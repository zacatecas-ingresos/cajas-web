package cajas.catalogos.clasevehiculo;

import cajas.persistence.entity.ClaseVehiculoEntity;

public class ClaseVehiculo {
	private Integer idClaseVehiculo;
	private String nombre;
	private Integer estatus;

	public ClaseVehiculo() {
	}

	public ClaseVehiculo(ClaseVehiculoEntity claseVehiculoEntity) {
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
	public Integer getEstatus() {
		return estatus;
	}
	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}
}