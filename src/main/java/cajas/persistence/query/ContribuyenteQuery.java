/*
 * ContribuyenteQuery.java
 * 
 */
package cajas.persistence.query;

import cajas.persistence.entity.ContribuyenteEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Freddy Barrera (freddy.barrera.moo@gmail.com)
 */
public class ContribuyenteQuery {
    
    private final EntityManager entityManager;
    private static final String BUSCAR_CONTRIBUYENTE = 
            "select contribuyente"
            + " from ContribuyenteEntity as contribuyente"
            + " where contribuyente.rfc like :criterio or contribuyente.nombreCompuesto like :criterio";

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

    public List<ContribuyenteEntity> buscarContribuyente(String criterio) {
        TypedQuery<ContribuyenteEntity> consulta = entityManager.createQuery(BUSCAR_CONTRIBUYENTE, ContribuyenteEntity.class);
        consulta.setParameter("criterio", '%' + criterio + '%');
        return consulta.getResultList();
    }
    
    public void editarContribuyente(ContribuyenteEntity contribuyenteEntity) {
        entityManager.merge(contribuyenteEntity);
    }

}
