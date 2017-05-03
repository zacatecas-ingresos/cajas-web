package cajas.reportes;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperRunManager;

public abstract class ReporteJasper extends Reporte {

	public ReporteJasper(HttpServletRequest request, HttpServletResponse response) {
		super(request, response);		
	}
	
	public abstract String path();
	
	public abstract Map<String, Object> params();
	
	public abstract String nombreReporte();

	@Override
	public void generar() {
		String path = path();
		
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(path);
		
		Connection connection = null;
		
		byte[] bytes = null;
		
		try{
			Context initcontex = new InitialContext();
			DataSource ds = (DataSource) initcontex.lookup("java:jboss/datasources/sitDS");
			
			connection = ds.getConnection();

			Map<String, Object> params = params();
			

			bytes = JasperRunManager.runReportToPdf(inputStream, params, connection);
		System.out.println("bytes " + bytes.length);
		} catch (NamingException | SQLException | JRException ex) {
			throw new RuntimeException(ex);
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					System.err.println(
							"Error al tratar cerrar la conexiÃ³n con la base de datos en " + getClass().getName());
					e.printStackTrace();
				}
			}
		}
		
		String nombreReporte = nombreReporte();
		ServletOutputStream servletOutputStream;
		try {
			servletOutputStream = response.getOutputStream();
			response.setContentType("application/pdf");
			response.setContentLength(bytes.length);
			response.setHeader("Content-Disposition", "inline;filename=" + nombreReporte);
			servletOutputStream.write(bytes, 0, bytes.length);
			servletOutputStream.flush();
			servletOutputStream.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}		
	}

}
