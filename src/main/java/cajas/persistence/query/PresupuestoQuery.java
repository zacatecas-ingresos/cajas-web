package cajas.persistence.query;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.PresupuestoEntity;

public class PresupuestoQuery {
	
	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	public void registrarActualizarPresupuesto(PresupuestoEntity presupuesto) {
		entityManager.persist(presupuesto);
	}

}
