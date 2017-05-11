package cajas.config.municipios;

import cajas.persistence.entity.MunicipioEntity;

public class Municipio {

    
    private Integer IdMunicipio;
    private Integer IdEstado;
    private String AbreviacionMunicipio;
    private String municipio;
    private Integer IdMunicipioTemporal;
    
    public Municipio(MunicipioEntity municipioEntity) {
		this.setAbreviacionMunicipio(municipioEntity.getAbreviacionMunicipio());
		this.setMunicipio(municipioEntity.getMunicipio());
		this.setIdMunicipio(municipioEntity.getIdMunicipio());
		this.setIdEstado(municipioEntity.getEstado().getIdEstado());
		this.setIdMunicipioTemporal(municipioEntity.getIdMunicipioTemporal());
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
	public String getAbreviacionMunicipio() {
		return AbreviacionMunicipio;
	}
	public void setAbreviacionMunicipio(String abreviacionMunicipio) {
		AbreviacionMunicipio = abreviacionMunicipio;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public Integer getIdMunicipioTemporal() {
		return IdMunicipioTemporal;
	}
	public void setIdMunicipioTemporal(Integer idMunicipioTemporal) {
		IdMunicipioTemporal = idMunicipioTemporal;
	}
    
    
        
}

