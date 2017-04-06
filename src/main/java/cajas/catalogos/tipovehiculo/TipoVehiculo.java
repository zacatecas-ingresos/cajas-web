package cajas.catalogos.tipovehiculo;

import cajas.persistence.entity.TipoVehiculoEntity;

public class TipoVehiculo {
	private Integer idTipoVehiculo;
	private Integer tipoVehiculo;
	private Integer idClaseVehiculo;
	private String abreviatura;
	private String nombre;
	private Boolean estatus;

	public TipoVehiculo(TipoVehiculoEntity tipoVehiculoEntity) {
		this.setAbreviatura(tipoVehiculoEntity.getAbreviatura());
		this.setEstatus(tipoVehiculoEntity.getEstatus());
		this.setIdTipoVehiculo(tipoVehiculoEntity.getIdTipoVehiculo());
		this.setNombre(tipoVehiculoEntity.getNombre());
		this.setIdClaseVehiculo(tipoVehiculoEntity.getClaseVehiculo().getIdClaseVehiculo());
		this.setTipoVehiculo(tipoVehiculoEntity.getIdTipoVehiculo());
	}

	public Integer getIdTipoVehiculo() {
		return idTipoVehiculo;
	}
	public void setIdTipoVehiculo(Integer idTipoVehiculo) {
		this.idTipoVehiculo = idTipoVehiculo;
	}
	public Integer getTipoVehiculo() {
		return tipoVehiculo;
	}
	public void setTipoVehiculo(Integer tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
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
