package cajas.vehicular.verificacion.ministerial;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import org.joda.time.DateTime;

import cajas.exception.BusinessException;
import cajas.persistence.entity.ClaseVehiculoEntity;
import cajas.persistence.entity.MarcaVehiculoEntity;
import cajas.persistence.entity.TipoVehiculoEntity;
import cajas.persistence.entity.VerificacionVehicularEntity;
import cajas.persistence.query.VerificacionVehicularQuery;

@Stateless
public class VerificacionVehiculoMinisterialEJB {
	
	@Inject
	VerificacionVehicularQuery vVehicularQuery; 
	
	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	public void guardarVerificacionMinisterialVehiculo(VerificacionVehiculoMinisterial verificacionVehiculoMinisterial) {
		try {
			VerificacionVehicularEntity verificacionVehicularEntity = entityManager.find(VerificacionVehicularEntity.class, verificacionVehiculoMinisterial.getIdVerificacionVehiculo());
//			verificacionVehicularEntity.setEstatusVerificacion(verificacionVehiculoMinisterial.getEstatusVerificacion());
			verificacionVehicularEntity.setFechaVerificacion(DateTime.now().toDate());
			verificacionVehicularEntity.setVinVehiculo(verificacionVehiculoMinisterial.getVinVehiculo());
			verificacionVehicularEntity.setNumeroMotorVehiculo(verificacionVehiculoMinisterial.getNumeroMotorVehiculo());	
			if (verificacionVehiculoMinisterial.getIdMarcaVehiculo() != null && verificacionVehiculoMinisterial.getIdMarcaVehiculo() > 0) {
				MarcaVehiculoEntity marcaVehiculo = entityManager.find(MarcaVehiculoEntity.class,verificacionVehiculoMinisterial.getIdMarcaVehiculo());
				verificacionVehicularEntity.setMarcaVehiculo(marcaVehiculo);
			}
			verificacionVehicularEntity.setModeloVehiculo(verificacionVehiculoMinisterial.getModeloVehiculo());
			if (verificacionVehiculoMinisterial.getIdClaseVehiculo() != null) {
				ClaseVehiculoEntity claseVehiculoEntity = entityManager.find(ClaseVehiculoEntity.class,
						verificacionVehiculoMinisterial.getIdClaseVehiculo());
				verificacionVehicularEntity.setClaseVehiculo(claseVehiculoEntity);
			}
			if (verificacionVehiculoMinisterial.getIdTipoVehiculo() != null) {
				TipoVehiculoEntity tipoVehiculoEntity = entityManager.find(TipoVehiculoEntity.class,
						verificacionVehiculoMinisterial.getIdTipoVehiculo());
				verificacionVehicularEntity.setTipoVehiculo(tipoVehiculoEntity);
			}
			verificacionVehicularEntity.setFolioVerificacionMinisterial(verificacionVehiculoMinisterial.getFolioVerificacionMinisterial());
			verificacionVehicularEntity.setObservacionesMinisterial(verificacionVehiculoMinisterial.getObservacionesMinisterial());
			verificacionVehicularEntity.setLineaVehiculo(verificacionVehiculoMinisterial.getLineaVehiculo());
			entityManager.merge(verificacionVehicularEntity);
		} catch (PersistenceException ex) {
			ex.printStackTrace();
			throw new BusinessException("Ocurrio un problema al registrar al registrar la Verificación del Vehiculo.");
		}
	}
//	
//	/********Obtener VIN *********/
//	public VerificacionVehiculoMinisterial obtenerVin(String vin) {
//		try {
//			VerificacionVehicularEntity vVehiculoEntity = vVehicularQuery.consultar(vin);
//			VerificacionVehiculoMinisterial vVehiculo = new VerificacionVehiculoMinisterial();
//			vVehiculo = vVehiculo.verificacionVehiculoMinisterialEntity(vVehiculoEntity);
//			return vVehiculo;
//		} catch (NoResultException ex) {
//			throw new BusinessException("El Vin no existe.");
//		}
//	}
//
//	
//	/********Obtener Numero Motor *********/
//	public VerificacionVehiculoMinisterial obtenerNumeroMotor(String NumeroMotor) {
//		try {
//			VerificacionVehicularEntity vVehiculoEntity = vVehicularQuery.consultarNumeroMotor(NumeroMotor);
//			VerificacionVehiculoMinisterial vVehiculo = new VerificacionVehiculoMinisterial();
//			vVehiculo = vVehiculo.verificacionVehiculoMinisterialEntity(vVehiculoEntity);
//			return vVehiculo;
//		} catch (NoResultException ex) {
//			throw new BusinessException("El Numero de Motor no existe.");
//		}
//	}
//	
	/*********************** Regresa el numero de Seguimiento que se genero para mostrarlo en el alert *************************/
	public String numeroSeguimientoPorVin(String vin){
		
		try {
			String res = vVehicularQuery.obtenerNumeroSeguimiento(vin);
			return res;
		} catch (NoResultException ex) {
			return "N/A";
		}
		
	}

	/*******Obtiene verificacion por ID********/
	public VerificacionVehiculoMinisterial obtenerVerificacionPorId(Integer idVerificacionVehiculo) {
		try {
			VerificacionVehicularEntity verificacionVehicularEntity = entityManager.find(VerificacionVehicularEntity.class, idVerificacionVehiculo);
			return new VerificacionVehiculoMinisterial(verificacionVehicularEntity);
		} catch (NoResultException ex) {
			throw new BusinessException("No hay Verificaciones Registradas.");
		}
	}

}