package cajas.contribuyentes;

import java.util.ArrayList;
import java.util.List;


import cajas.persistence.entity.ObligacionEntity;



public class ObligacionFactory {


		
		// entityToDto
	    // Obligacion a DTO
	   
		public ObligacionEntity dtoAEntidad(Obligacion dto) {
	        return dtoAEntidad(dto, null);
	    }

	    public ObligacionEntity dtoAEntidad(Obligacion dto, ObligacionEntity obligacion) {

	        if(obligacion == null) {
	            obligacion = new ObligacionEntity();
//	            obligacion.setIdObligacion(dto.getIdObligacion());
	        }

//	        obligacion.setObligacion(dto.getObligacion());
//	        obligacion.setDiaVencimiento(dto.getDiaVencimiento());
//	        obligacion.setFechaInicio(dto.getFechaInicio());
//	        obligacion.setTipoObligacion(dto.getTipoObligacion());
//	        obligacion.setDiasTiempoProrroga(dto.getDiasTiempoProrroga());
	        return obligacion;
	    }
	    
	    // DTO a obligacion
	    public Obligacion entidadADto(ObligacionEntity obligacion) {
	        Obligacion dto = new Obligacion();

//	        obligacion.setObligacion(dto.getObligacion());
//	        obligacion.setDiaVencimiento(dto.getDiaVencimiento());
//	        obligacion.setFechaInicio(dto.getFechaInicio());
//	        obligacion.setTipoObligacion(dto.getTipoObligacion());
//	        obligacion.setDiasTiempoProrroga(dto.getDiasTiempoProrroga());
	        
	        return dto;
	    }
	    
	    public List<Obligacion> entidadesADtos(List<ObligacionEntity> obligaciones) {
	        List<Obligacion> dtos = new ArrayList<>();
	        
	        for (ObligacionEntity obligacion : obligaciones) {
	            Obligacion dto = entidadADto(obligacion);
	            dtos.add(dto);
	        }

	        return dtos;
		
	}

}
