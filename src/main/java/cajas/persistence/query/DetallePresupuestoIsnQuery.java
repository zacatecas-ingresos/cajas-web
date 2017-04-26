package cajas.persistence.query;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.DetallePresupuestoIsnEntity;

public class DetallePresupuestoIsnQuery {
	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	public void actualizarRegistrarDetalle(DetallePresupuestoIsnEntity detallePresupuestoIsnEntity) {
		entityManager.persist(detallePresupuestoIsnEntity);
	}
}
