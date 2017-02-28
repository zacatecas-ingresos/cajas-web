package cajas.persistence.query;

import javax.persistence.EntityManager;

import cajas.persistence.entity.ParametroEntity;

public class ParametroPorClaveQuery {

	private EntityManager entityManager;
	
	private String clave;
	
	private ParametroEntity resultado;
	
	public ParametroPorClaveQuery(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public ParametroEntity consultar() {
		return resultado;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public ParametroEntity getResultado() {
		return resultado;
	}

	public void setResultado(ParametroEntity resultado) {
		this.resultado = resultado;
	}
	
	
}
