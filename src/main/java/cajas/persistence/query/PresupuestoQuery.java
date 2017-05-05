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

	public PresupuestoEntity obtenerPresupuestoPorId(Integer id) {
		PresupuestoEntity entity = entityManager.find(PresupuestoEntity.class, id);
		return entity;
	}

	public PresupuestoEntity obtenerPresupuestoPorLcc(String lcc) {
		PresupuestoEntity entity = entityManager
				.createQuery("SELECT p FROM PresupuestoEntity as p where p.lccBanco=:lcc or p.lccOxxo", PresupuestoEntity.class)
				.setParameter("lcc", lcc).getSingleResult();
		
		return entity;
	}
}
