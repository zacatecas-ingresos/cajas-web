package cajas.persistence.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.UsuarioEntity;

public class UsuarioQuery {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	public UsuarioEntity obtenerUsuarioPorId(Integer idUsuario) {
		return entityManager.find(UsuarioEntity.class, idUsuario);
	}

	public List<UsuarioEntity> obtenerUsuarios() {
		List<UsuarioEntity> usuarios = entityManager.createQuery("FROM UsuarioEntity a ", UsuarioEntity.class)
				.getResultList();
		return usuarios;
	}
	
	public List<UsuarioEntity> obtenerUsuariosFiltro(String parametroBusqueda) {
		List<UsuarioEntity> usuarios = entityManager.createQuery("FROM UsuarioEntity a WHERE a.nombre LIKE :parametroBusqueda OR a.email LIKE :parametroBusqueda ", UsuarioEntity.class)
				.setParameter("parametroBusqueda","%"+ parametroBusqueda+"%").getResultList();
		return usuarios;
	}

	public void registrarUsuario(UsuarioEntity usuario) {
		entityManager.persist(usuario);
	}

	public void actualizarUsuario(UsuarioEntity usuario) {
		entityManager.merge(usuario);
	}
	
	public void eliminarUsuario(UsuarioEntity usuario){
		entityManager.remove(usuario);
	}
	
}