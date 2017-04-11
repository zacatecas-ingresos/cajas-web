package cajas.vehicular.verificacion.alta;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import cajas.exception.BusinessException;
import cajas.seguridad.usuario.Usuario;

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
			return Response.ok(Status.OK,"application/json").tag("Verificacion de Vehiculo registrada correctamente.").build();
		} catch (BusinessException ex) {
			return Response.ok(Status.NOT_IMPLEMENTED,"application/json").tag(ex.getMessage()).build();
		}
	}
	
	
	/*****Compureba si ya existe una verificacion con ese VIN *********/
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
	
	
}
