package cajas.persistence.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import cajas.persistence.entity.EstadoEntity;

public class EstadoQuery {
    
    private EntityManager entityManager;
    
    // Consulta JPA
    private final static String BUSCAR_ESTADO = 
            "select estado"
            + " from EstadoEntity as estado"
            + " where estado.estado = :nombreEstado";
    //Consula con SQL nativo
    private final static String ACTUALIZAR_CON_PROCEDIMIENTO_ALMACENADO =
            "CALL usp_procrecimiento_almacenado(?)";

    public EstadoQuery(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    
    public EstadoEntity crearEstado(EstadoEntity estadoEntity) {
        entityManager.persist(estadoEntity);
        return estadoEntity;
    }
    
    public EstadoEntity obtenerEstado(Integer idEstado) {
        EstadoEntity estadoEntity = entityManager.find(EstadoEntity.class, idEstado);
        return estadoEntity;
    }
    
    public void editarEstado (EstadoEntity estadoEntity) {
        entityManager.merge(estadoEntity);
    }
    
    public void eliminarEstado (Integer idEstado) {
        EstadoEntity estadoEntity = obtenerEstado(idEstado);
        entityManager.remove(estadoEntity);
    }
    
    public List<EstadoEntity> buscarEstado(String nombre) {
        TypedQuery<EstadoEntity> consulta =  entityManager.createQuery(BUSCAR_ESTADO, EstadoEntity.class);
        consulta.setParameter("nombreEstado", nombre);
        return consulta.getResultList();
    }

    public void ejecutarProcedimientoAlmacenadoEstado(String nombre) {
        Query consulta = entityManager.createNativeQuery(ACTUALIZAR_CON_PROCEDIMIENTO_ALMACENADO);
        consulta.setParameter(1, nombre);
        consulta.executeUpdate();
    }
}
