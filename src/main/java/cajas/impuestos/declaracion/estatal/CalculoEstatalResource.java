package cajas.impuestos.declaracion.estatal;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import cajas.exception.BusinessException;

@Path("/presupuestoEstatal")
public class CalculoEstatalResource {

	@Inject
	ImpuestosEstatalesEJB impuestosEstatalesEJB;

	/****** Calculos ********/
	/***** Actualiza un usuario *********/
	@PUT
	@Consumes({ "application/json" })
	public Response actualizarUsuario(DeclaracionEstatal declaracionEstatal) {
		System.out.println("CALCULANDO.............");
		try {
			ImpuestoEstatal impuestoEstatal = impuestosEstatalesEJB.calcularImpuesto(declaracionEstatal);
			return Response.ok(impuestoEstatal).build();
		} catch (BusinessException ex) {
			return Response.ok(Status.NOT_IMPLEMENTED, "application/json").tag(ex.getMessage()).build();
		}
	}

}