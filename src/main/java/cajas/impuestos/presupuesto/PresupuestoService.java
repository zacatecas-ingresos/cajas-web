/**
 * 
 */
package cajas.impuestos.presupuesto;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;

import cajas.contribuyentes.Obligacion;
import cajas.exception.BusinessException;
import cajas.persistence.entity.CalculoTemporalEstatalEntity;
import cajas.persistence.entity.DetallePresupuestoIsnEntity;
import cajas.persistence.entity.PresupuestoEntity;
import cajas.persistence.entity.PresupuestoObligacionEntity;
import cajas.persistence.query.CalculoTemporalEstatalQuery;
import cajas.persistence.query.DetallePresupuestoIsnQuery;
import cajas.persistence.query.PresupuestoObligacionQuery;
import cajas.persistence.query.PresupuestoQuery;
import cajas.util.FechaUtil;
import cajas.util.LineaDeCapturaCerradaUtileria;

/**
 * @author Leila Schiaffini Ehuan
 *
 * @Since 26/04/2017 12:22:31
 */
public class PresupuestoService {
	@Inject
	private CalculoTemporalEstatalQuery calculoTemporalEstatalQuery;
	@Inject
	private DetallePresupuestoIsnQuery detallePresupuestoIsnQuery;

	@Inject
	private PresupuestoQuery presupuestoQuery;
	@Inject
	private PresupuestoObligacionQuery presupuestoObligacionQuery;

	/**
	 * Generar el presupuesto de isn, hospedaje
	 */
	protected Integer generarPresupuestoEstatal(List<Integer> calculos) {

		if (calculos.isEmpty()) {
			throw new BusinessException("Los conceptos del presupuesto son requeridos.");
		}

		BigDecimal importeTotal = BigDecimal.ZERO;

		PresupuestoEntity presupuesto = new PresupuestoEntity();
		presupuesto.setAnyoExpedicion(FechaUtil.ejercicioActual());
		presupuesto.setFechaEmisionPresupuesto(FechaUtil.fechaActual());
		presupuesto.setFechaRecepcionOperacion(null);
		presupuesto.setIdContribuyente(null);
		presupuesto.setIdEstatus(EstatusPresupuesto.ESPERA_CONFIRMACION_PAGO);
		presupuesto.setIdFormaPago(null);
		presupuesto.setIdMesExpedicion(FechaUtil.mesActual());
		presupuesto.setImporteTotal(importeTotal);
		presupuesto.setIntegrado(0);
		presupuesto.setLccBanco(" ");
		presupuesto.setLccOxxo(" ");

		presupuestoQuery.registrarActualizarPresupuesto(presupuesto);

		for (Integer idCalculo : calculos) {

			CalculoTemporalEstatalEntity c = calculoTemporalEstatalQuery.obtenerCalculoPorId(idCalculo);
			if (c == null) {
				throw new BusinessException(
						"El cálculo con identificador " + idCalculo + " no está registrado en el sistema.");
			}
			PresupuestoObligacionEntity po = new PresupuestoObligacionEntity();
			po.setActualizacion(c.getActualizaciones());
			po.setEjercicioFiscal(c.getEjercicioFiscal());
			po.setIdContribuyente(c.getIdContribuyente());
			po.setIdObligacion(c.getIdObligacion());
			po.setIdPeriodo(c.getIdPeriodo());
			po.setIdPresupuesto(presupuesto.getIdPresupuesto());
			po.setImpuesto(c.getImpuesto());
			po.setMulta(null);
			po.setRecargo(c.getRecargos());
			po.setTotal(c.getTotal());
			po.setUaz(c.getUaz());
			presupuestoObligacionQuery.registrarActualizarPresupuestoObligacion(po);

			importeTotal = importeTotal.add(po.getTotal());

		}

		presupuesto.setImporteTotal(importeTotal);
		String lccBancos = LineaDeCapturaCerradaUtileria.obtenerLineaCapturaCerrada(
				presupuesto.getIdPresupuesto().toString(), FechaUtil.fechaActual(),
				presupuesto.getImporteTotal().toString(), 2);

		String lccOxxo = LineaDeCapturaCerradaUtileria.obtenerLineaCapturaOxxo(
				presupuesto.getIdPresupuesto().toString(), FechaUtil.fechaActual(),
				presupuesto.getImporteTotal().toString());
		presupuesto.setLccBanco(lccBancos);
		presupuesto.setLccOxxo(lccOxxo);
		presupuestoQuery.registrarActualizarPresupuesto(presupuesto);

		return presupuesto.getIdPresupuesto();
	}

	/**
	 * Actualiza el estatus de un presupuesto
	 * 
	 * @param lcc
	 * @param estatus
	 */

	protected void cambiarEstatusPresupuesto(Integer idPresupuesto, Integer estatus) {
		PresupuestoEntity presEntity = null;
		try {
			presEntity = presupuestoQuery.obtenerPresupuestoPorId(idPresupuesto);
		} catch (NoResultException ex) {
			throw new BusinessException("No se encontraron resultados con el identificador del presupuesto utilizado.");
		}
		try {
			presEntity.setIdEstatus(estatus);
			presupuestoQuery.registrarActualizarPresupuesto(presEntity);
		} catch (PersistenceException ex) {
			throw new BusinessException("Se presentaron problemas al actualizar el presupuesto");
		}
	}

	/**
	 * Actualiza el estatus de un presupuesto
	 * 
	 * @param lcc
	 * @param estatus
	 */
	protected void cambiarEstatusPresupuestoPorLcc(String lcc, Integer estatus) {
		PresupuestoEntity presEntity = null;
		try {
			presEntity = presupuestoQuery.obtenerPresupuestoPorLcc(lcc);
		} catch (NoResultException ex) {
			throw new BusinessException("No se encontraron resultados con el identificador del presupuesto utilizado.");
		}

		try {
			presEntity.setIdEstatus(estatus);
			presupuestoQuery.registrarActualizarPresupuesto(presEntity);
		} catch (PersistenceException ex) {
			throw new BusinessException("Se presentaron problemas al actualizar el presupuesto");
		}
	}

}
