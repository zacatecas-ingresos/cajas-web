package cajas.vehicular.verificacion.alta;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import org.joda.time.DateTime;

import cajas.exception.BusinessException;
import cajas.persistence.entity.MarcaVehiculoEntity;
import cajas.persistence.entity.VerificacionVehicularEntity;
import cajas.persistence.query.VerificacionVehicularQuery;

@Stateless
public class VerificacionVehiculoEJB {
	
	@Inject
	VerificacionVehicularQuery vVehicularQuery; 
	
	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	public void crearVerificacionVehiculoMetodo(VerificacionVehiculo verificacionVehiculo) {
		
		try {
			
			VerificacionVehicularEntity verificacionVehiculoEntity = new VerificacionVehicularEntity();
			verificacionVehiculoEntity.setIdOficinaVerificacion(verificacionVehiculo.getIdOficinaVerificacion());
			verificacionVehiculoEntity.setEjercicio(verificacionVehiculo.getEjercicio());
			verificacionVehiculoEntity.setEstatusVerificacion(verificacionVehiculo.getEstatusVerificacion());
			verificacionVehiculoEntity.setFechaVerificacion(DateTime.now().toDate());
			verificacionVehiculoEntity.setVinVehiculo(verificacionVehiculo.getVinVehiculo());
			verificacionVehiculoEntity.setNumeroMotorVehiculo(verificacionVehiculo.getNumeroMotorVehiculo());	
			if (verificacionVehiculo.getIdMarcaVehiculo() != null && verificacionVehiculo.getIdMarcaVehiculo() > 0) {
				MarcaVehiculoEntity marcaVehiculo = entityManager.find(MarcaVehiculoEntity.class,verificacionVehiculo.getIdMarcaVehiculo());
				verificacionVehiculoEntity.setMarcaVehiculo(marcaVehiculo);
			}
			verificacionVehiculoEntity.setModeloVehiculo(verificacionVehiculo.getModeloVehiculo());
			verificacionVehiculoEntity.setIdClaseVehiculo(verificacionVehiculo.getIdClaseVehiculo());
			verificacionVehiculoEntity.setIdTipoVehiculo(verificacionVehiculo.getIdTipoVehiculo());
			verificacionVehiculoEntity.setLineaVehiculo(verificacionVehiculo.getLineaVehiculo());
			verificacionVehiculoEntity.setNombrePersonaVerificacion(verificacionVehiculo.getNombrePersonaVerificacion());
			verificacionVehiculoEntity.setApellidoPaternoPersonaVerificacion(verificacionVehiculo.getApellidoPaternoPersonaVerificacion());
			verificacionVehiculoEntity.setApellidoMaternoPersonaVerificacion(verificacionVehiculo.getApellidoMaternoPersonaVerificacion());
			verificacionVehiculoEntity.setFacturaVehiculoDocumentacion(verificacionVehiculo.getFacturaVehiculoDocumentacion());
			verificacionVehiculoEntity.setIdentificacionOficialDocumentacion(verificacionVehiculo.getIdentificacionOficialDocumentacion());
			verificacionVehiculoEntity.setIdentificacionRepresentanteLegalDocumentacion(verificacionVehiculo.getIdentificacionRepresentanteLegalDocumentacion());
			verificacionVehiculoEntity.setComprobanteDomicilioDocumentacion(verificacionVehiculo.getComprobanteDomicilioDocumentacion());
			verificacionVehiculoEntity.setRfcPersonaMoralDocumentacion(verificacionVehiculo.getRfcPersonaMoralDocumentacion());
			verificacionVehiculoEntity.setAnioActualComprobantePago((Integer)verificacionVehiculo.getAnioActualComprobantePago());	
			verificacionVehiculoEntity.setAnio1ComprobantePago((Integer)verificacionVehiculo.getAnio1ComprobantePago());
			verificacionVehiculoEntity.setAnio2ComprobantePago((Integer)verificacionVehiculo.getAnio2ComprobantePago());
			verificacionVehiculoEntity.setAnio3ComprobantePago((Integer)verificacionVehiculo.getAnio3ComprobantePago());
			verificacionVehiculoEntity.setAnio4ComprobantePago((Integer)verificacionVehiculo.getAnio4ComprobantePago());
			verificacionVehiculoEntity.setAnio5ComprobantePago((Integer)verificacionVehiculo.getAnio5ComprobantePago());			
			verificacionVehiculoEntity.setNoSeguimientoVerificacion(vVehicularQuery.generarNumeroSeguimiento(verificacionVehiculo.getIdOficinaVerificacion(),verificacionVehiculo.getEjercicio()));
			vVehicularQuery.registrarVerificacion(verificacionVehiculoEntity);
		} catch (PersistenceException ex) {
			ex.printStackTrace();
			throw new BusinessException("Ocurrio un problema al registrar al registrar la Verificación del Vehiculo.");
		}
	}
	
