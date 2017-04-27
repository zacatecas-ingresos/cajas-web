package cajas.persistence.query;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

import cajas.exception.BusinessException;
import cajas.persistence.entity.ContribuyentesObligacionesEntity;

public class ContribuyentesObligacionesQuery {

	private final EntityManager entityManager;

	private static final String CONSULTA_OBLIGACION_ASIGNADA = "SELECT c FROM ContribuyentesObligacionesEntity AS c "
			+ "WHERE c.idObligacion=:idObligacion AND WHERE c.idContribuyente =:idContribuyente";

	public ContribuyentesObligacionesQuery(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	/**
	 * Consulta que el contribuyente tenga asignada la obligacion
	 * 
	 * @param idObligacion
	 * @param idContribuyente
	 */
	public ContribuyentesObligacionesEntity obtenerAsignacion(Integer idObligacion, Integer idContribuyente) {
		try {

			return entityManager.createQuery(CONSULTA_OBLIGACION_ASIGNADA, ContribuyentesObligacionesEntity.class)
					.setParameter("idObligacion", idObligacion).setParameter("idContribuyente", idContribuyente)
					.getSingleResult();

		} catch (NoResultException ex) {
			return null;
		} catch (NonUniqueResultException ex) {
			throw new BusinessException("Asignacion duplicada");
		}

	}

}
