package cajas.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tipos_vehiculos", schema = "catalogos")
public class TipoVehiculoEntity implements Serializable {
	private static final long serialVersionUID = 3829415048369577327L;
	@Id
	@Column(name = "id_tipo_vehiculo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTipoVehiculo;

	@Column(name = "tipo_vehiculo")
	private Integer tipoVehiculo;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_clase_vehiculo")
    private ClaseVehiculoEntity claseVehiculo;
	@Column(name = "abreviatura")
	private String abreviatura;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "estatus")
	private Boolean estatus;

	public Integer getIdTipoVehiculo() {
		return idTipoVehiculo;
	}
	public void setIdTipoVehiculo(Integer idTipoVehiculo) {
		this.idTipoVehiculo = idTipoVehiculo;
	}
	public Integer getTipoVehiculo() {
		return tipoVehiculo;
	}
	public void setTipoVehiculo(Integer tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	public ClaseVehiculoEntity getClaseVehiculo() {
		return claseVehiculo;
	}
	public void setClaseVehiculo(ClaseVehiculoEntity claseVehiculo) {
		this.claseVehiculo = claseVehiculo;
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