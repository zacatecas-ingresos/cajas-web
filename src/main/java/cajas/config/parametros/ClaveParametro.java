package cajas.config.parametros;

public class ClaveParametro {

	public static final String DURACION_TOKENS = "1"; // Duración de los tokens para cada usuario
	public static final String DIR_TEMP = "DIR_TEMP";
	public static final String DIR_DATOS = "DIR_DATOS";
	
	/**********Autenticación********************/
    public static final int DURACION_MAXIMA_SESION = 7 * 24 * 60 * 60; // 7 días.
	
    /************** Filtro ***********************/
	public static final String API_NAME = "CAJAS";
	public static final String PATH = "/cajas/";
	public static final String CONTEXT_ROOT = "/";
	public static final String RECURSOS[] = {"/resources"};
	public static final String HEADER = "CAJAS";
	public static final String LOGIN = "/views/seguridad/login.jsp";
	public static final String INDEX = "/views/index.jsp";
	public static final String URL_SERVLET_LOGIN = "/loginServlet";
	public static final String CERRAR_SESION = "cerrarSesion";
	
	/******* Web Servlet ***********/
	public static final String COOKIE = "CAJAS";
	public static final String USUARIO_SERVICE = "java:global/cajas-web/UsuarioService!cajas.seguridad.usuario.UsuarioService";
	public static final String USUARIO_EJB = "java:global/cajas-web-17.03.10-SNAPSHOT/UsuarioService!cajas.seguridad.usuario.UsuarioService";
	public static final String TOKEN_SERVICE = "java:global/cajas-web/TokenService!cajas.seguridad.token.TokenService";
	public static final String TOKEN_EJB = "java:global/cajas-web-17.03.10-SNAPSHOT/TokenService!cajas.seguridad.token.TokenService";
	public static final String IP_SERVICE = "java:global/cajas-web-17.03.10-SNAPSHOT/IpService!cajas.seguridad.ip.IpService";
	public static final String IP_EJB = "java:global/cajas-web/IpService!cajas.seguridad.ip.IpService";
	public static final String PAGELOGIN = "/views/seguridad/login.jsp";
	public static final String ERROR_SESION = "Ocurrio un problema al iniciar sesión.";
	public static final String INTENTOS_SUPERADOS = "Ha superado el número de intentos para ingresar al sistema.Espere ";
	
}