package cajas.vehicular.verificacion.alta;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import cajas.exception.BusinessException;

@Path("/vehicular/verificacion")
public class VerificacionVehiculoResource {
	
	@EJB
	VerificacionVehiculoEJB verificacionVehiculoEjb;
	
	/**
	 * Crea un nuevo registro de Verificacion Vehiculo	 
	 */
	@POST
	@Consumes({ "application/json" })
	public Response crearVerificacionVehiculo(VerificacionVehiculo verificacionVehiculo) {
		try {
			verificacionVehiculoEjb.crearVerificacionVehiculoMetodo(verificacionVehiculo);			
			Map<String,String> resultado = new HashMap<>();
			resultado.put("Status", "OK");
			resultado.put("valor", verificacionVehiculoEjb.numeroSeguimientoPorVin(verificacionVehiculo.getVinVehiculo()));
			return Response.ok(resultado,"application/json").build();
		} catch (BusinessException ex) {
			return Response.ok(Status.NOT_IMPLEMENTED,"application/json").tag(ex.getMessage()).build();
		}
	}	
	
	/*****Comprueba si ya existe una verificacion con ese VIN *********/
	@GET
	@Path("/existeVin")
	@Produces({"application/json"})
	public Response exiteVin(@QueryParam("inputVin")String nombre){
		
		Map<String,String> resultado = new HashMap<>();
		try{
			VerificacionVehiculo vVehiculo = verificacionVehiculoEjb.obtenerVin(nombre);
			if(vVehiculo.getVinVehiculo() != null){
				resultado.put("valid", "false");//ya existe el vin
				return Response.ok(resultado).build();	
			}
			resultado.put("valid", "true");//No existe el vin
			return Response.ok(resultado).build();
		}catch(BusinessException ex){
			resultado.put("valid", "true");
			return Response.ok(resultado).build();
		}
	}
	
	/*****Comprueba si ya existe una verificacion con ese Numero de Motor *********/
	@GET
	@Path("/existeNumeroMotor")
	@Produces({"application/json"})
	public Response exiteNumeroMotor(@QueryParam("inputNumeroMotor")String numeroMotor){
		
		Map<String,String> resultado = new HashMap<>();
		try{
			VerificacionVehiculo vVehiculo = verificacionVehiculoEjb.obtenerNumeroMotor(numeroMotor);
			if(vVehiculo.getNumeroMotorVehiculo() != null){
				resultado.put("valid", "false");//ya existe el vin
				return Response.ok(resultado).build();	
			}
			resultado.put("valid", "true");//No existe el vin
			return Response.ok(resultado).build();
		}catch(BusinessException ex){
			resultado.put("valid", "true");
			return Response.ok(resultado).build();
		}
	}
	
	/*****Obtiene los usuarios registrados*********/
	@GET
	@Path("/obtenerVerificaciones")
	@Produces({ "application/json" })
	public Response obtenerVerificaciones() {
		try {
			List<VerificacionVehiculo> verificaciones = verificacionVehiculoEjb.obtenerVerificaciones();
			return Response.ok(verificaciones).build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}
	
	/*****Obtiene Verificacion por ID*********/
	@GET
	@Path("/obtenerVerificacioPorID")
	@Produces({ "application/json" })
	public Response obtenerVerificacioPorID(@QueryParam("id")Integer id) {
		try {
			List<VerificacionVehiculo> verificaciones = verificacionVehiculoEjb.obtenerVerificacionPorId(id);
			return Response.ok(verificaciones).build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}
	
	
	/************Obtiene una lista de usuarios de acuerdo al paramtero recibida y 
	 * encontrando aquellos que coinciden
	 */
	@GET
	@Path("/buscarPorCriterio")
	@Produces({"application/json"})
	public Response buscarPorCriterio(@QueryParam("criterioBusqueda")String criterioBusqueda){
		try{
			List<VerificacionVehiculo> verificaciones = verificacionVehiculoEjb.obtenerVerificacionesFiltro(criterioBusqueda);
			return Response.ok(verificaciones).build();
		}catch(BusinessException ex){
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}
	
	
	
	
}
