package cajas.persistence.query;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.PeriodosEntity;

public class PeriodosQuery {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	public List<PeriodosEntity> periodosPorTipo(Integer tipoPeriodo) {
		List<PeriodosEntity> periodos = entityManager
				.createQuery("FROM PeriodosEntity a WHERE a.tipoPeriodo=:tipoPeriodo", PeriodosEntity.class)
				.setParameter("tipoPeriodo", tipoPeriodo).getResultList();
		return periodos;
	}

	public List<PeriodosEntity> periodos(Integer aFiscal) {
		List<PeriodosEntity> periodos = entityManager.createQuery("FROM PeriodosEntity a WHERE a.aFiscal=:aFiscal", PeriodosEntity.class)
				.setParameter("aFiscal",aFiscal).getResultList();
		return periodos;
	}

	public PeriodosEntity obtenerPeriodo(Integer aFiscal, String mes, Integer tipoPeriodo) {
		PeriodosEntity periodo = entityManager
				.createQuery(
						"FROM PeriodosEntity a WHERE a.aFiscal=:aFiscal AND a.mes=:mes AND a.tipoPeriodo=:tipoPeriodo",
						PeriodosEntity.class)
				.setParameter("aFiscal", aFiscal).setParameter("mes", mes).setParameter("tipoPeriodo", tipoPeriodo)
				.getSingleResult();
		return periodo;
	}

}