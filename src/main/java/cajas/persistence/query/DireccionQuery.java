package cajas.persistence.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import cajas.persistence.entity.DireccionEntity;

public class DireccionQuery {

private EntityManager entityManager;
    
    // Consulta JPA
    private final static String BUSCAR_DIRECCION = 
            "select Direccion"
            + " from DireccionEntity as direccion"
            + " where direccion.direccion = :Buscar";
    
    private final static String OBTENER_DIRECCION =
    		"select direccion"
            + " from DireccionEntity as direccion"
            + " order by direccion.idDireccion";
   

    public DireccionQuery(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
        
    public DireccionEntity crearDireccion(DireccionEntity direccionEntity) {
        entityManager.persist(direccionEntity);
        return direccionEntity;
    }
    
    public DireccionEntity obtenerDireccion(Integer idDireccion) {
        DireccionEntity direccionEntity = entityManager.find(DireccionEntity.class, idDireccion);
        return direccionEntity;
    }
    
    public void editarDireccion(DireccionEntity direccionEntity) {
        entityManager.merge(direccionEntity);
    }
    
    public void eliminarDireccion (Integer idDireccion) {
        DireccionEntity direccionEntity = obtenerDireccion(idDireccion);
        entityManager.remove(direccionEntity);
    }
    
    public List<DireccionEntity> buscarDireccion(String nombre) {
        TypedQuery<DireccionEntity> consulta =  entityManager.createQuery(BUSCAR_DIRECCION, DireccionEntity.class);
        consulta.setParameter("Direccion", nombre);
        return consulta.getResultList();
    }
    
    public List<DireccionEntity> obtenerDireccion() {
		TypedQuery<DireccionEntity> consulta = entityManager.createQuery(OBTENER_DIRECCION, DireccionEntity.class);
		return consulta.getResultList();
	}


	
    }
