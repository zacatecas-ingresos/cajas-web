package cajas.seguridad.usuario;

import java.util.Date;

import cajas.persistence.entity.UsuarioEntity;

public class Usuario {

	private Integer id;
	private String nombre;
	private String email;
	private Integer activo;
	private Date fechaAlta;

	public Usuario usuarioEntity(UsuarioEntity usuarioEntity) {
		Usuario usuario = new Usuario();
		usuario.setId(usuarioEntity.getIdUsuario());
		usuario.setNombre(usuarioEntity.getNombre());
		usuario.setEmail(usuarioEntity.getEmail());
		usuario.setActivo(usuarioEntity.getActivo());
		usuario.setFechaAlta(usuarioEntity.getFechaAlta());
		return usuario;
	}

	/**************** Getters and Setters ****************/

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getActivo() {
		return activo;
	}
	
	public void setActivo(Integer activo) {
		this.activo = activo;
	}
	
	public Date getFechaAlta() {
		return fechaAlta;
	}
	
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

}