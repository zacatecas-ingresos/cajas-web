package cajas.impuestos.declaracion.estatal;

public class Periodos {

	public static Integer periodos(String mes) {
		Integer periodo;
		switch (mes) {
		case "ENERO":
			periodo = 1;
			break;
		case "FEBRERO":
			periodo = 2;
			break;
		case "MARZO":
			periodo = 3;
			break;
		case "ABRIL":
			periodo = 4;
			break;
		case "MAYO":
			periodo = 5;
			break;
		case "JUNIO":
			periodo = 6;
			break;
		case "JULIO":
			periodo = 7;
			break;
		case "AGOSTO":
			periodo = 8;
			break;
		case "SEPTIEMBRE":
			periodo = 9;
			break;
		case "OCTUBRE":
			periodo = 10;
			break;
		case "NOVIEMBRE":
			periodo = 11;
			break;
		case "DICIEMBRE":
			periodo = 12;
			break;
		default:
			periodo = 0;
			break;
		}
		return periodo;
	}

}