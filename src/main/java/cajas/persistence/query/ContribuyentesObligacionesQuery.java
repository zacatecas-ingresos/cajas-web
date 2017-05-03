package cajas.persistence.query;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;

import cajas.exception.BusinessException;
import cajas.persistence.entity.ContribuyentesObligacionesEntity;

public class ContribuyentesObligacionesQuery {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	public ContribuyentesObligacionesEntity obtenerAsignacioActiva(Integer idObligacion, String rfc) {
		try {

			 return entityManager
					.createQuery("SELECT c FROM ContribuyentesObligacionesEntity AS c WHERE c.obligacion.idObligacion=:idObligacion AND WHERE c.contribuyente.rfc =:rfc AND c.estatus=1",
							ContribuyentesObligacionesEntity.class)
					.setParameter("idObligacion", idObligacion)
					.setParameter("rfc", rfc)
					.getSingleResult();
			
		} catch (NoResultException ex) {
			return null;
		}catch (NonUniqueResultException ex){
			throw new BusinessException("Asignacion duplicada");
		}
		
	}

}
