package cajas.persistence.entity;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "asignacion_caja", schema = "cajas")
public class AsignacionCajaEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3328917680688448906L;

	@Id
	@Column(name = "id_asignacion")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idAsignacion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_caja")
	private CajasEntity idCaja;
	
	@Column(name="id_usuario")
	private Integer idUsuario;
	
	@Column(name="fecha_asignacion")
	private Date fechaAsignacion;

	@Column(name="hora_asignacion")
	private Date horaAsignacion;
	
	@Column(name="fecha_desasignacion")
	private Date fechaDesasignacion;

	@Column(name="hora_desasignacion")
	private Date horadesAsignacion;

	/**
	 * @return the idAsignacion
	 */
	public Integer getIdAsignacion() {
		return idAsignacion;
	}

	/**
	 * @param idAsignacion the idAsignacion to set
	 */
	public void setIdAsignacion(Integer idAsignacion) {
		this.idAsignacion = idAsignacion;
	}

	



	/**
	 * @return the idCaja
	 */
	public CajasEntity getIdCaja() {
		return idCaja;
	}

	/**
	 * @param idCaja the idCaja to set
	 */
	public void setIdCaja(CajasEntity idCaja) {
		this.idCaja = idCaja;
	}

	/**
	 * @return the idUsuario
	 */
	public Integer getIdUsuario() {
		return idUsuario;
	}

	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * @return the fechaAsignacion
	 */
	public Date getFechaAsignacion() {
		return fechaAsignacion;
	}

	/**
	 * @param fechaAsignacion the fechaAsignacion to set
	 */
	public void setFechaAsignacion(Date fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}

	/**
	 * @return the horaAsignacion
	 */
	public Date getHoraAsignacion() {
		return horaAsignacion;
	}

	/**
	 * @param horaAsignacion the horaAsignacion to set
	 */
	public void setHoraAsignacion(Date horaAsignacion) {
		this.horaAsignacion = horaAsignacion;
	}

	/**
	 * @return the fechaDesasignacion
	 */
	public Date getFechaDesasignacion() {
		return fechaDesasignacion;
	}

	/**
	 * @param fechaDesasignacion the fechaDesasignacion to set
	 */
	public void setFechaDesasignacion(Date fechaDesasignacion) {
		this.fechaDesasignacion = fechaDesasignacion;
	}

	/**
	 * @return the horadesAsignacion
	 */
	public Date getHoradesAsignacion() {
		return horadesAsignacion;
	}

	/**
	 * @param horadesAsignacion the horadesAsignacion to set
	 */
	public void setHoradesAsignacion(Date horadesAsignacion) {
		this.horadesAsignacion = horadesAsignacion;
	}
	
	
	
	
}
