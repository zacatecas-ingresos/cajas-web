/*
 * ContribuyenteQuery.java
 * 
 */
package cajas.persistence.query;

import cajas.persistence.entity.ContribuyenteEntity;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Freddy Barrera (freddy.barrera.moo@gmail.com)
 */
public class ContribuyenteQuery {
    private final EntityManager entityManager;

    public ContribuyenteQuery(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    public ContribuyenteEntity crearContribuyente(ContribuyenteEntity contribuyenteEntity) {
        entityManager.persist(contribuyenteEntity);
        return contribuyenteEntity;
    }
    
    public ContribuyenteEntity obtenerContribuyente(Integer idContribuyente) {
        ContribuyenteEntity contribuyenteEntity = entityManager.find(ContribuyenteEntity.class, idContribuyente);
        return contribuyenteEntity;
    }

    public void editarContribuyente(ContribuyenteEntity contribuyenteEntity) {
        entityManager.merge(contribuyenteEntity);
    }
    
    public void eliminarContribuyente(Integer idContribuyente) {
        ContribuyenteEntity contribuyenteEntity = obtenerContribuyente(idContribuyente);
        entityManager.remove(contribuyenteEntity);
    }

}
