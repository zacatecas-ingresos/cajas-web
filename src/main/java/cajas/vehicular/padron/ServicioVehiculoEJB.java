package cajas.vehicular.padron;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import cajas.exception.BusinessException;
import cajas.persistence.entity.CombustibleVehiculoEntity;
import cajas.persistence.entity.ServicioVehiculoEntity;
import cajas.persistence.query.ServicioVehiculoQuery;

@Stateless
public class ServicioVehiculoEJB {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;
	
	@Inject
	ServicioVehiculoQuery servicioQuery;
	
	public List<ServicioVehiculo> obtenerServiciosVehiculos() {
		try {
			List<ServicioVehiculoEntity> serviciosVehiculosEntity = servicioQuery.obtenerServiciosQuery();
			List<ServicioVehiculo> serviciosVehiculos = new ArrayList<>();
			
			for (ServicioVehiculoEntity servicioVehiculoEntity : serviciosVehiculosEntity) {
				ServicioVehiculo servicio = new ServicioVehiculo();
				servicio = servicio.servicioVehiculo(servicioVehiculoEntity);
				serviciosVehiculos.add(servicio);		
			}
			return serviciosVehiculos;
		} catch (NoResultException ex) {
			throw new BusinessException("No hay Combustibles de Seguridad Registrados.");
		}
	}

}
