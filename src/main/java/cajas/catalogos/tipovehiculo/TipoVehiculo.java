package cajas.catalogos.tipovehiculo;

import cajas.persistence.entity.TipoVehiculoEntity;

public class TipoVehiculo {
	private Integer idTipoVehiculo;
	private Integer idClaseVehiculo;
	private String nombre;
	private Integer estatus;

	public TipoVehiculo(TipoVehiculoEntity tipoVehiculoEntity) {
		this.setEstatus(tipoVehiculoEntity.getEstatus());
		this.setIdTipoVehiculo(tipoVehiculoEntity.getIdTipoVehiculo());
		this.setNombre(tipoVehiculoEntity.getNombre());
		this.setIdClaseVehiculo(tipoVehiculoEntity.getClaseVehiculo().getIdClaseVehiculo());
	}

	public Integer getIdTipoVehiculo() {
		return idTipoVehiculo;
	}
	public void setIdTipoVehiculo(Integer idTipoVehiculo) {
		this.idTipoVehiculo = idTipoVehiculo;
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
