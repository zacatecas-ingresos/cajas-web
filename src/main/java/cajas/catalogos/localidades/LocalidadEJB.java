package cajas.catalogos.localidades;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.exception.BusinessException;
import cajas.persistence.entity.LocalidadEntity;
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
            throw new BusinessException("No se puede guardar en el almacen de dato un estado en blanco");

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
        // Implementar reglas de negocio

        LocalidadEntity localidadEntity = localidadQuery.obtenerLocalidad(localidad.getIdLocalidad());
        localidadEntity = localidadFactory.dtoAEntidad(localidad, localidadEntity);
        localidadQuery.editarLocalidad(localidadEntity);
    }

    public void eliminarLocalidad(Integer idLocalidad) {
        localidadQuery.eliminarLocalidad(idLocalidad);

    }

    //buscar municipio por nombre 
    public List<Localidad> buscarLocalidad(String localidad) {
        List<LocalidadEntity> localidadEntities = localidadQuery.buscarLocalidad(localidad);
        List<Localidad> localidaddtos = localidadFactory.entidadesADtos(localidadEntities);
        return localidaddtos;

    }

}
