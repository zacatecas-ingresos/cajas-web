package cajas.persistence.query;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import cajas.persistence.entity.ServicioVehiculoEntity;

public class ServicioVehiculoQuery {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;
	
	/**
	Funcion que obtiene todos los Servicios de Vehiculos
	@return Lista de Servicios Vehiculares
	*/	
	public List<ServicioVehiculoEntity> obtenerServiciosQuery() {
		List<ServicioVehiculoEntity> servicios = entityManager.createQuery("FROM ServicioVehiculoEntity u", ServicioVehiculoEntity.class).getResultList();
		return servicios;
	}
}
