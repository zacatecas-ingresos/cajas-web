package cajas.contribuyentes;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.exception.BusinessException;
import cajas.persistence.entity.LocalidadEntity;
import cajas.persistence.query.LocalidadQuery;

@Stateless
public class LocalidadEJB {

    @PersistenceContext(unitName = "sitDS")
    private EntityManager entityManager;
    private LocalidadQuery localidadQuery = new LocalidadQuery(entityManager);
    private LocalidadFactory localidadFactory = new LocalidadFactory();
    
    
        public Integer crearLocalidad(Localidad localidad){
            
            if(localidad == null) {
                throw new NullPointerException("No se puede guardar en el almacen de dato un valor vacio");
            
            }
            
            if(localidad.getLocalidad().isEmpty()) {
                throw new BusinessException("No se puede guardar en el almacen de dato un estado en blanco");
                
            }
            
            LocalidadEntity localidadEntity = localidadQuery.crearLocalidad(localidadFactory.dtoAEntidad(localidad));
            return localidadEntity.getIdLocalidad();
        }

        public Localidad obtenerLocalidad(Integer idLocalidad) {
            // Implementar reglas de negocio
            
            LocalidadEntity localidadEntity = localidadQuery.obtenerLocalidad(idLocalidad);
            Localidad localidad = localidadFactory.entidadADto(localidadEntity);
            
            return localidad;
        }
        
        public void editarLocalidad(Localidad localidad) {
            // Implementar reglas de negocio
            
            LocalidadEntity localidadEntity = localidadQuery.obtenerLocalidad(localidad.getIdLocalidad());
            localidadEntity = localidadFactory.dtoAEntidad(localidad, localidadEntity);
            localidadQuery.editarLocalidad(localidadEntity);
        }
        
        
        public void eliminarLocalidad(Integer idLocalidad) {
            localidadQuery.eliminarLocalidad(idLocalidad);
            
        }    
        
        
        //buscar municipio por nombre 
        
           public List<Localidad> buscarLocalidad(String localidad){
               List<LocalidadEntity>localidadEntities = localidadQuery.buscarLocalidad(localidad);
               List<Localidad> localidaddtos =    localidadFactory.entidadesADtos(localidadEntities);
               return localidaddtos;
               
                       
           }
           
        
          
    
}
