package cajas.impuestos.declaracion.estatal;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class ImpuestosEstatalesEJB {
	@Inject
	private CalculoEstatalService calculoEstatalService;

	public ImpuestoEstatal calcularImpuesto(DeclaracionEstatal declaracion) {
		return calculoEstatalService.calcularImpuesto(declaracion);
	}
}
