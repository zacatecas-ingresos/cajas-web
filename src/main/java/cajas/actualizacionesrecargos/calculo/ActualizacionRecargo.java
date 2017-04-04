package cajas.actualizacionesrecargos.calculo;

import java.math.BigDecimal;

public class ActualizacionRecargo {

	private BigDecimal inpcInicio;
	private BigDecimal inpcFinal;
	private Boolean aplicaRecargo;
	private BigDecimal importeActualizacion;
	private BigDecimal factorActualizacion;
	private BigDecimal importeRecargo;
	private BigDecimal porcentajeRecargo;

	/******* Getters and Setters *******/

	public BigDecimal getInpcInicio() {
		return inpcInicio;
	}

	public void setInpcInicio(BigDecimal inpcInicio) {
		this.inpcInicio = inpcInicio;
	}

	public BigDecimal getInpcFinal() {
		return inpcFinal;
	}

	public void setInpcFinal(BigDecimal inpcFinal) {
		this.inpcFinal = inpcFinal;
	}

	public Boolean getAplicaRecargo() {
		return aplicaRecargo;
	}

	public void setAplicaRecargo(Boolean aplicaRecargo) {
		this.aplicaRecargo = aplicaRecargo;
	}

	public BigDecimal getImporteActualizacion() {
		return importeActualizacion;
	}

	public void setImporteActualizacion(BigDecimal importeActualizacion) {
		this.importeActualizacion = importeActualizacion;
	}

	public BigDecimal getFactorActualizacion() {
		return factorActualizacion;
	}

	public void setFactorActualizacion(BigDecimal factorActualizacion) {
		this.factorActualizacion = factorActualizacion;
	}

	public BigDecimal getImporteRecargo() {
		return importeRecargo;
	}

	public void setImporteRecargo(BigDecimal importeRecargo) {
		this.importeRecargo = importeRecargo;
	}

	public BigDecimal getPorcentajeRecargo() {
		return porcentajeRecargo;
	}

	public void setPorcentajeRecargo(BigDecimal porcentajeRecargo) {
		this.porcentajeRecargo = porcentajeRecargo;
	}

}