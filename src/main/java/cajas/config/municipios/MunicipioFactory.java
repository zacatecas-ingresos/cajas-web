package cajas.config.municipios;

import java.util.ArrayList;
import java.util.List;


import cajas.persistence.entity.MunicipioEntity;

public class MunicipioFactory {

    
    // entityToDto
    // Entidad a DTO
    public MunicipioEntity dtoAEntidad(Municipio dto) {
        return dtoAEntidad(dto, null);
    }

    public MunicipioEntity dtoAEntidad(Municipio dto, MunicipioEntity entidad) {

        if(entidad == null) {
            entidad = new MunicipioEntity();
            entidad.setIdMunicipio(dto.getIdMunicipio());
        }

        entidad.setAbreviacionMunicipio(dto.getAbreviacionMunicipio());
        entidad.setMunicipio(dto.getMunicipio());

        return entidad;
    }
    
    // DTO a entidad
    public Municipio entidadADto(MunicipioEntity entidad) {
        Municipio dto = new Municipio();
        
        // Set
        // carro.color = "azul";
        // carro.setColor("azul");
        
        // Get
        // colorCarro = carro.color;
        // colorCarro = carro.getColor();
        
        dto.setIdMunicipio(entidad.getIdMunicipio());
        dto.setAbreviacionMunicipio(entidad.getAbreviacionMunicipio());
        dto.setMunicipio(entidad.getMunicipio());
        
        return dto;
    }
    
    public List<Municipio> entidadesADtos(List<MunicipioEntity> entidades) {
        List<Municipio> dtos = new ArrayList<>();
        
        for(MunicipioEntity entidad : entidades) {
            Municipio dto = entidadADto(entidad);
            dtos.add(dto);
        }

        return dtos;
    }
}
