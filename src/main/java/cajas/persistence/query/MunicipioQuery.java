package cajas.persistence.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import cajas.persistence.entity.MunicipioEntity;

public class MunicipioQuery {

 private EntityManager entityManager;
    
    // Consulta JPA
    private final static String BUSCAR_MUNICIPIO = 
            "select municipio"
            + " from MunicipioEntity as municipio"
            + " where municipio.municipio = :nombreMunicipio";
    private final static String OBTENER_MUNICIPIOS =
    		"select municipio"
            + " from MunicipioEntity as municipio"
            + " order by municipio.idMunicipio";
    //Consula con SQL nativo
    private final static String ACTUALIZAR_CON_PROCEDIMIENTO_ALMACENADO =
            "CALL usp_procrecimiento_almacenado(?)";

    public MunicipioQuery(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    
    public MunicipioEntity crearMunicipio(MunicipioEntity municipioEntity) {
        entityManager.persist(municipioEntity);
        return municipioEntity;
    }
    
    public MunicipioEntity obtenerMunicipio(Integer idMunicipio) {
        MunicipioEntity municipioEntity = entityManager.find(MunicipioEntity.class, idMunicipio);
        return municipioEntity;
    }
    
    public void editarMunicipio (MunicipioEntity municipioEntity) {
        entityManager.merge(municipioEntity);
    }
    
    public void eliminarMunicipio (Integer idMunicipio) {
        MunicipioEntity municipioEntity = obtenerMunicipio(idMunicipio);
        entityManager.remove(municipioEntity);
    }
    
    public List<MunicipioEntity> buscarMunicipio(String nombre) {
        TypedQuery<MunicipioEntity> consulta =  entityManager.createQuery(BUSCAR_MUNICIPIO, MunicipioEntity.class);
        consulta.setParameter("nombreMunicipio", nombre);
        return consulta.getResultList();
    }

    public void ejecutarProcedimientoAlmacenadoMunicipio(String nombre) {
        Query consulta = entityManager.createNativeQuery(ACTUALIZAR_CON_PROCEDIMIENTO_ALMACENADO);
        consulta.setParameter(1, nombre);
        consulta.executeUpdate();
    }


	public List<MunicipioEntity> obtenerMunicipio() {
		TypedQuery<MunicipioEntity> consulta = entityManager.createQuery(OBTENER_MUNICIPIOS, MunicipioEntity.class);
		return consulta.getResultList();
	}
    
}
