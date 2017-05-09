package cajas.persistence.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CombustiblesVehiculos", schema = "vehicular")
public class CombustibleVehiculoEntity implements Serializable{

	private static final long serialVersionUID = -1330215080313507252L;
	
	@Id
	@Column(name = "IdCombustible")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCombustible;
	
	@Column( name  = "Abreviatura")
	private String abreviatura;
	
	@Column( name = "Nombre" )
	private String nombre;
	
	@Column( name = "Estatus" )
	private Boolean estatus;

	public Integer getIdCombustible() {
		return idCombustible;
	}

	public void setIdCombustible(Integer idCombustible) {
		this.idCombustible = idCombustible;
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
