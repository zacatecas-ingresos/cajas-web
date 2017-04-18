package cajas.config.periodos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import cajas.exception.BusinessException;

@Path("/periodos")
public class PeriodoResource {

	@EJB
	PeriodoEJB periodoEJB;

	@GET
	@Produces({ "application/json" })
	public Response periodos(@QueryParam("aFiscal")Integer aFiscal) {
		Map<String,String> respuesta = new HashMap<String,String>();
		try {
			List<Periodo> periodos = periodoEJB.periodos(aFiscal);
			return Response.ok(periodos).build();
		} catch (BusinessException ex) {
			respuesta.put("code","400");
			respuesta.put("message",ex.getMessage());
			return Response.status(Status.BAD_REQUEST).entity(respuesta).build();
		}
	}

}