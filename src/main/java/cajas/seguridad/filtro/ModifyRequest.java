package cajas.seguridad.filtro;


import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import cajas.config.parametros.ClaveParametro;

public class ModifyRequest extends HttpServletRequestWrapper {

	 private Map<String,String> newHeaders = null;
	 private List<String> headers;
	
	public ModifyRequest(HttpServletRequest request) {
		super(request);
	}
	
	
	public void putHeader(String nombreHeader,String valorHeader){
		newHeaders.put(nombreHeader, valorHeader);	
	}

	@Override
	public String getHeader(String name) {
		/**** Se obtiene la peticion y se castea *********/
		HttpServletRequest request = (HttpServletRequest) getRequest();
		
		/****** Se revisa si en la peticion esta la header que creamos ******/
		if (ClaveParametro.HEADER.equals(name)) {

			/******** Revisamos las cookies ************/
			Cookie[] cookies = request.getCookies();

			/******* Si las cookies son nulas returnamos ********/
			if (cookies == null) {
				return null;
			}

			/******* Recorremos las cookies ********/
			for (Cookie cookie : cookies) {
				/*********
				 * Si en las cookies esta una con el mismo nombre de la header
				 * retornamos su valor
				 **********/
				if (ClaveParametro.HEADER.equals(cookie.getName())) {
					String cookieValue = cookie.getValue();
					return cookieValue;
				}
			}
		}

		/***** Si no retornamos la peticion *********/
		return request.getHeader(name);
	}
	
	/************Getters and Setters**********/
	
	public Map<String,String> getNewHeaders() {
		return getNewHeaders();
	}


	public void setNewHeaders(Map<String, String> newHeaders) {
		this.newHeaders = newHeaders;
	}
	
	public List<String> getHeaders() {
		return headers;
	}
	
	public void setHeaders(List<String> headers) {
		this.headers = headers;
	}

}