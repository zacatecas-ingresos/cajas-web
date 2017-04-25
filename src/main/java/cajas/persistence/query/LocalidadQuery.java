package cajas.persistence.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import cajas.persistence.entity.LocalidadEntity;


public class LocalidadQuery {

private EntityManager entityManager;
    
    // Consulta JPA
    private final static String BUSCAR_LOCALIDAD = 
            "select Localidad"
            + " from LocalidadEntity as localidad"
            + " where localidad.localidad = :nombreLocalidad";
    //Consula con SQL nativo
    private final static String ACTUALIZAR_CON_PROCEDIMIENTO_ALMACENADO =
            "CALL usp_procrecimiento_almacenado(?)";

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
    
    public void editarLocalidad(LocalidadEntity localidadEntity) {
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

    public void ejecutarProcedimientoAlmacenadoLocalidad(String nombre) {
        Query consulta = entityManager.createNativeQuery(ACTUALIZAR_CON_PROCEDIMIENTO_ALMACENADO);
        consulta.setParameter(1, nombre);
        consulta.executeUpdate();
    }
    
}
