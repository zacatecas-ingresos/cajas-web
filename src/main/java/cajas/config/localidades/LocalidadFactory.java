package cajas.config.localidades;

import java.util.ArrayList;
import java.util.List;

import cajas.persistence.entity.LocalidadEntity;


public class LocalidadFactory {

 // entityToDto
    // Entidad a DTO
    public LocalidadEntity dtoAEntidad(Localidad dto) {
        return dtoAEntidad(dto, null);
    }

    public LocalidadEntity dtoAEntidad(Localidad dto, LocalidadEntity entidad) {

        if(entidad == null) {
            entidad = new LocalidadEntity();
            entidad.setIdLocalidad(dto.getIdLocalidad());
                    }
        
        entidad.setAbreviacionLocalidad(dto.getAbreviacionLocalidad());
        entidad.setLocalidad(dto.getLocalidad());
        
        return entidad;
    }
    
    // DTO a entidad    
    public Localidad entidadADto(LocalidadEntity entidad) {
        Localidad dto = new Localidad();
                
        
        
    dto.setIdLocalidad(entidad.getIdLocalidad());
    dto.setAbreviacionLocalidad(entidad.getAbreviacionLocalidad());
    dto.setLocalidad(entidad.getLocalidad());

    return dto;
    }
    
    public List<Localidad> entidadesADtos(List<LocalidadEntity> entidades) {
        List<Localidad> dtos = new ArrayList<>();
        
        for(LocalidadEntity entidad : entidades) {
            Localidad dto = entidadADto(entidad);
            dtos.add(dto);
        }

        return dtos;
    }
    
}
