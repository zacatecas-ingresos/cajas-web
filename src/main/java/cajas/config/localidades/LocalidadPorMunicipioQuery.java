package cajas.config.localidades;

import java.util.List;

import javax.persistence.EntityManager;

import cajas.persistence.entity.LocalidadEntity;
import cajas.persistence.entity.MunicipioEntity;

public class LocalidadPorMunicipioQuery {
	
	private EntityManager entityManager;

	public LocalidadPorMunicipioQuery(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public List<LocalidadEntity> consultar(MunicipioEntity municipioEntity) {
		List<LocalidadEntity> localidadEntity = entityManager
				.createQuery(
						"FROM LocalidadEntity tv WHERE tv.municipio = :municipio",
						LocalidadEntity.class)
				.setParameter("municipio", municipioEntity).getResultList();
		return localidadEntity;
	}

}
