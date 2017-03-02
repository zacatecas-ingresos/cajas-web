package cajas.persistence.query;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.UsuarioEntity;


public class UsuarioPorNombreQuery {

	private EntityManager entityManager;
	
	private String nombre;
	
	private UsuarioEntity usuario;
	
	public UsuarioPorNombreQuery(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public UsuarioEntity consultar() {
		
		UsuarioEntity usuario =	entityManager.createQuery("FROM UsuarioEntity u WHERE u.nombre=:nombre", UsuarioEntity.class)
				.setParameter("nombre", nombre)				
				.getSingleResult();
		
		return usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public UsuarioEntity getUsuario() {
		return usuario;
	}
}
