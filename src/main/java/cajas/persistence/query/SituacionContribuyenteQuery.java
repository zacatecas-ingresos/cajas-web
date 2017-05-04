/*
 * SituacionContribuyenteQuery.java
 * Creado el 04/May/2017 4:07:30 PM
 * 
 */
package cajas.persistence.query;

import javax.persistence.EntityManager;

/**
 *
 * @author Alejandro Perez
 */
public class SituacionContribuyenteQuery {
    
    private final EntityManager entityManager;

    public SituacionContribuyenteQuery(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    
    //TODO: Alejandro la situación del contribuyente no debe tener eliminar.
}
