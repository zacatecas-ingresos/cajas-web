package cajas.vehicular.padron;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import cajas.exception.BusinessException;
import cajas.persistence.entity.AgenciaEntity;
import cajas.persistence.query.AgenciaQuery;

@Stateless
public class AgenciaVehicularEJB {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;
	
	@Inject
	AgenciaQuery agenciaVehicularQuery;
	
	public List<AgenciaVehiculo> obtenerAgenciasVehiculos() {
		try {
			List<AgenciaEntity> agenciasVehiculosEntity = agenciaVehicularQuery.obtenerAgenciasVehicularesQuery();
			List<AgenciaVehiculo> agenciasVehiculos = new ArrayList<>();
			
			for (AgenciaEntity agenciaVehiculoEntity : agenciasVehiculosEntity) {
				AgenciaVehiculo agencia = new AgenciaVehiculo();
				agencia = agencia.agenciaVehiculo(agenciaVehiculoEntity);
				agenciasVehiculos.add(agencia);		
			}
			return agenciasVehiculos;
		} catch (NoResultException ex) {
			throw new BusinessException("No hay Combustibles de Seguridad Registrados.");
		}
	}
}
