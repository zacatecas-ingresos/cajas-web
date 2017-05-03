package cajas.reportes;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cajas.exception.BusinessException;

@WebServlet ("/reportes")
public class ReporteServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
     * @see HttpServlet#HttpServlet()
     */
	public ReporteServlet(){
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	          throws ServletException, IOException{
		
		
		String rpt  = request.getParameter("rpt");
		
		if(rpt == null) {
			throw new BusinessException("El parametro rpt es requerido");
		}
		
		
		Reporte reporte = null;
		if(rpt.equals("presupuestoISN")) {
			reporte = new PresupuestoISN(request, response);
		}
		
		if(reporte != null) {
			reporte.generar();
		}
	}
}
