package cajas.vehicular.verificacion.ministerial;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import cajas.exception.BusinessException;

@Path("/vehicular/verificacionMinisterial")
public class VerificacionVehiculoMinisterialResource {
	
	@EJB
	VerificacionVehiculoMinisterialEJB verificacionVehiculoMinisterialEJB;
	
	/**
	 * Crea un nuevo registro de Verificacion Vehiculo	 
	 */
	@PUT
	@Consumes({ "application/json" })
	public Response guardarVerificacionMinisterialVehiculo(VerificacionVehiculoMinisterial verificacionVehiculoMinisterial) {
		try {
			verificacionVehiculoMinisterialEJB.guardarVerificacionMinisterialVehiculo(verificacionVehiculoMinisterial);
			Map<String,String> resultado = new HashMap<>();
			resultado.put("Status", "OK");
			resultado.put("valor", verificacionVehiculoMinisterialEJB.numeroSeguimientoPorVin(verificacionVehiculoMinisterial.getVinVehiculo()));
			return Response.ok(resultado,"application/json").build();
		} catch (BusinessException ex) {
			return Response.ok(Status.NOT_IMPLEMENTED,"application/json").tag(ex.getMessage()).build();
		}
	}	
	
//	/*****Comprueba si ya existe una verificacion con ese VIN *********/
//	@GET
//	@Path("/existeVin")
//	@Produces({"application/json"})
//	public Response exiteVin(@QueryParam("inputVin")String nombre){
//		
//		Map<String,String> resultado = new HashMap<>();
//		try{
//			VerificacionVehiculoMinisterial vVehiculo = verificacionVehiculoMinisterialEJB.obtenerVin(nombre);
//			if(vVehiculo.getVinVehiculo() != null){
//				resultado.put("valid", "false");//ya existe el vin
//				return Response.ok(resultado).build();	
//			}
//			resultado.put("valid", "true");//No existe el vin
//			return Response.ok(resultado).build();
//		}catch(BusinessException ex){
//			resultado.put("valid", "true");
//			return Response.ok(resultado).build();
//		}
//	}
//	
//	/*****Comprueba si ya existe una verificacion con ese Numero de Motor *********/
//	@GET
//	@Path("/existeNumeroMotor")
//	@Produces({"application/json"})
//	public Response exiteNumeroMotor(@QueryParam("inputNumeroMotor")String numeroMotor){
//		
//		Map<String,String> resultado = new HashMap<>();
//		try{
//			VerificacionVehiculoMinisterial vVehiculo = verificacionVehiculoMinisterialEJB.obtenerNumeroMotor(numeroMotor);
//			if(vVehiculo.getNumeroMotorVehiculo() != null){
//				resultado.put("valid", "false");//ya existe el vin
//				return Response.ok(resultado).build();	
//			}
//			resultado.put("valid", "true");//No existe el vin
//			return Response.ok(resultado).build();
//		}catch(BusinessException ex){
//			resultado.put("valid", "true");
//			return Response.ok(resultado).build();
//		}
//	}

	/*****Obtiene Verificacion por ID*********/
	@GET
	@Produces({ "application/json" })
	public Response obtenerVerificacioPorId(@QueryParam("idVerificacion")Integer id) {
		try {
			VerificacionVehiculoMinisterial verificacion = verificacionVehiculoMinisterialEJB.obtenerVerificacionPorId(id);
			return Response.ok(verificacion).build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}
}