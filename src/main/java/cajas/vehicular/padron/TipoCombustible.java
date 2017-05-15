package cajas.vehicular.padron;

import cajas.persistence.entity.TipoCombustibleEntity;

public class TipoCombustible {
	private Integer idCombustible;
	private String nombre;
	private Integer estatus;
	
	public TipoCombustible combustibleVehiculoEntity(TipoCombustibleEntity combustibleVehiculoEntity){
		TipoCombustible combustibleVehiculo = new TipoCombustible();
		combustibleVehiculo.setIdCombustible(combustibleVehiculoEntity.getIdCombustible());
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
