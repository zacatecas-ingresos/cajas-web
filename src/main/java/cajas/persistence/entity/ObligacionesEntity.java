package cajas.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "obligaciones", schema = "catalogos")
public class ObligacionesEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5958182331794817692L;

	@Id
	@Column(name = "id_obligacion")
	private Integer idObligacion; 

	@Column(name = "obligacion")
	private String obligacion;
	
	@Column(name = "dia_vencimiento")
	private Integer diaVencimiento;
	
	@Column(name = "dias_tiempo_prorroga")
	private Integer diasProrroga;
	
	/****************************************************************/

	public Integer getIdObligacion() {
		return idObligacion;
	}

	public void setIdObligacion(Integer idObligacion) {
		this.idObligacion = idObligacion;
	}

	public String getObligacion() {
		return obligacion;
	}

	public void setObligacion(String obligacion) {
		this.obligacion = obligacion;
	}

	public Integer getDiasProrroga() {
		return diasProrroga;
	}

	public void setDiasProrroga(Integer diasProrroga) {
		this.diasProrroga = diasProrroga;
	}
	
	public Integer getDiaVencimiento() {
		return diaVencimiento;
	}
	
	public void setDiaVencimiento(Integer diaVencimiento) {
		this.diaVencimiento = diaVencimiento;
	}
	
}