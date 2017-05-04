package cajas.persistence.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TasasImpuestos", schema = "configuracion")
public class TasaImpuestoEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6128425945175618929L;

	@Id
	@Column(name = "IdTasaImpuesto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTasaImpuesto;

	@Column(name = "Impuesto")
	private String impuesto;

	@Column(name = "FechaInicio")
	private Date fechaInicio;

	@Column(name = "FechaFin")
	private Date fechaFin;

	@Column(name = "Tasa")
	private BigDecimal tasa;

	@Column(name = "TasaConcursoEnajenacion")
	private BigDecimal tasaConcursoEnajenacion;

	@Column(name = "TasaConcursoBeneficiario")
	private BigDecimal tasaConcursoBeneficiario;

	@Column(name = "TipoTasa")
	private Integer tipoTasa;

	/************** Getters and Setters **************/

	public Integer getIdTasaImpuesto() {
		return idTasaImpuesto;
	}

	public void setIdTasaImpuesto(Integer idTasaImpuesto) {
		this.idTasaImpuesto = idTasaImpuesto;
	}

	public String getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(String impuesto) {
		this.impuesto = impuesto;
	}

	public BigDecimal getTasa() {
		return tasa;
	}

	public void setTasa(BigDecimal tasa) {
		this.tasa = tasa;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Integer getTipoTasa() {
		return tipoTasa;
	}

	public void setTipoTasa(Integer tipoTasa) {
		this.tipoTasa = tipoTasa;
	}

	public BigDecimal getTasaConcursoEnajenacion() {
		return tasaConcursoEnajenacion;
	}

	public void setTasaConcursoEnajenacion(BigDecimal tasaConcursoEnajenacion) {
		this.tasaConcursoEnajenacion = tasaConcursoEnajenacion;
	}

	public BigDecimal getTasaConcursoBeneficiario() {
		return tasaConcursoBeneficiario;
	}

	public void setTasaConcursoBeneficiario(BigDecimal tasaConcursoBeneficiario) {
		this.tasaConcursoBeneficiario = tasaConcursoBeneficiario;
	}

}