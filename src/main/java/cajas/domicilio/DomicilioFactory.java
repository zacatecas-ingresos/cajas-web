package cajas.domicilio;

import java.util.ArrayList;
import java.util.List;


import cajas.persistence.entity.DomicilioEntity;

public class DomicilioFactory {

	// entityToDto
    // Entidad a DTO
    public DomicilioEntity dtoAEntidad(Domicilio dto) {
        return dtoAEntidad(dto, null);
    }

    public DomicilioEntity dtoAEntidad(Domicilio dto, DomicilioEntity entidad) {

    	if(entidad == null) {
            entidad = new DomicilioEntity();
            entidad.setIdDireccion(dto.getIdDomicilio());}
		return entidad;
    	}
			
        
        
    
    // DTO a entidad    
    public Domicilio entidadADto(DomicilioEntity entidad) {
    	Domicilio dto = new Domicilio();
		return dto;
        
   
    }
    
    public List<Domicilio> entidadesADtos(List<DomicilioEntity> entidades) {
        List<Domicilio> dtos = new ArrayList<>();
        
        for(DomicilioEntity entidad : entidades) {
        	Domicilio dto = entidadADto(entidad);
            dtos.add(dto);
        }

        return dtos;
    }
}
