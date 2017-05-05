/*
 * SituacionContribuyenteFactory.java
 * Creado el 04/May/2017 4:03:49 PM
 * 
 */
package cajas.config.situacioncontribuyente;
import java.util.ArrayList;
import java.util.List;

import cajas.config.situacioncontribuyente.SituacionContribuyente;
import cajas.persistence.entity.SituacionContribuyenteEntity;
/**
 *
 * @author Alejandro Perez
 */
public class SituacionContribuyenteFactory {
	 // entityToDto
    // Entidad a DTO
	   
	 public static  SituacionContribuyenteEntity dtoAEntidad(SituacionContribuyente dto) {
	        return dtoAEntidad(dto);
	    }

	    public SituacionContribuyenteEntity dtoAEntidad(SituacionContribuyenteEntity situacionContribuyenteEntity, SituacionContribuyenteEntity entidad) {

	        if(entidad == null) {
	            entidad = new SituacionContribuyenteEntity();
	            entidad.setIdSituacionContribuyente(situacionContribuyenteEntity.getIdSituacionContribuyente());
	        }

	        entidad.setSituacionContribuyente(situacionContribuyenteEntity.getEstatusSituacionContribuyente());
	        entidad.setEstatusSituacionContribuyente(situacionContribuyenteEntity.getEstatusSituacionContribuyente());

	        return entidad;
	    }
	    
	 // DTO a entidad
	    public SituacionContribuyente entidadADto(SituacionContribuyenteEntity entidad) {
	    	SituacionContribuyente dto = new SituacionContribuyente();

	        dto.setIdSituacionContribuyente(entidad.getIdSituacionContribuyente());
	        dto.setSituacionContribuyente(entidad.getEstatusSituacionContribuyente());
	        dto.setEstatusSituacionContribuyente(entidad.getEstatusSituacionContribuyente());
	        
	        return dto;
	    }
	    
	    public List<SituacionContribuyente> entidadesADtos(List<SituacionContribuyenteEntity> entidades) {
	        List<SituacionContribuyente> dtos = new ArrayList<>();
	        
	        for (SituacionContribuyenteEntity entidad : entidades) {
	        	SituacionContribuyente dto = entidadADto(entidad);
	            dtos.add(dto);
	        }

	        return dtos;
	    }






}
