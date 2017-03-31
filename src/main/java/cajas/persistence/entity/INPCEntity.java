package cajas.persistence.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inpc", schema = "cajas")
public class INPCEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8293741844102128011L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_inpc")
	private Integer idINPC;

	@Column(name = "afiscal")
	private Integer aFiscal;

	@Column(name = "mes_fiscal")
	private Integer mesFiscal;

	@Column(name = "inpc")
	private BigDecimal inpc;

	@Column(name = "recargo")
	private BigDecimal recargo;

	/***************** Getters and Setters *****************/

	public Integer getIdINPC() {
		return idINPC;
	}

	public void setIdINPC(Integer idINPC) {
		this.idINPC = idINPC;
	}

	public Integer getaFiscal() {
		return aFiscal;
	}

	public void setaFiscal(Integer aFiscal) {
		this.aFiscal = aFiscal;
	}

	public Integer getMesFiscal() {
		return mesFiscal;
	}

	public void setMesFiscal(Integer mesFiscal) {
		this.mesFiscal = mesFiscal;
	}

	public BigDecimal getInpc() {
		return inpc;
	}

	public void setInpc(BigDecimal inpc) {
		this.inpc = inpc;
	}

	public BigDecimal getRecargo() {
		return recargo;
	}

	public void setRecargo(BigDecimal recargo) {
		this.recargo = recargo;
	}

}