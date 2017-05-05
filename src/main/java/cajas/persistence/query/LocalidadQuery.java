package cajas.persistence.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import cajas.persistence.entity.LocalidadEntity;

public class LocalidadQuery {

	private EntityManager entityManager;
    private final static String BUSCAR_LOCALIDAD = 
    				"select localidad"
    	            + " from LocalidadEntity as localidad"
    	            + " where localidad.localidad = :nombreLocalidad";
    private final static String OBTENER_LOCALIDADES =
    		"select localidad"
            + " from LocalidadEntity as localidad"
            + " order by localidad.idLocalidad";
    

    public LocalidadQuery(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    
    public LocalidadEntity crearLocalidad(LocalidadEntity localidadEntity) {
        entityManager.persist(localidadEntity);
        return localidadEntity;
    }
    
    public LocalidadEntity obtenerLocalidad(Integer idLocalidad) {
        LocalidadEntity localidadEntity = entityManager.find(LocalidadEntity.class, idLocalidad);
        return localidadEntity;
    }
    
    public void editarLocalidad (LocalidadEntity localidadEntity) {
        entityManager.merge(localidadEntity);
    }
    
    public void eliminarLocalidad (Integer idLocalidad) {
        LocalidadEntity localidadEntity = obtenerLocalidad(idLocalidad);
        entityManager.remove(localidadEntity);
    }
    
    public List<LocalidadEntity> buscarLocalidad(String nombre) {
        TypedQuery<LocalidadEntity> consulta =  entityManager.createQuery(BUSCAR_LOCALIDAD, LocalidadEntity.class);
        consulta.setParameter("nombreLocalidad", nombre);
        return consulta.getResultList();
    }

   
    public List<LocalidadEntity> obtenerLocalidad() {
		TypedQuery<LocalidadEntity> consulta = entityManager.createQuery(OBTENER_LOCALIDADES, LocalidadEntity.class);
		return consulta.getResultList();
	}
    
}
