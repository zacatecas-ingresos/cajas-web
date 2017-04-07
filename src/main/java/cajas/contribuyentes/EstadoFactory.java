package cajas.contribuyentes;

import java.util.ArrayList;
import java.util.List;

import cajas.persistence.entity.EstadoEntity;

public class EstadoFactory {

    // entityToDto
    // Entidad a DTO
    public EstadoEntity dtoAEntidad(Estado dto) {
        return dtoAEntidad(dto, null);
    }

    public EstadoEntity dtoAEntidad(Estado dto, EstadoEntity entidad) {

        if(entidad == null) {
            entidad = new EstadoEntity();
            entidad.setIdEstado(dto.getIdEstado());
        }

        entidad.setAbreviacionEstado(dto.getAbreviacionEstado());
        entidad.setEstado(dto.getEstado());

        return entidad;
    }
    
    // DTO a entidad
    public Estado entidadADto(EstadoEntity entidad) {
        Estado dto = new Estado();
        
        // Set
        // carro.color = "azul";
        // carro.setColor("azul");
        
        // Get
        // colorCarro = carro.color;
        // colorCarro = carro.getColor();
        
        dto.setIdEstado(entidad.getIdEstado());
        dto.setAbreviacionEstado(entidad.getAbreviacionEstado());
        dto.setEstado(entidad.getEstado());
        
        return dto;
    }
    
    public List<Estado> entidadesADtos(List<EstadoEntity> entidades) {
        List<Estado> dtos = new ArrayList<>();
        
        for(EstadoEntity entidad : entidades) {
            Estado dto = entidadADto(entidad);
            dtos.add(dto);
        }

        return dtos;
    }
}
