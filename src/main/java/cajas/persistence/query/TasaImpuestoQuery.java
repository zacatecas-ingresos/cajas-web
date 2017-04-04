package cajas.persistence.query;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.TasaImpuestoEntity;

public class TasaImpuestoQuery {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	public TasaImpuestoEntity obtenerTasaPorImpuesto(String impuesto) {
		TasaImpuestoEntity tasaImpuesto = entityManager
				.createQuery("FROM TasaImpuestoEntity a WHERE a.impuesto=:impuesto", TasaImpuestoEntity.class)
				.setParameter("impuesto", impuesto).getSingleResult();
		return tasaImpuesto;
	}

}