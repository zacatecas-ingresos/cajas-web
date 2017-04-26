package cajas.persistence.query;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.CajasEntity;

public class CajasQuery {
	
	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;
	
	public CajasEntity obtenerCaja(Integer idCaja){
		return entityManager.find(CajasEntity.class, idCaja);
	}
	
	public void actualizarRegistrarCaja(CajasEntity cajasEntity){
		entityManager.persist(cajasEntity);
	}
	
	public void eliminar(CajasEntity cajasEntity){
		entityManager.remove(cajasEntity);
	}

}
