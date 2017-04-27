/*
 * ContribuyenteResource.java
 * Creado el 25/Apr/2017 12:50:05 AM
 * 
 */
package cajas.contribuyentes;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

/**
 *
 * @author Freddy Barrera (freddy.barrera@gmail.com)
 */
@Path("contribuyentes")
public class ContribuyenteResource {

    @EJB private ContribuyenteEJB contribuyenteEJB;
    private static final Logger LOGGER = Logger.getLogger(ContribuyenteResource.class.getName());
    
    @GET
    @Path("consulta")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Contribuyente> buscarContribuyente(
            @QueryParam("porCriterio") String criterio) {
        LOGGER.debugv("Criterio a buscar: {0}", criterio);
        return contribuyenteEJB.buscarContribuyente(criterio);
    }
}
