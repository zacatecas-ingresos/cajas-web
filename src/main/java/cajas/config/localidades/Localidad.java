package cajas.config.localidades;

import cajas.persistence.entity.LocalidadEntity;

public class Localidad {

    
    private Integer IdLocalidad;
    private Integer IdMunicipio;
    private Integer IdEstado;
    private String AbreviacionLocalidad;
    private String Localidad;
    private Integer IdLocalidadTemporal;
    
    public Localidad(LocalidadEntity localidadEntity){
    	this.setIdLocalidad(localidadEntity.getIdLocalidad());
    	this.setAbreviacionLocalidad(localidadEntity.getAbreviacionLocalidad());
    	this.setLocalidad(localidadEntity.getLocalidad());
    	this.setIdLocalidadTemporal(localidadEntity.getIdLocalidadTemporal());
    	this.setIdMunicipio(localidadEntity.getMunicipio().getIdMunicipio());
    	this.setIdEstado(localidadEntity.getEstado().getIdEstado());
    	
    	
    	
    	
    }
	
    
    public Integer getIdLocalidad() {
		return IdLocalidad;
	}
	public void setIdLocalidad(Integer idLocalidad) {
		IdLocalidad = idLocalidad;
	}
	public Integer getIdMunicipio() {
		return IdMunicipio;
	}
	public void setIdMunicipio(Integer idMunicipio) {
		IdMunicipio = idMunicipio;
	}
	public Integer getIdEstado() {
		return IdEstado;
	}
	public void setIdEstado(Integer idEstado) {
		IdEstado = idEstado;
	}
	public String getAbreviacionLocalidad() {
		return AbreviacionLocalidad;
	}
	public void setAbreviacionLocalidad(String abreviacionLocalidad) {
		AbreviacionLocalidad = abreviacionLocalidad;
	}
	public String getLocalidad() {
		return Localidad;
	}
	public void setLocalidad(String localidad) {
		Localidad = localidad;
	}
	public Integer getIdLocalidadTemporal() {
		return IdLocalidadTemporal;
	}
	public void setIdLocalidadTemporal(Integer idLocalidadTemporal) {
		IdLocalidadTemporal = idLocalidadTemporal;
	}
	
    
    


    
}
