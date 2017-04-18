package cajas.config.ejerciciosfiscales;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.NoResultException;

import cajas.exception.BusinessException;
import cajas.persistence.entity.EjercicioFiscalEntity;
import cajas.persistence.query.EjercicioFiscalQuery;

@Stateless
public class EjercicioEJB {

	@Inject
	EjercicioFiscalQuery ejercicioFiscalQuery;

	public List<EjercicioFiscal> ejerciciosFiscales() {
		try {
			List<EjercicioFiscal> ejercicios = new ArrayList<>();
			List<EjercicioFiscalEntity> ejerciciosEntity = ejercicioFiscalQuery.ejerciciosFiscales();
			for (EjercicioFiscalEntity e : ejerciciosEntity) {
				EjercicioFiscal ejercicioFiscal = new EjercicioFiscal();
				ejercicioFiscal = ejercicioFiscal.ejercicoFiscal(e);
				ejercicios.add(ejercicioFiscal);
			}
			return ejercicios;
		} catch (NoResultException ex) {
			ex.printStackTrace();
			throw new BusinessException("No se encontrarón resultados.");
		}
	}

}