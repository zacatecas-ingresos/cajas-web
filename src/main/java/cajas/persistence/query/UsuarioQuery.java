package cajas.persistence.query;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.UsuarioEntity;

public class UsuarioQuery {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	public UsuarioEntity obtenerUsuarioPorId(Integer idUsuario) {
		return entityManager.find(UsuarioEntity.class, idUsuario);
	}

}