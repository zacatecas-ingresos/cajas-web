package cajas.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sucursales")
public class SucursalEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3098772764888638187L;

	@Id
	@Column(name = "id_sucursal")
	private Integer idSucursal;

	@Column(name = "numero_sucursal")
	private Integer numeeroSucursal;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name = "id_contribuyente")
	private ContribuyenteEntity idContribuyente;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@Column(name = "id_obligacion")
	private ObligacionesEntity idObligacion;

	public Integer getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(Integer idSucursal) {
		this.idSucursal = idSucursal;
	}

	public Integer getNumeeroSucursal() {
		return numeeroSucursal;
	}

	public void setNumeeroSucursal(Integer numeeroSucursal) {
		this.numeeroSucursal = numeeroSucursal;
	}

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

	
}
