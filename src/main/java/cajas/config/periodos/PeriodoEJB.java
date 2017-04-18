package cajas.config.periodos;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.NoResultException;

import cajas.exception.BusinessException;
import cajas.persistence.entity.PeriodosEntity;
import cajas.persistence.query.PeriodosQuery;

@Stateless
public class PeriodoEJB {

	@Inject
	PeriodosQuery periodosQuery;
	
	
	public List<Periodo> periodos(Integer aFiscal){
		try{
			List<Periodo> periodos = new ArrayList<>();
			List<PeriodosEntity> periodosEntity = periodosQuery.periodos(aFiscal);
			for(PeriodosEntity p : periodosEntity){
				Periodo periodo = new Periodo();
				periodo= periodo.periodoEntity(p);
				periodos.add(periodo);
			}
			return periodos;
		}catch(NoResultException ex){
			ex.printStackTrace();
			throw new BusinessException("No se encontrarón resultaods.");
		}
	}
	
}