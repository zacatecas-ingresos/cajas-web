package cajas.catalogos.tipovehiculo;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import cajas.exception.BusinessException;
import cajas.persistence.entity.TipoVehiculoEntity;

@Stateless
public class TipoVehiculoEJB {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	public void crearTipoVehiculo(TipoVehiculo tipoVehiculo) {
		try {
			TipoVehiculoEntity tipoVehiculoEntity = new TipoVehiculoEntity();
			tipoVehiculoEntity.setNombre(tipoVehiculo.getNombre());
			tipoVehiculoEntity.setAbreviatura(tipoVehiculo.getAbreviatura());
			tipoVehiculoEntity.setEstatus(tipoVehiculo.getEstatus());
			entityManager.persist(tipoVehiculoEntity);
		} catch (PersistenceException ex) {
			ex.printStackTrace();
			throw new BusinessException("Ocurrio un problema al registrar al dar de alta la Marca de Vehiculo.");
		}
	}

	public TipoVehiculo obtenerTipoVehiculoPorId(Integer idTipoVehiculo) {
		try {
			TipoVehiculoEntity tipoVehiculoEntity = entityManager.find(TipoVehiculoEntity.class, idTipoVehiculo);
			TipoVehiculo tipoVehiculo = new TipoVehiculo(tipoVehiculoEntity);
			return tipoVehiculo;
		} catch (NoResultException ex) {
			throw new BusinessException("La Marca de Vehiculo no existe.");
		}
	}

	public void actualizarTipoVehiculo(TipoVehiculo tipoVehiculo) {
		try {
			TipoVehiculoEntity tipoVehiculoEntity = entityManager.find(TipoVehiculoEntity.class, tipoVehiculo.getIdTipoVehiculo());
			tipoVehiculoEntity.setNombre(tipoVehiculo.getNombre());
			tipoVehiculoEntity.setAbreviatura(tipoVehiculo.getAbreviatura());
			tipoVehiculoEntity.setEstatus(tipoVehiculo.getEstatus());
			entityManager.merge(tipoVehiculoEntity);
		} catch (NoResultException ex) {
			throw new BusinessException("Ocurrio un problema al actualizar la Marca de Vehiculo.");
		}
	}
	

	public void eliminarTipoVehiculo(Integer idTipoVehiculo) {
		try {
			TipoVehiculoEntity tipoVehiculoEntity = entityManager.find(TipoVehiculoEntity.class, idTipoVehiculo);
			entityManager.remove(tipoVehiculoEntity);
		} catch (NoResultException ex) {
			throw new BusinessException("Ocurrio un problema al eliminar la Marca de Vehiculo.");
		}
	}

	public List<TipoVehiculo> obtenerTiposVehiculoFiltro(String parametro) {
		List<TipoVehiculo> tipoVehiculoList = new ArrayList<>();
		try {
			TipoVehiculoPorNombreQuery tipoVehiculoPorNombreQuery = new TipoVehiculoPorNombreQuery(entityManager);
			List<TipoVehiculoEntity> tipoVehiculoEntityList = null;
			tipoVehiculoEntityList = tipoVehiculoPorNombreQuery.consultar(parametro);
			for(TipoVehiculoEntity tipoVehiculoEntity : tipoVehiculoEntityList) {
				tipoVehiculoList.add(new TipoVehiculo(tipoVehiculoEntity));
			}
		} catch (NoResultException ex) {
		}
		return tipoVehiculoList;
	}

}
