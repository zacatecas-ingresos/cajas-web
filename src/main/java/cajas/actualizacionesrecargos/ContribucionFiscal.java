package cajas.actualizacionesrecargos;

import java.math.BigDecimal;

public class ContribucionFiscal {

	private Integer aFiscalAdeudo;
	private Integer mesFiscalAdeudo;
	private Integer aFiscalPago;
	private Integer mesFiscalPago;
	private BigDecimal cantidadAdeuda;
	private Boolean pagoVencido;

	/*********** Getters and Setters ***********/

	public BigDecimal getCantidadAdeuda() {
		return cantidadAdeuda;
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

}