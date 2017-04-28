package cajas.persistence.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.DocumentoPedimentoEntity;

public class DocumentoPedimentoQuery {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	/**
	 * Funcion que obtiene todas las verificaciones
	 * 
	 * @return Arreglo de Verificaciones
	 */
	public List<DocumentoPedimentoEntity> obtenerVerificaciones() {
		List<DocumentoPedimentoEntity> documentos = entityManager.createQuery("FROM DocumentoPedimentoEntity d ORDER BY d.documento DESC", DocumentoPedimentoEntity.class).getResultList();
		return documentos;
	}

}