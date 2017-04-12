package cajas.persistence.query;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.CalculoTemporalEstatalEntity;

public class CalculoTemporalEstatalQuery {
	
	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;
	
	
	public CalculoTemporalEstatalEntity registrarCalculoEstatal(CalculoTemporalEstatalEntity calculoEstatal){
		entityManager.persist(calculoEstatal);
		return calculoEstatal;
	}
}