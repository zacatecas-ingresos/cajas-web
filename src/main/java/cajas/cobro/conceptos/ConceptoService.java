package cajas.cobro.conceptos;

import javax.inject.Inject;
import javax.persistence.NoResultException;

import cajas.exception.BusinessException;
import cajas.persistence.entity.ConceptosEntity;
import cajas.persistence.query.ConceptoQuery;
import cajas.util.ValidacionUtil;

public class ConceptoService {

	@Inject
	private ConceptoQuery conceptoQuery;

	protected void registrarConcepto(Concepto concepto) {
		validarConcepto(concepto);

		boolean verificarConcepto = conceptoQuery.existeConcepto(concepto.getClave(), concepto.getEjercicioFiscal());

		if (verificarConcepto) {
			throw new BusinessException("Existe un registro con la misma clave y año fiscal");
		} else {
			ConceptosEntity entity = ConceptoFactory.toConceptoEntity(concepto);
			conceptoQuery.altaConcepto(entity);
		}
	}

	protected void modificarConcepto(Integer idConcepto, Concepto concepto) {

		try {
			ConceptosEntity entidad = conceptoQuery.obtenerConcepto(idConcepto);

			if ((concepto.getClave() != entidad.getClave())
					|| (concepto.getEjercicioFiscal() != entidad.getEjercicioFiscal())) {

				boolean verificarConcepto = conceptoQuery.existeConcepto(concepto.getClave(),
						concepto.getEjercicioFiscal());

				if (verificarConcepto) {
					throw new BusinessException(
							"No se puede modificar concepto, la clave para ejercicio fiscal existe.");
				} else {
					conceptoQuery.editarConcepto(ConceptoFactory.toConceptoEditar(concepto, entidad));
				}

			} else {
				conceptoQuery.editarConcepto(ConceptoFactory.toConceptoEditar(concepto, entidad));
			}
		} catch (NoResultException ex) {
			throw new BusinessException("No existe concepto.");
		}
	}

	public void validarConcepto(Concepto concepto) {

		if (!ValidacionUtil.esNumeroPositivo(concepto.getIdConcepto())) {
			throw new BusinessException("El concepto es requerido.");
		}

		if (!ValidacionUtil.esCadenaVacia(concepto.getDescripcion())) {
			throw new BusinessException("La descripcion es requerida.");
		}

		if (!ValidacionUtil.esCadenaVacia(concepto.getNivel1())) {
			throw new BusinessException("El nivel 1 es requerido.");
		}

		if (!ValidacionUtil.esCadenaVacia(concepto.getNivel2())) {
			throw new BusinessException("E nivel 2 es requerido.");
		}

		if (!ValidacionUtil.esCadenaVacia(concepto.getNivel3())) {
			throw new BusinessException("El nivel 3 es requerido.");
		}

		if (!ValidacionUtil.esCadenaVacia(concepto.getNivel4())) {
			throw new BusinessException("El nivel 4 es requerido.");
		}

		if (!ValidacionUtil.esCadenaVacia(concepto.getNivel5())) {
			throw new BusinessException("El nivel 5 es requerido.");
		}

		if (!ValidacionUtil.esCadenaVacia(concepto.getNivel6())) {
			throw new BusinessException("El nivel 6 es requerido.");
		}

		if (!ValidacionUtil.esNumeroPositivo(concepto.getCobroDerecho())) {
			throw new BusinessException("El cobro de derecho es requerido.");
		}

		if (!ValidacionUtil.esNumeroPositivo(concepto.getEjercicioFiscal())) {
			throw new BusinessException("El ejercicio fiscal es requerido.");
		}

		if (!ValidacionUtil.esNumeroPositivo(concepto.getTipoNivel())) {
			throw new BusinessException("El tipo de nivel es requerido.");
		}
	}
}
