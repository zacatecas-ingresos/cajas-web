/*
 * SituacionContribuyenteQuery.java
 * Creado el 04/May/2017 4:07:30 PM
 * 
 */
package cajas.persistence.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import cajas.persistence.entity.SituacionContribuyenteEntity;

/**
 *
 * @author Alejandro Perez
 */
public class SituacionContribuyenteQuery {
    
    private final EntityManager entityManager;
 // Consulta JPA
    private final static String BUSCAR_SITUACION_CONTRIBUYENTE = 
            "select situacioncontribuyente"
            + " from SituacionContribuyenteEntity as situacionContribuyente"
            + " where estatusSituacionContribuyente.estatusSituacionContribuyente like :SituacionContribuyente";
    private final static String OBTENER_TODAS_LAS_SITUACIONES_DE_LOS_CONTRIBUYENTES =
            "select SituacionContribuyente"
            + " from SituacionContribuyenteEntity as situacionContribuyente"
            + " order by situacionContribuyente.idSituacionContribuyente";
    //Consula con SQL nativo
    private final static String ACTUALIZAR_CON_PROCEDIMIENTO_ALMACENADO =
            "CALL usp_procrecimiento_almacenado(?)";


    public SituacionContribuyenteQuery(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    public SituacionContribuyenteEntity crearSituacionContribuyente(SituacionContribuyenteEntity situacionContribuyenteEntity) {
        entityManager.persist(situacionContribuyenteEntity);
        return situacionContribuyenteEntity;
    }
    
    public SituacionContribuyenteEntity obtenerSituacionContribuyente(Integer idSituacionContribuyenteEstado) {
    	SituacionContribuyenteEntity situacionContribuyenteEntity = entityManager.find(SituacionContribuyenteEntity.class, idSituacionContribuyenteEstado);
        return situacionContribuyenteEntity;
    }
    public List<SituacionContribuyenteEntity> obtenerSituacionesContibuyentes() {
        TypedQuery<SituacionContribuyenteEntity> consulta = entityManager.createQuery(OBTENER_TODAS_LAS_SITUACIONES_DE_LOS_CONTRIBUYENTES, SituacionContribuyenteEntity.class);
        List<SituacionContribuyenteEntity> situaciones = consulta.getResultList();
        return situaciones;
    }
    
    public void editarSituacionContribuyente (SituacionContribuyenteEntity situacionContribuyenteEntity) {
        entityManager.merge(situacionContribuyenteEntity);
    }
    public List<SituacionContribuyenteEntity> buscarSituacioncontribuyente(String nombre) {
        TypedQuery<SituacionContribuyenteEntity> consulta =  entityManager.createQuery(BUSCAR_SITUACION_CONTRIBUYENTE, SituacionContribuyenteEntity.class);
        consulta.setParameter("situacionContribuyente", '%' + nombre + '%');
        List<SituacionContribuyenteEntity> situacion = consulta.getResultList();
        return situacion;
    }

    public void ejecutarProcedimientoAlmacenadoSituacionContribuyente(String situacion) {
        Query consulta = entityManager.createNativeQuery(ACTUALIZAR_CON_PROCEDIMIENTO_ALMACENADO);
        consulta.setParameter(1, situacion);
        consulta.executeUpdate();
    }
    
    //TODO: Alejandro la situación del contribuyente no debe tener eliminar.
}
