package cajas.persistence.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ContribuyentesObligaciones", schema = "contribuyente")
public class ContribuyentesObligacionesEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7043979673936517207L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdContribuyenteObligacion")
	private Integer idContribuyenteObligacion;

	@Column(name = "IdContribuyente")
	private Integer idContribuyente;

	@Column(name = "IdObligacion")
	private Integer idObligacion;

	@Column(name = "FechaAlta")
	private Date fechaAlta;

	@Column(name = "FechaBaja")
	private Date fechaBaja;

	@Column(name = "Estatus")
	private Integer estatus;
	
	@Column(name = "NumeroControl")
	private String numeroControl;
	
	@Column(name = "IdTemporal")
	private Integer idTemporal;

	public Integer getIdContribuyente() {
		return idContribuyente;
	}

	public void setIdContribuyente(Integer idContribuyente) {
		this.idContribuyente = idContribuyente;
	}

	public Integer getIdContribuyenteObligacion() {
		return idContribuyenteObligacion;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	public Integer getIdObligacion() {
		return idObligacion;
	}

	public void setIdObligacion(Integer idObligacion) {
		this.idObligacion = idObligacion;
	}

	public String getNumeroControl() {
		return numeroControl;
	}

	public void setNumeroControl(String numeroControl) {
		this.numeroControl = numeroControl;
	}

	public Integer getIdTemporal() {
		return idTemporal;
	}

	public void setIdTemporal(Integer idTemporal) {
		this.idTemporal = idTemporal;
	}

	public void setIdContribuyenteObligacion(Integer idContribuyenteObligacion) {
		this.idContribuyenteObligacion = idContribuyenteObligacion;
	}
	
	

}
