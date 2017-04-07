package cajas.persistence.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dias_no_laborales")
public class DiasNoLaboralesEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4939760472535915722L;
 
	@Id
	@Column(name = "id_dia")
	private Integer idDia;

	@Column(name = "dia_no_laboral")
	private Date DiaNoLaboral;
	
	@Column(name = "motivo")
	private String motivo;

	public Integer getIdDia() {
		return idDia;
	}

	public void setIdDia(Integer idDia) {
		this.idDia = idDia;
	}

	public Date getDiaNoLaboral() {
		return DiaNoLaboral;
	}

	public void setDiaNoLaboral(Date diaNoLaboral) {
		DiaNoLaboral = diaNoLaboral;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	
}
