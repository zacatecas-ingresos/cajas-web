package cajas.impuestos.declaracion.estatal;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import cajas.exception.BusinessException;
import cajas.util.RespuestaResource;

@Path("/calculoEstatal")
public class CalculoEstatalResource {

	@EJB
	private ImpuestosEstatalesEJB impuestosEstatalesEJB;

	/****** Calculos ********/
	/***** Actualiza un usuario *********/
	@PUT
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response calcularImpuesto(DeclaracionEstatal declaracionEstatal) {
		try {
			ImpuestoEstatal impuestoEstatal = impuestosEstatalesEJB.calcularImpuesto(declaracionEstatal);
			return Response.ok(impuestoEstatal).build();
		} catch (BusinessException ex) {
			return Response.status(Status.BAD_REQUEST).entity(RespuestaResource.respuesta("400",ex.getMessage())).build();
		}
	}

}