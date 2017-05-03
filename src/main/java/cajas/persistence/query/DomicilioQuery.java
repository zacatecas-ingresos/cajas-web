package cajas.persistence.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import cajas.persistence.entity.DomicilioEntity;

public class DomicilioQuery {

private EntityManager entityManager;
    
    // Consulta JPA
    private final static String BUSCAR_DOMICILIO = 
            "select Domicilio"
            + " from DomicilioEntity as domicilio"
            + " where domicilio.domicilio = :Buscar";
    
    private final static String OBTENER_DOMICILIO =
    		"select domicilio"
            + " from DomicilioEntity as domicilio"
            + " order by domicilio.idDomicilio";
   

    public DomicilioQuery(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
        
    public DomicilioEntity crearDomicilio(DomicilioEntity domicilioEntity) {
        entityManager.persist(domicilioEntity);
        return domicilioEntity;
    }
    
    public DomicilioEntity obtenerDomicilio(Integer idDomicilio) {
        DomicilioEntity domicilioEntity = entityManager.find(DomicilioEntity.class, idDomicilio);
        return domicilioEntity;
    }
    
    public void editarDomicilio(DomicilioEntity domicilioEntity) {
        entityManager.merge(domicilioEntity);
    }
    
    public void eliminarDomicilio (Integer idDomicilio) {
        DomicilioEntity domicilioEntity = obtenerDomicilio(idDomicilio);
        entityManager.remove(domicilioEntity);
    }
    
    public List<DomicilioEntity> buscarDomicilio(String nombre) {
        TypedQuery<DomicilioEntity> consulta =  entityManager.createQuery(BUSCAR_DOMICILIO, DomicilioEntity.class);
        consulta.setParameter("Domicilio", nombre);
        return consulta.getResultList();
    }
    
    public List<DomicilioEntity> obtenerDomicilio() {
		TypedQuery<DomicilioEntity> consulta = entityManager.createQuery(OBTENER_DOMICILIO, DomicilioEntity.class);
		return consulta.getResultList();
	}


	
    }
