package cajas.cobro.conceptos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class ConceptoEJB {

	@Inject
	private ConceptoService conceptoService;

	protected void registrarConcepto(Concepto concepto) {

		conceptoService.registrarConcepto(concepto);

	}

	protected void modificarConcepto(Integer idConcepto, Concepto concepto) {

		conceptoService.modificarConcepto(idConcepto, concepto);
	}

	protected List<Concepto> consultarConceptosPorClave(String clave) {

		return null;
	}

}
