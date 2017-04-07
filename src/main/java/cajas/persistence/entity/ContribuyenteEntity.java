package cajas.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contribuyentes")
public class ContribuyenteEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5318651937091329981L;

	@Id
	@Column(name = "id_contribuyente")
	private Integer idContribuyente;

	@Column(name = "rfc")
	private String rfc;

	public Integer getIdContribuyente() {
		return idContribuyente;
	}

	public void setIdContribuyente(Integer idContribuyente) {
		this.idContribuyente = idContribuyente;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	
	
}
