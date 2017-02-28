package cajas.persistence.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author alfonso
 *
 */

@Entity
@Table(name="saldoscuentascontables")
public class SaldoCuentaContableEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idsaldocuentacontable")
	private Integer  IdSaldoCuentaContable;
	
	@Column(name="cargo")
	private Double Cargo;
	
	@Column(name="abono")
	private Double Abono;
	
	@Column(name="anyofiscal")
	private Integer AnyoFiscal;
	
	@Column(name="mes")
	private Integer Mes;
	
	@OneToOne(fetch=FetchType.LAZY,cascade={CascadeType.PERSIST,CascadeType.REMOVE},optional=false)
	private CuentaContableEntity NumeroCuenta;

	public Integer getIdSaldoCuentaContable() {
		return IdSaldoCuentaContable;
	}

	public void setIdSaldoCuentaContable(Integer idSaldoCuentaContable) {
		IdSaldoCuentaContable = idSaldoCuentaContable;
	}

	public Double getCargo() {
		return Cargo;
	}

	public void setCargo(Double cargo) {
		Cargo = cargo;
	}

	public Double getAbono() {
		return Abono;
	}

	public void setAbono(Double abono) {
		Abono = abono;
	}

	public Integer getAnyoFiscal() {
		return AnyoFiscal;
	}

	public void setAnyoFiscal(Integer anyoFiscal) {
		AnyoFiscal = anyoFiscal;
	}

	public Integer getMes() {
		return Mes;
	}

	public void setMes(Integer mes) {
		Mes = mes;
	}

	public CuentaContableEntity getNumeroCuenta() {
		return NumeroCuenta;
	}

	public void setNumeroCuenta(CuentaContableEntity numeroCuenta) {
		NumeroCuenta = numeroCuenta;
	}

}