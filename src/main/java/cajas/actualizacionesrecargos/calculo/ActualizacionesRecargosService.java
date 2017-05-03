package cajas.actualizacionesrecargos.calculo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.NoResultException;

import org.joda.time.DateTime;

import cajas.impuestos.declaracion.estatal.TipoTasaRecargo;
import cajas.persistence.entity.INPCEntity;
import cajas.persistence.query.INPCQuery;

public class ActualizacionesRecargosService {

	@Inject
	private INPCQuery inpcQuery;

	/************************************* ACTUALIZACIONES *************************************/

	/************* Calcula el importe de la actualización **********/
	public ActualizacionRecargo calculoActualizacion(ContribucionFiscal contribucionFiscal) {
				
		ActualizacionRecargo actualizacionRecargo = new ActualizacionRecargo();
		BigDecimal actualizacion = BigDecimal.ZERO;
		BigDecimal inpcAnterior = BigDecimal.ZERO;
		BigDecimal inpcActual = BigDecimal.ZERO;
		BigDecimal porcentajeRecargo = BigDecimal.ZERO;
		BigDecimal importeRecargo = BigDecimal.ZERO;
		BigDecimal factorActualizacion = BigDecimal.ZERO;
		BigDecimal cantidadAdeudaActualizacion = BigDecimal.ZERO;

		/*******
		 * Obtengo el INPC del mes anterior en el que se debio efectuar el pago
		 * 
		 */
		if(contribucionFiscal.getPeriodoActualizacion() != null){
			
			inpcAnterior = obtenerINPC(contribucionFiscal.getPeriodoActualizacion().getEjercicioInicial(),contribucionFiscal.getPeriodoActualizacion().getMesInicial());
						
			/*******
			 * Obtengo el INPC del mes anterior en el que se va a realizar el pago
			 * 
			 */
			inpcActual = obtenerINPC(contribucionFiscal.getPeriodoActualizacion().getEjercicioFinal(), contribucionFiscal.getPeriodoActualizacion().getMesFinal());
			
			/***
			 * Si el INPC del mes en el que se va a efectuar el pago no devuelve
			 * ningun resultado obtengo el INPC del mes anterior al solicitado
			 * inicialmente
			 */
			if (inpcActual == null) {
				inpcActual = obtenerINPC(contribucionFiscal.getPeriodoActualizacion().getEjercicioFinal(),contribucionFiscal.getPeriodoActualizacion().getMesFinal() -1);
			}			
			
			/***
			 * Bien ahora que ya tenemos los dos INPC, procedemos a realizar el
			 * calculo del factor de actualización
			 */

			factorActualizacion = factorActualizacion(inpcAnterior, inpcActual);
			/*****
			 * Factor de actualización Si el factor de actualización es menor a 1 se
			 * toma como factor 1
			 */
			if(factorActualizacion.compareTo(BigDecimal.ZERO) > 0) {
				contribucionFiscal.setAplicaActualizacion(true);
			}
			
			/*****
			 * Ahora si calculamos el monto de la actualización multiplicando el
			 * importe recibido por el factor de la actualización
			 */
			

			BigDecimal cantidadTotal = BigDecimal.ZERO;
			cantidadTotal = contribucionFiscal.getCantidadAdeuda().add(contribucionFiscal.getUaz());
			actualizacion = cantidadTotal.multiply(factorActualizacion).setScale(0,RoundingMode.HALF_EVEN);
			cantidadAdeudaActualizacion = actualizacion.add(cantidadTotal);
			actualizacion = actualizacion.subtract(cantidadTotal);
		}
		
		
		/******************* Recargos *******************/
		if(contribucionFiscal.getPeriodoRecargo() != null){
			
			/*****
			 * Calculo del recargo
			 * 
			 */
			importeRecargo = calculoRecargo(contribucionFiscal.getPeriodoRecargo().getEjercicioInicial(), contribucionFiscal.getPeriodoRecargo().getMesInicial(),
			contribucionFiscal.getPeriodoRecargo().getEjercicioFinal(),contribucionFiscal.getPeriodoRecargo().getMesFinal(),cantidadAdeudaActualizacion,contribucionFiscal.getTipoTasaRecargo());
			
			/***
			 * Set Valores calculados
			 * 
			 */
			actualizacionRecargo.setInpcInicio(inpcAnterior);
			actualizacionRecargo.setInpcFinal(inpcActual);

			/****
			 * Si el factor de actualización es menor a uno solo se pagan recargos
			 */
			if(importeRecargo.compareTo(BigDecimal.ZERO) > 0) {
				contribucionFiscal.setAplicaRecargos(true);
			}
						
		}
		
		actualizacionRecargo.setFactorActualizacion(factorActualizacion);
		actualizacionRecargo.setPorcentajeRecargo(porcentajeRecargo);
		actualizacionRecargo.setImporteRecargo(importeRecargo);		
		actualizacionRecargo.setImporteActualizacion(actualizacion);
		
		return actualizacionRecargo;
	}

