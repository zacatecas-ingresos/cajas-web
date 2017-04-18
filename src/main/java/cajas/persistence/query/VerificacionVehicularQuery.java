package cajas.persistence.query;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.VerificacionVehicularEntity;

public class VerificacionVehicularQuery {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	public void registrarVerificacion(VerificacionVehicularEntity vVehicular) {
		entityManager.persist(vVehicular);
	}
	
	public VerificacionVehicularEntity consultar(String vin) {
		
		VerificacionVehicularEntity vVehiculo =	entityManager.createQuery("FROM VerificacionVehicularEntity u WHERE u.vinVehiculo=:vin", VerificacionVehicularEntity.class)
				.setParameter("vin", vin)				
				.getSingleResult();
		
		return vVehiculo;
	}
	
	public VerificacionVehicularEntity consultarNumeroMotor(String numeroMotor) {
		
		VerificacionVehicularEntity vVehiculo =	entityManager.createQuery("FROM VerificacionVehicularEntity u WHERE u.numeroMotorVehiculo=:numeroMotor", VerificacionVehicularEntity.class)
				.setParameter("numeroMotor", numeroMotor)				
				.getSingleResult();
		
		return vVehiculo;
	}
	
	
	/**
	Funcion que genera el siguiente numero de seguimiento para las verificaciones
	@param idOficina
	@param ejercicio
	@return numero de seguimiento formado
	*/
	public Integer generarNumeroSeguimiento(Integer idOficina, Integer ejercicio) {
		
				
		Integer num  =	entityManager.createQuery("select max(u.noSeguimientoVerificacion) FROM VerificacionVehicularEntity u WHERE u.idOficinaVerificacion=:idOficina AND u.ejercicio=:ejercicio", Integer.class)
				.setParameter("idOficina", idOficina).setParameter("ejercicio", ejercicio).getSingleResult();		
		
		if(num != null){
			num= num + 1; 
		}else{
			num = 1;
		}		
		
		return num;
	}
	

}