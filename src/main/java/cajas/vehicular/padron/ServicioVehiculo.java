package cajas.vehicular.padron;

import cajas.persistence.entity.ServicioVehiculoEntity;

public class ServicioVehiculo {

	private Integer idServicio;
	private String abreviatura;
	private String nombre;
	private Boolean estatus;
	
	public ServicioVehiculo servicioVehiculo(ServicioVehiculoEntity servicioVehiculoEntity){
		ServicioVehiculo servicioVehiculo = new ServicioVehiculo();
		servicioVehiculo.setIdServicio(servicioVehiculoEntity.getIdServicio());
		servicioVehiculo.setAbreviatura(servicioVehiculoEntity.getAbreviatura());
		servicioVehiculo.setNombre(servicioVehiculoEntity.getNombre());
		servicioVehiculo.setEstatus(servicioVehiculoEntity.getEstatus());
		
		return servicioVehiculo;
	}
	
	
	public Integer getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(Integer idServicio) {
		this.idServicio = idServicio;
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
