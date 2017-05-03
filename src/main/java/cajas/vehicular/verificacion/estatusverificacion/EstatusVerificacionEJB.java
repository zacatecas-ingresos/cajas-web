package cajas.vehicular.verificacion.estatusverificacion;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.persistence.entity.EstatusVerificacionEntity;

@Stateless
public class EstatusVerificacionEJB {
	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	public EstatusVerificacion obtenerEstatusVerificacionPorId(Integer id) {
		EstatusVerificacionEntity estatusVerificacionEntity = entityManager.find(EstatusVerificacionEntity.class, id);
		return new EstatusVerificacion(estatusVerificacionEntity);
	}

	public List<EstatusVerificacion> obtenerEstatusVerificacionLista() {
		List<EstatusVerificacionEntity> estatusVerificacionEntityList = entityManager
				.createQuery("FROM EstatusVerificacionEntity", EstatusVerificacionEntity.class).getResultList();

		List<EstatusVerificacion> estatusVerificacionList = new ArrayList<>();
		for (EstatusVerificacionEntity entity : estatusVerificacionEntityList) {
			EstatusVerificacion estatusVerificacion = new EstatusVerificacion(entity);
			estatusVerificacionList.add(estatusVerificacion);
		}
		return estatusVerificacionList;
	}
}
