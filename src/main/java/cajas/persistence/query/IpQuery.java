package cajas.persistence.query;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.IpEntity;

public class IpQuery {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	/******* Registra una ip que ha sido bloqueada *******/
	public void registrarIp(IpEntity ip) {
		entityManager.persist(ip);
	}

	/******* Obtiene la informaci�n de una ip registrada **************/
	public IpEntity obtenerIP(String ip) {
		IpEntity ipEntity = entityManager
				.createQuery("FROM IpEntity a WHERE a.ip=:ip ORDER BY a.horaExpira DESC", IpEntity.class)
				.setParameter("ip", ip).setMaxResults(1).getSingleResult();
		return ipEntity;
	}

}