package cajas.impuestos.declaracion.estatal;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import cajas.exception.BusinessException;

@Path("/presupuestoEstatal")
public class CalculoEstatalResource {

	@EJB
	ImpuestosEstatalesEJB impuestosEstatalesEJB;

	/****** Calculos ********/
	/***** Actualiza un usuario *********/
	@PUT
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response actualizarUsuario(DeclaracionEstatal declaracionEstatal) {
		Map<String,String> respuesta = new HashMap<String,String>();
		try {
			ImpuestoEstatal impuestoEstatal = impuestosEstatalesEJB.calcularImpuesto(declaracionEstatal);
			return Response.ok(impuestoEstatal).build();
		} catch (BusinessException ex) {
			respuesta.put("code","400");
			respuesta.put("message",ex.getMessage());
			return Response.status(Status.BAD_REQUEST).entity(respuesta).build();
		}
	}

}