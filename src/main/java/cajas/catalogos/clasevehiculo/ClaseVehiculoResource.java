package cajas.catalogos.clasevehiculo;

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

@Path("/catalogos/clasevehiculo")
public class ClaseVehiculoResource {
	@EJB
	ClaseVehiculoEJB claseVehiculoEjb;

	/**
	 * Crea un nuevo registro de Clase de Vehiculo
	 * 
	 * @param claseVehiculo
	 */
	@POST
	@Consumes({ "application/json" })
	public Response altaClaseVehiculo(ClaseVehiculo1 claseVehiculo) {
		try {
			claseVehiculoEjb.crearClaseVehiculo(claseVehiculo);
			return Response.ok(Status.OK,"application/json").tag("Clase de Vehiculo registrada correctamente.").build();
		} catch (BusinessException ex) {
			return Response.ok(Status.NOT_IMPLEMENTED,"application/json").tag(ex.getMessage()).build();
		}
	}

	/**
	 * Busca Clases de Vehiculo por un criterio en las propiedadesde:
	 *  nombre
	 *  abreviatura
	 *  
	 * @param criterio
	 * @return claseVehiculoList
	 **/
	@GET
	@Path("/buscarPorCriterio")
	@Produces({"application/json"})
	public Response buscarClaseVehiculoPorCriterio(@QueryParam("parametro")String criterio){
		try{
			List<ClaseVehiculo1> claseVehiculoList = claseVehiculoEjb.obtenerClasesVehiculoFiltro(criterio);
			return Response.ok(claseVehiculoList).build();
		}catch(BusinessException ex){
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

	/**
	 * Obtener toda la lista de marcas de vehiculos
	 *  
	 * @return claseVehiculoList
	 **/
	@GET
	@Path("/obtenerListaCompleta")
	@Produces({"application/json"})
	public Response obtenerListaCompletaClaseVehiculo(){
		try{
			List<ClaseVehiculo1> claseVehiculoList = claseVehiculoEjb.obtenerClasesVehiculoFiltro("");
			return Response.ok(claseVehiculoList).build();
		}catch(BusinessException ex){
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

	/**
	 * Obtiene un ClaseVehiculo por id
	 * 
	 * @param idClaseVehiculo
	 * @return claseVehiculo
	 */
	@GET
	@Produces({ "application/json" })
	public Response obtenerClaseVehiculoPorId(@QueryParam("idClaseVehiculo") Integer idClaseVehiculo) {
		try {
			ClaseVehiculo1 claseVehiculo = claseVehiculoEjb.obtenerClaseVehiculoPorId(idClaseVehiculo);
			return Response.ok(claseVehiculo).build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

	/**
	 * Actualiza una Clase de Vehiculo
	 * 
	 * @param claseVehiculo
	 */
	@PUT
	@Consumes({ "application/json" })
	public Response actualizarClaseVehiculo(ClaseVehiculo1 claseVehiculo) {
		try {
			claseVehiculoEjb.actualizarClaseVehiculo(claseVehiculo);
			return Response.ok(Status.OK,"application/json").build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

	/**
	 * Busca Clases de Vehiculo por un criterio en las propiedadesde:
	 *  nombre
	 *  abreviatura
	 *  
	 * @param criterio
	 * @return claseVehiculoList
	 */
	@GET
	@Path("/buscarClaseVehiculos")
	@Produces({"application/json"})
	public Response obtenerClaseVehiculosFiltro(@QueryParam("parametro") String parametro){
		try{
			List<ClaseVehiculo1> claseVehiculo = claseVehiculoEjb.obtenerClasesVehiculoFiltro(parametro);
			return Response.ok(claseVehiculo).build();
		}catch(BusinessException ex){
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}
	

	/**
	 * Elimina una ClaseVehiculo a partir del id de la Clase de Vehiculo
	 *  
	 * @param idClaseVehiculo
	 */
	@DELETE
	@Path("/eliminarClaseVehiculos")
	@Produces({ "application/json" })
	public Response eliminarClaseVehiculo(@QueryParam("idClaseVehiculo") Integer idClaseVehiculo) {
		try {
			claseVehiculoEjb.eliminarClaseVehiculo(idClaseVehiculo);
			return Response.ok(Status.OK,"application/json").build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}
}
