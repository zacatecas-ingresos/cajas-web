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
@Table(name="tipospolizasfolios")
public class TipoFolioPolizaEntity  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="idtipopolizafolio")
	private String IdtipoPolizaFolio;
	
	@Column(name="folio")
	private Integer Folio;
	
	@Column(name="anyofiscal")
	private Integer AnyoFiscal;
	
	@OneToOne(fetch=FetchType.LAZY,cascade={CascadeType.PERSIST,CascadeType.REMOVE},optional=false)
	private TipoPolizaEntity IdTipoPoliza;

	public String getIdtipoPolizaFolio() {
		return IdtipoPolizaFolio;
	}

	public void setIdtipoPolizaFolio(String idtipoPolizaFolio) {
		IdtipoPolizaFolio = idtipoPolizaFolio;
	}

	public Integer getFolio() {
		return Folio;
	}

	public void setFolio(Integer folio) {
		Folio = folio;
	}

	public Integer getAnyoFiscal() {
		return AnyoFiscal;
	}

	public void setAnyoFiscal(Integer anyoFiscal) {
		AnyoFiscal = anyoFiscal;
	}

	public TipoPolizaEntity getIdTipoPoliza() {
		return IdTipoPoliza;
	}
	
	public void setIdTipoPoliza(TipoPolizaEntity idTipoPoliza) {
		IdTipoPoliza = idTipoPoliza;
	}
}