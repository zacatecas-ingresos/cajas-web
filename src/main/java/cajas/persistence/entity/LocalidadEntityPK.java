package cajas.persistence.entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

/**
 * ID class for entity: LocalidadEntity
 *
 */ 
public class LocalidadEntityPK  implements Serializable {   
   
	         
	private Integer idLocalidad;         
	private Integer idMunicipio;         
	private Integer idEstado;         
	private String abreviacionLocalidad;         
	private String localidad;
	private static final long serialVersionUID = 1L;

	public LocalidadEntityPK() {}

	

	public Integer getIdLocalidad() {
		return this.idLocalidad;
	}

	public void setIdLocalidad(Integer idLocalidad) {
		this.idLocalidad = idLocalidad;
	}
	

	public Integer getIdMunicipio() {
		return this.idMunicipio;
	}

	public void setIdMunicipio(Integer idMunicipio) {
		this.idMunicipio = idMunicipio;
	}
	

	public Integer getIdEstado() {
		return this.idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}
	

	public String getAbreviacionLocalidad() {
		return this.abreviacionLocalidad;
	}

	public void setAbreviacionLocalidad(String abreviacionLocalidad) {
		this.abreviacionLocalidad = abreviacionLocalidad;
	}
	

	public String getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
   
	/*
	 * @see java.lang.Object#equals(Object)
	 */	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof LocalidadEntityPK)) {
			return false;
		}
		LocalidadEntityPK other = (LocalidadEntityPK) o;
		return true
			&& (getIdLocalidad() == null ? other.getIdLocalidad() == null : getIdLocalidad().equals(other.getIdLocalidad()))
			&& (getIdMunicipio() == null ? other.getIdMunicipio() == null : getIdMunicipio().equals(other.getIdMunicipio()))
			&& (getIdEstado() == null ? other.getIdEstado() == null : getIdEstado().equals(other.getIdEstado()))
			&& (getAbreviacionLocalidad() == null ? other.getAbreviacionLocalidad() == null : getAbreviacionLocalidad().equals(other.getAbreviacionLocalidad()))
			&& (getLocalidad() == null ? other.getLocalidad() == null : getLocalidad().equals(other.getLocalidad()));
	}
	
	/*	 
	 * @see java.lang.Object#hashCode()
	 */	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (getIdLocalidad() == null ? 0 : getIdLocalidad().hashCode());
		result = prime * result + (getIdMunicipio() == null ? 0 : getIdMunicipio().hashCode());
		result = prime * result + (getIdEstado() == null ? 0 : getIdEstado().hashCode());
		result = prime * result + (getAbreviacionLocalidad() == null ? 0 : getAbreviacionLocalidad().hashCode());
		result = prime * result + (getLocalidad() == null ? 0 : getLocalidad().hashCode());
		return result;
	}
   
   
}
