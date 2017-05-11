package cajas.config.municipios;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import cajas.exception.BusinessException;


@Path("municipios")
public class MunicipioResource {

    @EJB
    private MunicipioEJB municipioEjb;

    
    /**
     * obtiene los municipios por el ID
     * @param idMunicipio
     * @return
     */
    @GET
    @Path("{idMunicipio}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Municipio obtenerMunicipio(@QueryParam("idMunicipio") Integer idMunicipio) {
        return municipioEjb.obtenerMunicipio(idMunicipio);

    }
    
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void crearMunicipio(Municipio municipio){
	            municipioEjb.crearMunicipio(municipio);

    }

    @PUT
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void editarMunicipio(Municipio municipio) {
        municipioEjb.editarMunicipio(municipio);
    }

    @DELETE
    @Path("{idMunicipio}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void eliminarMunicipio(@PathParam("idMunicipio") Integer idMunicipio) {
        municipioEjb.eliminarMunicipio(idMunicipio);

    }

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Municipio> obtenerMunicipios() {
        return municipioEjb.obtenerMunicipios();
  
    }
    /**
     *  traer lista de municipios por el id del Estado
     * @param idEstado
     * @return municipios por estado
     */
    @GET
	@Path("/obtenerListaPorIdEstado")
	@Produces({"application/json"})
	public Response obtenerListaPorIdEstado(@QueryParam("idEstado") Integer idEstado) {
		try{
			List<Municipio> municipioList = municipioEjb.buscarMunicipiosUnEstado(idEstado);
			return Response.ok(municipioList).build();
		}catch(BusinessException ex){
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
		}
    
    
    
}
