package cajas.vehicular.padron;
import cajas.persistence.entity.AgenciaVehicularEntity;

public class AgenciaVehiculo {
	private Integer idAgencia;
	private Integer idEstado;
	private String rfc;
	private String abreviatura;
	private String nombre;
	private Boolean estatus;
	
	public AgenciaVehiculo agenciaVehiculo(AgenciaVehicularEntity agenciaVehicularEntity){
		AgenciaVehiculo agenciaVehiculo = new AgenciaVehiculo();
		
		agenciaVehiculo.setIdAgencia(agenciaVehicularEntity.getIdAgencia());
		
		if(agenciaVehicularEntity.getEstado() != null){
			agenciaVehiculo.setIdEstado(agenciaVehicularEntity.getEstado().getIdEstado());			
		}
		agenciaVehiculo.setAbreviatura(agenciaVehicularEntity.getAbreviatura());
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
