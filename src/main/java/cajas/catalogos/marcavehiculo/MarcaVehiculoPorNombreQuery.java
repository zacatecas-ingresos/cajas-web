package cajas.catalogos.marcavehiculo;

import java.util.List;

import javax.persistence.EntityManager;

import cajas.persistence.entity.MarcaVehiculoEntity;

public class MarcaVehiculoPorNombreQuery {
	private EntityManager entityManager;

	public MarcaVehiculoPorNombreQuery(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public List<MarcaVehiculoEntity> consultar(String criterio) {
		List<MarcaVehiculoEntity> marcaVehiculoEntity = entityManager
				.createQuery(
						"FROM MarcaVehiculoEntity mv WHERE mv.nombre LIKE :criterio OR mv.abreviatura LIKE :criterio",
						MarcaVehiculoEntity.class)
				.setParameter("nombre", "%" + criterio + "%").getResultList();
		return marcaVehiculoEntity;
	}
}