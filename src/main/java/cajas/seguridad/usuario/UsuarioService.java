package cajas.seguridad.usuario;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.NoResultException;

import cajas.exception.BusinessException;
import cajas.persistence.entity.TokenEntity;
import cajas.persistence.entity.UsuarioEntity;
import cajas.persistence.query.TokenQuery;
import cajas.persistence.query.UsuarioQuery;
import cajas.seguridad.usuario.RegistroUsuario;
import cajas.util.Crypto;

@Stateless
public class UsuarioService {

	@Inject
	UsuarioQuery usuarioQuery;
	
	@Inject
	TokenQuery tokenQuery;
	
	public void crearUsuario(RegistroUsuario usuario) {
	}

	public RegistroUsuario obtenerUsuario(String nombre) {
		return null;
	}

	public void borrarUsuario(Integer id) {
		
	}

	public void actualizarUsuario(RegistroUsuario usuarioDTO) {
		
	}
	
	public Usuario obtenerUsuarioPorToken(String token){
		try{
			TokenEntity tokenEntity = new TokenEntity();
			tokenEntity = tokenQuery.obtenerToken(Crypto.hmac(token));
			UsuarioEntity usuarioEntity = new UsuarioEntity();
			usuarioEntity = usuarioQuery.obtenerUsuarioPorId(tokenEntity.getUsuario().getIdUsuario());
			Usuario usuario = new Usuario();
			usuario = usuario.usuarioEntity(usuarioEntity);
			return usuario;
		}catch(NoResultException ex){
			ex.printStackTrace();
			throw new BusinessException("No se encontro al usuario por token.");
		}
	}
	

}
