package cajas.impuestos.declaracion.estatal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.util.Date;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.joda.time.DateTime;

import cajas.exception.BusinessException;
import cajas.persistence.entity.PeriodosEntity;
import cajas.persistence.entity.TasaImpuestoEntity;
import cajas.persistence.query.PeriodosQuery;
import cajas.persistence.query.TasaImpuestoQuery;

public class ImporteImpuestoService {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	@Inject
	TasaImpuestoQuery tasaImpuestoQuery;

	@Inject
	PeriodosQuery periodosQuery;

	/*********
	 * Calculo del impuesto estatal Formula: Base Gravable * Tasa = Impuesto
	 * 
	 * @throws ParseException
	 */
	public BigDecimal impuestoEstatal(BigDecimal baseGravable, Integer aFiscal, int idPeriodo, int tipoTasa) {
		try {
			PeriodosEntity periodo = entityManager.find(PeriodosEntity.class, idPeriodo);

			BigDecimal impuesto = BigDecimal.ZERO;
			BigDecimal tasa = BigDecimal.ZERO;

			// Consultar la tasa vigente del periodo declarado
			DateTime fechaInicio = new DateTime(periodo.getFechaInicio());
			fechaInicio.withYear(aFiscal);
			DateTime fechaFin = new DateTime(periodo.getFechaFin());
			fechaFin.withYear(aFiscal);

			tasa = tasaPorImpuesto(tipoTasa, fechaInicio.toDate(), fechaFin.toDate());

			impuesto = baseGravable.multiply(tasa);
			impuesto = impuesto.divide(new BigDecimal(100)).setScale(0, RoundingMode.HALF_UP);

			return impuesto;
		} catch (NoResultException ex) {
			ex.printStackTrace();
			throw new BusinessException("No existe ninguna tasa configurada en el periodo solicitado.");
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
	
	/*****
	 * Obtiene la tasa de acuerdo al impuesto recibido
	 * 
	 * @throws ParseException
	 */
	public BigDecimal tasaPorImpuestoConcurso(int tipoTasa, Date fechaInicio, Date fechaFin) {

		BigDecimal tasa = BigDecimal.ZERO;

		TasaImpuestoEntity tasaImpuestoEntity = tasaImpuestoQuery.obtenerTasaPorImpuesto(tipoTasa, fechaInicio,fechaFin);
		tasa = tasaImpuestoEntity.getTasa();	
		return tasa;
	}

	/*************
	 * CALCULO IMPUESTO SOBRE LOTERÍAS, RIFAS, SORTEOS, APUESTAS, JUEGOS
	 * PERMITIDOS Y CONCURSOS
	 *************/

	public BigDecimal impuestoConcursos(BigDecimal baseGravable, Integer aFiscal, int idPeriodo, int tipoIngreso) {
		try {

			PeriodosEntity periodo = entityManager.find(PeriodosEntity.class, idPeriodo);

			BigDecimal impuesto = BigDecimal.ZERO;
			BigDecimal tasa = BigDecimal.ZERO;

			// Consultar la tasa vigente del periodo declarado
			DateTime fechaInicio = new DateTime(periodo.getFechaInicio());
			fechaInicio.withYear(aFiscal);
			DateTime fechaFin = new DateTime(periodo.getFechaFin());
			fechaFin.withYear(aFiscal);
			
			tasa = tasaPorImpuestoConcurso(tipoIngreso, fechaInicio.toDate(), fechaFin.toDate());
			impuesto = baseGravable.multiply(tasa);
			impuesto = impuesto.divide(new BigDecimal(100)).setScale(0, RoundingMode.HALF_EVEN);

			return impuesto;
		} catch (NoResultException ex) {
			ex.printStackTrace();
			throw new BusinessException("No existe ninguna tipo de ingreso configurado en el periodo solicitado.");
		}
	}

}