package cajas.persistence.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.AgenciaEntity;

public class AgenciaQuery {
	
	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;
	
	public List<AgenciaEntity> obtenerAgenciasVehicularesQuery() {
		List<AgenciaEntity> agencias = entityManager.createQuery("FROM AgenciaEntity", AgenciaEntity.class)
				.getResultList();
		return agencias;
	}

}
