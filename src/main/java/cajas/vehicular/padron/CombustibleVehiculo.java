package cajas.vehicular.padron;

import cajas.persistence.entity.CombustibleVehiculoEntity;

public class CombustibleVehiculo {
	private Integer idCombustible;
	private String abreviatura;
	private String nombre;
	private Boolean estatus;
	
	public CombustibleVehiculo combustibleVehiculoEntity(CombustibleVehiculoEntity combustibleVehiculoEntity){
		CombustibleVehiculo combustibleVehiculo = new CombustibleVehiculo();
		combustibleVehiculo.setIdCombustible(combustibleVehiculoEntity.getIdCombustible());
		combustibleVehiculo.setAbreviatura(combustibleVehiculoEntity.getAbreviatura());
		combustibleVehiculo.setNombre(combustibleVehiculoEntity.getNombre());
		combustibleVehiculo.setEstatus(combustibleVehiculoEntity.getEstatus());		
		return combustibleVehiculo;
	}
	
	
	public Integer getIdCombustible() {
		return idCombustible;
	}
	public void setIdCombustible(Integer idCombustible) {
		this.idCombustible = idCombustible;
	}
	public String getAbreviatura() {
		return abreviatura;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Boolean getEstatus() {
		return estatus;
	}
	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}


}
