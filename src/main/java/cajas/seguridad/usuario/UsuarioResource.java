package cajas.seguridad.usuario;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import cajas.exception.BusinessException;

@Path("/usuario")
public class UsuarioResource {

	@EJB
	UsuarioService usuarioService;

	@POST
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response altaUsuario(RegistroUsuario usuario) {
		try {
			usuarioService.crearUsuario(usuario);
			return Response.status(Status.OK).tag("Usuario registrado correctamente.").build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

	@PUT
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response actualizarUsuario(RegistroUsuario usuario) {
		try {
			usuarioService.actualizarUsuario(usuario);
			return Response.status(Status.OK).tag("Usuario actualizado correctamente.").build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

	@PUT
	@Path("/desactivarUsuario")
	@Produces({ "application/json" })
	public Response desactivarUsuario(@QueryParam("idUsuario") Integer idUsuario) {
		try {
			usuarioService.desactivarUsuario(idUsuario);
			return Response.status(Status.OK).tag("Usuario desactivado correctamente.").build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

	@GET
	@Path("/usuarioPorCorreo")
	@Produces({ "application/json" })
	public Response obtenerUsuarioPorCorreo(@QueryParam("correo") String correo) {
		try {
			Usuario usuario = usuarioService.obtenerUsuarioPorCorreo(correo);
			return Response.ok(usuario).build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

	@GET
	@Path("/usuarioPorNombre")
	@Produces({ "application/json" })
	public Response obtenerUsuarioPorNombre(@QueryParam("nombre") String nombre) {
		try {
			Usuario usuario = usuarioService.obtenerUsuarioPorNombre(nombre);
			return Response.ok(usuario).build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

	@GET
	@Path("/usuarioPorId")
	@Produces({ "application/json" })
	public Response obtenerUsuarioPorId(@QueryParam("idUsuario") Integer idUsuario) {
		try {
			Usuario usuario = usuarioService.obtenerUsuarioPorId(idUsuario);
			return Response.ok(usuario).build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

	@GET
	@Produces({ "application/json" })
	public Response obtenerUsuarios() {
		try {
			List<Usuario> usuarios = usuarioService.obtenerUsuarios();
			return Response.ok(usuarios).build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

	@DELETE
	@Produces({ "application/json" })
	public Response eliminarUsuario(@QueryParam("idUsuario") Integer idUsuario) {
		try {
			usuarioService.eliminarUsuario(idUsuario);
			return Response.status(Status.OK).tag("Usuario eliminado correctamente.").build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

}