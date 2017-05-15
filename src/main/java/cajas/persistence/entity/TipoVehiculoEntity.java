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
@Table(name = "TiposVehiculos", schema = "vehicular")
public class TipoVehiculoEntity implements Serializable {
	private static final long serialVersionUID = 3829415048369577327L;
	@Id
	@Column(name = "IdTipoVehiculo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTipoVehiculo;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdClaseVehiculo")
    private ClaseVehiculoEntity claseVehiculo;
	
	@Column(name = "TipoVehiculo")
	private String nombre;
	
	@Column(name = "Estatus")
	private Boolean estatus;

	public Integer getIdTipoVehiculo() {
		return idTipoVehiculo;
	}
	public void setIdTipoVehiculo(Integer idTipoVehiculo) {
		this.idTipoVehiculo = idTipoVehiculo;
	}
	public ClaseVehiculoEntity getClaseVehiculo() {
		return claseVehiculo;
	}
	public void setClaseVehiculo(ClaseVehiculoEntity claseVehiculo) {
		this.claseVehiculo = claseVehiculo;
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