/**
 * 
 */
package cajas.persistence.query;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.ObligacionesEntity;

/**
 * @author Sanchez Moo Jesus Miguel
 *
 */
public class ObtenerObligacionQuery {
	
	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;
	
	
	public ObligacionesEntity obtenerObligacion(Integer idObligacion){
		return entityManager.find(ObligacionesEntity.class, idObligacion);
	}

}
