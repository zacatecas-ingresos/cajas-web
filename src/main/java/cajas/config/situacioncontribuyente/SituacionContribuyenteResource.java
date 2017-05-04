/*
 * SituacionContribuyenteResource.java
 * Creado el 04/May/2017 4:04:34 PM
 * 
 */
package cajas.config.situacioncontribuyente;

import javax.ejb.EJB;
import javax.ws.rs.Path;

/**
 *
 * @author Alejandro Perez
 */
@Path("estados")
public class SituacionContribuyenteResource {
    @EJB
    private SituacionContribuyenteEJB situacionContribuyenteEJB;
    
}
