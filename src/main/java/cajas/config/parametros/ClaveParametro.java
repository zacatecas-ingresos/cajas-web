package cajas.config.parametros;

public class ClaveParametro {

	public static final String DURACION_TOKENS = "1"; //Duracion de los tokens para cada usuario
	public static final String DIR_TEMP = "DIR_TEMP";
	public static final String DIR_DATOS = "DIR_DATOS";
	
	/**********Autenticacion********************/
	public static final int DURACION_MINIMA_SESION = 1 * 24 * 60 *60; // Un dia.
    public static final int DURACION_MAXIMA_SESION = 7 * 24 * 60 * 60; // 7 diÂ­as.
	
    /************** Filtro ***********************/
	public static final String API_NAME = "CAJAS";
	public static final String COOKIE_NORMAL = "CAJAS.COOKIE";
	public static final String COOKIE_CHECKBOX = "CAJAS.COOKIECHECKBOX";
	public static final String PATH = "/cajas/";
	public static final String RECURSOS[] = {"/resources"};
	public static final String HEADER = "HEADER.COOKIE";
	public static final String LOGIN = "/views/seguridad/login.jsp";
	public static final String INDEX = "/index.jsp";
	
	/******* Web Servlet ***********/
	public static final String COOKIE = "CAJAS.COOKIE";
	public static final String TOKEN_SERVICE = "java:global/cajas-web-17.03.10-SNAPSHOT/TokenService!cajas.seguridad.token.TokenService";
	public static final String PAGELOGIN = "/views/seguridad/login.jsp";
	public static final String ERROR_LOGIN = "El usuario y/o contraseña no son los correctos.";
	public static final String ERROR_SESION = "Ocurrio un problema al iniciar sesión.";
	
}