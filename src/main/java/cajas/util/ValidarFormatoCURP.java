package cajas.util;

public class ValidarFormatoCURP {

	private ValidarFormatoCURP(){
		
	}
	public static boolean validarCurp(String curp){
		curp=curp.toUpperCase().trim();
		return curp.matches("[A-Z][A,E,I,O,U,X][A-Z]{2}[0-9]{2}[0-1][0-9][0-3]"
				+ "[0-9][M,H][A-Z]{2}[B,C,D,F,G,H,J,K,L,M,N,Ñ,P,Q,R,S,T,V,W,X,Y,Z]"
				+ "{3}[0-9,A-Z][0-9]");
}
}