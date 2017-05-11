package cajas.vehicular.padron;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import cajas.exception.BusinessException;

@Path("/vehicular/padron/agenciavehicular")
public class AgenciaVehicularResource {
	@EJB
	AgenciaVehicularEJB agenciaVehicularEJB;
	
	@GET
	@Path("/obtenerAgenciasVehiculos")
	@Produces({ "application/json" })
	public Response obtenerAgenciasVehiculos() {
		try {
			List<AgenciaVehiculo> agencias = agenciaVehicularEJB.obtenerAgenciasVehiculos();
			return Response.ok(agencias).build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

}
