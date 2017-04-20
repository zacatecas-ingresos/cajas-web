package cajas.seguridad.filtro;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.ejb.EJB;
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
import cajas.exception.BusinessException;
import cajas.seguridad.token.TokenService;
import cajas.seguridad.usuario.Usuario;
import org.jboss.logging.Logger;

public class Filtro implements Filter {

	private static final Logger LOG = Logger.getLogger(Filtro.class.getName());

	private String contextPath;
	private HttpServletRequest httpRequest;
	private HttpServletResponse httpResponse;
	private HttpSession httpSession;
	private Usuario usuarioSesion;

	@EJB
        private TokenService tokenService;

	/*************** Filtro ****************************/

	/************
	 * Primer metodo que se ejecuta al iniciar el filtro
	 *************/
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		LOG.info("[\tInicia el filtro:]");
		contextPath = filterConfig.getServletContext().getContextPath();
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		
		LOG.info("[\tFiltro:]");
		/**** caracteres especiales ******/
		servletRequest.setCharacterEncoding("UTF-8");

		httpRequest = (HttpServletRequest) servletRequest;
		httpResponse = (HttpServletResponse) servletResponse;
		httpSession = httpRequest.getSession();
		usuarioSesion = (Usuario) httpSession.getAttribute(ClaveParametro.API_NAME);
		String recursoSolicitado = getRequestResource(httpRequest.getRequestURI());

		httpResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		httpResponse.setHeader("Pragma", "no-cache");
		httpResponse.setDateHeader("Expires", 0);

		ModifyRequest newRequest = new ModifyRequest(httpRequest);

		
		if (newRequest.getHeader(ClaveParametro.HEADER) != null) {

			try {
				boolean tokenValido = tokenValido(newRequest.getHeader(ClaveParametro.HEADER));
				if (!tokenValido) {

					if (recursoSolicitado.equals(ClaveParametro.CONTEXT_ROOT)
							|| recursoSolicitado.equals(ClaveParametro.LOGIN)) {
						httpResponse.sendRedirect(contextPath + ClaveParametro.INDEX);
					}

					
					if(httpRequest.getParameter(ClaveParametro.CERRAR_SESION) != null){
						eliminarCookieUsuario();
						httpResponse.sendRedirect(contextPath + ClaveParametro.LOGIN);					
					}
					
					filterChain.doFilter(newRequest, servletResponse);
				} else {
					eliminarCookie();
					httpResponse.sendRedirect(contextPath);
				}
			} catch (BusinessException ex) {
				eliminarCookie();
				httpResponse.sendRedirect(contextPath);
			}
		} else if (getCookieValue(ClaveParametro.COOKIE) != null) {

			List<String> listaHeaders = listaHeaders();
			String tokenCookie = null;
			for (String l : listaHeaders) {
				tokenCookie = newRequest.getHeader(l);
			}
			if (tokenCookie != null) {
				boolean valorCookieValida = compararToken(tokenCookie);
				if (valorCookieValida) {
					try {
						boolean tokenValido = tokenValido(tokenCookie);
						if (!tokenValido) {
							newRequest.putHeader(ClaveParametro.HEADER, tokenCookie);
							newRequest.getHeaderNames();

							filterChain.doFilter(newRequest, servletResponse);
						}
					} catch (BusinessException ex) {
						eliminarCookie();
						httpResponse.sendRedirect(contextPath);
					}
				}
			}
		} else if (recursoSolicitado.equals(ClaveParametro.CONTEXT_ROOT)
				|| recursoSolicitado.equals(ClaveParametro.LOGIN)
				|| recursoSolicitado.equals(ClaveParametro.URL_SERVLET_LOGIN)) {
			filterChain.doFilter(newRequest, servletResponse);

		} else if ((!recursoSolicitado.equals(ClaveParametro.CONTEXT_ROOT)
				|| !recursoSolicitado.equals(ClaveParametro.LOGIN)) && getCookieValue(ClaveParametro.COOKIE) == null) {

			httpResponse.sendRedirect(contextPath);
		}
	}

	/******* saber si la cookie esta activa todavia *****/
	public boolean compararToken(String token) {
		if (token.equals(getCookieValue(ClaveParametro.COOKIE))) {
			return true;
		}
		return false;
	}

	/**
	 * Obtenemos el token si se encuentra en la cookie persistente del browser
	 * 
	 * @param request
	 * @param name
	 * @return
	 */
	public String getCookieValue(String name) {
		Cookie[] cookies = httpRequest.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie != null && name.equals(cookie.getName())) {
					return cookie.getValue();
				}
			}
		}
		return null;
	}

	/******* Devuelve una lista con las headers *********/
	public List<String> listaHeaders() {
		List<String> lista = new ArrayList<String>();
		Enumeration<String> enumeration = httpRequest.getHeaderNames();
		while (enumeration.hasMoreElements()) {
			String element = (String) enumeration.nextElement();
			lista.add(element);
		}
		return lista;
	}

	/**
	 * Valida que la rua solicitada este dentro del conexto y luego elimina el
	 * contexto de la ruta.
	 *
	 * <p>
	 * En caso de que el recurso solicitado no esté dentro del contexto retorna
	 * un null.
	 *
	 * @param recursoURI
	 *            el ruta del recurso solicitado que debe incluir el contexto.
	 * @return la ruta del recurso sin el contexto.
	 */
	public String getRequestResource(String recursoURI) {
		if (recursoURI != null) {
			if (recursoURI.startsWith(contextPath)) {
				return recursoURI.substring(contextPath.length());
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	/***** Revisar si el token es valido ******/
	public boolean tokenValido(String token) {
		return tokenService.expiroToken(token);
	}

	/**********
	 * quitar cookie
	 * 
	 * @throws IOException
	 ********/
	public void eliminarCookie() throws IOException {
		Cookie opentoken = new Cookie(ClaveParametro.COOKIE, null);
		opentoken.setMaxAge(0);
		opentoken.setPath(ClaveParametro.PATH);
		httpResponse.addCookie(opentoken);
	}

	/**********
	 * quitar cookie y usuario de sesion
	 * 
	 * @throws IOException
	 ********/
	public void eliminarCookieUsuario() throws IOException {
		String tokenUser = "";
		tokenUser = getCookieValue(ClaveParametro.COOKIE);
		tokenService.cerrarSesion(tokenUser);
		Cookie opentoken = new Cookie(ClaveParametro.COOKIE, null);
		opentoken.setMaxAge(0);
		opentoken.setPath(ClaveParametro.PATH);
		httpResponse.addCookie(opentoken);

		if (httpSession != null) {
			httpSession.invalidate();
		}
	}

	@Override
	public void destroy() {
		LOG.info("[\t Fin del filtro:]");
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