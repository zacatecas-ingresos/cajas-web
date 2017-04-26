/**
 * 
 */
package cajas.impuestos.presupuesto;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;

import cajas.contribuyentes.TipoObligacion;
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
		presupuesto.setEjercicioExpedicion(FechaUtil.ejercicioActual());
		presupuesto.setFechaEmisionPresupuesto(FechaUtil.fechaActual());
		presupuesto.setFechaRecepcionOperacion(null);
		presupuesto.setIdContribuyente(null);
		presupuesto.setIdEstatus(EstatusPresupuesto.GENERADO);
		presupuesto.setIdFormaPago(null);
		presupuesto.setIdMesExpedicion(FechaUtil.mesActual());
		presupuesto.setImporteTotal(importeTotal);
		presupuesto.setIntegrado(false);
		presupuesto.setLcc("S/LCC");

		presupuestoQuery.registrarActualizarPresupuesto(presupuesto);

		for (Integer idCalculo : calculos) {

			CalculoTemporalEstatalEntity c = calculoTemporalEstatalQuery.obtenerCalculoPorId(idCalculo);
			if (c == null) {
				throw new BusinessException(
						"El cálculo con identificador " + idCalculo + " no está registrado en el sistema.");
			}
			PresupuestoObligacionEntity po = new PresupuestoObligacionEntity();
			po.setActualizaciones(c.getActualizaciones());
			po.setEjercicioFiscal(c.getEjercicioFiscal());
			po.setIdContribuyente(c.getIdContribuyente());
			po.setIdObligacion(c.getIdObligacion());
			po.setIdPeriodo(c.getIdPeriodo());
			po.setIdPresupuesto(presupuesto.getIdPresupuesto());
			po.setImpuesto(c.getImpuesto());
			po.setMulta(null);
			po.setRecargos(c.getRecargos());
			po.setTotal(c.getTotal());
			po.setUaz(c.getUaz());
			presupuestoObligacionQuery.registrarActualizarPresupuestoObligacion(po);

			importeTotal = importeTotal.add(po.getTotal());

			if (c.getIdObligacion() == TipoObligacion.NOMINA) {
				DetallePresupuestoIsnEntity d = new DetallePresupuestoIsnEntity();
				d.setActualizaciones(c.getActualizaciones());
				d.setBaseGravable(c.getBaseGravable());
				d.setEjercicioFiscal(c.getEjercicioFiscal());
				d.setIdContribuyente(c.getIdContribuyente());
				d.setIdPeriodo(c.getIdPeriodo());
				d.setIdPresupuestoObligacion(po.getIdPresupuestoObligacion());
				d.setIdSucursal(c.getIdSucursal());
				d.setImpuesto(c.getImpuesto());
				d.setNumeroEmpleados(c.getNumeroEmpleados());
				d.setRecargos(c.getRecargos());
				d.setTipoDeclaracion(c.getTipoDeclaracion());
				d.setTotal(c.getTotal());
				d.setUaz(c.getUaz());
				detallePresupuestoIsnQuery.actualizarRegistrarDetalle(d);
			}

		}

		return presupuesto.getIdPresupuesto();
	}

}
