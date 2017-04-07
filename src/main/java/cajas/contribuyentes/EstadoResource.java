package cajas.contribuyentes;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;



@Path("estados")
public class EstadoResource {

    @EJB
    private EstadoEJB estadoEjb;

    @GET
    @Path ("{idEstado}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Estado obtenerEstado(@PathParam("idEstado") Integer idEstado) {
        return estadoEjb.obtenerEstado(idEstado);
    }
    
    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void crearEstado(Estado estado){
        estadoEjb.crearEstado(estado);
        
    }
    @PUT
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void editarEstado(Estado estado){
        estadoEjb.editarEstado(estado);
        
    }
    
    @DELETE
    @Path ("{idEstado}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void eliminarEstado(@PathParam("idEstado") Integer idEstado) {
        estadoEjb.eliminarEstado(idEstado);
        
        
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Estado> buscarEstado(@QueryParam("estado") String estado){
        return estadoEjb.buscarEstado(estado);
        
    }
    
    

    
}
