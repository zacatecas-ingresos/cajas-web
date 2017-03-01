package cajas.persistence.query;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.TokenEntity;

public class TokenQuery {

	@PersistenceContext(name = "cajasPU")
	private EntityManager entityManager;

	/********* Registrar un token *********/
	public void registrarToken(TokenEntity token) {
		entityManager.persist(token);
	}

	/******** Actualizar un token ********/
	public void actualizarToken(TokenEntity token){
		entityManager.merge(token);
	}
	
	/******** Obtiene un token ********/
	public TokenEntity obtenerToken(String token) {
		TokenEntity tokenEntity = entityManager
				.createQuery("FROM TokenEntity a WHERE " + " a.token=:token", TokenEntity.class)
				.setParameter("token", token).getSingleResult();
		return tokenEntity;
	}

}