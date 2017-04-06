package cajas.catalogos.clasevehiculo;

import cajas.persistence.entity.ClaseVehiculoEntity;

public class ClaseVehiculo1 {
	private Integer idClaseVehiculo;
	private String nombre;
	private String abreviatura;
	private Boolean estatus;

	public ClaseVehiculo1() {
	}

	public ClaseVehiculo1(ClaseVehiculoEntity claseVehiculoEntity) {
		this.setAbreviatura(claseVehiculoEntity.getAbreviacion());
		this.setEstatus(claseVehiculoEntity.getEstatus());
		this.setIdClaseVehiculo(claseVehiculoEntity.getIdClaseVehiculo());
		this.setNombre(claseVehiculoEntity.getNombre());
	}

	public Integer getIdClaseVehiculo() {
		return idClaseVehiculo;
	}
	public void setIdClaseVehiculo(Integer idClaseVehiculo) {
		this.idClaseVehiculo = idClaseVehiculo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAbreviatura() {
		return abreviatura;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	public Boolean getEstatus() {
		return estatus;
	}
	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}
}