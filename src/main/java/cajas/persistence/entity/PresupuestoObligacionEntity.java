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
@Table(name = "PresupuestosObligaciones", schema = "recaudaciones")
public class PresupuestoObligacionEntity implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7535560829211502363L;

	@Id
	@Column(name = "IdPresupuestoObligacion")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPresupuestoObligacion;

	@Column(name = "IdPresupuesto")
	private Integer idPresupuesto;
	
	@Column(name = "IdDetallePresupuesto")
	private Integer idDetallePresupuesto;
	
	@Column(name = "IdObligacion")
	private Integer idObligacion;

	@Column(name = "IdPeriodo")
	private Integer idPeriodo;

	@Column(name = "Impuesto")
	private BigDecimal impuesto;

	@Column(name = "UAZ")
	private BigDecimal uaz;

	@Column(name = "Actualizacion")
	private BigDecimal actualizacion;

	@Column(name = "Recargo")
	private BigDecimal recargo;

	@Column(name = "Multa")
	private BigDecimal multa;

	@Column(name = "Total")
	private BigDecimal total;

	@Column(name = "EjercicioFiscal")
	private Integer ejercicioFiscal;

	@Column(name = "IdContribuyente")
	private Integer idContribuyente;
	
	/************ Getters and Setters ************/

	public Integer getIdPresupuestoObligacion() {
		return idPresupuestoObligacion;
	}

	public void setIdPresupuestoObligacion(Integer idPresupuestoObligacion) {
		this.idPresupuestoObligacion = idPresupuestoObligacion;
	}

	public Integer getIdPresupuesto() {
		return idPresupuesto;
	}

	public void setIdPresupuesto(Integer idPresupuesto) {
		this.idPresupuesto = idPresupuesto;
	}

	public Integer getIdDetallePresupuesto() {
		return idDetallePresupuesto;
	}

	public void setIdDetallePresupuesto(Integer idDetallePresupuesto) {
		this.idDetallePresupuesto = idDetallePresupuesto;
	}

	public Integer getIdObligacion() {
		return idObligacion;
	}

	public void setIdObligacion(Integer idObligacion) {
		this.idObligacion = idObligacion;
	}

	public Integer getIdPeriodo() {
		return idPeriodo;
	}

	public void setIdPeriodo(Integer idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

	public BigDecimal getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(BigDecimal impuesto) {
		this.impuesto = impuesto;
	}

	public BigDecimal getUaz() {
		return uaz;
	}

	public void setUaz(BigDecimal uaz) {
		this.uaz = uaz;
	}

	public BigDecimal getActualizacion() {
		return actualizacion;
	}

	public void setActualizacion(BigDecimal actualizacion) {
		this.actualizacion = actualizacion;
	}

	public BigDecimal getRecargo() {
		return recargo;
	}

	public void setRecargo(BigDecimal recargo) {
		this.recargo = recargo;
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

	public Integer getEjercicioFiscal() {
		return ejercicioFiscal;
	}

	public void setEjercicioFiscal(Integer ejercicioFiscal) {
		this.ejercicioFiscal = ejercicioFiscal;
	}

	public Integer getIdContribuyente() {
		return idContribuyente;
	}

	public void setIdContribuyente(Integer idContribuyente) {
		this.idContribuyente = idContribuyente;
	}

	
}
