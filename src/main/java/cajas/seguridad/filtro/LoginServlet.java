package cajas.seguridad.filtro;

import java.io.IOException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cajas.config.parametros.ClaveParametro;
import cajas.exception.BusinessException;
import cajas.exception.CredencialesInvalidasException;
import cajas.exception.LoginException;
import cajas.seguridad.token.Credenciales;
import cajas.seguridad.token.TokenService;


@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2868430473913972878L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			
			String contextPath = request.getServletContext().getContextPath();
			String index = contextPath+ClaveParametro.INDEX;
			
			Context initContext = new InitialContext();
			TokenService tokenService = (TokenService) initContext.lookup(ClaveParametro.TOKEN_SERVICE);
			
			String nombreUsuario = request.getParameter("nombreUsuario");
			String password = request.getParameter("password");
						
			Credenciales credenciales = new Credenciales();
			
			credenciales.setNombreUsuario(nombreUsuario);
			credenciales.setPassword(password);
			
			try{
				String token = tokenService.abrirSesion(credenciales, false);
				
				if(token != null && token != ""){
					response.addCookie(crearCookie(token,ClaveParametro.DURACION_MINIMA_SESION));
					response.sendRedirect(index);
				}
			}catch(CredencialesInvalidasException ex){
				ex.printStackTrace();
				response.sendError(403);
			}catch(LoginException ex){
				ex.printStackTrace();
				response.sendError(403);
			}catch(BusinessException ex){
				ex.printStackTrace();
				response.sendError(500);
			}					
		} catch (NamingException e) {
			e.printStackTrace();
			throw new LoginException("Ocurrio un problema al autenticar al usuario.");
		}
	}

	
	public Cookie crearCookie(String token,Integer duracion){
		Cookie cookie = new Cookie(ClaveParametro.COOKIE, token);
		cookie.setPath(ClaveParametro.PATH);
		cookie.setMaxAge(duracion);
		return cookie;
	}
	
	
}