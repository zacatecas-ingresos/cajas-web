package cajas.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clases_vehiculos", schema = "catalogos")
public class ClaseVehiculoEntity implements Serializable {
	private static final long serialVersionUID = 3010915041069578627L;
	@Id
	@Column(name = "id_clase_vehiculo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idClaseVehiculo;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "abreviacion")
	private String abreviacion;
	@Column(name = "estatus")
	private Boolean estatus;

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
	public String getAbreviacion() {
		return abreviacion;
	}
	public void setAbreviacion(String abreviacion) {
		this.abreviacion = abreviacion;
	}
	public Boolean getEstatus() {
		return estatus;
	}
	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}
}