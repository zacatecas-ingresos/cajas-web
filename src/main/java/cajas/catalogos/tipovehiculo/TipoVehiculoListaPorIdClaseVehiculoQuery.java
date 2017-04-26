package cajas.catalogos.tipovehiculo;

import java.util.List;

import javax.persistence.EntityManager;

import cajas.persistence.entity.ClaseVehiculoEntity;
import cajas.persistence.entity.TipoVehiculoEntity;

public class TipoVehiculoListaPorIdClaseVehiculoQuery {
	private EntityManager entityManager;

	public TipoVehiculoListaPorIdClaseVehiculoQuery(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public List<TipoVehiculoEntity> consultar(ClaseVehiculoEntity claseVehiculoEntity) {
		List<TipoVehiculoEntity> tipoVehiculoEntity = entityManager
				.createQuery(
						"FROM TipoVehiculoEntity tv WHERE tv.claseVehiculo = :claseVehiculo",
						TipoVehiculoEntity.class)
				.setParameter("claseVehiculo", claseVehiculoEntity).getResultList();
		return tipoVehiculoEntity;
	}
}
