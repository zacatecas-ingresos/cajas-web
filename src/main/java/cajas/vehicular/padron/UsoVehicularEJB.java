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
import cajas.persistence.entity.UsoVehiculoEntity;
import cajas.persistence.query.UsoVehicularQuery;

@Stateless
public class UsoVehicularEJB {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;
	
	@Inject
	UsoVehicularQuery usosQuery;
	
	public List<UsoVehiculo> obtenerUsosVehiculo() {
		try {
			List<UsoVehiculoEntity> usosVehiculoEntity = usosQuery.obtenerUsosQuery();
			List<UsoVehiculo> usosVehiculo = new ArrayList<>();
			
			for (UsoVehiculoEntity usoVehiculoEntity : usosVehiculoEntity) {
				UsoVehiculo uso = new UsoVehiculo();
				uso = uso.usoVehiculo(usoVehiculoEntity);
				usosVehiculo.add(uso);			
			}
			return usosVehiculo;
		} catch (NoResultException ex) {
			throw new BusinessException("No hay Usos de Vehiculos Registrados.");
		}
	}
	
	
}
