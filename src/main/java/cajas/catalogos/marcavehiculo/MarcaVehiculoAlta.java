package cajas.catalogos.marcavehiculo;

public class MarcaVehiculoAlta {
	private Integer idMarcaVehiculo;
	private String nombre;
	private String abreviatura;
	private Boolean estatus;

	public Integer getIdMarcaVehiculo() {
		return idMarcaVehiculo;
	}
	public void setIdMarcaVehiculo(Integer idMarcaVehiculo) {
		this.idMarcaVehiculo = idMarcaVehiculo;
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