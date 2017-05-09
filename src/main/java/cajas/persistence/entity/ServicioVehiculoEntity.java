package cajas.persistence.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "ServiciosVehiculos", schema = "vehicular")
public class ServicioVehiculoEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9140214242354121405L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column ( name = "IdServicio")
	private Integer idServicio;
	
	@Column ( name = "Abreviatura" )
	private String abreviatura;
	
	@Column ( name = "Nombre" )
	private String nombre;
	
	@Column ( name = "Estatus" )
	private Boolean estatus;

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
