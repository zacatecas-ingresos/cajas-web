/*
 * ContribuyenteFactory.java
 * 
 */
package cajas.contribuyentes;

import cajas.persistence.entity.ContribuyenteEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Freddy Barrera (freddy.barrera.moo@gmail.com)
 */
public class ContribuyenteFactory {

    public ContribuyenteEntity dtoAEntity(Contribuyente dto) {
        return dtoAEntity(dto, null);
    }

    public ContribuyenteEntity dtoAEntity(Contribuyente dto, ContribuyenteEntity entidad) {
        if (entidad == null) {
            entidad = new ContribuyenteEntity();
            entidad.setIdContribuyente(dto.getId());
        }
        
        entidad.setRfc(dto.getRfc());
        entidad.setCurp(dto.getCurp());
        entidad.setTipoPersona(dto.getTipoPersona());
        entidad.setNombreCompuesto(dto.getNombreCompuesto());
        entidad.setNombre(dto.getNombre());
        entidad.setPrimerApellido(dto.getPrimerApellido());
        entidad.setSegundoApellido(dto.getSegundoApellido());
        entidad.setSexo(dto.getSexo());
        entidad.setFechaNacimiento(dto.getFechaNacimiento());
        entidad.setNacionalidad(dto.getNacionalidad());
        entidad.setRazonSocial(dto.getRazonSocial());

        return entidad;
    }
    
    public Contribuyente entityADto(ContribuyenteEntity entidad) {
        Contribuyente dto = new Contribuyente();
        dto.setId(entidad.getIdContribuyente());
        dto.setRfc(entidad.getRfc());
        dto.setCurp(entidad.getCurp());
        dto.setTipoPersona(entidad.getTipoPersona());
        dto.setNombreCompuesto(entidad.getNombreCompuesto());
        dto.setNombre(entidad.getNombre());
        dto.setPrimerApellido(entidad.getPrimerApellido());
        dto.setSegundoApellido(entidad.getSegundoApellido());
        dto.setSexo(entidad.getSexo());
        dto.setFechaNacimiento(entidad.getFechaNacimiento());
        dto.setNacionalidad(entidad.getNacionalidad());
        dto.setRazonSocial(entidad.getRazonSocial());

        return dto;
    }

    public List<Contribuyente> entitiesADtos(List<ContribuyenteEntity> entities) {
        List<Contribuyente> dtos = new ArrayList<>();
        
        for (ContribuyenteEntity entity : entities) {
            Contribuyente dto = entityADto(entity);
            dtos.add(dto);
        }
        
        return Collections.unmodifiableList(dtos);
    }

}
