package cajas.config.domicilios;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.jboss.logging.Logger;




@Path("domicilio")
public class DomicilioResource {

    @EJB private DomicilioEJB domicilioEJB;
    private static final Logger LOGGER = Logger.getLogger(DomicilioResource.class.getName());
    
    @GET
    @Path("consulta")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Domicilio> buscarDomicilio(
            @QueryParam("porCriterio") String criterio) {
        LOGGER.debugv("Criterio a buscar: {0}", criterio);
        return domicilioEJB.buscarDomicilio(criterio);
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void crearDomicilio(Domicilio domicilio){
        domicilioEJB.crearDomicilio(domicilio);
        String plantilla = "{0}: {1}";
        LOGGER.debugv(plantilla, "ID", domicilio.getIdDomicilio());
    }
}
