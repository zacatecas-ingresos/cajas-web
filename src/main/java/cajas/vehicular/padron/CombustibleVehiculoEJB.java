package cajas.vehicular.padron;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import cajas.exception.BusinessException;
import cajas.persistence.entity.CombustibleVehiculoEntity;
import cajas.persistence.entity.UsoVehiculoEntity;
import cajas.persistence.query.CombustibleVehiculoQuery;

@Stateless
public class CombustibleVehiculoEJB {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;
	
	@Inject
	CombustibleVehiculoQuery combustibleQuery;
	
	public List<CombustibleVehiculo> obtenerCombustibleVehiculo() {
		try {
			List<CombustibleVehiculoEntity> combustiblesVehiculosEntity = combustibleQuery.obtenerCombustiblesQuery();
			List<CombustibleVehiculo> combustiblesVehiculos = new ArrayList<>();
			
			for (CombustibleVehiculoEntity combustibleVehiculoEntity : combustiblesVehiculosEntity) {
				CombustibleVehiculo combustible = new CombustibleVehiculo();
				combustible = combustible.combustibleVehiculoEntity(combustibleVehiculoEntity);
				combustiblesVehiculos.add(combustible);		
			}
			return combustiblesVehiculos;
		} catch (NoResultException ex) {
			throw new BusinessException("No hay Combustibles de Seguridad Registrados.");
		}
	}
}
