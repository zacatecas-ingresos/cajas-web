package cajas.impuestos.presupuesto;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
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
			Presupuesto presupuestoGenerado = new Presupuesto();
			List<Integer> presupuesto = new ArrayList<>();
			for (ImpuestoEstatal im : impuestoEstatal) {
				presupuesto.add(im.getIdCalculoTemporal());
			}
			Integer idPresupuesto = presupuestoEJB.generarPresupuestoEstatal(presupuesto);
			presupuestoGenerado.setIdPresupuesto(idPresupuesto);
			return Response.status(Status.OK).entity(presupuestoGenerado).build();
		} catch (BusinessException ex) {
			return Response.status(Status.BAD_REQUEST).entity(RespuestaResource.respuesta("400",ex.getMessage())).build();
		}
	}

	@POST
	@Path("/actualizaPresupuesto")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response cambiarEstatusPresupuestoPorId(@QueryParam("idPresupuesto")Integer idPresupuesto, @QueryParam("estatus")Integer estatus){
		try{
			presupuestoEJB.cambiarEstatusPresupuestoPorId(idPresupuesto, estatus);
			return Response.status(Status.OK).build();
		}catch (BusinessException ex) {
			return Response.status(Status.BAD_REQUEST).entity(RespuestaResource.respuesta("400",ex.getMessage())).build();
		}
	}
	
	@POST
	@Path("/actualizaPresupuestoLCC")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response cambiarEstatusPresupuestoPorLCC(@QueryParam("lcc")String lcc,@QueryParam("estatus")Integer estatus){
		try{
			presupuestoEJB.cambiarEstatusPresupuestoPorlcc(lcc, estatus);
			return Response.status(Status.OK).build();
		}catch (BusinessException ex) {
			return Response.status(Status.BAD_REQUEST).entity(RespuestaResource.respuesta("400",ex.getMessage())).build();
		}
	}
	
}