package cajas.persistence.entity;

import java.util.Date;

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
@Table(name = "tokens")
public class TokenEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idtoken")
	private Integer id;

	@Column(name = "token")
	private String token;

	@Column(name = "fechacreacion")
	private Date fechaCreacion;

	@Column(name = "hora_creacion")
	private Date horaCreacion;

	@Column(name = "fechaexpiracion")
	private Date fechaExpiracion;

	@Column(name = "hora_expira")
	private Date horaExpira;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdUsuario")
	private UsuarioEntity usuario;

	@Column(name = "Activo")
	private Boolean activo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
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