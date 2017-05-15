package cajas.persistence.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DocumentosPedimentos", schema = "vehicular")
public class DocumentoPedimentoEntity implements Serializable{

	private static final long serialVersionUID = -6759892518656940196L;
	
	@Id
	@Column(name = "IdDocumentoPedimento")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDocumentoPedimento;
	
	@Column( name = "Documento")
	private String documento;
	
	@Column ( name = "Estatus" )
	private Integer estatus;
	
	@Column ( name = "ModeloA" )
	private Integer modeloA;
	
	@Column ( name = "ModeloC" )
	private Integer modeloC;

	
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

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
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
	
	

}
