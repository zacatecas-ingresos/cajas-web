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
import cajas.persistence.entity.TipoCombustibleEntity;
import cajas.persistence.entity.UsoVehiculoEntity;
import cajas.persistence.query.TipoCombustibleQuery;

@Stateless
public class TipoCombustibleEJB {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;
	
	@Inject
	TipoCombustibleQuery combustibleQuery;
	
	public List<TipoCombustible> obtenerCombustibleVehiculo() {
		try {
			List<TipoCombustibleEntity> combustiblesVehiculosEntity = combustibleQuery.obtenerCombustiblesQuery();
			List<TipoCombustible> combustiblesVehiculos = new ArrayList<>();
			
			for (TipoCombustibleEntity combustibleVehiculoEntity : combustiblesVehiculosEntity) {
				TipoCombustible combustible = new TipoCombustible();
				combustible = combustible.combustibleVehiculoEntity(combustibleVehiculoEntity);
				combustiblesVehiculos.add(combustible);		
			}
			return combustiblesVehiculos;
		} catch (NoResultException ex) {
			throw new BusinessException("No hay Combustibles de Seguridad Registrados.");
		}
	}
}
