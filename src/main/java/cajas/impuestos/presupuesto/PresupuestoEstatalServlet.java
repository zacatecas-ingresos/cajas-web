package cajas.impuestos.presupuesto;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperRunManager;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class FormatoAltaIsssteServlet
 */
@WebServlet ("/PresupuestoEstatalServlet")
public class PresupuestoEstatalServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5015580659127931333L;
	
	/**
     * @see HttpServlet#HttpServlet()
     */
	public PresupuestoEstatalServlet(){
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	          throws ServletException, IOException{
		Integer idPresupuestoConsultar =Integer.parseInt(request.getParameter("idPresupuestoConsultar"));
		
		byte[] bytes = doReport(idPresupuestoConsultar);
		
		ServletOutputStream servletOutputStream = response.getOutputStream();
		response.setContentType("application/pdf");
		response.setContentLength(bytes.length);
		response.setHeader("Content-Disposition",
				"inline;filename=" + "Presupuesto_Estatal.pdf");
		servletOutputStream.write(bytes, 0, bytes.length);
		servletOutputStream.flush();
		servletOutputStream.close();
	}

	private byte[] doReport(Integer idPresupuestoConsultar) {
		byte[] bytes = null;
		
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("/reportes/REPORTE_FORMATO_ALTAS_ISSSTE.jasper");
		Connection conexion = null;
		
		try{
			Context initcontex = new InitialContext();
			DataSource ds = (DataSource) initcontex.lookup("java:jboss/datasources/sitDS");
			
			conexion = ds.getConnection();

			Map<String, Object> parameters = new HashMap<String, Object>();

			parameters.put("ID_PRESUPUESTO_CONSULTAR", idPresupuestoConsultar);
			

			bytes = JasperRunManager.runReportToPdf(inputStream, parameters, conexion);
		
		}catch (NamingException ex) {
			System.err.println("Error al cargar tratar de resolver el nombre: java:jboss/datasources/SIAYFRHDS"
					+ getClass().getName());
			ex.printStackTrace();
		} catch (SQLException ex) {
			System.err.println("Error al tratar obtener la conexiÃ³n con la base de datos en " + getClass().getName());
			ex.printStackTrace();
		} catch (JRException ex) {
			System.err.println("Error durante la generación del reporte ");
			ex.printStackTrace();
		} finally {
			if (conexion != null) {
				try {
					conexion.close();
				} catch (SQLException e) {
					System.err.println(
							"Error al tratar cerrar la conexiÃ³n con la base de datos en " + getClass().getName());
					e.printStackTrace();
				}
			}
		}

		return bytes;
	}
	
}
