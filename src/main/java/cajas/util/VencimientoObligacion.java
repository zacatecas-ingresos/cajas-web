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
			throw new BusinessException("No existe obligacion en el regisgtro.");
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
	
	//Se aplica el recargo el dia 20 del mes siguiente al periodo declarado.
    public boolean aplicaRecargo(Integer anyoFiscalDeclarado, Integer periodoDeclarado){
    	boolean aplica = false;
    	DateTime fechaLimite = new DateTime(anyoFiscalDeclarado, periodoDeclarado, 20,0,0,0,0);
    	         fechaLimite = fechaLimite.plusMonths(1);
    	//System.out.println(fechaLimite.toString());
    	         fechaLimite =  diasNoLaboralesQuery.siguienteDiaHabil(fechaLimite);
    	//System.out.println("con dias" + fechaLimite.toString());
    	if(FechaUtil.fechaActualSinTiempo().compareTo(fechaLimite) == 1){
    		aplica = true;
    	}    
    	
 	    return aplica;
    }
    
    //Se aplica la actualizacion al segundo mes del periodo declarado.
    public boolean aplicaActualizacion(Integer anyoFiscalDeclarado, Integer periodoDeclarado){
    	boolean aplica = false;
    	DateTime fechaLimite = new DateTime(anyoFiscalDeclarado, periodoDeclarado, 1,0,0,0,0);
    	         fechaLimite = fechaLimite.plusMonths(2);
    	if(FechaUtil.fechaActualSinTiempo().compareTo(fechaLimite) == 1){
    		aplica = true;
    	}   
    	return aplica;
    }

}
