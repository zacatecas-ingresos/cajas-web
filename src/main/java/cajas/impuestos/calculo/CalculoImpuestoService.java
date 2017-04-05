package cajas.impuestos.calculo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

			if (periodo.contains("-")) {
				String meses[] = periodo.split("-");
				fechaInicio = obtenerFecha(meses[0]);
				fechaFin = obtenerFecha(meses[1]);
			} else {
				fechaInicio = obtenerFecha(periodo);
				fechaFin = obtenerFecha(periodo);
			}

			fechaInicio = aFiscal + fechaInicio;
			fechaFin = aFiscal + fechaFin;

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
	public String obtenerFecha(String periodo) {
		String fecha = "";
		switch (periodo) {
		case "ENERO":
			fecha = Periodo.ENERO;
			break;
		case "FEBRERO":
			fecha = Periodo.FEBRERO;
			break;
		case "MARZO":
			fecha = Periodo.MARZO;
			break;
		case "ABRIL":
			fecha = Periodo.ABRIL;
			break;
		case "MAYO":
			fecha = Periodo.MAYO;
			break;
		case "JUNIO":
			fecha = Periodo.JUNIO;
			break;
		case "JULIO":
			fecha = Periodo.JULIO;
			break;
		case "AGOSTO":
			fecha = Periodo.AGOSTO;
			break;
		case "SEPTIEMBRE":
			fecha = Periodo.SEPTIEMBRE;
			break;
		case "OCTUBRE":
			fecha = Periodo.OCTUBRE;
			break;
		case "NOVIEMBRE":
			fecha = Periodo.NOVIEMBRE;
			break;
		case "DICIEMBRE":
			fecha = Periodo.DICIEMBRE;
			break;
		default:
			fecha = "";
			break;
		}
		return fecha;
	}

}