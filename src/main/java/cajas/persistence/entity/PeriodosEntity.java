package cajas.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "periodos", schema = "catalogos")
public class PeriodosEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7606189452168892189L;

	@Id
	@Column(name = "id_periodo")
	private Integer idPeriodo;

	@Column(name = "mes")
	private String mes;

	@Column(name = "afiscal")
	private Integer aFiscal;

	@Column(name = "fecha_inicio")
	private Date fechaInicio;

	@Column(name = "fecha_fin")
	private Date fechaFin;

	@Column(name = "tipo_periodo")
	private Integer tipoPeriodo;

	/************* Getters and Setters *************/

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