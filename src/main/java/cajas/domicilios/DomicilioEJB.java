package cajas.domicilios;


import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;

import org.apache.commons.lang3.StringUtils;
import org.jboss.logging.Logger;

import cajas.exception.BusinessException;
import cajas.persistence.entity.DomicilioEntity;
import cajas.persistence.query.DomicilioQuery;


@Stateless
public class DomicilioEJB {

	
	    @PersistenceContext(unitName = "sitDS")
	    private EntityManager entityManager;
	    private DomicilioQuery domicilioQuery;
	    private final DomicilioFactory domicilioFactory = new DomicilioFactory();
	    
	    private static final Logger LOGGER = Logger.getLogger(DomicilioEJB.class.getName());
	    
	    @PostConstruct
	    private void init() {
	        domicilioQuery = new DomicilioQuery(entityManager);
	    }

	    public Integer crearDomicilio(Domicilio domicilio) {

	        if (domicilio == null) {
	            throw new NullPointerException("No se puede guardar en el almacen de dato un valor vacio");

	        }

	        if (domicilio.getDomicilio().isEmpty()) {
	            throw new BusinessException("No se puede guardar en el almacen de dato un estado en blanco");

	        }

	        DomicilioEntity domicilioEntity = domicilioFactory.dtoAEntidad(domicilio);
	        domicilioEntity = domicilioQuery.crearDomicilio(domicilioEntity);
	        return domicilioEntity.getIdDireccion();
	    }

	    public Domicilio obtenerDomicilio(Integer idDomicilio) {
	        if (idDomicilio == null || idDomicilio <= 0) {
	            throw new BusinessException("No se puede obtener un ID nulo o menor que cero.");
	        }
	        
	        DomicilioEntity domicilioEntity = domicilioQuery.obtenerDomicilio(idDomicilio);
	        Domicilio domicilio = domicilioFactory.entidadADto(domicilioEntity);
	        return domicilio;
	    }

	    public List<Domicilio> buscarDomicilio(String criterio) {
	        if (StringUtils.isBlank(criterio)) {
	            throw new BusinessException("No se puede realizar búsqueda.");
	        }
	        
	        List<DomicilioEntity> domicilioEntities = domicilioQuery.buscarDomicilio(criterio);
	        List<Domicilio> domicilioDtos = domicilioFactory.entidadesADtos(domicilioEntities);
	        return domicilioDtos;
	    }
	    
	    
	    public void editarDomicilio(Domicilio domicilio) {
	        // Implementar reglas de negocio

	    	 DomicilioEntity domicilioEntity = domicilioQuery.obtenerDomicilio(domicilio.getIdDomicilio());
	         domicilioEntity = domicilioFactory.dtoAEntidad(domicilio, domicilioEntity);
	         domicilioQuery.editarDomicilio(domicilioEntity);
	    }

	    public void eliminarDomicilio(Integer idDomicilio) {
	    	domicilioQuery.eliminarDomicilio(idDomicilio);
	    }

	    

	    public List<Domicilio> obtenerDomicilio() {
			List<DomicilioEntity> domicilioEntities = domicilioQuery.obtenerDomicilio();
			List<Domicilio> domicilioaddtos = domicilioFactory.entidadesADtos(domicilioEntities);
			return domicilioaddtos;
	    }

		
}