package cajas.seguridad.filtro;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cajas.config.parametros.ClaveParametro;
import cajas.seguridad.token.Credenciales;
import cajas.seguridad.usuario.Usuario;

public class Filtro implements Filter {

	private static final Logger LOG = Logger.getLogger(Filtro.class.getName());

	private String contextPath;
	private HttpServletRequest httpRequest;
	private HttpServletResponse httpResponse;
	private HttpSession httpSession;
	private Usuario usuarioSesion;

	/*************** Filtro ****************************/

	/************
	 * Primer metodo que se ejecuta al iniciar el filtro
	 *************/
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		LOG.info(String.format("[\t Inicia el filtro:]"));
		contextPath = filterConfig.getServletContext().getContextPath();
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		LOG.info(String.format("[\t Filtro:]"));
		/**** caracteres especiales ******/
		servletRequest.setCharacterEncoding("UTF-8");

		httpRequest = (HttpServletRequest) servletRequest;
		httpResponse = (HttpServletResponse) servletResponse;
		httpSession = httpRequest.getSession();
		
				
		if(getCookieValue(httpRequest, ClaveParametro.COOKIE) != null){//buscamos la cookie
			//colocamos en la cabecera
			String valorCookie = getCookieValue(httpRequest, ClaveParametro.COOKIE);
			httpResponse.addHeader(ClaveParametro.HEADER, valorCookie);
		}
		
		filterChain.doFilter(servletRequest, servletResponse);
	}
	

	@Override
	public void destroy() {
		LOG.info(String.format("[\t Fin del filtro:]"));
	}
	
	/**
	 * Obtenemos el token si se encuentra en la cookie persistente del browser
	 * @param request
	 * @param name
	 * @return
	 */
	public static String getCookieValue(HttpServletRequest request, String name) {
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie != null && name.equals(cookie.getName())) {
					return cookie.getValue();
				}
			}
		}
		return null;
	}
	
	
	/***********************************************************************************************/

	public String getContextPath() {
		return contextPath;
	}

	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
	}

	public HttpServletRequest getHttpRequest() {
		return httpRequest;
	}

	public void setHttpRequest(HttpServletRequest httpRequest) {
		this.httpRequest = httpRequest;
	}

	public HttpServletResponse getHttpResponse() {
		return httpResponse;
	}

	public void setHttpResponse(HttpServletResponse httpResponse) {
		this.httpResponse = httpResponse;
	}

	public HttpSession getHttpSession() {
		return httpSession;
	}

	public void setHttpSession(HttpSession httpSession) {
		this.httpSession = httpSession;
	}

	public Usuario getUsuarioSesion() {
		return usuarioSesion;
	}

	public void setUsuarioSesion(Usuario usuarioSesion) {
		this.usuarioSesion = usuarioSesion;
	}

}