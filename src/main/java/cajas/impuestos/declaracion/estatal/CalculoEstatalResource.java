package cajas.impuestos.declaracion.estatal;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import cajas.exception.BusinessException;


@Path("/presupuestoEstatal")
public class CalculoEstatalResource {
	
	
	@EJB
	CalculoEstatalService calculoEstatalService;
	
	
	/****** Calculos********/
	/*****Actualiza un usuario*********/
	@GET
	@Consumes({ "application/json" })
	public Response actualizarUsuario(DeclaracionEstatal declaracionEstatal) {
		System.out.println("CALCULANDO.............");
		try{
			ImpuestoEstatal impuestoEstatal = calculoEstatalService.calcularImpuesto(declaracionEstatal);
		}catch(BusinessException ex){
			ex.printStackTrace();
		}
		return null;
	}

}