package cajas.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

//import org.hibernate.type.NumericBooleanType;
@Entity
@Table(name = "marcas_vehiculos", schema = "catalogos")
public class MarcaVehiculoEntity implements Serializable {

	private static final long serialVersionUID = 6737516490015922078L;

	@Id
	@Column(name = "id_marca_vehiculo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMarcaVehiculo;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "abreviatura")
	private String abreviatura;

	@Column(name = "estatus")
	@Type(type = "org.hibernate.type.NumericBooleanType")
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