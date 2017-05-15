package cajas.persistence.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TiposCombustibles", schema = "vehicular")
public class TipoCombustibleEntity implements Serializable{

	private static final long serialVersionUID = -1330215080313507252L;
	
	@Id
	@Column(name = "IdTipoCombustible")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCombustible;	
	
	@Column( name = "TipoCombustible" )
	private String nombre;
	
	@Column( name = "Estatus" )
	private Integer estatus;

	public Integer getIdCombustible() {
		return idCombustible;
	}

	public void setIdCombustible(Integer idCombustible) {
		this.idCombustible = idCombustible;
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
