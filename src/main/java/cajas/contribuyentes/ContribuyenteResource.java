/*
 * ContribuyenteResource.java
 * Creado el 25/Apr/2017 12:50:05 AM
 * 
 */
package cajas.contribuyentes;

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

/**
 *
 * @author Freddy Barrera (freddy.barrera.moo@gmail.com)
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
    
    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void crearContribuyente(Contribuyente contribuyente){
//        contribuyenteEJB.crearContribuyente(contribuyente);
        String plantilla = "{0}: {1}";
        LOGGER.debugv(plantilla, "ID", contribuyente.getId());
        LOGGER.debugv(plantilla, "CURP", contribuyente.getCurp());
        LOGGER.debugv(plantilla, "RFC", contribuyente.getRfc());
        LOGGER.debugv(plantilla, "Nombre", contribuyente.getNombre());
        LOGGER.debugv(plantilla, "Primer apellido", contribuyente.getPrimerApellido());
        LOGGER.debugv(plantilla, "Segundo apellido", contribuyente.getSegundoApellido());
        LOGGER.debugv(plantilla, "Sexo", contribuyente.getSexo());
        LOGGER.debugv(plantilla, "Tipo de persona", contribuyente.getTipoPersona());
        LOGGER.debugv(plantilla, "Fecha de nacimiento", contribuyente.getFechaNacimiento());
        LOGGER.debugv(plantilla, "Razón social", contribuyente.getRazonSocial());
    }
}
