package cajas.contribuyentes;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import cajas.contribuyentes.Obligacion;
import cajas.contribuyentes.ObligacionEJB;

@Path("obligaciones")
public class ObligacionResource {

	
	@EJB
    private ObligacionEJB obligacionEjb;

    @GET
    @Path ("{idObligacion}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Obligacion obtenerObligacion(@PathParam("idObligacion") Integer idObligacion) {
        return obligacionEjb.obtenerObligacionPorIdObligacion(idObligacion);
    }
	}


