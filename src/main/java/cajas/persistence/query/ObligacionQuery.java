package cajas.persistence.query;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import cajas.persistence.entity.ObligacionEntity;


public class  ObligacionQuery { 
	
	
	private final EntityManager entityManager;
	
	 // Consulta JPA
	
	
	            

	private static final String OBTENER_TODAS_LAS_OBLIGACIONES = "select obligacion from ObligacionEntity as obligacion" + " order by obligacion.idObligacion";
	 
	public ObligacionQuery(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
						
			public List<ObligacionEntity> buscarObligacion(String obligacion) {
	        TypedQuery<ObligacionEntity> consulta =  entityManager.createQuery("FROM ObligacionEntity O", ObligacionEntity.class);
	        consulta.setParameter("Obligacion", obligacion);
	        return consulta.getResultList();
			}
			
			public  ObligacionEntity obtenerObligacion(Integer idObligacion){
				
			ObligacionEntity obligacionesEntity = entityManager.find(ObligacionEntity.class, idObligacion);		
		
			return obligacionesEntity;
		}
			  public List<ObligacionEntity> obtenerTodaslasObligaciones() {
			        TypedQuery<ObligacionEntity> consulta = entityManager.createQuery(OBTENER_TODAS_LAS_OBLIGACIONES, ObligacionEntity.class);
			        List<ObligacionEntity> obligacines = consulta.getResultList();
			        return obligacines;
			    }
		}


