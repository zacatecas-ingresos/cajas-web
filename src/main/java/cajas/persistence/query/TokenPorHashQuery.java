package cajas.persistence.query;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.TokenEntity;

public class TokenPorHashQuery {

	@PersistenceContext(name = "postgresqlDS")
	private EntityManager entityManager;
	
	private String hash;
	
	private TokenEntity tokenEntity;
	
	public TokenPorHashQuery(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public TokenEntity consultar() {
		return tokenEntity;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}
	
	
	
}

