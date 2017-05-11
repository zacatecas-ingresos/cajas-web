package cajas.vehicular.padron;
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

@Path("/vehicular/padron/serviciovehicular")
public class ServicioVehiculoResource {
	
	@EJB
	ServicioVehiculoEJB servicioVehicularEJB;
	
	@GET
	@Path("/obtenerServiciosVehiculares")
	@Produces({ "application/json" })
	public Response obtenerServiciosVehiculares() {
		try {
			List<ServicioVehiculo> servicios = servicioVehicularEJB.obtenerServiciosVehiculos();
			return Response.ok(servicios).build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

}
