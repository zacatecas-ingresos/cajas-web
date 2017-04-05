package cajas.catalogos.marcavehiculo;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import cajas.exception.BusinessException;
import cajas.persistence.entity.MarcaVehiculoEntity;

@Stateless
public class MarcaVehiculoEJB {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	public void crearMarcaVehiculo(MarcaVehiculo marcaVehiculo) {
		try {
			MarcaVehiculoEntity marcaVehiculoEntity = new MarcaVehiculoEntity();
			marcaVehiculoEntity.setNombre(marcaVehiculo.getNombre());
			marcaVehiculoEntity.setAbreviatura(marcaVehiculo.getAbreviatura());
			marcaVehiculoEntity.setEstatus(marcaVehiculo.getEstatus());
			entityManager.persist(marcaVehiculoEntity);
		} catch (PersistenceException ex) {
			ex.printStackTrace();
			throw new BusinessException("Ocurrio un problema al registrar al dar de alta la Marca de Vehiculo.");
		}
	}

	public MarcaVehiculo obtenerMarcaVehiculoPorId(Integer idMarcaVehiculo) {
		try {
			MarcaVehiculoEntity marcaVehiculoEntity = entityManager.find(MarcaVehiculoEntity.class, idMarcaVehiculo);
			MarcaVehiculo marcaVehiculo = new MarcaVehiculo(marcaVehiculoEntity);
			return marcaVehiculo;
		} catch (NoResultException ex) {
			throw new BusinessException("El usuario no existe.");
		}
	}

	public void actualizarMarcaVehiculo(MarcaVehiculo marcaVehiculo) {
		try {
			MarcaVehiculoEntity marcaVehiculoEntity = entityManager.find(MarcaVehiculoEntity.class, marcaVehiculo.getIdMarcaVehiculo());
			marcaVehiculoEntity.setNombre(marcaVehiculo.getNombre());
			marcaVehiculoEntity.setAbreviatura(marcaVehiculo.getAbreviatura());
			marcaVehiculoEntity.setEstatus(marcaVehiculo.getEstatus());
			entityManager.merge(marcaVehiculoEntity);
		} catch (NoResultException ex) {
			throw new BusinessException("Ocurrio un problema al actualizar la Marca de Vehiculo.");
		}
	}

	public List<MarcaVehiculo> obtenerMarcasVehiculoFiltro(String parametroBusqueda) {
		List<MarcaVehiculo> marcaVehiculoList = new ArrayList<>();
		try {
			MarcaVehiculoPorNombreQuery marcaVehiculoPorNombreQuery = new MarcaVehiculoPorNombreQuery(entityManager);
			List<MarcaVehiculoEntity> marcaVehiculoEntityList = null;
			marcaVehiculoEntityList = marcaVehiculoPorNombreQuery.consultar(parametroBusqueda);
			for(MarcaVehiculoEntity marcaVehiculoEntity : marcaVehiculoEntityList) {
				marcaVehiculoList.add(new MarcaVehiculo(marcaVehiculoEntity));
			}
		} catch (NoResultException ex) {
		}
		return marcaVehiculoList;
	}
	

	public void eliminarMarcaVehiculo(Integer idMarcaVehiculo) {
		try {
			MarcaVehiculoEntity marcaVehiculoEntity = entityManager.find(MarcaVehiculoEntity.class, idMarcaVehiculo);
			entityManager.remove(marcaVehiculoEntity);
		} catch (NoResultException ex) {
			throw new BusinessException("Ocurrio un problema al eliminar la Marca de Vehiculo.");
		}
	}

}