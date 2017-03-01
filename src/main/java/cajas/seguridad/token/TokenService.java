package cajas.seguridad.token;

import java.util.Calendar;
import java.util.Date;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;

import org.apache.commons.lang3.RandomStringUtils;
import org.joda.time.DateTime;

import cajas.config.parametros.ClaveParametro;
import cajas.exception.BusinessException;
import cajas.exception.CredencialesInvalidasException;
import cajas.exception.LoginException;
import cajas.persistence.entity.TokenEntity;
import cajas.persistence.entity.UsuarioEntity;
import cajas.persistence.query.TokenQuery;
import cajas.persistence.query.UsuarioPorNombreQuery;
import cajas.util.Crypto;

@Stateless
public class TokenService {

	TokenQuery tokenQuery;

	UsuarioPorNombreQuery usuarioPorNombreQuery;

	/***********
	 * Inicio de Sesion regresa un token como resultado de un inicio de sesion
	 * en el sistema llevado a cabo correctamente
	 ***********/
	public String abrirSesion(Credenciales login, Boolean checkbox) {

		if (login.getNombreUsuario().equals(null) || login.getNombreUsuario().length() == 0) {
			throw new LoginException("Ingrese su nombre de usuario.");
		}

		if (login.getPassword().equals(null) || login.getPassword().length() == 0) {
			throw new LoginException("Ingrese su contraseña.");
		}

		boolean credencialesValidas = true;
		UsuarioEntity usuarioEntity = new UsuarioEntity();

		usuarioPorNombreQuery.setNombre(login.getNombreUsuario());
		usuarioEntity = usuarioPorNombreQuery.consultar();

		String hashPassword = Crypto.hmac(login.getPassword());
		credencialesValidas = usuarioEntity.getPassword().equals(hashPassword);

		if (!credencialesValidas) {
			throw new CredencialesInvalidasException("La contraseña que ha ingresado es incorrecta.");
		}

		if (!usuarioEntity.getActivo()) {
			throw new CredencialesInvalidasException(
					"El usuario ingresado se encuentra inactivo para utilizar el sistema.");
		}

		String token = RandomStringUtils.randomAlphabetic(20);
		String hashToken = Crypto.hmac(token);
		Integer duracionSegundos = checkbox ? ClaveParametro.DURACION_MAXIMA_SESION
				: ClaveParametro.DURACION_MINIMA_SESION;

		Calendar fechaCreacion = Calendar.getInstance();
		Calendar fechaExpira = (Calendar) fechaCreacion.clone();
		fechaExpira.add(Calendar.DAY_OF_YEAR, 1);
		fechaExpira.add(Calendar.SECOND, duracionSegundos);

		Date fechaActual = new Date();

		try {
			TokenEntity tokenNuevo = new TokenEntity();
			tokenNuevo.setId(usuarioEntity.getId());
			tokenNuevo.setFechaCreacion(fechaActual);
			tokenNuevo.setHoraCreacion(fechaCreacion.getTime());
			tokenNuevo.setFechaExpiracion(fechaActual);
			tokenNuevo.setHoraExpira(fechaExpira.getTime());
			tokenNuevo.setToken(hashToken);
			tokenNuevo.setActivo(true);
			tokenQuery.registrarToken(tokenNuevo);
		} catch (PersistenceException ex) {
			ex.printStackTrace();
			throw new LoginException("Ocurrio un problema al ingresar al sistema.");
		}

		return token;
	}

	/************ Cerrar Sesion *******************/
	public void cerrarSesion(String token) {
		try {
			String hashToken = Crypto.hmac(token);
			TokenEntity tokenEntity = new TokenEntity();
			tokenEntity = tokenQuery.obtenerToken(hashToken);
			tokenEntity.setActivo(false);
			tokenQuery.actualizarToken(tokenEntity);
		} catch (PersistenceException ex) {
			ex.printStackTrace();
			throw new BusinessException("Ocurrio un problema al cerrar al terminar la sesion del sistema.");
		}
	}

	/******* Permite sabe si un token ha expirado *********/
	public boolean expiroToken(String token) {
		try {
			String hashToken = Crypto.hmac(token);
			TokenEntity tokenEntity = tokenQuery.obtenerToken(hashToken);

			if (tokenEntity == null) {
				return true;
			}

			if (!tokenEntity.getActivo()) {
				return true;
			}

			Date fechaExpira = tokenEntity.getFechaExpiracion();
			DateTime fechaActual = DateTime.now();
			fechaActual = fechaActual.withTime(0, 0, 0, 0);
			Date fecha = fechaActual.toDate();
			boolean expiro = fecha.compareTo(fechaExpira) > 0;

			if (expiro) {
				cerrarSesion(token);
			}

			return expiro;
		} catch (NoResultException ex) {
			ex.printStackTrace();
			throw new BusinessException("Ocurrio un problema al saber si un token ha expirado.");
		}

	}

}