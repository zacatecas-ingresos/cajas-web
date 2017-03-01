package cajas.seguridad.filtro;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/login")
public class Login {

	
	@GET
	@Consumes({"application/json"})
	public String abrirSesion(){
		System.out.println("INICIANDO SESIÓN::::");
		String token = "";
		return token;
	}
	
	
}