package cajas.impuestos.declaracion.estatal;

import javax.inject.Inject;

import java.math.BigDecimal;

import javax.ejb.Stateless;

@Stateless
public class ImpuestoConcursoEJB {

	@Inject
	ImporteImpuestoService impuestoSorteoService;

	public BigDecimal impuestoConcurso(ImpuestoConcurso impuestoConcurso) {

		BigDecimal baseGravable = BigDecimal.ZERO;
		if (impuestoConcurso.getTipoIngreso().equals(TipoTasa.TASA_ENAJENANTE)) {
			baseGravable = impuestoConcurso.getBaseGravableEnajenacion();
		} else if (impuestoConcurso.getTipoIngreso().equals(TipoTasa.TASA_ENAJENANTE)) {
			baseGravable = impuestoConcurso.getBaseGravableEfectivo().add(impuestoConcurso.getBaseGravableEspecie());
		}
		return impuestoSorteoService.impuestoConcursos(baseGravable, impuestoConcurso.getaFiscal(),impuestoConcurso.getIdPeriodo(), impuestoConcurso.getTipoIngreso());
	}
}