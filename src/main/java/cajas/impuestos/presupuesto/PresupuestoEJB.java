/**
 * 
 */
package cajas.impuestos.presupuesto;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * @author Leila Schiaffini Ehuan
 *
 * @Since 26/04/2017 14:33:38
 */
@Stateless
public class PresupuestoEJB {
	@Inject
	private PresupuestoService presupuestoService;

	/**
	 * Generación de presupuesto estatal, nómina, hospedaje
	 * 
	 * @param calculos
	 *            id´s de los conceptos del presupuesto
	 */
	protected Integer generarPresupuestoEstatal(List<Integer> calculos) {
		return presupuestoService.generarPresupuestoEstatal(calculos);
	}

}
