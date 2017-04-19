/**
 * 
 */
package cajas.util;

import javax.inject.Inject;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;

import cajas.exception.BusinessException;
import cajas.persistence.entity.ObligacionesEntity;
import cajas.persistence.query.DiasNoLaboralesQuery;
import cajas.persistence.query.ObtenerObligacionQuery;

/**
 * @author Sanchez Moo Jesus Miguel
 *
 */
public class VencimientoObligacion {

	@Inject
	private ObtenerObligacionQuery obtenerObligacionQuery;

	@Inject
	private DiasNoLaboralesQuery diasNoLaboralesQuery;

	public boolean haVencidoObligacion(int idObligacion, int mes, int ejercicioFiscal) {
		boolean vencido = false;

		ObligacionesEntity obligacion = obtenerObligacionQuery.obtenerObligacion(idObligacion);

		if (obligacion == null) {
			throw new BusinessException("No existe obligacion en el registro.");
		}
		DateTime fechaVencimiento = new DateTime(ejercicioFiscal, mes, 20, 0, 0);
		fechaVencimiento = fechaVencimiento.plusMonths(1).plusDays(obligacion.getDiasProrroga());
		if (fechaVencimiento.getDayOfWeek() == DateTimeConstants.FRIDAY) {
			fechaVencimiento = fechaVencimiento.plusDays(3);
		}

		int diasNoLaborables = diasNoLaboralesQuery.obtenerNumeroDiasNoLaborales(fechaVencimiento);
		fechaVencimiento = fechaVencimiento.plusDays(diasNoLaborables);
		
		if(FechaUtil.fechaActualSinTiempo().isAfter(fechaVencimiento)){
			  vencido = true;
		  }  
		
		return vencido;
	}

}
