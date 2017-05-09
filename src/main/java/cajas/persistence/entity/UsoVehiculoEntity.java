package cajas.persistence.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "UsosVehiculos", schema="vehicular")
public class UsoVehiculoEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7064583484490997462L;

	@Id
	@Column( name = "IdUso")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUso;
	
	@Column( name = "Abreviatura" )
	private String abreviatura;
	
	@Column( name = "Nombre" )
	private String nombre;
	
	@Column( name = "Estatus" )
	private Boolean estatus;

	public Integer getIdUso() {
		return idUso;
	}

	public void setIdUso(Integer idUso) {
		this.idUso = idUso;
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
