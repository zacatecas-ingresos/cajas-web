package cajas.persistence.query;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.UsuarioEntity;

public class UsuarioPorNombreQuery {
	
	@PersistenceContext(name = "postgresqlDS")
	private EntityManager entityManager;
	
	public UsuarioEntity consultar(String nombre) {
				
		UsuarioEntity usuario =	entityManager.createQuery("FROM UsuarioEntity u WHERE u.nombre=:nombre", UsuarioEntity.class)
				.setParameter("nombre", nombre)				
				.getSingleResult();
		
		return usuario;
	}
	
}