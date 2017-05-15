package cajas.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ClasesVehiculos", schema = "vehicular")
public class ClaseVehiculoEntity implements Serializable {
	private static final long serialVersionUID = 3010915041069578627L;
	@Id
	@Column(name = "IdClaseVehiculo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idClaseVehiculo;
	@Column(name = "ClaseVehiculo")
	private String nombre;
	@Column(name = "Estatus")
	private Integer estatus;

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
	public Integer getEstatus() {
		return estatus;
	}
	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}
}