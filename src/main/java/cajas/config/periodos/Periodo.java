package cajas.config.periodos;

import java.util.Date;

import cajas.persistence.entity.PeriodosEntity;

public class Periodo {

	private Integer idPeriodo;
	private String mes;
	private Integer aFiscal;
	private Date fechaInicio;
	private Date fechaFin;
	private Integer tipoPeriodo;

	public Periodo periodoEntity(PeriodosEntity periodoEntity) {
		Periodo periodo = new Periodo();
		periodo.setIdPeriodo(periodoEntity.getIdPeriodo());
		periodo.setMes(periodoEntity.getMes());
		periodo.setaFiscal(periodoEntity.getaFiscal());
		periodo.setFechaInicio(periodoEntity.getFechaInicio());
		periodo.setFechaFin(periodoEntity.getFechaFin());
		periodo.setTipoPeriodo(periodoEntity.getTipoPeriodo());
		return periodo;
	}

	/************* Getters and *************/

	public Integer getIdPeriodo() {
		return idPeriodo;
	}

	public void setIdPeriodo(Integer idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public Integer getaFiscal() {
		return aFiscal;
	}

	public void setaFiscal(Integer aFiscal) {
		this.aFiscal = aFiscal;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Integer getTipoPeriodo() {
		return tipoPeriodo;
	}

	public void setTipoPeriodo(Integer tipoPeriodo) {
		this.tipoPeriodo = tipoPeriodo;
	}

}