package cajas.seguridad.filtro;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2868430473913972878L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String contextPath = request.getServletContext().getContextPath();

		System.out.println("CONTEXT PATH::::" + contextPath);

		String uri = contextPath + "/login";

		System.out.println("URL::::" + uri);

		String nombreUsuario = request.getParameter("nombreUsuario");
		String password = request.getParameter("password");
		System.out.print("NOMBRE DE USUARIO:::" + nombreUsuario + "PASSWORD:::::" + password);

		
		response.sendRedirect(uri);
		
	}

}