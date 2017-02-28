package cajas.persistence.query;

import java.util.List;

import javax.persistence.EntityManager;

import cajas.persistence.entity.ConfiguracionPerfilEntity;

public class ListaConfiguracionPerfilQuery {

	private EntityManager entityManager;
	
	private Integer idPerfil;
	
	private List<ConfiguracionPerfilEntity> resultado;
	
	public ListaConfiguracionPerfilQuery(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public List<ConfiguracionPerfilEntity> consultar() {
		return resultado;
	}

	public Integer getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}
	
	
}
