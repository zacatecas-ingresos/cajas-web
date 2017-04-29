package cajas.cobro.conceptos;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import cajas.exception.BusinessException;

@Path("/concepto")
public class ConceptoResource {
	
	@EJB
	ConceptoEJB conceptoEjb;
	
	@GET
	@Path("/obtenerConcepto")
	@Produces({"application/json"})
	public Response obtenerConceptos(@QueryParam("clave")String clave){
		try{
			System.out.println("llega dato de busqueda");
			List<Concepto> conceptos = conceptoEjb.consultarConceptosPorClave(clave);
			return Response.ok(conceptos).build();
		}catch(BusinessException ex){
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}
	
	@POST
	@Path("/nuevoConcepto")
	@Consumes({ "application/json" })
	public Response altaUsuario(Concepto concepto) {
		try {
			conceptoEjb.registrarConcepto(concepto);
			return Response.ok(Status.OK,"application/json").tag("Se registro correctamente el nuevo concepto.").build();
		} catch (BusinessException ex) {
			return Response.ok(Status.NOT_IMPLEMENTED,"application/json").tag(ex.getMessage()).build();
		}
	}

}
