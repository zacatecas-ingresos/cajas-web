package cajas.persistence.query;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.TypedQuery;

import cajas.persistence.entity.ObligacionEntity;


public class  ObligacionQuery { 
	
	
	private EntityManager entityManager;
	
	public ObligacionQuery(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
						
			public List<ObligacionEntity> buscarObligacion(String obligacion) {
	        TypedQuery<ObligacionEntity> consulta =  entityManager.createQuery("FROM ObligacionesEntity O", ObligacionEntity.class);
	        consulta.setParameter("Obligacion", obligacion);
	        return consulta.getResultList();
			}
			
		public  ObligacionEntity obtenerObligacion(Integer idObligacion){
				
			ObligacionEntity obligacionesEntity = entityManager.find(ObligacionEntity.class, idObligacion);		
		
			return obligacionesEntity;
		}
		
		}


