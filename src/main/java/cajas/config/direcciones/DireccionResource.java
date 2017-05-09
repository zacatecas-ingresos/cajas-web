package cajas.config.direcciones;

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





@Path("direcciones")
public class DireccionResource {

    @EJB private DireccionEJB direccionEJB;

    
    
    @GET
    @Path ("{idDireccion}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Direccion obtenerDireccion(@QueryParam("idDireccion") Integer idDireccion) {
        return direccionEJB.obtenerDireccion(idDireccion);
        
    }
    
    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void crearDireccion(Direccion Direccion){
        direccionEJB.crearDireccion(Direccion);
        
    }
    @PUT
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void editarDireccion(Direccion Direccion){
        direccionEJB.editarDireccion(Direccion);
        
    }
    
    @DELETE
    @Path ("{idLocalidad}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void eliminarLocalidad(@PathParam("idDireccion") Integer idDireccion) {
        direccionEJB.eliminarDireccion(idDireccion);
        
        
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Direccion> obtenerDomicilio() {
        return direccionEJB.obtenerDireccion();
        
    }
}
