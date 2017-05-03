package cajas.util;

import java.util.HashMap;
import java.util.Map;

public class RespuestaResource {

	public static final Map<String, String> respuesta(String code, String message) {
		Map<String, String> respuesta = new HashMap<String, String>();
		respuesta.put("code", code);
		respuesta.put("message", message);
		return respuesta;
	}
}