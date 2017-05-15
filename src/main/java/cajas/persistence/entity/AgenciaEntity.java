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
@Table( name = "Agencias", schema="vehicular")
public class AgenciaEntity implements Serializable{

	private static final long serialVersionUID = -3765122932636977211L;

	@Id
	@Column( name = "IdAgencia")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAgencia;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdEstado")
	private EstadoEntity estado;
	
	@Column( name = "RFC")
	private String rfc;
	
	@Column( name = "Agencia" )
	private String nombre;
	
	@Column( name = "Estatus")
	private Integer estatus;

	public Integer getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(Integer idAgencia) {
		this.idAgencia = idAgencia;
	}

	public EstadoEntity getEstado() {
		return estado;
	}

	public void setEstado(EstadoEntity estado) {
		this.estado = estado;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
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