	/********Obtener VIN *********/
	public VerificacionVehiculo obtenerVin(String vin) {
		try {
			VerificacionVehicularEntity vVehiculoEntity = vVehicularQuery.consultar(vin);
			VerificacionVehiculo vVehiculo = new VerificacionVehiculo();
			vVehiculo = vVehiculo.verificacionVehiculoEntity(vVehiculoEntity);
			return vVehiculo;
		} catch (NoResultException ex) {
			throw new BusinessException("El Vin no existe.");
		}
	}

	
	/********Obtener Numero Motor *********/
	public VerificacionVehiculo obtenerNumeroMotor(String NumeroMotor) {
		try {
			VerificacionVehicularEntity vVehiculoEntity = vVehicularQuery.consultarNumeroMotor(NumeroMotor);
			VerificacionVehiculo vVehiculo = new VerificacionVehiculo();
			vVehiculo = vVehiculo.verificacionVehiculoEntity(vVehiculoEntity);
			return vVehiculo;
		} catch (NoResultException ex) {
			throw new BusinessException("El Numero de Motor no existe.");
		}
	}
	
	/*********************** Regresa el numero de Seguimiento que se genero para mostrarlo en el alert *************************/
	public String numeroSeguimientoPorVin(String vin){
		
		try {
			String res = vVehicularQuery.obtenerNumeroSeguimiento(vin);
			return res;
		} catch (NoResultException ex) {
			return "N/A";
		}
		
	}
	
	/*******Obtiene la lista de Verificaciones registradas********/
	public List<VerificacionVehiculo> obtenerVerificaciones() {
		try {
			List<VerificacionVehicularEntity> verificacionesEntity = vVehicularQuery.obtenerVerificaciones();
			List<VerificacionVehiculo> verificaciones = new ArrayList<>();
			
			for (VerificacionVehicularEntity verificacionEntity : verificacionesEntity) {
				VerificacionVehiculo verificacion = new VerificacionVehiculo();
				verificacion = verificacion.verificacionVehiculoEntity(verificacionEntity);
				verificaciones.add(verificacion);
			}
			return verificaciones;
		} catch (NoResultException ex) {
			throw new BusinessException("No hay Verificaciones Registradas.");
		}
	}
	
	/*******Obtiene verificacion por ID********/
	public List<VerificacionVehiculo> obtenerVerificacionPorId(Integer id) {
		try {
			List<VerificacionVehicularEntity> verificacionesEntity = vVehicularQuery.obtenerVerificacion(id);
			List<VerificacionVehiculo> verificaciones = new ArrayList<>();
			
			for (VerificacionVehicularEntity verificacionEntity : verificacionesEntity) {
				VerificacionVehiculo verificacion = new VerificacionVehiculo();
				
				String pattern = "dd-MM-yyyy";
			    SimpleDateFormat format = new SimpleDateFormat(pattern);
			   String fechaVerificacion = format.format(verificacionEntity.getFechaVerificacion());
			   verificacion.setFechaVerificacion(fechaVerificacion);
			   
			   String fechaVerificacionMinisterial = format.format(verificacionEntity.getFechaVerificacionMinisterial());
			   verificacion.setFechaVerificacionMinisterial(fechaVerificacionMinisterial);
			   
				verificacion = verificacion.verificacionVehiculoEntity(verificacionEntity);
				verificaciones.add(verificacion);
			}
			return verificaciones;
		} catch (NoResultException ex) {
			throw new BusinessException("No hay Verificaciones Registradas.");
		}
	}
	
	/*******Obtiene la lista de aquellos usuarios que coincidan con el parametro recibido********/
	public List<VerificacionVehiculo> obtenerVerificacionesFiltro(String criterioBusqueda) {
		try {
			List<VerificacionVehicularEntity> verificacionesEntity = vVehicularQuery.obtenerVerificaconesFiltro(criterioBusqueda);
			List<VerificacionVehiculo> verificaciones = new ArrayList<>();
			
			for (VerificacionVehicularEntity verificacionEntity : verificacionesEntity) {
				VerificacionVehiculo verificacion = new VerificacionVehiculo();
				verificacion = verificacion.verificacionVehiculoEntity(verificacionEntity);
				verificaciones.add(verificacion);
			}
			return verificaciones;
		} catch (NoResultException ex) {
			throw new BusinessException("No hay Verificaciones Registradas.");
		}
	}

}
