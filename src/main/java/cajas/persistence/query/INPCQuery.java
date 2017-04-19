package cajas.persistence.query;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.INPCEntity;

public class INPCQuery {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	/**********
	 * Obtener un registro inpc en base al año y mes que se le mandan
	 **************/
	public INPCEntity inpcEntity(Integer aFiscal, Integer mesFiscal) {
		INPCEntity inpcEntity = entityManager
				.createQuery("FROM INPCEntity a WHERE a.aFiscal=:aFiscal AND a.mesFiscal=:mesFiscal", INPCEntity.class)
				.setParameter("aFiscal", aFiscal).setParameter("mesFiscal", mesFiscal).getSingleResult();
		return inpcEntity;
	}

}