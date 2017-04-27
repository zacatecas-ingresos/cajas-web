package cajas.impuestos.presupuesto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import cajas.exception.BusinessException;
import cajas.impuestos.declaracion.estatal.ImpuestoEstatal;

@Path("/presupuestos")
public class PresupuestoResource {

	@EJB
	PresupuestoEJB presupuestoEJB;

	@POST
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response guardarPresupuesto(List<ImpuestoEstatal> impuestoEstatal) {
		Map<String, String> respuesta = new HashMap<String, String>();
		try {
			List<Integer> presupuesto = new ArrayList<>();
			for (ImpuestoEstatal im : impuestoEstatal) {
				presupuesto.add(im.getIdCalculoTemporal());
			}
			presupuestoEJB.generarPresupuestoEstatal(presupuesto);
			return Response.ok(Status.OK).build();
		} catch (BusinessException ex) {
			respuesta.put("code", "400");
			respuesta.put("message", ex.getMessage());
			return Response.status(Status.BAD_REQUEST).entity(respuesta).build();
		}
	}

}