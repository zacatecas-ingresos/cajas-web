package cajas.catalogos.tipovehiculo;

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

@Path("/catalogos/tipovehiculo")
public class TipoVehiculoResource {
	@EJB
	TipoVehiculoEJB tipoVehiculoEjb;

	/**
	 * Crea un nuevo registro de Tipo de Vehiculo
	 * 
	 * @param tipoVehiculo
	 */
	@POST
	@Consumes({ "application/json" })
	public Response altaTipoVehiculo(TipoVehiculo tipoVehiculo) {
		try {
			tipoVehiculoEjb.crearTipoVehiculo(tipoVehiculo);
			return Response.ok(Status.OK,"application/json").tag("Tipo de Vehiculo registrada correctamente.").build();
		} catch (BusinessException ex) {
			return Response.ok(Status.NOT_IMPLEMENTED,"application/json").tag(ex.getMessage()).build();
		}
	}

	/**
	 * Busca Tipos de Vehiculo por un criterio en las propiedadesde:
	 *  nombre
	 *  abreviatura
	 *  
	 * @param criterio
	 * @return tipoVehiculoList
	 **/
	@GET
	@Path("/buscarPorCriterio")
	@Produces({"application/json"})
	public Response buscarTipoVehiculoPorCriterio(@QueryParam("parametro")String criterio){
		try{
			List<TipoVehiculo> tipoVehiculoList = tipoVehiculoEjb.obtenerTiposVehiculoFiltro(criterio);
			return Response.ok(tipoVehiculoList).build();
		}catch(BusinessException ex){
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

	/**
	 * Obtener toda la lista de marcas de vehiculos
	 *  
	 * @return tipoVehiculoList
	 **/
	@GET
	@Path("/obtenerListaCompleta")
	@Produces({"application/json"})
	public Response obtenerListaCompletaTipoVehiculo(){
		try{
			List<TipoVehiculo> tipoVehiculoList = tipoVehiculoEjb.obtenerTiposVehiculoFiltro("");
			return Response.ok(tipoVehiculoList).build();
		}catch(BusinessException ex){
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

	/**
	 * Obtiene un TipoVehiculo por id
	 * 
	 * @param idTipoVehiculo
	 * @return tipoVehiculo
	 */
	@GET
	@Produces({ "application/json" })
	public Response obtenerTipoVehiculoPorId(@QueryParam("idTipoVehiculo") Integer idTipoVehiculo) {
		try {
			TipoVehiculo tipoVehiculo = tipoVehiculoEjb.obtenerTipoVehiculoPorId(idTipoVehiculo);
			return Response.ok(tipoVehiculo).build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

	/**
	 * Actualiza una Tipo de Vehiculo
	 * 
	 * @param tipoVehiculo
	 */
	@PUT
	@Consumes({ "application/json" })
	public Response actualizarTipoVehiculo(TipoVehiculo tipoVehiculo) {
		try {
			tipoVehiculoEjb.actualizarTipoVehiculo(tipoVehiculo);
			return Response.ok(Status.OK,"application/json").build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

	/**
	 * Busca Tipos de Vehiculo por un criterio en las propiedadesde:
	 *  nombre
	 *  abreviatura
	 *  
	 * @param criterio
	 * @return tipoVehiculoList
	 */
	@GET
	@Path("/buscarTipoVehiculos")
	@Produces({"application/json"})
	public Response obtenerTipoVehiculosFiltro(@QueryParam("parametro") String parametro){
		try{
			List<TipoVehiculo> tipoVehiculo = tipoVehiculoEjb.obtenerTiposVehiculoFiltro(parametro);
			return Response.ok(tipoVehiculo).build();
		}catch(BusinessException ex){
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}
	

	/**
	 * Elimina un TipoVehiculo a partir del id de la Tipo de Vehiculo
	 *  
	 * @param idTipoVehiculo
	 */
	@DELETE
	@Path("/eliminarTipoVehiculos")
	@Produces({ "application/json" })
	public Response eliminarTipoVehiculo(@QueryParam("idTipoVehiculo") Integer idTipoVehiculo) {
		try {
			tipoVehiculoEjb.eliminarTipoVehiculo(idTipoVehiculo);
			return Response.ok(Status.OK,"application/json").build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}
}
