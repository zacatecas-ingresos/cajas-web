/*
 * SituacionContribuyenteEJB.java
 * Creado el 04/May/2017 4:03:02 PM
 * 
 */
package cajas.config.situacioncontribuyente;

import cajas.persistence.query.SituacionContribuyenteQuery;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alejandro Perez
 */
@Stateless
public class SituacionContribuyenteEJB {

    @PersistenceContext(unitName = "sitDS")
    private EntityManager entityManager;
    private SituacionContribuyenteQuery situacionContribuyenteQuery;

    @PostConstruct
    private void init() {
        situacionContribuyenteQuery = new SituacionContribuyenteQuery(entityManager);
    }
    
}
