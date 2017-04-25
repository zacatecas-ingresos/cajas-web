package cajas.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "presupuesto_detalle", schema = "presupuestos")
public class PresupuestoDetalleEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4181523415882209887L;

	@Id
	@Column(name = "id_presupuesto_detalle")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idPresupuestoDetalle;
	
	@Column(name="id_presupuesto")
	private Integer idPresupuesto;
	
	@Column(name="id_detalle_presupuesto")
	private Integer idDetallePresupuesto;
	
	@Column(name="lcc")
	private String lcc;
	
	@Column(name="id_obligacion")
	private Integer idObligacion;
	
	@Column(name="integrada")
	private Boolean integrada;
	
	@Column(name="id_cobro")
	private Integer idCobro;
	
	@Column(name="fecha_integracion")
	private Date fechaIntegracion;
	
	@Column(name="hora_integracion")
	private Date horaIntegracion;

	public Integer getIdPresupuestoDetalle() {
		return idPresupuestoDetalle;
	}

	public void setIdPresupuestoDetalle(Integer idPresupuestoDetalle) {
		this.idPresupuestoDetalle = idPresupuestoDetalle;
	}

	public Integer getIdPresupuesto() {
		return idPresupuesto;
	}

	public void setIdPresupuesto(Integer idPresupuesto) {
		this.idPresupuesto = idPresupuesto;
	}

	public Integer getIdDetallePresupuesto() {
		return idDetallePresupuesto;
	}

	public void setIdDetallePresupuesto(Integer idDetallePresupuesto) {
		this.idDetallePresupuesto = idDetallePresupuesto;
	}

	public String getLcc() {
		return lcc;
	}

	public void setLcc(String lcc) {
		this.lcc = lcc;
	}

	public Integer getIdObligacion() {
		return idObligacion;
	}

	public void setIdObligacion(Integer idObligacion) {
		this.idObligacion = idObligacion;
	}

	public Boolean getIntegrada() {
		return integrada;
	}

	public void setIntegrada(Boolean integrada) {
		this.integrada = integrada;
	}

	public Integer getIdCobro() {
		return idCobro;
	}

	public void setIdCobro(Integer idCobro) {
		this.idCobro = idCobro;
	}

	public Date getFechaIntegracion() {
		return fechaIntegracion;
	}

	public void setFechaIntegracion(Date fechaIntegracion) {
		this.fechaIntegracion = fechaIntegracion;
	}

	public Date getHoraIntegracion() {
		return horaIntegracion;
	}

	public void setHoraIntegracion(Date horaIntegracion) {
		this.horaIntegracion = horaIntegracion;
	}
	
	
}
