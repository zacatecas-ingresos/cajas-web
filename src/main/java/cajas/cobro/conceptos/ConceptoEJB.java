package cajas.cobro.conceptos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import cajas.exception.BusinessException;
import cajas.persistence.query.ConceptoActivoClaveQuery;
import cajas.util.ValidacionUtil;

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

		return conceptoService.consultarConceptosPorClave(clave);
	}

	private void validarConcepto(Concepto concepto) {
		// Validación campos, lanzar excepción, basarse en la validación que
		// está en el cálculo estatal.
		
		if (!ValidacionUtil.esCadenaVacia(concepto.getDescripcion())) {
			throw new BusinessException("La descripcion de concepto es requerido.");
		}
		
		if (!ValidacionUtil.esCadenaVacia(concepto.getNivel1())) {
			throw new BusinessException("La descripcion de nivel 1 es requerido.");
		}
		
		if (!ValidacionUtil.esCadenaVacia(concepto.getNivel2())) {
			throw new BusinessException("La descripcion de nivel 2 es requerido.");
		}
		
		if (!ValidacionUtil.esCadenaVacia(concepto.getNivel3())) {
			throw new BusinessException("La descripcion de nivel 3 es requerido.");
		}
		
		if (!ValidacionUtil.esCadenaVacia(concepto.getNivel4())) {
			throw new BusinessException("La descripcion de nivel 4 es requerido.");
		}
		
		if (!ValidacionUtil.esCadenaVacia(concepto.getNivel5())) {
			throw new BusinessException("La descripcion de nivel 5 es requerido.");
		}
		
		if (!ValidacionUtil.esCadenaVacia(concepto.getNivel6())) {
			throw new BusinessException("La descripcion de nivel 6 es requerido.");
		}
		
		if(!ValidacionUtil.esNumeroPositivo(concepto.getCobroDerecho())){
			throw new BusinessException("Cobro derecho es requerido.");
		}
		
		if (!ValidacionUtil.esNumeroPositivo(concepto.getEjercicioFiscal())) {
			throw new BusinessException("El ejercicio fiscal es requerido.");
		}

		if (!ValidacionUtil.esNumeroPositivo(concepto.getTipoNivel())) {
			throw new BusinessException("El tipo de nivel es reuerido.");
		}
	}
}
