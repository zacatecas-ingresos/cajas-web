package cajas.impuestos.calculo;

import java.math.BigDecimal;

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
	 */
	public BigDecimal impuestoEstatal(BigDecimal baseGravable, String tipoImpuesto) {
		try {

			BigDecimal impuesto = BigDecimal.ZERO;
			BigDecimal tasa = BigDecimal.ZERO;
			tasa = tasaPorImpuesto(tipoImpuesto);

			impuesto = baseGravable.multiply(tasa);
			impuesto = impuesto.divide(new BigDecimal(100));

			return impuesto;
		} catch (NoResultException ex) {
			ex.printStackTrace();
			throw new BusinessException("No existe ninguna tasa correspondiente al impuesto " + tipoImpuesto);
		}
	}

	/*****
	 * Obtiene la tasa de acuerdo al impuesto recibido
	 */
	public BigDecimal tasaPorImpuesto(String tipoImpuesto) {
		BigDecimal tasa = BigDecimal.ZERO;
		TasaImpuestoEntity tasaImpuestoEntity = tasaImpuestoQuery.obtenerTasaPorImpuesto(tipoImpuesto);
		tasa = tasaImpuestoEntity.getTasa();
		return tasa;
	}

}