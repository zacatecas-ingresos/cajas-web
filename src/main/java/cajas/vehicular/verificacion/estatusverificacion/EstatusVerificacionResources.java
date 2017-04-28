package cajas.vehicular.verificacion.estatusverificacion;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import cajas.exception.BusinessException;

public class EstatusVerificacionResources {
	@Inject
	private EstatusVerificacionEJB estatusVerificacionEJB;
	@GET
	@Produces({ "application/json" })
	public Response obtenerEstatusVerificacionPorId(@QueryParam("idEstatusVerificacion")Integer id) {
		try {
			EstatusVerificacion estatusverificacion = estatusVerificacionEJB.obtenerEstatusVerificacionPorId(id);
			return Response.ok(estatusverificacion).build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}
}