package cajas.persistence.entity;

import java.util.Date;

import javax.persistence.Basic;
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
@Table(name = "tokens", schema = "seguridad")
public class TokenEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_token")
	private Integer idToken;

	@Column(name = "token")
	private String token;

	@Column(name = "fecha_creacion")
	private Date fechaCreacion;

	@Column(name = "hora_creacion")
	private Date horaCreacion;

	@Column(name = "fecha_expiracion")
	private Date fechaExpiracion;

	@Column(name = "hora_expira")
	private Date horaExpira;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	private UsuarioEntity usuario;

	@Column(name = "activo")
	private Integer activo;
	
	/**************************************************/
	
	public Integer getIdToken() {
		return idToken;
	}
	
	public void setIdToken(Integer idToken) {
		this.idToken = idToken;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaExpiracion() {
		return fechaExpiracion;
	}

	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	public UsuarioEntity getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
	}

	public Integer getActivo() {
		return activo;
	}
	
	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public Date getHoraCreacion() {
		return horaCreacion;
	}

	public void setHoraCreacion(Date horaCreacion) {
		this.horaCreacion = horaCreacion;
	}

	public Date getHoraExpira() {
		return horaExpira;
	}

	public void setHoraExpira(Date horaExpira) {
		this.horaExpira = horaExpira;
	}

}