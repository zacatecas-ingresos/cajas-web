package cajas.persistence.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Inpc", schema = "configuracion")
public class INPCEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8293741844102128011L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdInpc")
	private Integer idINPC;

	@Column(name = "Afiscal")
	private Integer aFiscal;

	@Column(name = "MesFiscal")
	private Integer mesFiscal;

	@Column(name = "INPC")
	private BigDecimal inpc;

	@Column(name = "Recargo")
	private BigDecimal recargo;
	
	@Column(name = "Periodo")
	private Date periodo;

	@Column(name = "RecargoEstatal")
	private BigDecimal recargoEstatal;
	
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

	public Date getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Date periodo) {
		this.periodo = periodo;
	}

	public BigDecimal getRecargoEstatal() {
		return recargoEstatal;
	}

	public void setRecargoEstatal(BigDecimal recargoEstatal) {
		this.recargoEstatal = recargoEstatal;
	}
}