/*
 * ContribuyenteEJB.java
 * Creado el 25/Apr/2017 12:48:59 AM
 * 
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
    
    @PostConstruct
    private void init() {
        contribuyenteQuery = new ContribuyenteQuery(entityManager);
    }
    
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

        ContribuyenteEntity contribuyenteEntity = contribuyenteFactory.dtoAEntity(contribuyente);
        contribuyenteEntity = contribuyenteQuery.crearContribuyente(contribuyenteEntity);
        return contribuyenteEntity.getIdContribuyente();
    }
    
    public Contribuyente obtenerContribuyente(Integer idContribuyente) {
        if (idContribuyente == null || idContribuyente <= 0) {
            throw new BusinessException("No se puede obtener un ID nulo o menor que cero.");
        }
        
        ContribuyenteEntity contribuyenteEntity = contribuyenteQuery.obtenerContribuyente(idContribuyente);
        Contribuyente contribuyente = contribuyenteFactory.entityADto(contribuyenteEntity);
        return contribuyente;
    }

    public List<Contribuyente> buscarContribuyente(String criterio) {
        if (StringUtils.isBlank(criterio)) {
            throw new BusinessException("No se puede realizar una búsqueda sin un criterio.");
        }
        
        List<ContribuyenteEntity> contribuyenteEntities = contribuyenteQuery.buscarContribuyente(criterio);
        List<Contribuyente> contribuyenteDtos = contribuyenteFactory.entitiesADtos(contribuyenteEntities);
        return contribuyenteDtos;
    }
    
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
    
    public void eliminarContribuyente(Integer idContribuyente) {
        if (idContribuyente == null || idContribuyente <= 0) {
            throw new BusinessException("No se puede eliminar un ID nulo o menor que cero.");
        }
        
        contribuyenteQuery.eliminarContribuyente(idContribuyente);
    }
}
