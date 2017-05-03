package cajas.vehicular.verificacion.alta;

import cajas.persistence.entity.DocumentoPedimentoEntity;

public class DocumentoPedimento {
	
	private Integer idDocumentoPedimento;
	private String documento;
	private Integer modeloA;
	private Integer modeloC;
	private Integer estatus;
	
	public DocumentoPedimento documentoPedimentoEntity(DocumentoPedimentoEntity documentoPedimentoEntity){
		
		DocumentoPedimento documentoP = new DocumentoPedimento();
		documentoP.setIdDocumentoPedimento(documentoPedimentoEntity.getIdDocumentoPedimento());
		documentoP.setDocumento(documentoPedimentoEntity.getDocumento());
		documentoP.setModeloA(documentoPedimentoEntity.getModeloA());
		documentoP.setModeloC(documentoPedimentoEntity.getModeloC());
		documentoP.setEstatus(documentoPedimentoEntity.getEstatus());
			
		return documentoP;
	}
	
	
	public Integer getIdDocumentoPedimento() {
		return idDocumentoPedimento;
	}
	public void setIdDocumentoPedimento(Integer idDocumentoPedimento) {
		this.idDocumentoPedimento = idDocumentoPedimento;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public Integer getModeloA() {
		return modeloA;
	}
	public void setModeloA(Integer modeloA) {
		this.modeloA = modeloA;
	}
	public Integer getModeloC() {
		return modeloC;
	}
	public void setModeloC(Integer modeloC) {
		this.modeloC = modeloC;
	}
	public Integer getEstatus() {
		return estatus;
	}
	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}
	
	

}
