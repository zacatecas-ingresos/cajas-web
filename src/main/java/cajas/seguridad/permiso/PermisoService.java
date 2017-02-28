package cajas.seguridad.permiso;

import javax.ejb.Stateless;
import cajas.exception.LoginException;
import cajas.exception.PermisoException;

@Stateless
public class PermisoService {

	
	public ValidacionPermiso validar(String token, Integer permiso) throws LoginException, PermisoException {
		return null;
	}
}
