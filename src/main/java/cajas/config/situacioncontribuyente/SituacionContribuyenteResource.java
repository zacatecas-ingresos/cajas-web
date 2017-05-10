/*
 * SituacionContribuyenteResource.java
 * Creado el 04/May/2017 4:04:34 PM
 * 
 */
package cajas.config.situacioncontribuyente;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author Alejandro Perez
 */
@Path("situacionContribuyente")
public class SituacionContribuyenteResource {
    @EJB
    private SituacionContribuyenteEJB situacionContribuyenteEJB;

    
    @GET
    @Path ("{idSituacionContribuyente}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public SituacionContribuyente obtenerEstado(@PathParam("idSituacionContribuyente") Integer idSituacionContribuyente) {
        return situacionContribuyenteEJB.obtenerSituacionContribuyente(idSituacionContribuyente);
    }
    
    @GET
    @Produces ({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<SituacionContribuyente> obtenerSituacionesContribuyentes() {
        return situacionContribuyenteEJB.obtenerTodasSituacionesContribuyentes();
    }
    @GET
    @Path("consulta")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<SituacionContribuyente> buscarSituacionContribuyente(@QueryParam("porNombreSituacion") String estado) {
        return situacionContribuyenteEJB.buscarSituacioncontribuyente(estado);
    }
    
    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void crearSituacionContribuyente(SituacionContribuyente situacionContribuyente){
    	situacionContribuyenteEJB.crearSituacionContribuyente(situacionContribuyente);
    }
    
    @PUT
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void editarSituacionContribuyente(SituacionContribuyente situacionContribuyente){
    	situacionContribuyenteEJB.editarSituacionContribuyente(situacionContribuyente);
    }
}
