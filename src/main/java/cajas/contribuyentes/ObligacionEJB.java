package cajas.contribuyentes;
/**
 * @author saul
 *
 */

	

	import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
	
import javax.persistence.PersistenceContext;


import cajas.persistence.entity.ObligacionEntity;
import cajas.persistence.query.ObligacionQuery;

	
	@Stateless
	public class ObligacionEJB {
		@PersistenceContext(name = "sitDS")
		private EntityManager entityManager;
		private ObligacionQuery obligacionQuery;
		
	    private ObligacionFactory obligacionFactory = new ObligacionFactory();
		
		 @PostConstruct	
		public void init(){
		obligacionQuery = new ObligacionQuery(entityManager);		
			
		}
		
		public Obligacion obtenerObligacionPorIdObligacion(Integer idObligacion) {
			Obligacion obligacion = new Obligacion();			
			    ///ObligacionEntity obligacionesEntity = obligacionQuery.obtenerObligacion(idObligacion);				
			return obligacion;
		}
		
		 public List<Obligacion> obtenerTodaslasObligaciones() {
			 
		        List<ObligacionEntity> obligacionesEntities = obligacionQuery.obtenerTodaslasObligaciones();		        		       
		        
		        return obligacionFactory.obligacionesADtos(obligacionesEntities);
		        
		    }

	
	}


