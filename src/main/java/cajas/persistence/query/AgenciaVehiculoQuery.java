package cajas.persistence.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.AgenciaVehicularEntity;

public class AgenciaVehiculoQuery {
	
	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;
	
	public List<AgenciaVehicularEntity> obtenerAgenciasVehicularesQuery() {
		List<AgenciaVehicularEntity> agencias = entityManager.createQuery("FROM AgenciaVehicularEntity", AgenciaVehicularEntity.class)
				.getResultList();
		return agencias;
	}

}
