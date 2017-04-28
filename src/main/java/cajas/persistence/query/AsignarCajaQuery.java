package cajas.persistence.query;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.AsignacionCajaEntity;

public class AsignarCajaQuery implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5909701157340135325L;
	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;
	

	public AsignacionCajaEntity obtenerAsignacionCajaPorIdUsuario(Integer idUsuario){
		AsignacionCajaEntity entity = entityManager.createNamedQuery("Select ac From AsignacionCajaEntity as ac where ac.idUsuario=:idUsuario and ac.fechaDesasignacion = NULL", AsignacionCajaEntity.class)
				.setParameter("idUsuario",idUsuario).getSingleResult();
		
		return entity;
	}
	
	public List<AsignacionCajaEntity> obtenerAsignaciones(){
		List<AsignacionCajaEntity> entity = entityManager.createNamedQuery("Select ac From AsignacionCajaEntity as ac where ac.fechaDesasignacion = NULL", AsignacionCajaEntity.class)
				.getResultList();		
		return entity;
	}
	
	
	public Boolean tieneAsgnadoCajero(Integer idCaja){
		AsignacionCajaEntity entity = entityManager.createNamedQuery("Select ac From AsignacionCajaEntity as ac where ac.idCaja.idCaja=:idCaja and ac.fechaDesasignacion = NULL", AsignacionCajaEntity.class)
				.setParameter("idCaja",idCaja).getSingleResult();
		
		if(entity != null){
		return true;
		}
		return false;
	}
}
