/*
 * ContribuyenteQuery.java
 * 
 */
package cajas.persistence.query;

import cajas.exception.BusinessException;
import cajas.impuestos.declaracion.estatal.InfoContribuyente;
import cajas.persistence.entity.ContribuyenteEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author Freddy Barrera (freddy.barrera.moo@gmail.com)
 */
public class ContribuyenteQuery {

	private final EntityManager entityManager;
	private static final String BUSCAR_CONTRIBUYENTE = "select contribuyente"
			+ " from ContribuyenteEntity as contribuyente"
			+ " where contribuyente.rfc like :criterio or contribuyente.nombreCompuesto like :criterio";

	private static final String BUSCAR_CONTRIBUYENTE_RFC = "SELECT NEW cajas.impuestos.declaracion.estatal.InfoContribuyente (c.idContribuyente, c.nombreCompuesto, c.rfc) "
			+ "FROM ContribuyenteEntity AS c WHERE c.rfc =:rfc";

	public ContribuyenteQuery(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public ContribuyenteEntity crearContribuyente(ContribuyenteEntity contribuyenteEntity) {
		entityManager.persist(contribuyenteEntity);
		return contribuyenteEntity;
	}

	public ContribuyenteEntity obtenerContribuyente(Integer idContribuyente) {
		ContribuyenteEntity contribuyenteEntity = entityManager.find(ContribuyenteEntity.class, idContribuyente);
		return contribuyenteEntity;
	}

	public List<ContribuyenteEntity> buscarContribuyente(String criterio) {
		TypedQuery<ContribuyenteEntity> consulta = entityManager.createQuery(BUSCAR_CONTRIBUYENTE,
				ContribuyenteEntity.class);
		consulta.setParameter("criterio", '%' + criterio + '%');
		return consulta.getResultList();
	}

	/**
	 * Consulta la información básica del contribuyente.
	 * 
	 * @param rfc
	 * @author Leila Schiaffini
	 */
	public InfoContribuyente obtenerContirbuyentePoRfc(String rfc) {
		try {
			return entityManager.createQuery(BUSCAR_CONTRIBUYENTE_RFC, InfoContribuyente.class).setParameter("rfc", rfc)
					.getSingleResult();
		} catch (NoResultException exception) {
			throw new BusinessException("No se encontró contribuyente con el rfc " + rfc);
		}
	}

	public void editarContribuyente(ContribuyenteEntity contribuyenteEntity) {
		entityManager.merge(contribuyenteEntity);
	}

}
