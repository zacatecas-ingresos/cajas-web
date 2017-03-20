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

import com.google.gson.Gson;

import cajas.config.parametros.ClaveParametro;
import cajas.exception.BusinessException;
import cajas.exception.CredencialesInvalidasException;
import cajas.exception.LoginException;
import cajas.seguridad.ip.Ip;
import cajas.seguridad.ip.IpService;
import cajas.seguridad.token.Credenciales;
import cajas.seguridad.token.TokenService;
import cajas.seguridad.usuario.Usuario;
import cajas.seguridad.usuario.UsuarioService;
import cajas.util.ResponseMessage;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2868430473913972878L;
	private Usuario usuarioEnSesion;
	private Integer intentos = 0;
	private Integer minutos;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String contextPath = req.getServletContext().getContextPath();
		try {
			doPost(req, resp);
		} catch (Exception ex) {
			ex.printStackTrace();
			resp.sendRedirect(contextPath);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			System.out.println("WEB SERVLET................");
			
			String contextPath = request.getServletContext().getContextPath();
			String index = contextPath + ClaveParametro.INDEX;

			Context initContext = new InitialContext();
			TokenService tokenService = (TokenService) initContext.lookup(ClaveParametro.TOKEN_EJB);

			String nombreUsuario = request.getParameter("nombreUsuario");
			String password = request.getParameter("password");

			Credenciales credenciales = new Credenciales();

			credenciales.setNombreUsuario(nombreUsuario);
			credenciales.setPassword(password);

			try {

				if (!revisarIP(request)) {
					String token = tokenService.abrirSesion(credenciales, true);
					if (token != null && token != "") {
						response.addCookie(crearCookie(token, ClaveParametro.DURACION_MAXIMA_SESION));
						usuarioEnSesion = new Usuario();
						UsuarioService usuarioService = (UsuarioService) initContext.lookup(ClaveParametro.USUARIO_EJB);
						usuarioEnSesion = usuarioService.obtenerUsuarioPorToken(token);
						request.getSession().setAttribute(ClaveParametro.API_NAME, usuarioEnSesion);
						response.sendRedirect(index);
						intentos = 0;
						minutos = 0;
					}
				} else if(revisarIP(request)) {					
					accesoRestringido(request, response, "");
				}
			} catch (CredencialesInvalidasException ex) {
				accesoRestringido(request, response, ex.getMessage());
			} catch (LoginException ex) {
				accesoRestringido(request, response, ex.getMessage());
			} catch (BusinessException ex) {
				accesoRestringido(request, response, ex.getMessage());
			}
		} catch (NamingException e) {
			String message = ClaveParametro.ERROR_SESION;
			Gson gson = new Gson();
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(gson.toJson(ResponseMessage.respuesta("respuesta", message)));
		}
	}

	
	public void accesoRestringido(HttpServletRequest request,HttpServletResponse response,String mensaje) throws ServletException, IOException{
		if(revisarIP(request)){
			minutosBloqueoIP(request);
			String message = ClaveParametro.INTENTOS_SUPERADOS;
			request.setAttribute("error",
					message + minutos + " minutos para intentar ingresar de nueva cuenta.");
			request.getRequestDispatcher(ClaveParametro.PAGELOGIN).forward(request, response);
		}else if(intentos>2 && !revisarIP(request)){
			bloquearIp(request);
			minutosBloqueoIP(request);
			String message = ClaveParametro.INTENTOS_SUPERADOS;
			request.setAttribute("error",message + minutos + " minutos para intentar ingresar de nueva cuenta.");
			request.getRequestDispatcher(ClaveParametro.PAGELOGIN).forward(request, response);
		}else{
			intentos++;
			String message =mensaje;
			Gson gson = new Gson();
			response.setStatus(HttpServletResponse.SC_FORBIDDEN);
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(gson.toJson(ResponseMessage.respuesta("respuesta", message)));
		}
	}
	
	public Cookie crearCookie(String token, Integer duracion) {
		Cookie cookie = new Cookie(ClaveParametro.COOKIE, token);
		cookie.setPath(ClaveParametro.PATH);
		cookie.setMaxAge(duracion);
		return cookie;
	}

	public void bloquearIp(HttpServletRequest httpRequest) {
		try {
			Ip ip = new Ip();
			ip.setIp(obtenerIp(httpRequest));
			Context initContext = new InitialContext();
			IpService ipService = (IpService) initContext.lookup(ClaveParametro.IP_SERVICE);
			ipService.registrarIP(ip);
		} catch (NamingException | BusinessException e) {
			throw new BusinessException("Ocurrio un problema al bloquear la IP.");
		}
	}

	/**
	 * M�todo para obtener la IP del usuario
	 * 
	 * @return
	 * @throws SocketException
	 */
	public static String obtenerIp(HttpServletRequest request) {
		String ip = request.getHeader("X-FORWARDED-FOR");
		if (ip == null) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}

	/******** verificar la ip ***************/
	public boolean revisarIP(HttpServletRequest httpRequest) {
		try {
			Context initContext = new InitialContext();
			IpService ipService = (IpService) initContext.lookup(ClaveParametro.IP_SERVICE);
			if (ipService.ip(obtenerIp(httpRequest))) {
				return true;
			}
			return false;
		} catch (NamingException e) {
			throw new BusinessException("Ocurrio un problema al obtener la IP bloqueada.");
		} catch (BusinessException ex) {
			return false;
		}
	}

	public void minutosBloqueoIP(HttpServletRequest httpRequest) {
		try {
			Context initContext = new InitialContext();
			IpService ipService = (IpService) initContext.lookup(ClaveParametro.IP_SERVICE);
			minutos = ipService.obtenerMinutosIP(obtenerIp(httpRequest));
		} catch (NamingException | BusinessException ex) {
			throw new BusinessException(
					"Ocurrio un problema al obtener los minutos restantes para permitir el ingreso al sistema.");
		}
	}

	/**************************************************************/

	public Integer getIntentos() {
		return intentos;
	}

	public void setIntentos(Integer intentos) {
		this.intentos = intentos;
	}

	public Integer getMinutos() {
		return minutos;
	}

	public void setMinutos(Integer minutos) {
		this.minutos = minutos;
	}

}