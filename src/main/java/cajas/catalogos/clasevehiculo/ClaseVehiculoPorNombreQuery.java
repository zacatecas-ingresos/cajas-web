package cajas.catalogos.clasevehiculo;

import java.util.List;

import javax.persistence.EntityManager;

import cajas.persistence.entity.ClaseVehiculoEntity;

public class ClaseVehiculoPorNombreQuery {
	private EntityManager entityManager;

	public ClaseVehiculoPorNombreQuery(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public List<ClaseVehiculoEntity> consultar(String criterio) {
		List<ClaseVehiculoEntity> claseVehiculoEntity = entityManager
				.createQuery(
						"FROM ClaseVehiculoEntity mv WHERE LOWER(mv.nombre) LIKE :criterio OR LOWER(mv.abreviacion) LIKE :criterio",
						ClaseVehiculoEntity.class)
				.setParameter("criterio", "%" + criterio.toLowerCase() + "%").getResultList();
		return claseVehiculoEntity;
	}
}
