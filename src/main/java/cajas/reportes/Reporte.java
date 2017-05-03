package cajas.reportes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Reporte {
	
	protected HttpServletRequest request;
	
	protected HttpServletResponse response;

	public Reporte(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
	}
	
	public abstract void generar();
	
}
