package cajas.config.ejerciciosfiscales;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import cajas.exception.BusinessException;

@Path("/ejerciciosFiscales")
public class EjercicioResource {

	@EJB
	EjercicioEJB ejercicioFiscalEJB;

	@GET
	@Produces({ "application/json" })
	public Response ejerciciosFiscales() {
		Map<String,String> respuesta = new HashMap<String,String>();
		try {
			List<EjercicioFiscal> ejercicios = ejercicioFiscalEJB.ejerciciosFiscales();
			return Response.ok(ejercicios).build();
		} catch (BusinessException ex) {
			respuesta.put("code","400");
			respuesta.put("message",ex.getMessage());
			return Response.status(Status.BAD_REQUEST).entity(respuesta).build();
		}
	}

}