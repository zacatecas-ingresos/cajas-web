package cajas.impuestos.declaracion.estatal;

import java.math.BigDecimal;

public class ImpuestoEstatal {
	private Integer idCalculoTemporal;
	private BigDecimal impuesto;
	private BigDecimal uaz;
	private BigDecimal actualizaciones;
	private BigDecimal recargos;
	private BigDecimal total;

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
	
}
