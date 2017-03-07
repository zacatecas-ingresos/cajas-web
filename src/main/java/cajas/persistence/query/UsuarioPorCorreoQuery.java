package cajas.persistence.query;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.UsuarioEntity;

public class UsuarioPorCorreoQuery {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	public UsuarioEntity consultarUsuarioPorCorreo(String correo) {
		UsuarioEntity usuario = entityManager
				.createQuery("FROM UsuarioEntity u WHERE u.email=:correo", UsuarioEntity.class)
				.setParameter("correo", correo).getSingleResult();

		return usuario;
	}

}