package cajas.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cajas", schema = "cajas" )
public class CajasEntity  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1415786659542417616L;
	
	@Id
	@Column (name = "id_caja")
	private Integer idCaja;
	
	@Column (name = "id_delegacion")
	private Integer idDelegacion;
	
	@Column (name = "numero_caja")
	private Integer numeroCaja;
	
	@Column (name = "nombre_caja")
	private String nombreCaja;
	
	@Column (name = "id_oficina")
	private Integer idOficina;
	
	@Column (name = "id_tipo_caja")
	private Integer idTipoCaja;
	
	@Column (name = "integracion")
	private Boolean integracion;
	
	@Column (name = "expide_placa")
	private Boolean expidePlaca;
	
	@Column (name = "id_banco")
	private Integer idBanco;

	public Integer getIdCaja() {
		return idCaja;
	}

	public void setIdCaja(Integer idCaja) {
		this.idCaja = idCaja;
	}

	public Integer getIdDelegacion() {
		return idDelegacion;
	}

	public void setIdDelegacion(Integer idDelegacion) {
		this.idDelegacion = idDelegacion;
	}

	public Integer getNumeroCaja() {
		return numeroCaja;
	}

	public void setNumeroCaja(Integer numeroCaja) {
		this.numeroCaja = numeroCaja;
	}

	public String getNombreCaja() {
		return nombreCaja;
	}

	public void setNombreCaja(String nombreCaja) {
		this.nombreCaja = nombreCaja;
	}

	public Integer getIdOficina() {
		return idOficina;
	}

	public void setIdOficina(Integer idOficina) {
		this.idOficina = idOficina;
	}

	public Integer getIdTipoCaja() {
		return idTipoCaja;
	}

	public void setIdTipoCaja(Integer idTipoCaja) {
		this.idTipoCaja = idTipoCaja;
	}

	public Boolean getIntegracion() {
		return integracion;
	}

	public void setIntegracion(Boolean integracion) {
		this.integracion = integracion;
	}

	public Boolean getExpidePlaca() {
		return expidePlaca;
	}

	public void setExpidePlaca(Boolean expidePlaca) {
		this.expidePlaca = expidePlaca;
	}

	public Integer getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(Integer idBanco) {
		this.idBanco = idBanco;
	}
	
	

}
