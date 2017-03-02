package cajas.seguridad.filtro;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cajas.config.parametros.ClaveParametro;
import cajas.util.Crypto;


@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2868430473913972878L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("WEB SERVLET........");
		String contextPath = request.getServletContext().getContextPath();
		
		String index = contextPath+"/index.jsp";
		
		String valorCookie = Crypto.hmac("PRUEBA.COOKIE"); 
		Cookie cookie = new Cookie(ClaveParametro.COOKIE,valorCookie);
		cookie.setPath(ClaveParametro.PATH);
		cookie.setMaxAge(ClaveParametro.DURACION_MINIMA_SESION);
		
		response.addCookie(cookie);
		response.sendRedirect(index);
	}

}