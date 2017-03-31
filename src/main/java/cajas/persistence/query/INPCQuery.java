package cajas.persistence.query;

import java.util.ArrayList;
import java.util.List;

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

	/********
	 * Obtiene una lista de inpc en base al año de inicio y mes en conjunto con
	 * el año final y mes final
	 */
	public List<INPCEntity> listaINPC(Integer aFiscalInicio, Integer mesFiscalInicio, Integer aFiscalFinal,
			Integer mesFiscalFinal, Boolean vencioPago) {

		List<INPCEntity> listaINPC = new ArrayList<>();

		if (vencioPago) {
			Integer mesActual;
			mesActual = mesFiscalFinal++;
			listaINPC = entityManager
					.createQuery("FROM INPCEntity a WHERE a.aFiscal IN(:aFiscalInicio,:aFiscalFinal) AND a.mesFiscal IN (:mesFiscalInicio,:mesFiscalFinal,:mesActual)",
							INPCEntity.class)
					.setParameter("aFiscalInicio", aFiscalInicio)
					.setParameter("aFiscalFinal", aFiscalFinal)
					.setParameter("mesFiscalInicio", mesFiscalInicio)
					.setParameter("mesFiscalFinal", mesFiscalFinal)
					.setParameter("mesActual", mesActual)
					.getResultList();
		} else {
			listaINPC = entityManager
					.createQuery("FROM INPCEntity a WHERE a.aFiscal IN(:aFiscalInicio,:aFiscalFinal) AND a.mesFiscal IN (:mesFiscalInicio,:mesFiscalFinal)",
							INPCEntity.class)
					.setParameter("aFiscalInicio", aFiscalInicio)
					.setParameter("aFiscalFinal", aFiscalFinal)
					.setParameter("mesFiscalInicio", mesFiscalInicio)
					.setParameter("mesFiscalFinal", mesFiscalFinal)
					.getResultList();
		}

		return listaINPC;
	}

}