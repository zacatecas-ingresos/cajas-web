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

	public void crearUsuario(RegistroUsuario usuario) {
		try {
			UsuarioEntity usuarioPorNombre = usuarioPorNombreQuery.consultar(usuario.getNombre());
			if (usuarioPorNombre != null) {
				throw new BusinessException("El usuario ya existe.");
			}

			UsuarioEntity usuarioPorCorreo = usuarioPorCorreoQuery.consultarUsuarioPorCorreo(usuario.getNombre());
			if (usuarioPorCorreo != null) {
				throw new BusinessException("El correo electrónico ya existe.");
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
					throw new BusinessException("El correo electrónico ya existe.");
				}
			}

		} catch (NoResultException ex) {

		}

		try {
			usuarioEntity.setNombre(usuario.getNombre());
			usuarioEntity.setEmail(usuario.getEmail());
			if(usuario.getPassword() != null){
				usuarioEntity.setPassword(Crypto.hmac(usuario.getPassword()));
			}
			if(usuario.getActivo() < 0 || usuario.getActivo() > 1){
				throw new BusinessException("Solo se aceptan una valor para el registro cero o uno.");
			}
			usuarioEntity.setActivo(usuario.getActivo());
			usuarioEntity.setFechaAlta(usuario.getFechaAlta());
			usuarioQuery.actualizarUsuario(usuarioEntity);
		} catch (PersistenceException ex) {
			ex.printStackTrace();
			throw new BusinessException("Ocurrio un problema al registrar al dar de alta al usuario.");
		}
	}

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

	public void desactivarUsuario(Integer idUsuario) {
		try {
			UsuarioEntity usuarioEntity = usuarioQuery.obtenerUsuarioPorId(idUsuario);
			usuarioEntity.setActivo(0);
			usuarioQuery.actualizarUsuario(usuarioEntity);
		} catch (PersistenceException ex) {
			throw new BusinessException("Ocurrio un problema al actualizar al usuario.");
		}
	}

	public void eliminarUsuario(Integer idUsuario) {
		try {
			UsuarioEntity usuarioEntity = usuarioQuery.obtenerUsuarioPorId(idUsuario);
			usuarioQuery.eliminarUsuario(usuarioEntity);
		} catch (PersistenceException ex) {
			throw new BusinessException("Ocurrio un problema al actualizar al usuario.");
		}
	}

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
