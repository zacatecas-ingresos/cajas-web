package cajas.contribuyentes;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;

import cajas.exception.BusinessException;
import cajas.persistence.entity.VerificadorEntity;
import cajas.persistence.query.VerificadorQuery;

@Stateless
public class VerificadorEJB {

	@Inject
	VerificadorQuery verificadorQuery;
	//@Inject 	VerificadorEntity verificadorEntity;



	/**********Registra un verificador**************/
	public void crearVerificador(VerificadorEntity usuario) {
	/*	try {
			VerificadorEntity verificadorPorNombre = verificadorPorNombreQuery.consultar(usuario.getNombre());
			if (verificadorPorNombre != null) {
				throw new BusinessException("El verificarod ya existe.");
			}

			VerificadorEntity verificadorPorAppaterno = verificadorPorAppaterno.consultarverificadorPorAppaternoo(usuario.getNombre());
			if (verificadorPorAppaterno != null) {
				throw new BusinessException("El apellido ya existe.");
			}
			VerificadorEntity verificadorPorApmaterno = verificadorPorApmaterno.consultarverificadorPorApmaternoo(usuario.getNombre());
			if (verificadorPorApmaterno != null) {
				throw new BusinessException("El apellido ya existe.");
			}
		} catch (NoResultException ex) {

		}

		try {
			VerificadorEntity verificadorEntity = new VerificadorEntity();
			verificadorEntity.setNombre(usuario.getNombre());
			verificadorEntity.setApPaterno(usuario.getApPaterno());
			verificadorEntity.setApPaterno(usuario.getApPaterno());
	
			VerificadorQuery.VerificadoEntity(VerificadorEntity);
		} catch (PersistenceException ex) {
			ex.printStackTrace();
			throw new BusinessException("Ocurrio un problema al registrar al dar de alta al usuario.");
		}
	*/

	}

	/*************Actualiza la informaci�n del verificador registrado***************/
	public void actualizarUsuario(VerificadorEntity usuario) {
		
		VerificadorEntity verificadorEntity = new VerificadorEntity();
		try {
			verificadorEntity = verificadorQuery.obtenerUsuarioPorId(usuario.getIdUsuario());

			if (!verificadorEntity.getNombre().equals(usuario.getNombre())) {
				//VerificadorEntity usuarioPorNombre = usuarioPorNombreQuery.consultar(usuario.getNombre());
				//if (usuarioPorNombre != null) {
				//	throw new BusinessException("El verificador ya existe.");
				//}
			}

		
		} catch (NoResultException ex) {

		}

		}

	/********Obtiene un verrificador por su nombre*********/
	public VerificadorEntity obtenerUsuarioPorNombre(VerificadorEntity nombre) {
	/*	try {
			UsuarioEntity verificadorEntity = VerificadorPorNombreQuery.consultar(nombre);
			VerificadorEntity usuario = new VerificadorEntity();
			usuario = usuario.VerificadorEntity(verificadorEntity);
			return usuario;
		} catch (NoResultException ex) {
			throw new BusinessException("El usuario no existe.");
		}
		
		*/
		return nombre;
	}

	/********Obtiene un verificadoro por su ID**********/
	public Integer obtenerUsuarioPorId(Integer idUsuario) {
	/*	try {
			VerificadorEntity verificadorEntity = verificadorQuery.obtenerUsuarioPorId(idUsuario);
			VerificadorEntity usuario = new VerificadorEntity();
			usuario = usuario.usuarioEntity(verificadorEntity);
			return usuario;
		} catch (NoResultException ex) {
			throw new BusinessException("El usuario no existe.");
		}
	 */
			return idUsuario;
	}
	/*******Obtiene la lista de verificadores registrados********/
	public List<VerificadorEntity> obtenerUsuarios() {
		return obtenerUsuarios();
		/* try {
			List<VerificadorEntity> verificadoresEntity = verificadorQuery.obtenerUsuarios();
			List<VerificadorEntity> verificadores = new ArrayList<>();
			for (VerificadorEntity verificadorEntity : verificadoresEntity) {
				VerificadorEntity verificador = new VerificadorEntity();
				verificador = verificador.VerificadorEntity(verificadorEntity);
				verificadores.add(verificador);
			}
			return verificadores;		} catch (NoResultException ex) {
			throw new BusinessException("No hay usuarios registrados.");
		}
		*/
	}
	
	
	

	/*********Elimina un verificador***********/
	public void eliminarUsuario(Integer idUsuario) {
		/*try {
			VerificadorEntity verificadorEntity = VerificadorQuery.obtenerUsuarioPorId(idUsuario);
			verificadorQuery.eliminarUsuario(usuarioEntity);
		} catch (PersistenceException ex) {
			throw new BusinessException("Ocurrio un problema al actualizar al usuario.");
		}
		*/
	}
	
	


	
	
	

}
