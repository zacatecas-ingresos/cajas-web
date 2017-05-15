package cajas.catalogos.tipovehiculo;

import java.util.List;

import javax.persistence.EntityManager;

import cajas.persistence.entity.TipoVehiculoEntity;

public class TipoVehiculoPorNombreQuery {
	private EntityManager entityManager;

	public TipoVehiculoPorNombreQuery(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public List<TipoVehiculoEntity> consultar(String criterio) {
		List<TipoVehiculoEntity> tipoVehiculoEntity = entityManager
				.createQuery(
						"FROM TipoVehiculoEntity mv WHERE LOWER(mv.nombre) LIKE :criterio",
						TipoVehiculoEntity.class)
				.setParameter("criterio", "%" + criterio.toLowerCase() + "%").getResultList();
		return tipoVehiculoEntity;
	}
}
