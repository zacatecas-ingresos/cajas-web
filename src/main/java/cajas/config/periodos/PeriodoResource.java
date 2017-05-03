package cajas.config.periodos;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import cajas.exception.BusinessException;
import cajas.util.RespuestaResource;

@Path("/periodos")
public class PeriodoResource {

	@EJB
	PeriodoEJB periodoEJB;

	@GET
	@Produces({ "application/json" })
	public Response periodos(@QueryParam("aFiscal")Integer aFiscal) {
		try {
			List<Periodo> periodos = periodoEJB.periodos(aFiscal);
			return Response.ok(periodos).build();
		} catch (BusinessException ex) {
			return Response.status(Status.BAD_REQUEST).entity(RespuestaResource.respuesta("400",ex.getMessage())).build();
		}
	}

}