package cajas.persistence.query;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.VerificacionAdeudoVehicularEntity;

public class VerificacionAdeudoVehicularQuery {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;
	

	public void registrarVerificacion(VerificacionAdeudoVehicularEntity vAVehicular) {
		entityManager.persist(vAVehicular);
	}
	
	public VerificacionAdeudoVehicularEntity consultar(Integer noFolio) {
		
		VerificacionAdeudoVehicularEntity vAdeudoVehiculo =	entityManager.createQuery("FROM VerificacionAdeudoVehicularEntity u WHERE u.folioVerificacionAdeudo=:noFolio", VerificacionAdeudoVehicularEntity.class)
				.setParameter("noFolio", noFolio)				
				.getSingleResult();
		
		return vAdeudoVehiculo;
	}
	
	

}