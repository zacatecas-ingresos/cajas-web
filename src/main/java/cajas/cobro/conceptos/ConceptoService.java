package cajas.cobro.conceptos;

import javax.inject.Inject;
import javax.persistence.NoResultException;

import cajas.exception.BusinessException;
import cajas.persistence.entity.ConceptosEntity;
import cajas.persistence.query.ConceptoQuery;

public class ConceptoService {

	@Inject
	private ConceptoQuery conceptoQuery;

	protected void registrarConcepto(Concepto concepto) {

		boolean verificarConcepto = conceptoQuery.existeConcepto(concepto.getClave(), concepto.getEjercicioFiscal());
		
		if(verificarConcepto){
			throw new BusinessException("Existe un registro con la misma clave y año fiscal");
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
