package cajas.persistence.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "documentos_pedimento", schema = "vehicular")
public class DocumentoPedimentoEntity implements Serializable{

	private static final long serialVersionUID = -6759892518656940196L;
	
	@Id
	@Column(name = "id_documento_pedimento")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDocumentoPedimento;
	
	@Column( name = "documento")
	private String documento;
	
	@Column( name = "modelo_a")
	private Integer modeloA;
	
	@Column ( name = "modelo_c")
	private Integer modeloC;
	
	@Column ( name = "estatus" )
	private Integer estatus;

	
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
