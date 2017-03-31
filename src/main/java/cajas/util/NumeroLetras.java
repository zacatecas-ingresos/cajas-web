package cajas.util;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;

public class NumeroLetras {
	private static final String[] UNIDADES = { "", "UN ", "DOS ", "TRES ",
			"CUATRO ", "CINCO ", "SEIS ", "SIETE ", "OCHO ", "NUEVE ", "DIEZ ",
			"ONCE ", "DOCE ", "TRECE ", "CATORCE ", "QUINCE ", "DIECISEIS",
			"DIECISIETE", "DIECIOCHO", "DIECINUEVE", "VEINTE" };

	private static final String[] DECENAS = { "VENTI", "TREINTA ", "CUARENTA ",
			"CINCUENTA ", "SESENTA ", "SETENTA ", "OCHENTA ", "NOVENTA ",
			"CIEN " };

	private static final String[] CENTENAS = { "CIENTO ", "DOSCIENTOS ",
			"TRESCIENTOS ", "CUATROCIENTOS ", "QUINIENTOS ", "SEISCIENTOS ",
			"SETECIENTOS ", "OCHOCIENTOS ", "NOVECIENTOS " };

	/**
	 * Convierte a letras un numero de la forma $123,456.32
	 * 
	 * @param number
	 *            Numero en representacion texto
	 * @throws NumberFormatException
	 *             Si valor del numero no es valido (fuera de rango o )
	 * @return Numero en letras
	 */
	public String convertNumberToLetter(String number)
			throws NumberFormatException {
		return convertNumberToLetter(new BigDecimal(number));
	}

	/**
	 * Convierte un numero en representacion numerica a uno en representacion de
	 * texto. El numero es valido si esta entre 0 y 999'999.999
	 * 
	 * @param number
	 *            Numero a convertir
	 * @return Numero convertido a texto
	 * @throws NumberFormatException
	 *             Si el numero esta fuera del rango
	 */
	public static String convertNumberToLetter(BigDecimal doubleNumber)
			throws NumberFormatException {
		StringBuilder converted = new StringBuilder();
		doubleNumber = doubleNumber.setScale(3);
		System.out.println(doubleNumber);
		// Validamos que sea un numero legal //doubleNumber > 999 999 999
		if (doubleNumber.compareTo(new BigDecimal("999999999")) == 1)
			throw new NumberFormatException(
					"El numero es mayor de 999'999.999, "
							+ "no es posible convertirlo");

		if (doubleNumber.compareTo(new BigDecimal("0")) == -1)
			throw new NumberFormatException("El numero debe ser positivo");

		String splitNumber[] = String.valueOf(doubleNumber).replace('.', '#')
				.split("#");

		// Descompone el trio de millones
		int millon = Integer.parseInt(String.valueOf(getDigitAt(splitNumber[0],
				8))
				+ String.valueOf(getDigitAt(splitNumber[0], 7))
				+ String.valueOf(getDigitAt(splitNumber[0], 6)));
		if (millon == 1)
			converted.append("UN MILLON ");
		else if (millon > 1)
			converted.append(convertNumber(String.valueOf(millon))
					+ "MILLONES ");

		// Descompone el trio de miles
		int miles = Integer.parseInt(String.valueOf(getDigitAt(splitNumber[0],
				5))
				+ String.valueOf(getDigitAt(splitNumber[0], 4))
				+ String.valueOf(getDigitAt(splitNumber[0], 3)));
		if (miles == 1)
			converted.append(" MIL ");
		else if (miles > 1)
			converted.append(convertNumber(String.valueOf(miles)) + " MIL ");

		// Descompone el ultimo trio de unidades
		int cientos = Integer.parseInt(String.valueOf(getDigitAt(
				splitNumber[0], 2))
				+ String.valueOf(getDigitAt(splitNumber[0], 1))
				+ String.valueOf(getDigitAt(splitNumber[0], 0)));
		if (cientos == 1)
			converted.append("UN");

		if (millon + miles + cientos == 0)
			converted.append("CERO");
		if (cientos > 1)
			converted.append(convertNumber(String.valueOf(cientos)));

		converted.append(" PESOS ");

		// Descompone los centavos
		int centavos = Integer.parseInt(String.valueOf(getDigitAt(
				splitNumber[1], 2))
				+ String.valueOf(getDigitAt(splitNumber[1], 1))
				+ String.valueOf(getDigitAt(splitNumber[1], 0)));
		String strCentavos = StringUtils.leftPad(centavos + "", 2, '0');
		converted.append(strCentavos + "/100 M.N.");

		return converted.toString();
	}

	/**
	 * Convierte los trios de numeros que componen las unidades, las decenas y
	 * las centenas del numero.
	 * 
	 * @param number
	 *            Numero a convetir en digitos
	 * @return Numero convertido en letras
	 */
	private static String convertNumber(String number) {
		if (number.length() > 3)
			throw new NumberFormatException(
					"La longitud maxima debe ser 3 digitos");

		// Caso especial con el 100
		if (number.equals("100")) {
			return "CIEN ";
		}

		StringBuilder output = new StringBuilder();
		if (getDigitAt(number, 2) != 0)
			output.append(CENTENAS[getDigitAt(number, 2) - 1]);

		int k = Integer.parseInt(String.valueOf(getDigitAt(number, 1))
				+ String.valueOf(getDigitAt(number, 0)));
		if (k <= 20)
			output.append(UNIDADES[k]);
		else if (k > 30 && getDigitAt(number, 0) != 0)
			output.append(DECENAS[getDigitAt(number, 1) - 2] + "Y "
					+ UNIDADES[getDigitAt(number, 0)]);
		else
			output.append(DECENAS[getDigitAt(number, 1) - 2]
					+ UNIDADES[getDigitAt(number, 0)]);

		return output.toString();
	}

	/**
	 * Retorna el digito numerico en la posicion indicada de derecha a izquierda
	 * 
	 * @param origin
	 *            Cadena en la cual se busca el digito
	 * @param position
	 *            Posicion de derecha a izquierda a retornar
	 * @return Digito ubicado en la posicion indicada
	 */
	private static int getDigitAt(String origin, int position) {
		if (origin.length() > position && position >= 0)
			return origin.charAt(origin.length() - position - 1) - 48;
		return 0;
	}

	/**
	 * Da formato a un número decimal y como resultado devuelve una cadena con  
	 * el signo de peso y las unidades agrupadas usando como separador comas.
	 * 
	 * @param numero el número que se desea formatear.
	 * @return una cadena con el número con formato $ 12,345.01
	 */
	public static String formatoMoneda(BigDecimal numero){
		double moneda = numero.doubleValue();
		Currency mxn = Currency.getInstance("MXN");
		Locale locale = new Locale("es", "MX");
		NumberFormat numformat = NumberFormat.getCurrencyInstance(locale);
		numformat.setCurrency(mxn);
		return numformat.format(moneda);
	}
	
	/**
	 * Da formato a un número decimal y como resultado devuelve una cadena con 
	 * el signo de porcentaje además de que soporta una parte decimal de de dos
	 * dígitos.
	 * 
	 * @param numero el número que se desea formatear.
	 * @return una cadena con el número con formato 12.12%.
	 */
	public static String formatoPorcentaje(BigDecimal numero){
		double num = numero.doubleValue();
		Locale locale = new Locale("es", "MX");
		NumberFormat defaultFormat = NumberFormat.getPercentInstance(locale);
		defaultFormat.setMinimumFractionDigits(2);
		
		return defaultFormat.format(num);
	}
}
