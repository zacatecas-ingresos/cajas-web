package cajas.impuestos.declaracion.estatal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import cajas.exception.BusinessException;

@Path("/validarContribuyente")
public class ValidacionContribuyenteResource {

	@EJB
	ValidarContribuyenteEJB validarContribuyenteEJB;

	@GET
	@Path("/contribuyente")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response obtenerContribuyentePorRFC(@QueryParam("rfc") String rfc) {
		Map<String, String> respuesta = new HashMap<String, String>();
		try {
			InfoContribuyente contribuyente = validarContribuyenteEJB.obtenerContribuyentePoRfc(rfc);
			return Response.status(Status.OK).entity(contribuyente).build();
		} catch (BusinessException ex) {
			respuesta.put("code", "400");
			respuesta.put("message", ex.getMessage());
			return Response.status(Status.BAD_REQUEST).entity(respuesta).build();
		}
	}

	@GET
	@Path("/sucursales")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response obtenerSucursales(@QueryParam("idContribuyente") Integer idContribuyente,
			@QueryParam("idObligacion") Integer idObligacion) {
		Map<String, String> respuesta = new HashMap<String, String>();
		try {
			List<Sucursal> sucursales = validarContribuyenteEJB.obtenerSucursales(idContribuyente, idObligacion);
			return Response.status(Status.OK).entity(sucursales).build();
		} catch (BusinessException ex) {
			respuesta.put("code", "400");
			respuesta.put("message", ex.getMessage());
			return Response.status(Status.BAD_REQUEST).entity(respuesta).build();
		}
	}

}