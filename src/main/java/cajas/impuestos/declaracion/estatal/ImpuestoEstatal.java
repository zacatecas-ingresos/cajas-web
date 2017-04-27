package cajas.impuestos.declaracion.estatal;

import java.math.BigDecimal;

public class ImpuestoEstatal {

	private Integer idCalculoTemporal;
	private BigDecimal impuesto;
	private BigDecimal uaz;
	private BigDecimal actualizaciones;
	private BigDecimal recargos;
	private BigDecimal total;

	private Integer periodo;
	private Integer aFiscal;
	private Integer obligacion;
	private String declaracion;

	/*********************** Getters and Setters ***********************/

	public Integer getIdCalculoTemporal() {
		return idCalculoTemporal;
	}

	public void setIdCalculoTemporal(Integer idCalculoTemporal) {
		this.idCalculoTemporal = idCalculoTemporal;
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

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Integer getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}

	public Integer getaFiscal() {
		return aFiscal;
	}

	public void setaFiscal(Integer aFiscal) {
		this.aFiscal = aFiscal;
	}

	public Integer getObligacion() {
		return obligacion;
	}

	public void setObligacion(Integer obligacion) {
		this.obligacion = obligacion;
	}

	public String getDeclaracion() {
		return declaracion;
	}

	public void setDeclaracion(String declaracion) {
		this.declaracion = declaracion;
	}

}
