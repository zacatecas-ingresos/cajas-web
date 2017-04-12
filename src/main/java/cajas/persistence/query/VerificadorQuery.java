package cajas.persistence.query;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import cajas.persistence.entity.VerificadorEntity;

public class VerificadorQuery {


	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	public VerificadorEntity obtenerUsuarioPorId(Integer idUsuario) {
		return entityManager.find(VerificadorEntity.class, idUsuario);
	}

	public List<VerificadorEntity> obtenerUsuarios() {
		List<VerificadorEntity> nombre = entityManager.createQuery("FROM VerificadorEntity a ", VerificadorEntity.class)
				.getResultList();
		return nombre;
	}
	


	public void registrarUsuario(VerificadorEntity nombre) {
		entityManager.persist(nombre);
	}

	public void actualizarUsuario(VerificadorEntity nombre) {
		entityManager.merge(nombre);
	}
	
	public void eliminarUsuario(VerificadorEntity nombre){
		entityManager.remove(nombre);
	}
	
}
