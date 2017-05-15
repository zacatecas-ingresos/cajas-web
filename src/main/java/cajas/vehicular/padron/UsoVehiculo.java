package cajas.vehicular.padron;
import cajas.persistence.entity.UsoVehiculoEntity;

public class UsoVehiculo {
	public Integer idUso;
	public String nombre;
	public Boolean estatus;
	
	public UsoVehiculo usoVehiculo(UsoVehiculoEntity usoVehiculoEntity){
		UsoVehiculo usoVehiculo = new UsoVehiculo();
		usoVehiculo.setIdUso(usoVehiculoEntity.getIdUso());
		usoVehiculo.setNombre(usoVehiculoEntity.getNombre());
		usoVehiculo.setEstatus(usoVehiculoEntity.getEstatus());
		
		return usoVehiculo;
	}	
	
	public Integer getIdUso() {
		return idUso;
	}
	public void setIdUso(Integer idUso) {
		this.idUso = idUso;
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
