package cajas.persistence.query;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.OficinaEntity;
import cajas.persistence.entity.UsuarioEntity;
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
		OficinaEntity oficina = entityManager.find(OficinaEntity.class, idOficina);
		Integer num  =	entityManager.createQuery("select max(u.noSeguimientoVerificacion) FROM VerificacionVehicularEntity u WHERE u.oficina =:oficina AND u.ejercicio=:ejercicio", Integer.class)
				.setParameter("oficina", oficina).setParameter("ejercicio", ejercicio).getSingleResult();		
		
		if(num != null){
			num= num + 1; 
		}else{
			num = 1;
		}		
		
		return num;
	}
	
	/**
	Funcion que obtiene Vin para mostrar en SweetAler
	@param vin
	@return No Seguimiento
	*/
	public String obtenerNumeroSeguimiento(String vin) {
		
				
		Integer noSeguimientoQuery = entityManager.createQuery("select u.noSeguimientoVerificacion FROM VerificacionVehicularEntity u WHERE u.vinVehiculo=:vin", Integer.class)
				.setParameter("vin", vin).getSingleResult();		
		
		return noSeguimientoQuery.toString();
	}
	
	/**
	Funcion que obtiene todas las verificaciones
	@param idVerificacion
	@return Arreglo de Verificaciones
	*/	
	public List<VerificacionVehicularEntity> obtenerVerificaciones() {
		List<VerificacionVehicularEntity> verificaciones = entityManager.createQuery("FROM VerificacionVehicularEntity v ORDER BY v.idVerificacionVehiculo DESC", VerificacionVehicularEntity.class)
				.getResultList();
		return verificaciones;
	}
	
	/**
	Funcion que obtiene verificacion por idVerificacion
	@return Arreglo con la Verificacon
	*/	
	public List<VerificacionVehicularEntity> obtenerVerificacion(Integer id) {
		List<VerificacionVehicularEntity> verificaciones = entityManager.createQuery("FROM VerificacionVehicularEntity v WHERE v.idVerificacionVehiculo =:id", VerificacionVehicularEntity.class)
				.setParameter("id", id).getResultList();
		return verificaciones;
	}
	
	/**
	Funcion que obtiene todas las verificaciones por los criterios de busqueda
	@param vin
	@param estatus
	@return Arreglo de Verificaciones
	*/
	public List<VerificacionVehicularEntity> obtenerVerificaconesFiltro(String criterioBusqueda) {
		Integer noSeguimiento = 0;
		try {
			noSeguimiento = Integer.valueOf(criterioBusqueda);
		} catch (Exception e) {
			noSeguimiento = 0;
		}
			
		if(noSeguimiento>0){
			List<VerificacionVehicularEntity> verificaciones = entityManager.createQuery("FROM VerificacionVehicularEntity vV WHERE LOWER(vV.vinVehiculo) LIKE :criterioBusqueda OR vV.noSeguimientoVerificacion = :noSeguimiento ORDER BY vV.idVerificacionVehiculo DESC", VerificacionVehicularEntity.class)
					.setParameter("criterioBusqueda","%"+ criterioBusqueda+"%")
					.setParameter("noSeguimiento",noSeguimiento)					
					.getResultList();
			return verificaciones;
		}else{
			List<VerificacionVehicularEntity> verificaciones = entityManager.createQuery("FROM VerificacionVehicularEntity vV WHERE LOWER(vV.vinVehiculo) LIKE :criterioBusqueda ORDER BY vV.idVerificacionVehiculo DESC", VerificacionVehicularEntity.class)
					.setParameter("criterioBusqueda","%"+ criterioBusqueda+"%")				
					.getResultList();
			return verificaciones;
		}

						
	}
	
	

}