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
@Table(name = "contribuyentes_obligaciones", schema = "obligaciones")
public class ContribuyentesObligacionesEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7043979673936517207L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_contribuyente_obligacion")
	private Integer idContribuyenteObligacion;

	@Column(name = "id_contribuyente")
	private Integer idContribuyente;

	@Column(name = "id_obligacion")
	private Integer idObligacion;

	@Column(name = "fecha_alta")
	private Date fechaAlta;

	@Column(name = "fecha_baja")
	private Date fechaBaja;

	@Column(name = "estatus")
	private Integer estatus;

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

}
