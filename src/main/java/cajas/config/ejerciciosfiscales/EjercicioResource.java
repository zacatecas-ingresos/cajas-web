package cajas.config.ejerciciosfiscales;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import cajas.exception.BusinessException;
import cajas.util.RespuestaResource;

@Path("/ejerciciosFiscales")
public class EjercicioResource {

	@EJB
	EjercicioEJB ejercicioFiscalEJB;

	@GET
	@Produces({ "application/json" })
	public Response ejerciciosFiscales() {
		try {
			List<EjercicioFiscal> ejercicios = ejercicioFiscalEJB.ejerciciosFiscales();
			return Response.ok(ejercicios).build();
		} catch (BusinessException ex) {
			return Response.status(Status.BAD_REQUEST).entity(RespuestaResource.respuesta("400",ex.getMessage())).build();
		}
	}

}