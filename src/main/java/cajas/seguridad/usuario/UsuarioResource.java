package cajas.seguridad.usuario;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	/********Registra un nuevo usuario*******/
	@POST
	@Consumes({ "application/json" })
	public Response altaUsuario(RegistroUsuario usuario) {
		try {
			usuarioService.crearUsuario(usuario);
			return Response.ok(Status.OK,"application/json").tag("Usuario registrado correctamente.").build();
		} catch (BusinessException ex) {
			return Response.ok(Status.NOT_IMPLEMENTED,"application/json").tag(ex.getMessage()).build();
		}
	}
	
	
	/*****Compureba si existe un usuario por su nombre de usuario*********/
	@GET
	@Path("/existeNombreUsuario")
	@Produces({"application/json"})
	public Response exiteNombreUsuario(@QueryParam("inputUser")String nombre){
		Map<String,String> resultado = new HashMap<>();
		try{
			Usuario usuario = usuarioService.obtenerUsuarioPorNombre(nombre);
			if(usuario.getNombre() != null){
				resultado.put("valid", "false");//ya existe
				return Response.ok(resultado).build();	
			}
			resultado.put("valid", "true");
			return Response.ok(resultado).build();
		}catch(BusinessException ex){
			resultado.put("valid", "true");
			return Response.ok(resultado).build();
		}
	}
	
	/*****Compureba si existe un usuario por su nombre de usuario usado en la edición*********/
	@GET
	@Path("/existeNombreUsuarioEdicion")
	@Produces({"application/json"})
	public Response exiteNombreUsuarioEdicion(@QueryParam("inputUser")String nombre,@QueryParam("idUsuario")Integer idUsuario){
		Map<String,String> resultado = new HashMap<>();
		try{
			Usuario usuario = usuarioService.obtenerUsuarioPorId(idUsuario);
			if(usuario.getNombre().equals(nombre)){
				resultado.put("valid","true");//no existe
				return Response.ok(resultado).build();
			}else{
				usuario = usuarioService.obtenerUsuarioPorNombre(nombre);
				if(usuario.getNombre() != null){
					resultado.put("valid","false");// ya existe
					return Response.ok(resultado).build();	
				}
				resultado.put("valid","true");
				return Response.ok(resultado).build();
			}
		}catch(BusinessException ex){
			resultado.put("valid","true");
			return Response.ok(resultado).build();
		}
	}
	
	/*****Compureba si existe un usuario por su email*********/
	@GET
	@Path("/existeEmail")
	@Produces({"application/json"})
	public Response existeEmail(@QueryParam("inputEmail")String email){
		Map<String,String> resultado = new HashMap<>();
		try{
			Usuario usuario = usuarioService.obtenerUsuarioPorCorreo(email);
			if(usuario.getEmail()!= null){
				resultado.put("valid","false");
				return Response.ok(resultado).build();	
			}
			resultado.put("valid","true");
			return Response.ok(resultado).build();
		}catch(BusinessException ex){
			resultado.put("valid","true");
			return Response.ok(resultado).build();
		}
	}
	
	/*****Compureba si existe un usuario por su email usado en edición*********/
	@GET
	@Path("/existeEmailEdicion")
	@Produces({"application/json"})
	public Response existeEmailEdicion(@QueryParam("inputEmail")String email,@QueryParam("idUsuario")Integer idUsuario){
		Map<String,String> resultado = new HashMap<>();
		try{
			Usuario usuario = usuarioService.obtenerUsuarioPorId(idUsuario);
			if(usuario.getEmail().equals(email)){
				resultado.put("valid","true");
				return Response.ok(resultado).build();
			}else{
				usuario = usuarioService.obtenerUsuarioPorNombre(email);
				if(usuario.getEmail() != null){
					resultado.put("valid","false");
					return Response.ok(resultado).build();	
				}
				resultado.put("valid","true");
				return Response.ok(resultado).build();
			}
		}catch(BusinessException ex){
			resultado.put("valid","true");
			return Response.ok(resultado).build();
		}
	}


	/*****Actualiza un usuario*********/
	@PUT
	@Consumes({ "application/json" })
	public Response actualizarUsuario(RegistroUsuario usuario) {
		try {
			usuarioService.actualizarUsuario(usuario);
			return Response.ok(Status.OK,"application/json").build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

	/*****Solo desactiva a un usuario*********/
	@PUT
	@Path("/desactivarUsuario")
	public Response desactivarUsuario(@QueryParam("idUsuario") Integer idUsuario) {
		try {
			usuarioService.desactivarActivarUsuario(idUsuario);
			return Response.ok(Status.OK,"application/json").build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}
	
	/*****Solo activa a un usuario*********/
	@PUT
	@Path("/activarUsuario")
	public Response activarUsuario(@QueryParam("idUsuario") Integer idUsuario) {
		try {
			usuarioService.desactivarActivarUsuario(idUsuario);
			return Response.ok(Status.OK,"application/json").build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

	/*****Obtiene un usuario por email*********/
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

	/*****Obtiene un usuario por nombre de usuario*********/
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
	
	/*****Obtiene un usuario por id*********/
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

	/*****Obtiene los usuarios registrados*********/
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
	
	
	/************Obtiene una lista de usuarios de acuerdo al paramtero recibida y 
	 * encontrando aquellos que coinciden
	 */
	@GET
	@Path("/buscarUsuarios")
	@Produces({"application/json"})
	public Response obtenerUsuariosFiltro(@QueryParam("parametro")String parametroBusqueda){
		try{
			List<Usuario> usuarios = usuarioService.obtenerUsuariosFiltro(parametroBusqueda);
			return Response.ok(usuarios).build();
		}catch(BusinessException ex){
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}
	

	/*****Elimina un usuario*********/
	@DELETE
	@Produces({ "application/json" })
	public Response eliminarUsuario(@QueryParam("idUsuario") Integer idUsuario) {
		try {
			usuarioService.eliminarUsuario(idUsuario);
			return Response.ok(Status.OK,"application/json").build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

}