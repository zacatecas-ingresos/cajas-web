package cajas.config.localidades;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import cajas.exception.BusinessException;
import cajas.persistence.entity.LocalidadEntity;
import cajas.persistence.entity.MunicipioEntity;
import cajas.persistence.query.LocalidadQuery;
import javax.annotation.PostConstruct;

@Stateless
public class LocalidadEJB {

    @PersistenceContext(unitName = "sitDS")
    private EntityManager entityManager;
    private LocalidadQuery localidadQuery;
    private final LocalidadFactory localidadFactory = new LocalidadFactory();
    
    @PostConstruct
    private void init() {
        localidadQuery = new LocalidadQuery(entityManager);
    }

    public Integer crearLocalidad(Localidad localidad) {

        if (localidad == null) {
            throw new NullPointerException("No se puede guardar en el almacen de dato un valor vacio");

        }

        if (localidad.getLocalidad().isEmpty()) {
            throw new BusinessException("No se puede guardar en el almacen de dato una localidad en blanco");

        }

        LocalidadEntity localidadEntity = localidadQuery.crearLocalidad(localidadFactory.dtoAEntidad(localidad));
        return localidadEntity.getIdLocalidad();
    }

    public Localidad obtenerLocalidad(Integer idLocalidad) {
        // Implementar reglas de negocio

        LocalidadEntity localidadEntity = localidadQuery.obtenerLocalidad(idLocalidad);
        Localidad localidad = localidadFactory.entidadADto(localidadEntity);

        return localidad;
    }

    public void editarLocalidad(Localidad localidad) {
    	 if (localidad == null) {
             throw new NullPointerException("No se puede editar una localidad nula");
    	 }
    	 
         LocalidadEntity localidadEntity = localidadQuery.obtenerLocalidad(localidad.getIdLocalidad());
    	 localidadEntity = localidadFactory.dtoAEntidad(localidad, localidadEntity);
         localidadQuery.editarLocalidad(localidadEntity);
    }

    public void eliminarLocalidad(Integer idLocalidad) {
        localidadQuery.eliminarLocalidad(idLocalidad);
    }

    //buscar localidad por nombre 
    public List<Localidad> buscarLocalidad(String localidad) {
        List<LocalidadEntity> localidadEntities = localidadQuery.buscarLocalidad(localidad);
        List<Localidad> localidaddtos = localidadFactory.entidadesADtos(localidadEntities);
        return localidaddtos;

    }

    public List<Localidad> obtenerLocalidades() {
		List<LocalidadEntity> localidadEntities = localidadQuery.obtenerLocalidad();
		List<Localidad> localidaddtos = localidadFactory.entidadesADtos(localidadEntities);
		return localidaddtos;
    }
    
    public List<Localidad> buscarLocalidadesPorMunicipio(Integer idMunicipio) {
		List<Localidad> localidadList = new ArrayList<>();
		try {
			MunicipioEntity municipioEntity = entityManager.find(MunicipioEntity.class, idMunicipio);
			
			LocalidadPorMunicipioQuery localidadPorMunicipioQuery = new LocalidadPorMunicipioQuery(entityManager);
			List<LocalidadEntity> LocalidadEntityList = null;
			LocalidadEntityList = localidadPorMunicipioQuery.consultar(municipioEntity);
			for(LocalidadEntity localidadEntity : LocalidadEntityList) {
				localidadList.add(new Localidad(localidadEntity));
			}
		} catch (NoResultException ex) {
		}
		return localidadList;
	}
    
    
}