	/********** Calculo factor de la actualización **********/
	private BigDecimal factorActualizacion(BigDecimal inpcAnterior, BigDecimal inpcActual) {
		BigDecimal factorActualizacion = BigDecimal.ZERO;

		factorActualizacion = inpcActual.divide(inpcAnterior, 4, RoundingMode.DOWN);
		return factorActualizacion;
	}

	/********** Obtener INPC *************/
	private BigDecimal obtenerINPC(Integer aFiscal, Integer mesFiscal) {
		try {
			INPCEntity inpcEntity = inpcQuery.inpcEntity(aFiscal, mesFiscal);
			return inpcEntity.getInpc();
		} catch (NoResultException ex) {
			return null;
		}
	}

	/************************************* RECARGOS *************************************/

	private BigDecimal calculoRecargo(Integer aFiscalInicio, Integer mesFiscalInicio, Integer aFiscalFinal,
			Integer mesFiscalFinal,BigDecimal importeActualizacion,Integer tipoTasaRecargo) {

		BigDecimal recargo = BigDecimal.ZERO;
	
		recargo = obtenerTasaRecargo(aFiscalInicio, mesFiscalInicio, aFiscalFinal, mesFiscalFinal,tipoTasaRecargo);
		
		recargo.setScale(2, RoundingMode.HALF_EVEN);

		BigDecimal montoRecargo = BigDecimal.ZERO;
		
		montoRecargo = importeActualizacion.multiply(recargo);
		
		montoRecargo = montoRecargo.divide(new BigDecimal(100), 0, RoundingMode.HALF_EVEN);

		return montoRecargo;
	}

	/********** Obtener INPC *************/
	private BigDecimal obtenerTasaRecargo(Integer aFiscalInicio, Integer mesFiscalInicio, Integer aFiscalFinal,
			Integer mesFiscalFinal,Integer tipoTasaRecargo) {
		
		// Genera un arreglo de fechas en el intervalo para
		// facilitar la creacion de una lista de factores de recargo mensual
		DateTime limiteSuperior = new DateTime(aFiscalFinal,mesFiscalFinal, 1, 0, 0);
		List<DateTime> mesAnyo = new ArrayList<DateTime>();
		DateTime fechaIndice = new DateTime(aFiscalInicio, mesFiscalInicio, 1, 0, 0);
		while (fechaIndice.compareTo(limiteSuperior) <= 0) {
				mesAnyo.add(fechaIndice);
				fechaIndice = fechaIndice.plusMonths(1);
		}
		
		List<INPCEntity> factoresRecargo = new ArrayList<INPCEntity>();
		for (DateTime c : mesAnyo) {
			
			INPCEntity factorRecargo = new INPCEntity();
			factorRecargo.setaFiscal(c.getYear());
			factorRecargo.setMesFiscal(c.getMonthOfYear());
						
			try{
				INPCEntity inpc = inpcQuery.inpcEntity(factorRecargo.getaFiscal(),factorRecargo.getMesFiscal());
				if(tipoTasaRecargo.equals(TipoTasaRecargo.tasaEstatal)){//Estatal
					factorRecargo.setRecargo(inpc.getRecargoEstatal());
				}else if(tipoTasaRecargo.equals(TipoTasaRecargo.tasaFederal)){
					factorRecargo.setRecargo(inpc.getRecargo());
				}
				factoresRecargo.add(factorRecargo);
			}catch(NoResultException ex){
				//ex.printStackTrace();
			}
		}	
	
		BigDecimal tasaRecargo = BigDecimal.ZERO;
		for (INPCEntity inpc : factoresRecargo) {
			tasaRecargo = tasaRecargo.add(inpc.getRecargo());
		}
		return tasaRecargo;
	}

}