package cajas.config.direcciones;


import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;

import org.apache.commons.lang3.StringUtils;

import cajas.exception.BusinessException;
import cajas.persistence.entity.DireccionEntity;
import cajas.persistence.query.DireccionQuery;


@Stateless
public class DireccionEJB {

	
	    @PersistenceContext(unitName = "sitDS")
	    private EntityManager entityManager;
	    private DireccionQuery direccionQuery;
	    private final DireccionFactory direccionFactory = new DireccionFactory();
	    
	    
	    @PostConstruct
	    private void init() {
	        direccionQuery = new DireccionQuery(entityManager);
	    }

	    public Integer crearDireccion(Direccion direccion) {

	        if (direccion == null) {
	            throw new NullPointerException("No se puede guardar un domicilio vacio");

	        }


	        DireccionEntity direccionEntity = direccionFactory.dtoAEntidad(direccion);
	        direccionEntity = direccionQuery.crearDireccion(direccionEntity);
	        return direccionEntity.getIdDireccion();
	    }

	    public Direccion obtenerDireccion(Integer idDireccion) {
	        if (idDireccion == null || idDireccion <= 0) {
	            throw new BusinessException("No se puede obtener un ID nulo o menor que cero.");
	        }
	        
	        DireccionEntity direccionEntity = direccionQuery.obtenerDireccion(idDireccion);
	        Direccion direccion = direccionFactory.entidadADto(direccionEntity);
	        return direccion;
	    }

	    public List<Direccion> buscarDireccion(String criterio) {
	        if (StringUtils.isBlank(criterio)) {
	            throw new BusinessException("No se puede realizar búsqueda.");
	        }
	        
	        List<DireccionEntity> direccionEntities = direccionQuery.buscarDireccion(criterio);
	        List<Direccion> direccionDtos = direccionFactory.entidadesADtos(direccionEntities);
	        return direccionDtos;
	    }
	    
	    
	    public void editarDireccion(Direccion direccion) {
	    	if (direccion == null) {
	             throw new NullPointerException("Seleccione un domicilio");
	    	 }

	    	 DireccionEntity direccionEntity = direccionQuery.obtenerDireccion(direccion.getIdDireccion());
	         direccionEntity = direccionFactory.dtoAEntidad(direccion, direccionEntity);
	         direccionQuery.editarDireccion(direccionEntity);
	    }

	    public void eliminarDireccion(Integer idDireccion) {
	    	direccionQuery.eliminarDireccion(idDireccion);
	    }

	    

	    public List<Direccion> obtenerDireccion() {
			List<DireccionEntity> direccionEntities = direccionQuery.obtenerDireccion();
			List<Direccion> direccionaddtos = direccionFactory.entidadesADtos(direccionEntities);
			return direccionaddtos;
	    }

		
}