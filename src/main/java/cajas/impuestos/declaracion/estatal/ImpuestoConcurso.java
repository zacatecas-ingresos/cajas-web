package cajas.impuestos.declaracion.estatal;

import java.math.BigDecimal;

public class ImpuestoConcurso {

	private Integer aFiscal;
	private Integer idPeriodo;
	private BigDecimal baseGravableEnajenacion;
	private BigDecimal baseGravableEfectivo;
	private BigDecimal baseGravableEspecie;
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

	public BigDecimal getBaseGravableEnajenacion() {
		return baseGravableEnajenacion;
	}

	public void setBaseGravableEnajenacion(BigDecimal baseGravableEnajenacion) {
		this.baseGravableEnajenacion = baseGravableEnajenacion;
	}

	public BigDecimal getBaseGravableEfectivo() {
		return baseGravableEfectivo;
	}

	public void setBaseGravableEfectivo(BigDecimal baseGravableEfectivo) {
		this.baseGravableEfectivo = baseGravableEfectivo;
	}

	public BigDecimal getBaseGravableEspecie() {
		return baseGravableEspecie;
	}

	public void setBaseGravableEspecie(BigDecimal baseGravableEspecie) {
		this.baseGravableEspecie = baseGravableEspecie;
	}

	public Integer getTipoIngreso() {
		return tipoIngreso;
	}

	public void setTipoIngreso(Integer tipoIngreso) {
		this.tipoIngreso = tipoIngreso;
	}

}