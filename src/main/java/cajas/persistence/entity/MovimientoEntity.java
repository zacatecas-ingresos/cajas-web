package cajas.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author aker
 *
 */
@Entity
@Table(name="Movimientos")
public class MovimientoEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idmovimiento")
	private Integer idmovimiento;
	
	@Column(name="concepto")
	private String concepto;
	
	@Column(name="cargo")
	private Double cargo;
	
	@Column(name="abono")
	private Double abono;
	
	//Claves foraneas
	@OneToOne
	@JoinColumn(name="idpoliza")
	private PolizaEntity polizaEntity;
	
	@OneToOne
	@JoinColumn(name="idnumerocuenta")
	private CuentaContableEntity cuentaContableEntity;
	
	public Integer getIdmovimiento() {
		return idmovimiento;
	}

	public void setIdmovimiento(Integer idmovimiento) {
		this.idmovimiento = idmovimiento;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public Double getCargo() {
		return cargo;
	}

	public void setCargo(Double cargo) {
		this.cargo = cargo;
	}

	public Double getAbono() {
		return abono;
	}

	public void setAbono(Double abono) {
		this.abono = abono;
	}

	public PolizaEntity getPolizaEntity() {
		return polizaEntity;
	}

	public void setPolizaEntity(PolizaEntity polizaEntity) {
		this.polizaEntity = polizaEntity;
	}

	public CuentaContableEntity getCuentaContableEntity() {
		return cuentaContableEntity;
	}

	public void setCuentaContableEntity(CuentaContableEntity cuentaContableEntity) {
		this.cuentaContableEntity = cuentaContableEntity;
	}
}
