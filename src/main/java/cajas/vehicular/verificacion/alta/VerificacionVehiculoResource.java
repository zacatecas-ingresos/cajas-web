package cajas.vehicular.verificacion.alta;
import java.util.List;
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

@Path("/vehicular/verificacion")
public class VerificacionVehiculoResource {
	
	VerificacionVehiculoEJB verificacionVehiculoEjb;
	
	/**
	 * Crea un nuevo registro de Verificacion Vehiculo	 
	 * @param verificacionVehiculo
	 */
	@POST
	@Consumes({ "application/json" })
	public Response crearVerificacionVehiculo(CrearVerificacionVehiculo verificacionVehiculo) {
		try {
			verificacionVehiculoEjb.crearVerificacionVehiculo(verificacionVehiculo);
			return Response.ok(Status.OK,"application/json").tag("Verificacion de Vehiculo registrada correctamente.").build();
		} catch (BusinessException ex) {
			return Response.ok(Status.NOT_IMPLEMENTED,"application/json").tag(ex.getMessage()).build();
		}
	}
	
}
