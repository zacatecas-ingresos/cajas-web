/*
 * SituacionContribuyenteEJB.java
 * Creado el 04/May/2017 4:03:02 PM
 * 
 */
package cajas.config.situacioncontribuyente;

import cajas.persistence.query.SituacionContribuyenteQuery;
import cajas.persistence.entity.SituacionContribuyenteEntity;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import cajas.exception.BusinessException;

@Stateless
public class SituacionContribuyenteEJB {

    @PersistenceContext(unitName = "sitDS")
    private EntityManager entityManager;
    private SituacionContribuyenteQuery situacionContribuyenteQuery;
    private final SituacionContribuyenteFactory situacionContribuyenteFactory = new SituacionContribuyenteFactory();
    
    @PostConstruct
    private void init() {
        situacionContribuyenteQuery = new SituacionContribuyenteQuery(entityManager);
    }
    
    public String crearSituacionContribuyente(SituacionContribuyente estatusSituacionContribuyente) {

        if(estatusSituacionContribuyente == null) {
            throw new NullPointerException("No se puede guardar en el almacen de dato un valor vacio");
        }

        if(estatusSituacionContribuyente.getEstatusSituacionContribuyente().isEmpty()) {
            throw new BusinessException("No se puede guardar en el almacen de dato un estado en blanco");
        }

        SituacionContribuyenteEntity situacionContribuyenteEntity = situacionContribuyenteQuery.crearSituacionContribuyente(SituacionContribuyenteFactory.dtoAEntidad(estatusSituacionContribuyente));
        return situacionContribuyenteEntity.getSituacionContribuyente();
    }
    
    public SituacionContribuyente obtenerSituacionContribuyente(Integer idSituacionContribuyente) {
        // Implementar reglas de negocio
        
    	SituacionContribuyenteEntity situacionContribuyenteEntity = situacionContribuyenteQuery.obtenerSituacionContribuyente(idSituacionContribuyente);
    	SituacionContribuyente situacionContribuyente = situacionContribuyenteFactory.entidadADto(situacionContribuyenteEntity);
        return situacionContribuyente;
    }
    
    public List<SituacionContribuyente> obtenerTodasSituacionesContribuyentes() {
        List<SituacionContribuyenteEntity> situacionContribuyentesEntities = situacionContribuyenteQuery.obtenerSituacionesContibuyentes();
        return situacionContribuyenteFactory.entidadesADtos(situacionContribuyentesEntities);
    }
    
    public void editarSituacionContribuyente(SituacionContribuyente situacionContribuyente) {
        // Implementar reglas de negocio
        
    	SituacionContribuyenteEntity situacionContribuyenteEntity = situacionContribuyenteQuery.obtenerSituacionContribuyente(situacionContribuyente.getIdSituacionContribuyente());
    	situacionContribuyenteEntity = situacionContribuyenteFactory.dtoAEntidad(situacionContribuyenteEntity,situacionContribuyenteEntity);
    	situacionContribuyenteQuery.editarSituacionContribuyente(situacionContribuyenteEntity);
    }
    public List<SituacionContribuyente> buscarSituacioncontribuyente(String situacionContribuyente) {
        List<SituacionContribuyenteEntity>situacionContribuyenteEntities = situacionContribuyenteQuery.buscarSituacioncontribuyente(situacionContribuyente);
        List<SituacionContribuyente> situacionContribuyenteDtos = situacionContribuyenteFactory.entidadesADtos(situacionContribuyenteEntities);
        return situacionContribuyenteDtos;
    }
    
}
