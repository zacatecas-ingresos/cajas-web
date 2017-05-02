package cajas.impuestos.declaracion.estatal;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import cajas.exception.BusinessException;
import cajas.util.RespuestaResource;

@Path("/validarContribuyente")
public class ValidacionContribuyenteResource {

	@EJB
	ValidarContribuyenteEJB validarContribuyenteEJB;

	@GET
	@Path("/contribuyente")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response obtenerContribuyentePorRFC(@QueryParam("rfc") String rfc) {
		try {
			InfoContribuyente contribuyente = validarContribuyenteEJB.obtenerContribuyentePoRfc(rfc);
			return Response.status(Status.OK).entity(contribuyente).build();
		} catch (BusinessException ex) {
			return Response.status(Status.BAD_REQUEST).entity(RespuestaResource.respuesta("400",ex.getMessage())).build();
		}
	}

	@GET
	@Path("/sucursales")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response obtenerSucursales(@QueryParam("idContribuyente") Integer idContribuyente,
			@QueryParam("idObligacion") Integer idObligacion) {
		try {
			List<Sucursal> sucursales = validarContribuyenteEJB.obtenerSucursales(idContribuyente, idObligacion);
			return Response.status(Status.OK).entity(sucursales).build();
		} catch (BusinessException ex) {
			return Response.status(Status.BAD_REQUEST).entity(RespuestaResource.respuesta("400",ex.getMessage())).build();
		}
	}

}