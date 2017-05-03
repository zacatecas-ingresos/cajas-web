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
import cajas.util.RespuestaResource;

@Path("/presupuestos")
public class PresupuestoResource {

	@EJB
	PresupuestoEJB presupuestoEJB;

	@POST
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response guardarPresupuesto(List<ImpuestoEstatal> impuestoEstatal) {
		try {
			Map<String,Integer> respuesta = new HashMap<String,Integer>();
			List<Integer> presupuesto = new ArrayList<>();
			for (ImpuestoEstatal im : impuestoEstatal) {
				presupuesto.add(im.getIdCalculoTemporal());
			}
			Integer idPresupuesto = presupuestoEJB.generarPresupuestoEstatal(presupuesto);
			respuesta.put("idPresupuesto",idPresupuesto);
			return Response.status(Status.OK).entity(respuesta).build();
		} catch (BusinessException ex) {
			return Response.status(Status.BAD_REQUEST).entity(RespuestaResource.respuesta("400",ex.getMessage())).build();
		}
	}

}