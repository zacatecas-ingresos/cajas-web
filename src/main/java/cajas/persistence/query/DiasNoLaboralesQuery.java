/**
 * 
 */
package cajas.persistence.query;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.joda.time.DateTime;

import cajas.persistence.entity.DiasNoLaboralesEntity;

/**
 * @author Leila
 *
 */
public class DiasNoLaboralesQuery {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	public int obtenerNumeroDiasNoLaborales(DateTime fecha) {
		int numeroDias = 0;
		if (fecha.getDayOfWeek() == 7) {
			numeroDias = 1;
		} else if (fecha.getDayOfWeek() == 6) {
			numeroDias = 2;
		}

		boolean esDiaInhabil = false;
		
		do {

			DateTime temp = fecha.plusDays(numeroDias);

			try {
				TypedQuery<DiasNoLaboralesEntity> query = entityManager
						.createQuery("SELECT d FROM DiasNoLaboralesEntity d WHERE d.dia_no_laboral = :dia",
								DiasNoLaboralesEntity.class)
						.setParameter("dia", temp.toDate());
				query.getSingleResult();
				esDiaInhabil = true;
				numeroDias++;
			} catch (NoResultException ex) {
				esDiaInhabil = false;
			}
		} while (esDiaInhabil);

		return numeroDias;
	}

}
