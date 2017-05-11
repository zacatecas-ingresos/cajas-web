package cajas.config.municipios;

import java.util.List;

import javax.persistence.EntityManager;

import cajas.persistence.entity.EstadoEntity;
import cajas.persistence.entity.MunicipioEntity;

public class MunicipioPorEstadoQuery {
	
	
	private EntityManager entityManager;

	public MunicipioPorEstadoQuery(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public List<MunicipioEntity> consultar(EstadoEntity estadoEntity) {
		List<MunicipioEntity> municipioEntity = entityManager
				.createQuery(
						"FROM MunicipioEntity tv WHERE tv.estado = :estado",
						MunicipioEntity.class)
				.setParameter("estado", estadoEntity).getResultList();
		return municipioEntity;
	}

}
