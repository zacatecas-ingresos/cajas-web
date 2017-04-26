package cajas.persistence.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "presupuesto_obligacion", schema = "presupuestos")
public class PresupuestoObligacionEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7535560829211502363L;

	@Id
	@Column(name = "id_presupuesto_obligacion")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPresupuestoObligacion;

	@Column(name = "id_presupuesto")
	private Integer idPresupuesto;

	@Column(name = "id_contribuyente")
	private Integer idContribuyente;

	@Column(name = "id_periodo")
	private Integer idPeriodo;

	@Column(name = "id_obligacion")
	private Integer idObligacion;

	@Column(name = "ejercicio_fiscal")
	private Integer ejercicioFiscal;

	@Column(name = "impuesto")
	private BigDecimal impuesto;

	@Column(name = "actualizaciones")
	private BigDecimal actualizaciones;

	@Column(name = "recargos")
	private BigDecimal recargos;

	@Column(name = "uaz")
	private BigDecimal uaz;

	@Column(name = "multa")
	private BigDecimal multa;

	@Column(name = "total")
	private BigDecimal total;

	public Integer getIdPresupuestoObligacion() {
		return idPresupuestoObligacion;
	}

	public void setIdPresupuesto(Integer idPresupuesto) {
		this.idPresupuesto = idPresupuesto;
	}

	public Integer getIdContribuyente() {
		return idContribuyente;
	}

	public void setIdContribuyente(Integer idContribuyente) {
		this.idContribuyente = idContribuyente;
	}

	public Integer getIdPeriodo() {
		return idPeriodo;
	}

	public void setIdPeriodo(Integer idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

	public Integer getIdObligacion() {
		return idObligacion;
	}

	public void setIdObligacion(Integer idObligacion) {
		this.idObligacion = idObligacion;
	}

	public Integer getEjercicioFiscal() {
		return ejercicioFiscal;
	}

	public void setEjercicioFiscal(Integer ejercicioFiscal) {
		this.ejercicioFiscal = ejercicioFiscal;
	}

	public BigDecimal getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(BigDecimal impuesto) {
		this.impuesto = impuesto;
	}

	public BigDecimal getActualizaciones() {
		return actualizaciones;
	}

	public void setActualizaciones(BigDecimal actualizaciones) {
		this.actualizaciones = actualizaciones;
	}

	public BigDecimal getRecargos() {
		return recargos;
	}

	public void setRecargos(BigDecimal recargos) {
		this.recargos = recargos;
	}

	public BigDecimal getUaz() {
		return uaz;
	}

	public void setUaz(BigDecimal uaz) {
		this.uaz = uaz;
	}

	public BigDecimal getMulta() {
		return multa;
	}

	public void setMulta(BigDecimal multa) {
		this.multa = multa;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Integer getIdPresupuesto() {
		return idPresupuesto;
	}

}
