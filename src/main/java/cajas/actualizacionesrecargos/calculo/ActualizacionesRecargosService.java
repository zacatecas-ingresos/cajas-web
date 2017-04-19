package cajas.actualizacionesrecargos.calculo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.NoResultException;

import cajas.exception.BusinessException;
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
			actualizacion = contribucionFiscal.getCantidadAdeuda().multiply(factorActualizacion).setScale(0,RoundingMode.UP);
			
		}
		
		
		/******************* Recargos *******************/
		if(contribucionFiscal.getPeriodoRecargo() != null){
			
			/*****
			 * Calculo del recargo
			 * 
			 */
			importeRecargo = calculoRecargo(contribucionFiscal.getPeriodoRecargo().getEjercicioInicial(), contribucionFiscal.getPeriodoRecargo().getMesInicial(),
			contribucionFiscal.getPeriodoRecargo().getEjercicioFinal(),contribucionFiscal.getPeriodoRecargo().getMesFinal(),actualizacion);
			
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

	/********* Calculo del recargo ***********/
	private BigDecimal calculoRecargo(Integer aFiscalInicio, Integer mesFiscalInicio, Integer aFiscalFinal,
			Integer mesFiscalFinal,BigDecimal importeActualizacion) {

		BigDecimal recargo = BigDecimal.ZERO;
		try {

			recargo = obtenerTasaRecargo(aFiscalInicio, mesFiscalInicio, aFiscalFinal, mesFiscalFinal);
			recargo.setScale(2, RoundingMode.HALF_EVEN);

		} catch (NoResultException ex) {
			ex.printStackTrace();
			throw new BusinessException("Ocurrio un problema no se encontrarón resultados.");
		}
		BigDecimal montoRecargo = BigDecimal.ZERO;

		montoRecargo = importeActualizacion.multiply(recargo);

		montoRecargo = montoRecargo.divide(new BigDecimal(100), 2, RoundingMode.HALF_EVEN);

		return montoRecargo;
	}

	/********** Obtener INPC *************/
	private BigDecimal obtenerTasaRecargo(Integer aFiscalInicio, Integer mesFiscalInicio, Integer aFiscalFinal,
			Integer mesFiscalFinal) {

		List<INPCEntity> inpcEntity = inpcQuery.listaINPC(aFiscalInicio, mesFiscalInicio, aFiscalFinal, mesFiscalFinal);
		BigDecimal tasaRecargo = BigDecimal.ZERO;
		for (INPCEntity inpc : inpcEntity) {
			tasaRecargo = tasaRecargo.add(inpc.getRecargo());
		}
		return tasaRecargo;
	}

}