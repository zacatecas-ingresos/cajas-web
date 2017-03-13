package cajas.seguridad.usuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;

import cajas.exception.BusinessException;
import cajas.persistence.entity.TokenEntity;
import cajas.persistence.entity.UsuarioEntity;
import cajas.persistence.query.TokenQuery;
import cajas.persistence.query.UsuarioPorCorreoQuery;
import cajas.persistence.query.UsuarioPorNombreQuery;
import cajas.persistence.query.UsuarioQuery;
import cajas.seguridad.usuario.RegistroUsuario;
import cajas.util.Crypto;

@Stateless
public class UsuarioService {

	@Inject
	UsuarioQuery usuarioQuery;

	@Inject
	UsuarioPorNombreQuery usuarioPorNombreQuery;

	@Inject
	UsuarioPorCorreoQuery usuarioPorCorreoQuery;

	@Inject
	TokenQuery tokenQuery;

	/**********Registra un usuario**************/
	public void crearUsuario(RegistroUsuario usuario) {
		try {
			UsuarioEntity usuarioPorNombre = usuarioPorNombreQuery.consultar(usuario.getNombre());
			if (usuarioPorNombre != null) {
				throw new BusinessException("El usuario ya existe.");
			}

			UsuarioEntity usuarioPorCorreo = usuarioPorCorreoQuery.consultarUsuarioPorCorreo(usuario.getNombre());
			if (usuarioPorCorreo != null) {
				throw new BusinessException("El correo electr�nico ya existe.");
			}
		} catch (NoResultException ex) {

		}

		try {
			UsuarioEntity usuarioEntity = new UsuarioEntity();
			usuarioEntity.setNombre(usuario.getNombre());
			usuarioEntity.setEmail(usuario.getEmail());
			usuarioEntity.setPassword(Crypto.hmac(usuario.getPassword()));
			if(usuario.getActivo() < 0 || usuario.getActivo() > 1){
				throw new BusinessException("Solo se aceptan una valor para el registro cero o uno.");
			}
			usuarioEntity.setActivo(usuario.getActivo());
			usuarioEntity.setFechaAlta(new Date());
			usuarioQuery.registrarUsuario(usuarioEntity);
		} catch (PersistenceException ex) {
			ex.printStackTrace();
			throw new BusinessException("Ocurrio un problema al registrar al dar de alta al usuario.");
		}
	}

	/*************Actualiza la informaci�n de un usuario registrado***************/
	public void actualizarUsuario(RegistroUsuario usuario) {
		
		UsuarioEntity usuarioEntity = new UsuarioEntity();
		try {
			usuarioEntity = usuarioQuery.obtenerUsuarioPorId(usuario.getId());

			if (!usuarioEntity.getNombre().equals(usuario.getNombre())) {
				UsuarioEntity usuarioPorNombre = usuarioPorNombreQuery.consultar(usuario.getNombre());
				if (usuarioPorNombre != null) {
					throw new BusinessException("El usuario ya existe.");
				}
			}

			if (!usuarioEntity.getEmail().equals(usuario.getEmail())) {
				UsuarioEntity usuarioPorCorreo = usuarioPorCorreoQuery.consultarUsuarioPorCorreo(usuario.getEmail());
				if (usuarioPorCorreo != null) {
					throw new BusinessException("El correo electr�nico ya existe.");
				}
			}

		} catch (NoResultException ex) {

		}

		try {
			usuarioEntity.setNombre(usuario.getNombre());
			usuarioEntity.setEmail(usuario.getEmail());
			
			if(usuario.getPassword() != ""){
				usuarioEntity.setPassword(Crypto.hmac(usuario.getPassword()));
			}			
			usuarioQuery.actualizarUsuario(usuarioEntity);
		} catch (PersistenceException ex) {
			ex.printStackTrace();
			throw new BusinessException("Ocurrio un problema al registrar al dar de alta al usuario.");
		}
	}

	/********Obtiene un usuario por su nombre*********/
	public Usuario obtenerUsuarioPorNombre(String nombre) {
		try {
			UsuarioEntity usuarioEntity = usuarioPorNombreQuery.consultar(nombre);
			Usuario usuario = new Usuario();
			usuario = usuario.usuarioEntity(usuarioEntity);
			return usuario;
		} catch (NoResultException ex) {
			throw new BusinessException("El usuario no existe.");
		}
	}

