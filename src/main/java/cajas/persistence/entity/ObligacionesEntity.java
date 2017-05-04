package cajas.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import cajas.contribuyentes.TipoObligacion;

@Entity
@Table(name = "Obligaciones", schema = "contribuyente")
public class ObligacionesEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5958182331794817692L;

	@Id
	@Column(name = "IdObligacion")
	private Integer idObligacion; 

	@Column(name = "Obligacion")
	private String obligacion;
	
	@Column(name = "DiaVencimiento")
	private Integer diaVencimiento;
	
//	@Column(name = "DiasTiempoProrroga")
//	private Integer diasProrroga;
	
//	@Column(name = "Estatus")
//	private Integer estatus;
	
	@Column(name = "UsuarioAlta")
	private String usuarioAlta;
	
	@Column(name = "TipoObligacion")
	@Enumerated(EnumType.STRING)
	private TipoObligacion tipoObligacion;

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

//	public Integer getDiasProrroga() {
//		return diasProrroga;
//	}

	
//	public void setDiasProrroga(Integer diasProrroga) {
//		this.diasProrroga = diasProrroga;
//	}
	
	public Integer getDiaVencimiento() {
		return diaVencimiento;
	}
	
	public void setDiaVencimiento(Integer diaVencimiento) {
		this.diaVencimiento = diaVencimiento;
	}

	public TipoObligacion getTipoObligacion() {
		return tipoObligacion;
	}

	public void setTipoObligacion(TipoObligacion tipoObligacion) {
		this.tipoObligacion = tipoObligacion;
	}
	
	
}
