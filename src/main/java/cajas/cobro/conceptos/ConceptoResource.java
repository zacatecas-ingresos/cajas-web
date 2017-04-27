package cajas.cobro.conceptos;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import cajas.exception.BusinessException;
import cajas.seguridad.usuario.Usuario;

@Path("/concepto")
public class ConceptoResource {
	
	@EJB
	ConceptoEJB conceptoEjb;
	
	@GET
	@Path("/obtenerConcepto")
	@Produces({"application/json"})
	public Response obtenerConceptos(@QueryParam("clave")String clave){
		try{
			List<Concepto> conceptos = conceptoEjb.consultarConceptosPorClave(clave);
			return Response.ok(conceptos).build();
		}catch(BusinessException ex){
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}

}
