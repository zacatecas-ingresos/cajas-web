package cajas.vehicular.padron;
import cajas.persistence.entity.AgenciaEntity;

public class AgenciaVehiculo {
	private Integer idAgencia;
	private Integer idEstado;
	private String rfc;
	private String nombre;
	private Integer estatus;
	
	public AgenciaVehiculo agenciaVehiculo(AgenciaEntity agenciaVehicularEntity){
		AgenciaVehiculo agenciaVehiculo = new AgenciaVehiculo();
		
		agenciaVehiculo.setIdAgencia(agenciaVehicularEntity.getIdAgencia());
		
		if(agenciaVehicularEntity.getEstado() != null){
			agenciaVehiculo.setIdEstado(agenciaVehicularEntity.getEstado().getIdEstado());			
		}
		agenciaVehiculo.setNombre(agenciaVehicularEntity.getNombre());
		agenciaVehiculo.setRfc(agenciaVehicularEntity.getRfc());
		agenciaVehiculo.setEstatus(agenciaVehicularEntity.getEstatus());
		
		return agenciaVehiculo;
	}
	
	public Integer getIdAgencia() {
		return idAgencia;
	}
	public void setIdAgencia(Integer idAgencia) {
		this.idAgencia = idAgencia;
	}
	public Integer getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
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
