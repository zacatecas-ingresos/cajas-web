package cajas.persistence.query;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.TasaImpuestoEntity;

public class TasaImpuestoQuery {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	public TasaImpuestoEntity obtenerTasaPorImpuesto(String impuesto, Date fechaInicio, Date fechaFin) {
		TasaImpuestoEntity tasaImpuesto = entityManager
				.createQuery("FROM TasaImpuestoEntity a WHERE a.impuesto=:impuesto AND "
						+ "(fechaInicio<=:fechaInicio AND fechaFin >=:fechaFin)", TasaImpuestoEntity.class)
				.setParameter("impuesto", impuesto).setParameter("fechaInicio", fechaInicio)
				.setParameter("fechaFin", fechaFin).getSingleResult();
		return tasaImpuesto;
	}

}