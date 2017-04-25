package cajas.catalogos.estados;

import java.util.List;

import javax.annotation.PostConstruct;
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
    private EstadoQuery estadoQuery;
    private final EstadoFactory estadoFactory = new EstadoFactory();

    @PostConstruct
    private void init() {
        estadoQuery = new EstadoQuery(entityManager);
    }
    
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

    public List<Estado> obtenerTodosEstados() {
        List<EstadoEntity> estadosEntities = estadoQuery.obtenerTodosEstados();
        return estadoFactory.entidadesADtos(estadosEntities);
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
    
    public List<Estado> buscarEstado(String estado) {
        List<EstadoEntity>estadoEntities = estadoQuery.buscarEstado(estado);
        List<Estado> estadosDtos = estadoFactory.entidadesADtos(estadoEntities);
        return estadosDtos;
    }
    
}
