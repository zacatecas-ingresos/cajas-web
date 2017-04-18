package cajas.actualizacionesrecargos.calculo;

import java.math.BigDecimal;

public class ContribucionFiscal {

	private Periodo periodoActualizacion;
	private Periodo periodoRecargo;
	private Integer aFiscalAdeudo;
	private Integer mesFiscalAdeudo;
	private Integer aFiscalPago;
	private Integer mesFiscalPago;
	private BigDecimal cantidadAdeuda;
	private Boolean pagoVencido;
	private String tipoRecargo;

	/*********** Getters and Setters ***********/

	public BigDecimal getCantidadAdeuda() {
		return cantidadAdeuda;
	}

	public Periodo getPeriodoActualizacion() {
		return periodoActualizacion;
	}

	public void setPeriodoActualizacion(Periodo periodoActualizacion) {
		this.periodoActualizacion = periodoActualizacion;
	}

	public Periodo getPeriodoRecargo() {
		return periodoRecargo;
	}

	public void setPeriodoRecargo(Periodo periodoRecargo) {
		this.periodoRecargo = periodoRecargo;
	}

	public Integer getaFiscalAdeudo() {
		return aFiscalAdeudo;
	}

	public void setaFiscalAdeudo(Integer aFiscalAdeudo) {
		this.aFiscalAdeudo = aFiscalAdeudo;
	}

	public Integer getMesFiscalAdeudo() {
		return mesFiscalAdeudo;
	}

	public void setMesFiscalAdeudo(Integer mesFiscalAdeudo) {
		this.mesFiscalAdeudo = mesFiscalAdeudo;
	}

	public Integer getaFiscalPago() {
		return aFiscalPago;
	}

	public void setaFiscalPago(Integer aFiscalPago) {
		this.aFiscalPago = aFiscalPago;
	}

	public Integer getMesFiscalPago() {
		return mesFiscalPago;
	}

	public void setMesFiscalPago(Integer mesFiscalPago) {
		this.mesFiscalPago = mesFiscalPago;
	}

	public void setCantidadAdeuda(BigDecimal cantidadAdeuda) {
		this.cantidadAdeuda = cantidadAdeuda;
	}

	public Boolean getPagoVencido() {
		return pagoVencido;
	}

	public void setPagoVencido(Boolean pagoVencido) {
		this.pagoVencido = pagoVencido;
	}

	public String getTipoRecargo() {
		return tipoRecargo;
	}

	public void setTipoRecargo(String tipoRecargo) {
		this.tipoRecargo = tipoRecargo;
	}

}