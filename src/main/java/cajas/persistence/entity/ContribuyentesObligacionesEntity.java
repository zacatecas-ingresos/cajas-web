package cajas.persistence.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "contribuyentes_obligaciones", schema = "obligaciones")
public class ContribuyentesObligacionesEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7043979673936517207L;
	
	@Id
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name = "id_contribuyente")
	private ContribuyenteEntity idContribuyente;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name = "id_obligacion")
	private ObligacionesEntity idObligacion;
	
	@Column(name = "fecha_alta")
	private Date fechaAlta;
	
	@Column(name = "fecha_baja")
	private Date fechaBaja;
	
	@Column(name = "estatus")
	private Integer estatus;

	public ContribuyenteEntity getIdContribuyente() {
		return idContribuyente;
	}

	public void setIdContribuyente(ContribuyenteEntity idContribuyente) {
		this.idContribuyente = idContribuyente;
	}

	public ObligacionesEntity getIdObligacion() {
		return idObligacion;
	}

	public void setIdObligacion(ObligacionesEntity idObligacion) {
		this.idObligacion = idObligacion;
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
	
	

}
