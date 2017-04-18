package cajas.contribuyentes;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.exception.BusinessException;
import cajas.persistence.entity.MunicipioEntity;
import cajas.persistence.query.MunicipioQuery;

@Stateless
public class MunicipioEJB {
    
    @PersistenceContext(unitName = "sitDS")
    private EntityManager entityManager;
    private MunicipioQuery municipioQuery = new MunicipioQuery(entityManager);
    private MunicipioFactory municipioFactory = new MunicipioFactory();
    
    
        public Integer crearMunicipio(Municipio municipio){
            
            if(municipio == null) {
                throw new NullPointerException("No se puede guardar en el almacen de dato un valor vacio");
            
            }
            
            if(municipio.getMunicipio().isEmpty()) {
                throw new BusinessException("No se puede guardar en el almacen de dato un estado en blanco");
                
            }
            
            MunicipioEntity municipioEntity = municipioQuery.crearMunicipio(municipioFactory.dtoAEntidad(municipio));
            return municipioEntity.getIdMunicipio();
        }

        public Municipio obtenerMunicipio(Integer idMunicipio) {
            // Implementar reglas de negocio
            
            MunicipioEntity municipioEntity = municipioQuery.obtenerMunicipio(idMunicipio);
            Municipio municipio = municipioFactory.entidadADto(municipioEntity);
            
            return municipio;
        }
        
        public void editarMunicipio(Municipio municipio) {
            // Implementar reglas de negocio
            
            MunicipioEntity municipioEntity = municipioQuery.obtenerMunicipio(municipio.getIdMunicipio());
            municipioEntity = municipioFactory.dtoAEntidad(municipio, municipioEntity);
            municipioQuery.editarMunicipio(municipioEntity);
        }
        
        
        public void eliminarMunicipio(Integer idMunicipio) {
            municipioQuery.eliminarMunicipio(idMunicipio);
        }    
        
        
        //buscar municipio por nombre 
        
           public List<Municipio> buscarMunicipio(String municipio) {
            List<MunicipioEntity>municipioEntities  = municipioQuery.buscarMunicipio(municipio);
        List<Municipio> municipiodtos =    municipioFactory.entidadesADtos(municipioEntities);
        return municipiodtos;
        
        }
           
    
    

}
