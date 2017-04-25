package cajas.catalogos.localidades;

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
import javax.ws.rs.core.MediaType;




@Path("localidades")
public class LocalidadResource {

    @EJB
    private LocalidadEJB localidadEjb;

        @GET
        @Path ("{idLocalidad}")
        @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
        public Localidad obtenerLocalidad(@PathParam("idLocalidad") Integer idLocalidad) {
            return localidadEjb.obtenerLocalidad(idLocalidad);
            
        }
        
        @POST
        @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
        @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
        public void crearLocalidad(Localidad localidad){
            localidadEjb.crearLocalidad(localidad);
            
        }
        @PUT
        @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
        @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
        public void editarLocalidad(Localidad localidad){
            localidadEjb.editarLocalidad(localidad);
            
        }
        
        @DELETE
        @Path ("{idLocalidad}")
        @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
        public void eliminarLocalidad(@PathParam("idLocalidad") Integer idLocalidad) {
            localidadEjb.eliminarLocalidad(idLocalidad);
            
            
        }
        
        @GET
        @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
        public List<Localidad> obtenerLocalidades() {
            return localidadEjb.obtenerLocalidades();
            
        }
    
}
