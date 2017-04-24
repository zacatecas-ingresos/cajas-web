package cajas.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author aker
 *
 */
@Entity
@Table(name="tipoPoliza")
public class TipoPolizaEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="idtipopoliza")
	private String idTipoPoliza;
	
	@Column(name="descripcion")
	private String descripcion;
	
	
	public String getIdTipoPoliza() {
		return idTipoPoliza;
	}

	public void setIdTipoPoliza(String idTipoPoliza) {
		this.idTipoPoliza = idTipoPoliza;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
