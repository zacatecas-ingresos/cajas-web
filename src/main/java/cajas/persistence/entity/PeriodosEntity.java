package cajas.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "periodos")
public class PeriodosEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7606189452168892189L;

	@Id
	@Column(name = "id_periodo")
	private Integer idPeriodo;

	@Column(name = "periodo")
	private String periodo;

	public Integer getIdPeriodo() {
		return idPeriodo;
	}

	public void setIdPeriodo(Integer idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	
}
