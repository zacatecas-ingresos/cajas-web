package cajas.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios", schema ="seguridad")
public class UsuarioEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8068013789268232633L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Integer idUsuario;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "email")
	private String email;

	@Column(name = "contrasenia")
	private String password;

	@Column(name = "activo")
	private Integer activo;

	@Column(name = "fecha_alta")
	private Date fechaAlta;

	/***********************************************************************/

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getActivo() {
		return activo;
	}
	
	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}