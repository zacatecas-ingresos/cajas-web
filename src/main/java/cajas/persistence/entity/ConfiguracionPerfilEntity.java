package cajas.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "configuracionperfiles")
public class ConfiguracionPerfilEntity {

	@Id
	@Column(name = "idconfiguracionperfil")
	private Integer idConfiguracionPerfil;

	@Column(name = "idaccion")
	private Integer idAccion;

	@Column(name = "idperfil")
	private Integer idPerfil;

	public Integer getIdConfiguracionPerfil() {
		return idConfiguracionPerfil;
	}

	public void setIdConfiguracionPerfil(Integer idConfiguracionPerfil) {
		this.idConfiguracionPerfil = idConfiguracionPerfil;
	}

	public Integer getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}

	public Integer getIdAccion() {
		return idAccion;
	}

	public void setIdAccion(Integer idAccion) {
		this.idAccion = idAccion;
	}
}