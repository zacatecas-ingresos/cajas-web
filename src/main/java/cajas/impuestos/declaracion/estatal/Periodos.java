package cajas.impuestos.declaracion.estatal;

public class Periodos {

	public static String periodos(Integer numeroPeriodo) {
		String periodo = "";
		switch (numeroPeriodo) {
		case 1:
			periodo = "ENERO";
			break;
		case 2:
			periodo = "FEBRERO";
			break;
		case 3:
			periodo = "MARZO";
			break;
		case 4:
			periodo = "ABRIL";
			break;
		case 5:
			periodo = "MAYO";
			break;
		case 6:
			periodo = "JUNIO";
			break;
		case 7:
			periodo = "ENERO";
			break;
		case 8:
			periodo = "JULIO";
			break;
		case 9:
			periodo = "AGOSTO";
			break;
		case 10:
			periodo = "OCTUBRE";
			break;
		case 11:
			periodo = "NOVIEMBRE";
			break;
		case 12:
			periodo = "DICIEMBRE";
			break;
		default:
			periodo = "";
			break;
		}
		return periodo;
	}

}