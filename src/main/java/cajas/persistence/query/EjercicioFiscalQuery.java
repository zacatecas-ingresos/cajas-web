package cajas.persistence.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.EjercicioFiscalEntity;

public class EjercicioFiscalQuery {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	/********* Ejercicios Fiscales *********/
	public List<EjercicioFiscalEntity> ejerciciosFiscales() {
		List<EjercicioFiscalEntity> ejercicios = entityManager
				.createQuery("FROM EjercicioFiscalEntity a", EjercicioFiscalEntity.class).getResultList();
		return ejercicios;
	}

}