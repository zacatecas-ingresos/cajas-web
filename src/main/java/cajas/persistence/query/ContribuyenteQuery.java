/*
 * ContribuyenteQuery.java
 * 
 */
package cajas.persistence.query;

import cajas.exception.BusinessException;
import cajas.impuestos.declaracion.estatal.InfoContribuyente;
import cajas.persistence.entity.ContribuyenteEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 * Esta clase contiene la información necesaria para realizar las consultas y 
 * operaciones sobre el contribuyente.
 * 
 * @author Freddy Barrera (freddy.barrera.moo@gmail.com)
 */
public class ContribuyenteQuery {

    private final EntityManager entityManager;
    private static final String BUSCAR_CONTRIBUYENTE = 
            "  select contribuyente"
            + "  from ContribuyenteEntity as contribuyente"
            + " where contribuyente.rfc like upper(:criterio)"
            + "    or contribuyente.nombreCompuesto like upper(:criterio)";
    private static final String BUSCAR_CONTRIBUYENTE_RFC = 
            "  select new cajas.impuestos.declaracion.estatal.InfoContribuyente("
            + "       c.idContribuyente, "
            + "       c.nombreCompuesto,"
            + "       c.rfc)"
            + "  from ContribuyenteEntity as c"
            + " where c.rfc = :rfc";

    /**
     * Crea una instancia.
     * 
     * @param entityManager el administrador de entidades para poder realizar 
     * las consultas y operaciones sobre las entidades.
     */
    public ContribuyenteQuery(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Permite persistir un nuevo contribuyente.
     * 
     * @param contribuyenteEntity el contribuyente a persistir.
     * @return el contribuyente ya persistido.
     */
    public ContribuyenteEntity crearContribuyente(ContribuyenteEntity contribuyenteEntity) {
        entityManager.persist(contribuyenteEntity);
        return contribuyenteEntity;
    }

    /**
     * Permite obtener un contribuyente ya antes persistido por medio de su ID.
     * 
     * @param idContribuyente el ID del contribuyente a buscar.
     * @return el contribuyente persistido.
     */
    public ContribuyenteEntity obtenerContribuyente(Integer idContribuyente) {
        ContribuyenteEntity contribuyenteEntity = entityManager.find(ContribuyenteEntity.class, idContribuyente);
        return contribuyenteEntity;
    }

    /**
     * Consulta la información básica del contribuyente.
     * 
     * @param rfc el RFC a buscar.
     * @return la información básica del contribuyente.
     * @author Leila Schiaffini
     */
    public InfoContribuyente obtenerContirbuyentePoRfc(String rfc) {
        try {
            return entityManager.createQuery(BUSCAR_CONTRIBUYENTE_RFC, InfoContribuyente.class).setParameter("rfc", rfc)
                    .getSingleResult();
        } catch (NoResultException exception) {
            throw new BusinessException("No se encontró contribuyente con el RFC " + rfc);
        }
    }

    /**
     * Permite obtener un contribuyente por medio de un criterio de busqueda.
     * 
     * @param criterio el criterio que se usara para buscar al contribuyente.
     * @return el contribuyente ya persistido.
     */
    public List<ContribuyenteEntity> buscarContribuyente(String criterio) {
        TypedQuery<ContribuyenteEntity> consulta = entityManager.createQuery(BUSCAR_CONTRIBUYENTE,
                ContribuyenteEntity.class);
        consulta.setParameter("criterio", '%' + criterio + '%');
        return consulta.getResultList();
    }

    /**
     * Permite actualizar la información de un contribuyente ya antes persistido.
     * En caso de que el contribuyente no exista no se creará un nuevo
     * contribuyente.
     * 
     * @param contribuyenteEntity el contribuyente será actualizado.
     */
    public void editarContribuyente(ContribuyenteEntity contribuyenteEntity) {
        entityManager.merge(contribuyenteEntity);
    }

}
