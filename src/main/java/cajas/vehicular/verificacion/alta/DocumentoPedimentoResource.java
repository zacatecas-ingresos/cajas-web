package cajas.vehicular.verificacion.alta;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

@Path("/vehicular/verificacion/documentoPedimento")
public class DocumentoPedimentoResource {
	
	@EJB
	DocumentoPedimentoEJB documentoPedimientoEjb;
	
	
	/*****Obtiene los documentos registrados*********/
	@GET
	@Path("/obtenerDocumentos")
	@Produces({ "application/json" })
	public Response obtenerVerificaciones() {
		try {
			List<DocumentoPedimento> documentos = documentoPedimientoEjb.obtenerDocumentos();
			return Response.ok(documentos).build();
		} catch (BusinessException ex) {
			return Response.status(Status.NOT_IMPLEMENTED).tag(ex.getMessage()).build();
		}
	}
	
	
}
