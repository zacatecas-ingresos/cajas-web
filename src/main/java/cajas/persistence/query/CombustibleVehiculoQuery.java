package cajas.persistence.query;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import cajas.persistence.entity.CombustibleVehiculoEntity;


public class CombustibleVehiculoQuery {
	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;
	
	public List<CombustibleVehiculoEntity> obtenerCombustiblesQuery(){
		List<CombustibleVehiculoEntity> combustibles = entityManager.createQuery("CombustibleVehiculoEntity c",CombustibleVehiculoEntity.class).getResultList();
		
		return combustibles;
	}
}
