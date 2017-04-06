package cajas.impuestos.calculo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.NoResultException;

import cajas.exception.BusinessException;
import cajas.persistence.entity.TasaImpuestoEntity;
import cajas.persistence.query.TasaImpuestoQuery;

@Stateless
public class CalculoImpuestoService {

	@Inject
	TasaImpuestoQuery tasaImpuestoQuery;

	/*********
	 * Calculo del impuesto estatal Formula: Base Gravable * Tasa = Impuesto
	 * @throws ParseException 
	 */
	public BigDecimal impuestoEstatal(BigDecimal baseGravable, String tipoImpuesto, Integer aFiscal, String periodo) throws ParseException {
		try {

			BigDecimal impuesto = BigDecimal.ZERO;
			BigDecimal tasa = BigDecimal.ZERO;
			String fechaInicio = "";
			String fechaFin = "";

			String[]fechas = new String[2];
			
			if (periodo.contains("-")) {
				String meses[] = periodo.split("-");
				fechas = obtenerFecha(meses[0],fechaInicio,fechaFin,aFiscal);
				fechaInicio = aFiscal + fechas[0];
				fechas = obtenerFecha(meses[1],fechaInicio,fechaFin,aFiscal);
				fechaFin = aFiscal + fechas[1];
			} else {
				fechas = obtenerFecha(periodo,fechaInicio,fechaFin,aFiscal);
				fechaInicio = aFiscal + fechas[0];
				fechaFin = aFiscal + fechas[1];
			}
			
						
			tasa = tasaPorImpuesto(tipoImpuesto, fechaInicio, fechaFin);

			impuesto = baseGravable.multiply(tasa);
			impuesto = impuesto.divide(new BigDecimal(100).setScale(0, RoundingMode.HALF_UP));

			return impuesto;
		} catch (NoResultException ex) {
			ex.printStackTrace();
			throw new BusinessException("No existe ninguna tasa correspondiente al impuesto " + tipoImpuesto);
		}
	}

	/*****
	 * Obtiene la tasa de acuerdo al impuesto recibido
	 * @throws ParseException 
	 */
	public BigDecimal tasaPorImpuesto(String tipoImpuesto, String fechaInicio, String fechaFin) throws ParseException {
		
		BigDecimal tasa = BigDecimal.ZERO;
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		Date inicio = formato.parse(fechaInicio);
		Date fin = formato.parse(fechaFin);
				
		TasaImpuestoEntity tasaImpuestoEntity = tasaImpuestoQuery.obtenerTasaPorImpuesto(tipoImpuesto, inicio, fin);
		tasa = tasaImpuestoEntity.getTasa();
		return tasa;
	}

	/********
	 * Obtener fecha de acuerdo al mes
	 * 
	 * @param periodo
	 * @return
	 */
	public String[] obtenerFecha(String periodo,String fechaInicio,String fechaFin,Integer aFiscal) {
		
		String []fechas = new String[2];
		switch (periodo) {
		case "ENERO":
			fechas[0] = Periodo.ENERO_INICIO;
			fechas[1] = Periodo.ENERO_FIN;
			break;
		case "FEBRERO":
			fechas[0] = Periodo.FEBRERO_INICIO;
			GregorianCalendar calendar =  new GregorianCalendar();
			fechas[1] = (calendar.isLeapYear(aFiscal))?Periodo.FEBRERO_FIN_BISIESTO:Periodo.FEBRERO_FIN;
			break;
		case "MARZO":
			fechas[0] = Periodo.MARZO_INICIO;
			fechas[1] = Periodo.MARZO_FIN;
			break;
		case "ABRIL":
			fechas[0] = Periodo.ABRIL_INICIO;
			fechas[1] = Periodo.ABRIL_FIN;
			break;
		case "MAYO":
			fechas[0] = Periodo.MAYO_INICIO;
			fechas[1] = Periodo.MAYO_FIN;
			break;
		case "JUNIO":
			fechas[0] = Periodo.JUNIO_INICIO;
			fechas[1] = Periodo.JUNIO_FIN;
			break;
		case "JULIO":
			fechas[0] = Periodo.JULIO_INICIO;
			fechas[1] = Periodo.JULIO_FIN;
			break;
		case "AGOSTO":
			fechas[0] = Periodo.AGOSTO_INICIO;
			fechas[1] = Periodo.AGOSTO_FIN;
			break;
		case "SEPTIEMBRE":
			fechas[0] = Periodo.SEPTIEMBRE_INICIO;
			fechas[1] = Periodo.SEPTIEMBRE_FIN;
			break;
		case "OCTUBRE":
			fechas[0] = Periodo.OCTUBRE_INICIO;
			fechas[1] = Periodo.OCTUBRE_FIN;
			break;
		case "NOVIEMBRE":
			fechas[0] = Periodo.NOVIEMBRE_INICIO;
			fechas[1] = Periodo.NOVIEMBRE_FIN;
			break;
		case "DICIEMBRE":
			fechas[0] = Periodo.DICIEMBRE_INICIO;
			fechas[1] = Periodo.DICIEMBRE_FIN;
			break;
		default:
			fechas[0] ="01-01";
			fechas[1] = "12-01";
			break;
		}
		return fechas;
	}

}