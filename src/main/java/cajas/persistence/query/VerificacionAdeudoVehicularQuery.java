package cajas.persistence.query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.VerificacionAdeudoVehicularEntity;

public class VerificacionAdeudoVehicularQuery {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	public void registrarVerificacion(VerificacionAdeudoVehicularEntity vAVehicular) {
		entityManager.persist(vAVehicular);
	}
	
	

}