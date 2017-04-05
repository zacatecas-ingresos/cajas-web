package cajas.catalogos.marcavehiculo;

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

@Path("/catalogos/marcavehiculo")
public class MarcaVehiculoResource {
	@EJB
	MarcaVehiculoEJB marcaVehiculoEjb;

	/**
	 * Crea un nuevo registro de Marca de Vehiculo
	 * 
	 * @param marcaVehiculo
	 */
	@POST
	@Consumes({ "application/json" })
	public Response altaMarcaVehiculo(MarcaVehiculo marcaVehiculo) {
		try {
			marcaVehiculoEjb.crearMarcaVehiculo(marcaVehiculo);
			return Response.ok(Status.OK,"application/json").tag("Marca de Vehiculo registrada correctamente.").build();
		} catch (BusinessException ex) {
			return Response.ok(Status.NOT_IMPLEMENTED,"application/json").tag(ex.getMessage()).build();
		}
	}

	/**
	 * Busca Marcas de Vehiculo por un criterio en las propiedadesde:
	 *  nombre
	 *  abreviatura
	 *  
	 * @param criterio
	 * @return marcaVehiculoList
	 **/
	@GET
	@Path("/buscarPorCriterio")
	@Produces({"application/json"})
	public Response buscarMarcaVehiculoPorCriterio(@QueryParam("parametro")String criterio){
		try{
			List<MarcaVehiculo> marcaVehiculoList = marcaVehiculoEjb.obtenerMarcasVehiculoFiltro(criterio);
			return Response.ok(marcaVehiculoList).build();
		}catch(BusinessException ex){
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

	/**
	 * Obtener toda la lista de marcas de vehiculos
	 *  
	 * @return marcaVehiculoList
	 **/
	@GET
	@Path("/obtenerListaCompleta")
	@Produces({"application/json"})
	public Response obtenerListaCompletaMarcaVehiculo(){
		try{
			List<MarcaVehiculo> marcaVehiculoList = marcaVehiculoEjb.obtenerMarcasVehiculoFiltro("");
			return Response.ok(marcaVehiculoList).build();
		}catch(BusinessException ex){
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

	/**
	 * Obtiene un MarcaVehiculo por id
	 * 
	 * @param idMarcaVehiculo
	 * @return marcaVehiculo
	 */
	@GET
	@Produces({ "application/json" })
	public Response obtenerMarcaVehiculoPorId(@QueryParam("idMarcaVehiculo") Integer idMarcaVehiculo) {
		try {
			MarcaVehiculo marcaVehiculo = marcaVehiculoEjb.obtenerMarcaVehiculoPorId(idMarcaVehiculo);
			return Response.ok(marcaVehiculo).build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

	/**
	 * Actualiza una Marca de Vehiculo
	 * 
	 * @param marcaVehiculo
	 */
	@PUT
	@Consumes({ "application/json" })
	public Response actualizarMarcaVehiculo(MarcaVehiculo marcaVehiculo) {
		try {
			marcaVehiculoEjb.actualizarMarcaVehiculo(marcaVehiculo);
			return Response.ok(Status.OK,"application/json").build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

	/**
	 * Busca Marcas de Vehiculo por un criterio en las propiedadesde:
	 *  nombre
	 *  abreviatura
	 *  
	 * @param criterio
	 * @return marcaVehiculoList
	 */
	@GET
	@Path("/buscarMarcaVehiculos")
	@Produces({"application/json"})
	public Response obtenerMarcaVehiculosFiltro(@QueryParam("parametro") String parametro){
		try{
			List<MarcaVehiculo> marcaVehiculos = marcaVehiculoEjb.obtenerMarcasVehiculoFiltro(parametro);
			return Response.ok(marcaVehiculos).build();
		}catch(BusinessException ex){
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}
	

	/**
	 * Elimina un MarcaVehiculo a partir del id de la Marca de Vehiculo
	 *  
	 * @param idMarcaVehiculo
	 */
	@DELETE
	@Path("/eliminarMarcaVehiculos")
	@Produces({ "application/json" })
	public Response eliminarMarcaVehiculo(@QueryParam("idMarcaVehiculo") Integer idMarcaVehiculo) {
		try {
			marcaVehiculoEjb.eliminarMarcaVehiculo(idMarcaVehiculo);
			return Response.ok(Status.OK,"application/json").build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}
}
