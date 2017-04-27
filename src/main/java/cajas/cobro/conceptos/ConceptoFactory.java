package cajas.cobro.conceptos;


import java.math.BigDecimal;

import cajas.persistence.entity.ConceptosEntity;

public class ConceptoFactory {
	
	public static ConceptosEntity toConceptoEntity(Concepto concepto){
		
		ConceptosEntity entity = new ConceptosEntity();
		
		entity.setDescripcion(concepto.getDescripcion());
		entity.setNivel1(concepto.getNivel1());
		entity.setNivel2(concepto.getNivel2());
		entity.setNivel3(concepto.getNivel3());
		entity.setNivel4(concepto.getNivel4());
		entity.setNivel5(concepto.getNivel5());
		entity.setNivel6(concepto.getNivel6());
		entity.setClave(concepto.getClave());
		entity.setCobroDerecho(concepto.getCobroDerecho());
		entity.setEjercicioFiscal(concepto.getEjercicioFiscal());
		entity.setTipoNivel(concepto.getTipoNivel());
		entity.setActivo(Boolean.TRUE);
		
		return entity;		
	}
	
	public static Concepto toObtenerConcepto(ConceptosEntity entity){
		
		Concepto concepto = new Concepto();
		
		concepto.setIdConcepto(entity.getIdConcepto());
		concepto.setDescripcion(entity.getDescripcion());
		concepto.setNivel1(entity.getNivel1());
		concepto.setNivel2(entity.getNivel2());
		concepto.setNivel3(entity.getNivel3());
		concepto.setNivel4(entity.getNivel4());
		concepto.setNivel5(entity.getNivel5());
		concepto.setNivel6(entity.getNivel6());
		concepto.setClave(entity.getClave());
		concepto.setCobroDerecho(entity.getCobroDerecho());
		concepto.setEjercicioFiscal(entity.getEjercicioFiscal());
		concepto.setTipoNivel(concepto.getTipoNivel());
		concepto.setActivo(entity.isActivo());
		
		return concepto;
	}
	
	public static ConceptosEntity toConceptoEditar(Concepto concepto, ConceptosEntity entity){
		
		if(concepto.getDescripcion()!=entity.getDescripcion()){
			entity.setDescripcion(concepto.getDescripcion());
		}
			
		if(concepto.getNivel1()!=entity.getNivel1()){
			entity.setNivel1(concepto.getNivel1());
		}
		
		if(concepto.getNivel2()!=entity.getNivel2()){
			entity.setNivel2(concepto.getNivel2());
		}
		
		if(concepto.getNivel3()!=entity.getNivel3()){
			entity.setNivel3(concepto.getNivel3());
		}
		
		if(concepto.getNivel4()!=entity.getNivel4()){
			entity.setNivel4(concepto.getNivel4());
		}
		
		if(concepto.getNivel5()!=entity.getNivel5()){
			entity.setNivel5(concepto.getNivel5());
		}
		if(concepto.getNivel6()!=entity.getNivel6()){
			entity.setNivel6(concepto.getNivel6());
		}
		
		if(concepto.getClave()!=entity.getClave()){
			entity.setClave(concepto.getClave());
		}
		
		if(concepto.getCobroDerecho().compareTo(BigDecimal.ZERO)>=0){
			entity.setCobroDerecho(concepto.getCobroDerecho());
		}
		if(concepto.getEjercicioFiscal()!=entity.getEjercicioFiscal()){
			entity.setEjercicioFiscal(concepto.getEjercicioFiscal());
		}
		
		if(concepto.getTipoNivel()!=entity.getTipoNivel()){
			entity.setTipoNivel(concepto.getTipoNivel());
		}
		
		return entity;
	}

}
