/*
 * ContribuyenteEJB.java
 * Creado el 25/Apr/2017 12:48:59 AM
 */
package cajas.contribuyentes;

import cajas.exception.BusinessException;
import cajas.persistence.entity.ContribuyenteEntity;
import cajas.persistence.query.ContribuyenteQuery;
import cajas.util.ValidarFormatoCURP;
import cajas.util.ValidarFormatoRFC;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.lang3.StringUtils;
import org.jboss.logging.Logger;

/**
 * Este EJB permite administrar la lógica relacionada con la administración del
 * contribuyente.
 * 
 * @author Freddy Barrera (freddy.barrera.moo@gmail.com)
 */
@Stateless
public class ContribuyenteEJB {

    @PersistenceContext(unitName = "sitDS")
    private EntityManager entityManager;
    private ContribuyenteQuery contribuyenteQuery;
    private final ContribuyenteFactory contribuyenteFactory = new ContribuyenteFactory();

    private static final Logger LOGGER = Logger.getLogger(ContribuyenteEJB.class.getName());
    
    /**
     * Se ejecuta después de que el contenedor inicaliza la clase. Por ello
     * permite pasar como parametro a otras clases los elementos que se 
     * inyectan en esta clase.
     */
    @PostConstruct
    private void init() {
        contribuyenteQuery = new ContribuyenteQuery(entityManager);
    }

    /**
     * Este permite crear un nuevo contribuyente.
     * @param contribuyente la información del contribuyente que será creado.
     * @return el ID del contribuyente que se creo.
     */    
    public Integer crearContribuyente(Contribuyente contribuyente) {
        if (contribuyente == null) {
            throw new NullPointerException("No se puede guardar un contribuyente nulo");
        }

        if (!ValidarFormatoRFC.validarRfc(contribuyente.getRfc())) {
            throw new BusinessException("Verifique el formato del RFC.");
        }

        if (!ValidarFormatoCURP.validarCurp(contribuyente.getCurp())) {
            throw new BusinessException("Verifique el formato del CURP.");
        }

        // Cuando el contribuyente es una persona moral se toman los datos de 
        // la persona como la del representante legal.
        ContribuyenteEntity contribuyenteEntity = contribuyenteFactory.dtoAEntity(contribuyente);
        contribuyenteEntity = contribuyenteQuery.crearContribuyente(contribuyenteEntity);
        return contribuyenteEntity.getIdContribuyente();
    }
    
    /**
     * Permite obtener un contribuyente por medio de su ID.
     * @param idContribuyente el ID del contribuyente a buscar.
     * @return el contribuyente que se ha encontrado.
     */
    public Contribuyente obtenerContribuyente(Integer idContribuyente) {
        if (idContribuyente == null || idContribuyente <= 0) {
            throw new BusinessException("No se puede obtener un ID nulo o menor que cero.");
        }
        
        ContribuyenteEntity contribuyenteEntity = contribuyenteQuery.obtenerContribuyente(idContribuyente);
        Contribuyente contribuyente = contribuyenteFactory.entityADto(contribuyenteEntity);
        return contribuyente;
    }

    /**
     * Este permite buscar un contribuyente por nombre, por RFC, por razón social
     * ya sea que se escriba completa o parcialmente.
     * @param criterio el nombre, RFC o razón social del contribuyente a buscar.
     * @return una lista de los contribuyentes que coinciden con el criterio de 
     * busquedad.
     */
    public List<Contribuyente> buscarContribuyente(String criterio) {
        if (StringUtils.isBlank(criterio)) {
            throw new BusinessException("No se puede realizar una búsqueda sin un criterio.");
        }
        
        List<ContribuyenteEntity> contribuyenteEntities = contribuyenteQuery.buscarContribuyente(criterio);
        List<Contribuyente> contribuyenteDtos = contribuyenteFactory.entitiesADtos(contribuyenteEntities);
        return contribuyenteDtos;
    }

    /**
     * Este permite editar la información de un contribuyente.
     * 
     * @param contribuyente la información del contribuyente que será 
     * actualizada.
     */
    public void editarContribuyente(Contribuyente contribuyente) {
        if (contribuyente == null) {
            throw new NullPointerException("No se puede editar un contribuyente nulo");
        }

        if (!ValidarFormatoRFC.validarRfc(contribuyente.getRfc())) {
            throw new BusinessException("Verifique el formato del RFC.");
        }

        ContribuyenteEntity contribuyenteEntity = contribuyenteQuery.obtenerContribuyente(contribuyente.getId());
        
        if (contribuyenteEntity == null) {
            throw new BusinessException("El contribuyente que desea editar no existe.");
        }
        
        contribuyenteEntity = contribuyenteFactory.dtoAEntity(contribuyente, contribuyenteEntity);
        contribuyenteQuery.editarContribuyente(contribuyenteEntity);
    }

}
