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
@Table(name="Poliza")
public class PolizaEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idpoliza")
	private Integer idpoliza;
	
	@Column(name="folio")
	private Integer folio;
	
	@Column(name="numeromovimientos")
	private Integer numeromovimientos;
	
	@Column(name="fechapoliza")
	private String fechapoliza;
	
	@Column(name="cargo")
	private Double  cargo;
	
	@Column(name="abono")
	private Double abono;
	
	//Claves foraneas
	@OneToOne
	@JoinColumn(name = "idconceptopoliza")
	private TipoPolizaEntity tipoPolizaEntity;
	
	@OneToOne
	@JoinColumn(name="idtipopoliza")
	private ConceptoPolizaEntity conceptoPolizaEntity;
	
	public Integer getIdpoliza() {
		return idpoliza;
	}

	public void setIdpoliza(Integer idpoliza) {
		this.idpoliza = idpoliza;
	}

	public Integer getFolio() {
		return folio;
	}

	public void setFolio(Integer folio) {
		this.folio = folio;
	}

	public Integer getNumeromovimientos() {
		return numeromovimientos;
	}

	public void setNumeromovimientos(Integer numeromovimientos) {
		this.numeromovimientos = numeromovimientos;
	}

	public String getFechapoliza() {
		return fechapoliza;
	}

	public void setFechapoliza(String fechapoliza) {
		this.fechapoliza = fechapoliza;
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

	public TipoPolizaEntity getTipoPolizaEntity() {
		return tipoPolizaEntity;
	}

	public void setTipoPolizaEntity(TipoPolizaEntity tipoPolizaEntity) {
		this.tipoPolizaEntity = tipoPolizaEntity;
	}

	public ConceptoPolizaEntity getConceptoPolizaEntity() {
		return conceptoPolizaEntity;
	}

	public void setConceptoPolizaEntity(ConceptoPolizaEntity conceptoPolizaEntity) {
		this.conceptoPolizaEntity = conceptoPolizaEntity;
	}
}
