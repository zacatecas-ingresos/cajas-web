package cajas.cobro.conceptos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import cajas.persistence.query.ConceptoActivoClaveQuery;

@Stateless
public class ConceptoEJB {
	
	@Inject
	private ConceptoActivoClaveQuery conceptoActivoClaveQuery;
	
	@Inject
	private ConceptoService conceptoService;
	
	//dar de alta nuevos conceptos
	protected void registrarConcepto(Concepto concepto) {
		// Validar que los datos requeridos no estén vacíos
		validarConcepto(concepto);

		// Validar que no exista un concepto registrado activo con el ejericico
		// fiscal y la clave

		// Creas la entidad y la registras
		conceptoService.registrarConcepto(concepto);

	}
	
	//modificar conceptos dados de alta
	protected void modificarConcepto(Integer idConcepto, Concepto concepto){
		
		conceptoService.modificarConcepto(idConcepto, concepto);
	}

	protected List<Concepto> consultarConceptosPorClave(String clave) {
		// Validar que no venga vacia la clave y lanzar excepción si está vacía
		// Consultar todos los conceptos registrados con la clave especificada

		return null;
	}

	private void validarConcepto(Concepto concepto) {
		// Validación campos, lanzar excepción, basarse en la validación que
		// está en el cálculo estatal.
	}
}
