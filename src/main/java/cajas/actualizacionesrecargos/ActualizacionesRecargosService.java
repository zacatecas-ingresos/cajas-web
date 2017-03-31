package cajas.actualizacionesrecargos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.NoResultException;

import cajas.exception.BusinessException;
import cajas.persistence.entity.INPCEntity;
import cajas.persistence.query.INPCQuery;

@Stateless
public class ActualizacionesRecargosService {

	@Inject
	INPCQuery inpcQuery;

	/************************************* ACTUALIZACIONES *************************************/

	/************* Calcula el importe de la actualización **********/
	public BigDecimal calculoActualizacion(Integer aFiscal, Integer mesFiscal, BigDecimal impuestoGravable) {

		BigDecimal actualizacion = BigDecimal.ZERO;

		BigDecimal inpcAnterior = BigDecimal.ZERO;
		BigDecimal inpcActual = BigDecimal.ZERO;
		try {

			inpcAnterior = obtenerINPC(aFiscal, mesFiscal);
			Calendar periodo = Calendar.getInstance();
			Integer aFiscalActual = periodo.get(Calendar.YEAR);
			Integer mesFiscalActual = periodo.get(Calendar.MONTH);

			inpcActual = obtenerINPC(aFiscalActual, mesFiscalActual);

			if (inpcActual.compareTo(BigDecimal.ZERO) == 0) {
				mesFiscalActual--;
				inpcActual = obtenerINPC(aFiscalActual, mesFiscalActual);
			}

		} catch (NoResultException ex) {
			ex.printStackTrace();
			throw new BusinessException("Ocurrio un problema no se encontrarón resultados.");
		}

		BigDecimal factorActualizacion = BigDecimal.ZERO;

		factorActualizacion = factorActualizacion(inpcAnterior, inpcActual);

		factorActualizacion = (factorActualizacion.compareTo(BigDecimal.ONE) < 1) ? BigDecimal.ONE
				: factorActualizacion;

		actualizacion = impuestoGravable.multiply(factorActualizacion).setScale(4, RoundingMode.HALF_EVEN);

		return actualizacion;
	}

	/************* Calcula el importe de una actualización *************/
	public BigDecimal importeActualizacion(BigDecimal actualizacion, BigDecimal impuestoGravable) {
		BigDecimal importeActualizacion = BigDecimal.ZERO;
		importeActualizacion = actualizacion.subtract(impuestoGravable);
		return importeActualizacion;
	}

	/********** Calculo factor de la actualización **********/
	public BigDecimal factorActualizacion(BigDecimal inpcAnterior, BigDecimal inpcActual) {
		BigDecimal factorActualizacion = BigDecimal.ZERO;

		factorActualizacion = inpcActual.divide(inpcAnterior, 4);

		return factorActualizacion;
	}

	/********** Obtener INPC *************/
	public BigDecimal obtenerINPC(Integer aFiscal, Integer mesFiscal) {
		INPCEntity inpcEntity = inpcQuery.inpcEntity(aFiscal, mesFiscal);
		return inpcEntity.getInpc();
	}

	/************************************* RECARGOS *************************************/

	/********* Calculo del recargo ***********/
	public BigDecimal calculoRecargo(Integer aFiscalInicio, Integer mesFiscalInicio, Boolean vencioPago,
			BigDecimal importeActualizacion) {
		BigDecimal recargo = BigDecimal.ZERO;
		try {
			recargo = obtenerTasaRecargo(aFiscalInicio, mesFiscalInicio, vencioPago);
			recargo.setScale(2);

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
	public BigDecimal obtenerTasaRecargo(Integer aFiscalInicio, Integer mesFiscalInicio, Boolean vencioPago) {
		Calendar periodo = Calendar.getInstance();
		Integer aFiscalFinal = periodo.get(Calendar.YEAR);
		Integer mesFiscalFinal = periodo.get(Calendar.MONTH);

		List<INPCEntity> inpcEntity = inpcQuery.listaINPC(aFiscalInicio, mesFiscalInicio, aFiscalFinal, mesFiscalFinal,
				vencioPago);
		BigDecimal tasaRecargo = BigDecimal.ZERO;
		for (INPCEntity inpc : inpcEntity) {
			tasaRecargo = tasaRecargo.add(inpc.getRecargo());
		}
		return tasaRecargo;
	}

}