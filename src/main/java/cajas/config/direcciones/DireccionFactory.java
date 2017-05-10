package cajas.config.direcciones;

import java.util.ArrayList;
import java.util.List;


import cajas.persistence.entity.DireccionEntity;

public class DireccionFactory {

	// entityToDto
    // Entidad a DTO
    public DireccionEntity dtoAEntidad(Direccion dto) {
        return dtoAEntidad(dto, null);
    }

    public DireccionEntity dtoAEntidad(Direccion dto, DireccionEntity entidad) {

    	if(entidad == null) {
            entidad = new DireccionEntity();
            entidad.setIdDireccion(dto.getIdDireccion());}
		return entidad;
    	}
			
        
        
    
    // DTO a entidad    
    public Direccion entidadADto(DireccionEntity entidad) {
    	Direccion dto = new Direccion();
    	dto.setCalle(entidad.getCalle());
    	dto.setNumeroExterior(entidad.getNumeroExterior());
    	dto.setColonia(entidad.getColonia());
    	dto.setCodigoPostal(entidad.getCodigoPostal());
		return dto;
        
   
    }
    
    public List<Direccion> entidadesADtos(List<DireccionEntity> entidades) {
        List<Direccion> dtos = new ArrayList<>();
        
        for(DireccionEntity entidad : entidades) {
        	Direccion dto = entidadADto(entidad);
            dtos.add(dto);
        }

        return dtos;
    }
}
