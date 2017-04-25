/*
 * ContribuyenteFactory.java
 * 
 */
package cajas.contribuyentes;

import cajas.persistence.entity.ContribuyenteEntity;

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
        return entidad;
    }
    
    public Contribuyente entityADto(ContribuyenteEntity entidad) {
        Contribuyente dto = new Contribuyente();
        dto.setId(entidad.getIdContribuyente());
        dto.setRfc(entidad.getRfc());
        
        return dto;
    }

}
