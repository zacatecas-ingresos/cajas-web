/*
 * ContribuyenteFactory.java
 * 
 */
package cajas.contribuyentes;

import cajas.persistence.entity.ContribuyenteEntity;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase ayuda en la conversión de una entidad a un DTO y viceversa.
 * 
 * @author Freddy Barrera (freddy.barrera.moo@gmail.com)
 */
public class ContribuyenteFactory {

    /**
     * Este convierte un DTO a una entidad.
     * @param dto el DTO a convertir.
     * @return una entidad.
     */
    public ContribuyenteEntity dtoAEntity(Contribuyente dto) {
        return dtoAEntity(dto, null);
    }

    /**
     * Este convierte un DTO a una entidad.
     * 
     * @param dto el DTO a convertir.
     * @param entidad la entidad que se tomará como base para la conversión.
     * @return la entidad con la información actulizada del DTO.
     */
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

    /**
     * Permite convertir una entidad a una DTO.
     * @param entidad la entidad que será convertida.
     * @return el DTO ya con la información que estaba en la entidad.
     */
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

    /**
     * Permite convertir una lista de entidades a una lista de DTOs.
     * @param entidades las entidades que serán convertidas.
     * @return la lista de DTOs que se convirtio.
     */
    public List<Contribuyente> entitiesADtos(List<ContribuyenteEntity> entidades) {
        List<Contribuyente> dtos = new ArrayList<>();
        
        for (ContribuyenteEntity entity : entidades) {
            Contribuyente dto = entityADto(entity);
            dtos.add(dto);
        }
        
        return dtos;
    }

}
