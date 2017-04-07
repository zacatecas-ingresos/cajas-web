package cajas.contribuyentes;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.exception.BusinessException;
import cajas.persistence.entity.EstadoEntity;
import cajas.persistence.query.EstadoQuery;

@Stateless
public class EstadoEJB {

    @PersistenceContext(unitName = "sitDS")
    private EntityManager entityManager;
    private EstadoQuery estadoQuery = new EstadoQuery(entityManager);
    private EstadoFactory estadoFactory = new EstadoFactory();
    
    public Integer crearEstado(Estado estado) {

        if(estado == null) {
            throw new NullPointerException("No se puede guardar en el almacen de dato un valor vacio");
        }

        if(estado.getEstado().isEmpty()) {
            throw new BusinessException("No se puede guardar en el almacen de dato un estado en blanco");
        }

        EstadoEntity estadoEntity = estadoQuery.crearEstado(estadoFactory.dtoAEntidad(estado));
        return estadoEntity.getIdEstado();
    }

    public Estado obtenerEstado(Integer idEstado) {
        // Implementar reglas de negocio
        
        EstadoEntity estadoEntity = estadoQuery.obtenerEstado(idEstado);
        Estado estado = estadoFactory.entidadADto(estadoEntity);
        
        return estado;
    }
    
    public void editarEstado(Estado estado) {
        // Implementar reglas de negocio
        
        EstadoEntity estadoEntity = estadoQuery.obtenerEstado(estado.getIdEstado());
        estadoEntity = estadoFactory.dtoAEntidad(estado, estadoEntity);
        estadoQuery.editarEstado(estadoEntity);
    }
    
    
    public void eliminarEstado(Integer idEstado) {
        estadoQuery.eliminarEstado(idEstado);
    }    
    
    
    //buscar estado por nombre 
    
       public List<Estado> buscarEstado(String estado) {
        List<EstadoEntity>estadoEntities  = estadoQuery.buscarEstado(estado);
    List<Estado> estadodtos =    estadoFactory.entidadesADtos(estadoEntities);
    return estadodtos;
    
    
    
    }
    
}
