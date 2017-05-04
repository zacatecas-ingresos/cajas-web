package cajas.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estatus_verificaciones", schema = "vehicular")
public class EstatusVerificacionEntity implements Serializable {
	private static final long serialVersionUID = 3932729104626046760L;

	@Id
	@Column(name = "id_estatus_verificacion")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEstatusVerificacion;

	@Column(name = "estatus_verificacion")
	private String estatusVerificacion;

	public Integer getIdEstatusVerificacion() {
		return idEstatusVerificacion;
	}

	public void setIdEstatusVerificacion(Integer idEstatusVerificacion) {
		this.idEstatusVerificacion = idEstatusVerificacion;
	}

	public String getEstatusVerificacion() {
		return estatusVerificacion;
	}

	public void setEstatusVerificacion(String estatusVerificacion) {
		this.estatusVerificacion = estatusVerificacion;
	}
}