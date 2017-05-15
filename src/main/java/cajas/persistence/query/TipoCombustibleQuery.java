package cajas.persistence.query;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import cajas.persistence.entity.TipoCombustibleEntity;


public class TipoCombustibleQuery {
	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;
	
	public List<TipoCombustibleEntity> obtenerCombustiblesQuery(){
		List<TipoCombustibleEntity> combustibles = entityManager.createQuery("TipoCombustibleEntity c",TipoCombustibleEntity.class).getResultList();
		
		return combustibles;
	}
}
