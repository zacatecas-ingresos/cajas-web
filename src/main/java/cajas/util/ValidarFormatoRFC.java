package cajas.util;

public class ValidarFormatoRFC {

	private ValidarFormatoRFC() {
		
	}
	
	public static boolean validarRfc(String rfc){
		rfc=rfc.toUpperCase().trim();
		return rfc.toUpperCase().matches("[A-Z,Ñ,&]{3,4}[0-9]{2}[0-1][0-9][0-3][0-9][A-Z,0-9]?[A-Z,0-9]?[0-9,A-Z]?");
		}
}
