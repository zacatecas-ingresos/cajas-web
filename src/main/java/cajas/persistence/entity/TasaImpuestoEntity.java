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
@Table(name = "tasa_impuesto", schema = "catalogos")
public class TasaImpuestoEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6128425945175618929L;

	@Id
	@Column(name = "id_tasa_impuesto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTasaImpuesto;

	@Column(name = "impuesto")
	private String impuesto;

	@Column(name = "fecha_inicio")
	private Date fechaInicio;

	@Column(name = "fecha_fin")
	private Date fechaFin;

	@Column(name = "tasa")
	private BigDecimal tasa;

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

}