	/**********Obtiene un usuario por su correo electr�nico********/
	public Usuario obtenerUsuarioPorCorreo(String correo) {
		try {
			UsuarioEntity usuarioEntity = usuarioPorCorreoQuery.consultarUsuarioPorCorreo(correo);
			Usuario usuario = new Usuario();
			usuario = usuario.usuarioEntity(usuarioEntity);
			return usuario;
		} catch (NoResultException ex) {
			throw new BusinessException("El usuario no existe.");
		}
	}
	
	
	/********Obtiene un usuario por su ID**********/
	public Usuario obtenerUsuarioPorId(Integer idUsuario) {
		try {
			UsuarioEntity usuarioEntity = usuarioQuery.obtenerUsuarioPorId(idUsuario);
			Usuario usuario = new Usuario();
			usuario = usuario.usuarioEntity(usuarioEntity);
			return usuario;
		} catch (NoResultException ex) {
			throw new BusinessException("El usuario no existe.");
		}
	}

	/*******Obtiene la lista de usuarios registrados********/
	public List<Usuario> obtenerUsuarios() {
		try {
			List<UsuarioEntity> usuariosEntity = usuarioQuery.obtenerUsuarios();
			List<Usuario> usuarios = new ArrayList<>();
			for (UsuarioEntity usuarioEntity : usuariosEntity) {
				Usuario usuario = new Usuario();
				usuario = usuario.usuarioEntity(usuarioEntity);
				usuarios.add(usuario);
			}
			return usuarios;
		} catch (NoResultException ex) {
			throw new BusinessException("No hay usuarios registrados.");
		}
	}
	
	/*******Obtiene la lista de aquellos usuarios que coincidan con el parametro recibido********/
	public List<Usuario> obtenerUsuariosFiltro(String paramteroBusqueda) {
		try {
			List<UsuarioEntity> usuariosEntity = usuarioQuery.obtenerUsuariosFiltro(paramteroBusqueda);
			List<Usuario> usuarios = new ArrayList<>();
			for (UsuarioEntity usuarioEntity : usuariosEntity) {
				Usuario usuario = new Usuario();
				usuario = usuario.usuarioEntity(usuarioEntity);
				usuarios.add(usuario);
			}
			return usuarios;
		} catch (NoResultException ex) {
			throw new BusinessException("No hay usuarios registrados.");
		}
	}

	/*******Desactiva un usuario para que no pueda ingresar al sistema********/
	public void desactivarActivarUsuario(Integer idUsuario) {
		try {
			UsuarioEntity usuarioEntity = usuarioQuery.obtenerUsuarioPorId(idUsuario);
			if(usuarioEntity.getActivo().equals(1)){
				usuarioEntity.setActivo(0);	
			}else{
				usuarioEntity.setActivo(1);
			}
			usuarioQuery.actualizarUsuario(usuarioEntity);
		} catch (PersistenceException ex) {
			throw new BusinessException("Ocurrio un problema al actualizar al usuario.");
		}
	}

	/*********Elimina un usuario***********/
	public void eliminarUsuario(Integer idUsuario) {
		try {
			UsuarioEntity usuarioEntity = usuarioQuery.obtenerUsuarioPorId(idUsuario);
			usuarioQuery.eliminarUsuario(usuarioEntity);
		} catch (PersistenceException ex) {
			throw new BusinessException("Ocurrio un problema al actualizar al usuario.");
		}
	}
	
	/*****Obtiene un usuario por el token enviado*********/
	public Usuario obtenerUsuarioPorToken(String token) {
		try {
			TokenEntity tokenEntity = new TokenEntity();
			tokenEntity = tokenQuery.obtenerToken(Crypto.hmac(token));
			UsuarioEntity usuarioEntity = new UsuarioEntity();
			usuarioEntity = usuarioQuery.obtenerUsuarioPorId(tokenEntity.getUsuario().getIdUsuario());
			Usuario usuario = new Usuario();
			usuario = usuario.usuarioEntity(usuarioEntity);
			return usuario;
		} catch (NoResultException ex) {
			ex.printStackTrace();
			throw new BusinessException("No se encontro al usuario por token.");
		}
	}

}
