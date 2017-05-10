package cajas.persistence.query;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import cajas.persistence.entity.UsoVehiculoEntity;

public class UsoVehicularQuery {
	
	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;
	
	/**
	Funcion que obtiene todos los usos de vehiculos
	@return Lista de Usos Vehiculares
	*/	
	public List<UsoVehiculoEntity> obtenerUsosQuery() {
		List<UsoVehiculoEntity> usos = entityManager.createQuery("FROM UsoVehiculoEntity u", UsoVehiculoEntity.class)
				.getResultList();
		return usos;
	}

}
