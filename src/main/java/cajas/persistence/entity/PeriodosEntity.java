package cajas.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Periodos", schema = "configuracion")
public class PeriodosEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7606189452168892189L;

	@Id
	@Column(name = "IdPeriodo")
	private Integer idPeriodo;

	@Column(name = "Mes")
	private String mes;

	@Column(name = "Afiscal")
	private Integer aFiscal;

	@Column(name = "FechaInicio")
	private Date fechaInicio;

	@Column(name = "FechaFin")
	private Date fechaFin;

	@Column(name = "TipoPeriodo")
	private Integer tipoPeriodo;

	@Column(name = "IdMes")
	private Integer idMes;

	/************* Getters and Setters *************/

	public Integer getIdPeriodo() {
		return idPeriodo;
	}

	public int getIdMes() {
		return idMes;
	}

	public void setIdMes(int idMes) {
		this.idMes = idMes;
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