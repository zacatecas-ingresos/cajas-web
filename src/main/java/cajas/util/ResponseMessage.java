package cajas.util;

import java.util.HashMap;
import java.util.Map;

public class ResponseMessage {

	public static Map<String, String> respuesta(String clave, String mensaje) {
		Map<String, String> mensajeJson = new HashMap<String, String>();
		mensajeJson.put(clave, mensaje);
		return mensajeJson;
	}
	
	
	

}