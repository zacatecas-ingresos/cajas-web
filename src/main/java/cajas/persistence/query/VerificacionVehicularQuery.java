package cajas.persistence.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.UsuarioEntity;
import cajas.persistence.entity.VerificacionVehicularEntity;

public class VerificacionVehicularQuery {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	public void registrarVerificacion(VerificacionVehicularEntity vVehicular) {
		entityManager.persist(vVehicular);
	}

}