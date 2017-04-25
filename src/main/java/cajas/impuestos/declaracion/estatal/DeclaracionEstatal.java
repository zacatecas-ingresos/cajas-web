package cajas.impuestos.declaracion.estatal;

import java.math.BigDecimal;

/**
 * @author Leila Schiaffini Ehuan
 *
 * @since 07/04/2017
 */
public class DeclaracionEstatal {

	private int periodo;
	private int ejercicioFiscal;
	private BigDecimal totalErogaciones;
	private int numeroEmpleados;
	private Integer idContribuyente;
	private int idObligacion;
	private int idSucursal;
	private String idTipoDeclaracion;
	private Integer tipoTasaRecargo;

	public String getIdTipoDeclaracion() {
		return idTipoDeclaracion;
	}

	public void setIdTipoDeclaracion(String idTipoDeclaracion) {
		this.idTipoDeclaracion = idTipoDeclaracion;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public int getEjercicioFiscal() {
		return ejercicioFiscal;
	}

	public void setEjercicioFiscal(int ejercicioFiscal) {
		this.ejercicioFiscal = ejercicioFiscal;
	}

	public BigDecimal getTotalErogaciones() {
		return totalErogaciones;
	}

	public void setTotalErogaciones(BigDecimal totalErogaciones) {
		this.totalErogaciones = totalErogaciones;
	}

	public int getNumeroEmpleados() {
		return numeroEmpleados;
	}

	public void setNumeroEmpleados(int numeroEmpleados) {
		this.numeroEmpleados = numeroEmpleados;
	}

	public Integer getIdContribuyente() {
		return idContribuyente;
	}

	public void setIdContribuyente(Integer idContribuyente) {
		this.idContribuyente = idContribuyente;
	}

	public int getIdObligacion() {
		return idObligacion;
	}

	public void setIdObligacion(int idObligacion) {
		this.idObligacion = idObligacion;
	}

	public int getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}
	
	public Integer getTipoTasaRecargo() {
		return tipoTasaRecargo;
	}
	
	public void setTipoTasaRecargo(Integer tipoTasaRecargo) {
		this.tipoTasaRecargo = tipoTasaRecargo;
	}

}
