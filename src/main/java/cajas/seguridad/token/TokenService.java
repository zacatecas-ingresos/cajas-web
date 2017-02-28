package cajas.seguridad.token;

import javax.ejb.Stateless;
import cajas.exception.CredencialesInvalidasException;

@Stateless
public class TokenService {
	
	

	public String abrirSesion(Credenciales login) throws CredencialesInvalidasException{
		return null;
	}

	public void cerrarSesion(String token) {
		
	}


}