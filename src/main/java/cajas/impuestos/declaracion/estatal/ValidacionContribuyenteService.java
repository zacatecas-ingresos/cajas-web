/**
 * 
 */
package cajas.impuestos.declaracion.estatal;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.exception.BusinessException;
import cajas.persistence.entity.ContribuyentesObligacionesEntity;
import cajas.persistence.query.ContribuyenteQuery;
import cajas.persistence.query.ContribuyentesObligacionesQuery;
import cajas.util.ValidacionUtil;

/**
 * @author Leila Schiaffini Ehuan
 *
 * @Since 27/04/2017 13:46:37
 */
public class ValidacionContribuyenteService {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	protected InfoContribuyente obtenerContribuyentePoRfc(String rfc) {
		ContribuyenteQuery contribuyenteQuery = new ContribuyenteQuery(entityManager);
		return contribuyenteQuery.obtenerContirbuyentePoRfc(rfc);
	}

	/**
	 * Consulta la información básica del contribuyente y válida que tenga la
	 * obligación activa
	 * 
	 * @param criterio
	 *            rfc, nombre o razón social
	 * @param idObligacion
	 * @author Leila Schiaffini
	 */
	protected List<Sucursal> obtenerSucursales(Integer idContribuyente, Integer idObligacion) {

		if (!ValidacionUtil.esNumeroPositivo(idContribuyente)) {
			throw new BusinessException("El contribuyente es requerido.");
		}

		if (!ValidacionUtil.esNumeroPositivo(idObligacion)) {
			throw new BusinessException("La obligación es requerida.");
		}

		ContribuyentesObligacionesQuery contribuyenteObligacionQuery = new ContribuyentesObligacionesQuery(
				entityManager);

		ContribuyentesObligacionesEntity asignacion = contribuyenteObligacionQuery.obtenerAsignacion(idObligacion,
				idContribuyente);

		if (asignacion == null) {
			throw new BusinessException("El contribuyente no tiene asignada la obligación");
		}

		if (asignacion.getEstatus() != 1) {
			throw new BusinessException("La obligación no está activa");
		}

		List<Sucursal> sucursales = new ArrayList<>();
		return sucursales;

	}

}
