package cajas.catalogos.clasevehiculo;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import cajas.exception.BusinessException;
import cajas.persistence.entity.ClaseVehiculoEntity;

@Stateless
public class ClaseVehiculoEJB {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	public void crearClaseVehiculo(ClaseVehiculo1 claseVehiculo) {
		try {
			ClaseVehiculoEntity claseVehiculoEntity = new ClaseVehiculoEntity();
			claseVehiculoEntity.setNombre(claseVehiculo.getNombre());
			claseVehiculoEntity.setAbreviacion(claseVehiculo.getAbreviatura());
			claseVehiculoEntity.setEstatus(claseVehiculo.getEstatus());
			entityManager.persist(claseVehiculoEntity);
		} catch (PersistenceException ex) {
			ex.printStackTrace();
			throw new BusinessException("Ocurrio un problema al registrar al dar de alta la Marca de Vehiculo.");
		}
	}

	public ClaseVehiculo1 obtenerClaseVehiculoPorId(Integer idClaseVehiculo) {
		try {
			ClaseVehiculoEntity claseVehiculoEntity = entityManager.find(ClaseVehiculoEntity.class, idClaseVehiculo);
			ClaseVehiculo1 claseVehiculo = new ClaseVehiculo1(claseVehiculoEntity);
			return claseVehiculo;
		} catch (NoResultException ex) {
			throw new BusinessException("La Marca de Vehiculo no existe.");
		}
	}

	public void actualizarClaseVehiculo(ClaseVehiculo1 claseVehiculo) {
		try {
			ClaseVehiculoEntity claseVehiculoEntity = entityManager.find(ClaseVehiculoEntity.class, claseVehiculo.getIdClaseVehiculo());
			claseVehiculoEntity.setNombre(claseVehiculo.getNombre());
			claseVehiculoEntity.setAbreviacion(claseVehiculo.getAbreviatura());
			claseVehiculoEntity.setEstatus(claseVehiculo.getEstatus());
			entityManager.merge(claseVehiculoEntity);
		} catch (NoResultException ex) {
			throw new BusinessException("Ocurrio un problema al actualizar la Marca de Vehiculo.");
		}
	}

	public void eliminarClaseVehiculo(Integer idClaseVehiculo) {
		try {
			ClaseVehiculoEntity claseVehiculoEntity = entityManager.find(ClaseVehiculoEntity.class, idClaseVehiculo);
			entityManager.remove(claseVehiculoEntity);
		} catch (NoResultException ex) {
			throw new BusinessException("Ocurrio un problema al eliminar la Marca de Vehiculo.");
		}
	}

	public List<ClaseVehiculo1> obtenerClasesVehiculoFiltro(String parametro) {
		List<ClaseVehiculo1> claseVehiculoList = new ArrayList<>();
		try {
			ClaseVehiculoPorNombreQuery claseVehiculoPorNombreQuery = new ClaseVehiculoPorNombreQuery(entityManager);
			List<ClaseVehiculoEntity> claseVehiculoEntityList = null;
			claseVehiculoEntityList = claseVehiculoPorNombreQuery.consultar(parametro);
			for(ClaseVehiculoEntity claseVehiculoEntity : claseVehiculoEntityList) {
				claseVehiculoList.add(new ClaseVehiculo1(claseVehiculoEntity));
			}
		} catch (NoResultException ex) {
		}
		return claseVehiculoList;
	}
}