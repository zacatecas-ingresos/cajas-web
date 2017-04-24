package cajas.persistence.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author alfonso
 *
 */

@Entity
@Table(name = "conceptospolizas")
public class ConceptoPolizaEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idconceptopoliza")
	private String IdConceptoPoliza;

	@Column(name = "descripcion")
	private String Descripcion;

	@OneToOne(fetch=FetchType.LAZY,cascade={CascadeType.PERSIST,CascadeType.REMOVE},optional=false)
	private TipoPolizaEntity IdTipoPoliza;

	public String getIdConceptoPoliza() {
		return IdConceptoPoliza;
	}

	public void setIdConceptoPoliza(String idConceptoPoliza) {
		IdConceptoPoliza = idConceptoPoliza;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public TipoPolizaEntity getIdTipoPoliza() {
		return IdTipoPoliza;
	}

	public void setIdTipoPoliza(TipoPolizaEntity idTipoPoliza) {
		IdTipoPoliza = idTipoPoliza;
	}
}
