package cajas.impuestos.declaracion.estatal;

import java.math.BigDecimal;

public class ImpuestoSorteo {

	private Integer aFiscal;
	private Integer idPeriodo;
	private BigDecimal baseGravable;
	private Integer tipoIngreso;

	/*****************************************************/

	public Integer getaFiscal() {
		return aFiscal;
	}

	public void setaFiscal(Integer aFiscal) {
		this.aFiscal = aFiscal;
	}

	public Integer getIdPeriodo() {
		return idPeriodo;
	}

	public void setIdPeriodo(Integer idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

	public BigDecimal getBaseGravable() {
		return baseGravable;
	}

	public void setBaseGravable(BigDecimal baseGravable) {
		this.baseGravable = baseGravable;
	}

	public Integer getTipoIngreso() {
		return tipoIngreso;
	}

	public void setTipoIngreso(Integer tipoIngreso) {
		this.tipoIngreso = tipoIngreso;
	}

}