package cajas.cobro.conceptos;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.NoResultException;

import cajas.exception.BusinessException;
import cajas.persistence.entity.ConceptosEntity;
import cajas.persistence.query.ConceptoQuery;
import cajas.util.ValidacionUtil;

public class ConceptoService {

	@Inject
	private ConceptoQuery conceptoQuery;
	
	protected List<Concepto> consultarConceptosPorClave(String clave) {
		// Validar que no venga vacia la clave y lanzar excepción si está vacía
		// Consultar todos los conceptos registrados con la clave especificada
		if(!ValidacionUtil.esCadenaVacia(clave)){
			throw new BusinessException("La clave de concepto es requerida para realizar busqueda.");
		}
		
		List<ConceptosEntity> listaConceptos = conceptoQuery.obtenerConceptos(clave);
		
		if(listaConceptos.size()<=0){
			throw new BusinessException("No existe conceptos con la clave especificada.");
		}
		
		List<Concepto> conceptos = new ArrayList<Concepto>();
		
		for (ConceptosEntity entidad : listaConceptos) {
			Concepto concepto = ConceptoFactory.toObtenerConcepto(entidad);
			conceptos.add(concepto);
		}
		
		return conceptos;
	}

	protected void registrarConcepto(Concepto concepto) {

		boolean verificarConcepto = conceptoQuery.existeConcepto(concepto.getClave(), concepto.getEjercicioFiscal());
		
		if(verificarConcepto){
			throw new BusinessException("Existe un registro con la misma clave y a�o fiscal");
		}else{
			ConceptosEntity entity = ConceptoFactory.toConceptoEntity(concepto);
			conceptoQuery.altaConcepto(entity);
		}
	}
	
	protected void modificarConcepto(Integer idConcepto, Concepto concepto){
		
		try{
			ConceptosEntity entidad = conceptoQuery.obtenerConcepto(idConcepto);
			
			if((concepto.getClave()!=entidad.getClave()) || (concepto.getEjercicioFiscal()!=entidad.getEjercicioFiscal())){
				
				boolean verificarConcepto = conceptoQuery.existeConcepto(concepto.getClave(), concepto.getEjercicioFiscal());
				
				if(verificarConcepto){
					throw new BusinessException("No se puede modificar concepto, la clave para ejercicio fiscal existe.");
				}else{
					conceptoQuery.editarConcepto(ConceptoFactory.toConceptoEditar(concepto, entidad));
				}
				
			}else{
				conceptoQuery.editarConcepto(ConceptoFactory.toConceptoEditar(concepto, entidad));
			}
		}catch (NoResultException ex) {
			throw new BusinessException("No existe concepto.");
		}
	}
}
