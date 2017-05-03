package cajas.vehicular.verificacion.alta;
import java.util.HashMap;
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

@Path("/vehicular/verificacion/adeudo")
public class VerificacionAdeudoVehiculoResource {
	
	@EJB
	VerificacionAdeudoVehicularEJB verificacionVehiculoEjb;
	
	/**
	 * Crea un nuevo registro de Verificacion Adeudo Vehiculo	 
	 */
	@POST
	@Consumes({ "application/json" })
	public Response crearVerificacionVehiculo(VerificacionAdeudoVehicular verificacionAdeudoVehiculo) {
		try {
			verificacionVehiculoEjb.creaVerificacionAdeudoVehicular(verificacionAdeudoVehiculo);			
			Map<String,String> resultado = new HashMap<>();
			resultado.put("Status", "OK");		
			return Response.ok(resultado,"application/json").build();
		} catch (BusinessException ex) {
			return Response.ok(Status.NOT_IMPLEMENTED,"application/json").tag(ex.getMessage()).build();
		}
	}	
	
}
