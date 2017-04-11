/**
 * 
 */
package cajas.util;

import java.sql.Time;
import java.util.Date;

import org.joda.time.DateTime;

/**
 * @author Leila Schiaffini Ehuan
 *
 * @since 10/04/2017
 */
public class FechaUtil {
	private FechaUtil() {
	}

	/**
	 * Retorna la fecha actual en el sistema.
	 *
	 * @return
	 */
	public static Date fechaActual() {
		DateTime fechaActual = DateTime.now();
		return fechaActual.toDate();
	}

	public static Time horaActual() {
		Time horaActual = new Time(new Date().getTime());
		return horaActual;
	}

	/**
	 * Retorna la fecha actual sin horas ni minutos ni segundos
	 *
	 * @return
	 */
	public static DateTime fechaActualSinTiempo() {
		DateTime fechaActual = DateTime.now();
		fechaActual = fechaActual.withTime(0, 0, 0, 0);
		return fechaActual;
	}

	/**
	 * Retorna la fecha sin horas ni minutos ni segundos
	 *
	 * @param fecha
	 *            fecha con tiempo.
	 * @return
	 *
	 */
	public static DateTime fechaSinTiempo(Date fecha) {
		DateTime fechaSinTiempo = new DateTime(fecha);
		fechaSinTiempo = fechaSinTiempo.withTime(0, 0, 0, 0);
		return fechaSinTiempo;
	}

	/**
	 * Retorna el ejercicio fiscal actual
	 *
	 * @return
	 */
	public static int ejercicioActual() {
		int ejercicio = DateTime.now().getYear();
		return ejercicio;
	}

	/**
	 * Retorna el año de la fecha
	 *
	 * @param fecha
	 * @return
	 */
	public static int anioFecha(Date fecha) {
		DateTime fechaTime = new DateTime(fecha);
		int anio = fechaTime.getYear();
		return anio;
	}

	/**
	 * * Retorna la fecha con horas, minutos y segundos
	 *
	 * @return
	 */
	public static DateTime fechaConTiempo() {
		DateTime fechaActual = DateTime.now();
		return fechaActual;
	}

	/**
	 * Retorna el mes Actual
	 *
	 * @return
	 */
	public static int mesActual() {
		int mes = DateTime.now().getMonthOfYear();
		return mes;
	}

	/**
	 * Compara que la fecha ingresada no sea mayor a la actual
	 *
	 * @param fecha
	 * @return
	 */
	public static boolean validarFechaFutura(Date fecha) {
		boolean esfechaFutura = false;
		DateTime fechaIngresada = new DateTime(fecha);
		fechaIngresada.withHourOfDay(0);
		fechaIngresada.withMinuteOfHour(0);
		fechaIngresada.withSecondOfMinute(0);
		fechaIngresada.withMillisOfSecond(0);

		DateTime fechaActual = DateTime.now();
		fechaActual.withHourOfDay(0);
		fechaActual.withMinuteOfHour(0);
		fechaActual.withSecondOfMinute(0);
		fechaActual.withMillisOfSecond(0);

		if (fechaIngresada.isAfter(fechaActual)) {
			esfechaFutura = true;
		}

		return esfechaFutura;
	}

}
