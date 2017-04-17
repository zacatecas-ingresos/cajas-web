package cajas.impuestos.declaracion.estatal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.util.Date;

import javax.inject.Inject;
import javax.persistence.NoResultException;

import cajas.exception.BusinessException;
import cajas.persistence.entity.PeriodosEntity;
import cajas.persistence.entity.TasaImpuestoEntity;
import cajas.persistence.query.PeriodosQuery;
import cajas.persistence.query.TasaImpuestoQuery;

public class ImporteImpuestoService {

	@Inject
	TasaImpuestoQuery tasaImpuestoQuery;

	@Inject
	PeriodosQuery periodosQuery;

	/*********
	 * Calculo del impuesto estatal Formula: Base Gravable * Tasa = Impuesto
	 * 
	 * @throws ParseException
	 */
	public BigDecimal impuestoEstatal(BigDecimal baseGravable, Integer aFiscal, String periodo, Integer tipoPeriodo,
			int tipoTasa) {
		try {
	
			BigDecimal impuesto = BigDecimal.ZERO;
			BigDecimal tasa = BigDecimal.ZERO;

			PeriodosEntity periodoEntity = periodosQuery.obtenerPeriodo(aFiscal, periodo, tipoPeriodo);

			tasa = tasaPorImpuesto(tipoTasa, periodoEntity.getFechaInicio(), periodoEntity.getFechaFin());
					
			impuesto = baseGravable.multiply(tasa);
			impuesto = impuesto.divide(new BigDecimal(100).setScale(0, RoundingMode.HALF_UP));
			
			return impuesto;
		} catch (NoResultException ex) {
			ex.printStackTrace();
			throw new BusinessException("No existe ninguna tasa configurada en el periodo solicitado ");
		}
	}

	/*****
	 * Obtiene la tasa de acuerdo al impuesto recibido
	 * 
	 * @throws ParseException
	 */
	public BigDecimal tasaPorImpuesto(int tipoTasa, Date fechaInicio, Date fechaFin) {

		BigDecimal tasa = BigDecimal.ZERO;

		TasaImpuestoEntity tasaImpuestoEntity = tasaImpuestoQuery.obtenerTasaPorImpuesto(tipoTasa, fechaInicio,
				fechaFin);
		tasa = tasaImpuestoEntity.getTasa();
		return tasa;
	}

}