package cajas.contribuyentes;
 
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import cajas.exception.BusinessException;
import cajas.persistence.entity.VerificadorEntity;

@Path("/verificadores")
public class VerificadorResource {
	@EJB
	VerificadorEJB verificadorEJB;

	@POST
	@Consumes({ "application/json" })
	public Response altaUsuario(VerificadorEntity usuario) {
		try {
			verificadorEJB.crearVerificador(usuario);
			return Response.ok(Status.OK,"application/json").tag("verificador registrado correctamente.").build();
		} catch (BusinessException ex) {
			return Response.ok(Status.NOT_IMPLEMENTED,"application/json").tag(ex.getMessage()).build();
		}
	}

	
	@POST
	@Consumes({ "application/json" })
	public Response actualizarUsuario(VerificadorEntity usuario) {
		try {
			verificadorEJB.actualizarUsuario(usuario);
			return Response.ok(Status.OK,"application/json").build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}
	@POST
	@Path("/verificadorPorNombre")
	@Produces({ "application/json" })
	public Response obtenerUsuarioPorNombre(@QueryParam("nombre") String nombre) {
		try {
			//VerificadorEntity usuario = VerificadorEJB.obtenerUsuarioPorNombre(nombre);
			//return Response.ok(usuario).build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
		return null;
	
	}	
	@POST
	@Path("/verificadorPorId")
	@Produces({ "application/json" })
	public Response obtenerUsuarioPorId(@QueryParam("idUsuario") Integer idUsuario) {
		try {
			//Integer usuario = VerificadorEJB.obtenerUsuarioPorId(idUsuario);
		//	return Response.ok(usuario).build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
		return null;
	}
	@DELETE
	@Produces({ "application/json" })
	public Response eliminarUsuario(@QueryParam("idUsuario"	) Integer idUsuario) {
		try {
			verificadorEJB.eliminarUsuario(idUsuario);
			return Response.ok(Status.OK,"application/json").build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}
}
