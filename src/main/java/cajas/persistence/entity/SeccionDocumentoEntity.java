package cajas.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seccion_documento", schema = "vehicular")

public class SeccionDocumentoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_seccion_documento")
	private Integer idSeccionDocumento;

	@Column(name = "clave_documento")
	private String claveDocumento;

	@Column(name = "clave_seccion")
	private String claveSeccion;

	@Column(name = "seccion_documento")
	private String seccionDocumento;

	public Integer getIdSeccionDocumento() {
		return idSeccionDocumento;
	}

	public void setIdSeccionDocumento(Integer idSeccionDocumento) {
		this.idSeccionDocumento = idSeccionDocumento;
	}

	public String getClaveDocumento() {
		return claveDocumento;
	}

	public void setClaveDocumento(String claveDocumento) {
		this.claveDocumento = claveDocumento;
	}

	public String getClaveSeccion() {
		return claveSeccion;
	}

	public void setClaveSeccion(String claveSeccion) {
		this.claveSeccion = claveSeccion;
	}

	public String getSeccionDocumento() {
		return seccionDocumento;
	}

	public void setSeccionDocumento(String seccionDocumento) {
		this.seccionDocumento = seccionDocumento;
	}

}
