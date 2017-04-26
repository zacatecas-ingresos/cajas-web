package cajas.persistence.query;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.PresupuestoObligacionEntity;

public class PresupuestoObligacionQuery {
	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	public void registrarActualizarPresupuestoObligacion(PresupuestoObligacionEntity presupuestoObligacionEntity) {
		entityManager.persist(presupuestoObligacionEntity);
	}
}
