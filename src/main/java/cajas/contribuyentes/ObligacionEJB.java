package cajas.contribuyentes;
/**
 * @author saul
 *
 */

	

	import javax.annotation.PostConstruct;
	import javax.ejb.Stateless;
	import javax.persistence.EntityManager;
	
	import javax.persistence.PersistenceContext;
	

import cajas.persistence.entity.ObligacionEntity;
import cajas.persistence.query.ObligacionQuery;
//import cajas.persistence.query.ObtenerObligacionQuery;
	
	
	@Stateless
	public class ObligacionEJB {

		@PersistenceContext(name = "sitDS")
		private EntityManager entityManager;
		private ObligacionQuery obligacionQuery;
		
		@PostConstruct
	
		public void init(){
	
			obligacionQuery = new ObligacionQuery(entityManager);
		
			
		}
		
	
		public Obligacion obtenerObligacionPorIdObligacion(Integer idObligacion) {
			Obligacion obligacion = new Obligacion();			
			    ObligacionEntity obligacionesEntity = obligacionQuery.obtenerObligacion(idObligacion);				
			return obligacion;
		}

	}


