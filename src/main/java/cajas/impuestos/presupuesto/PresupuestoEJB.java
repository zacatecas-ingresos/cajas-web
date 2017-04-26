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

	protected Integer generarPresupuestoEstatal(List<Integer> calculos) {
		return presupuestoService.generarPresupuestoEstatal(calculos);
	}

}
