package cajas.persistence.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "presupuesto", schema = "presupuestos")
public class PresupuestoEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2289520626451249665L;

	@Id
	@Column(name = "id_presupuesto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPresupuesto;

	@Column(name = "id_contribuyente")
	private Integer idContribuyente;

	@Column(name = "lcc")
	private String lcc;

	@Column(name = "importe_total")
	private BigDecimal importeTotal;

	@Column(name = "id_forma_pago")
	private Integer idFormaPago;

	@Column(name = "id_estatus")
	private Integer idEstatus;

	@Column(name = "fecha_recepcion_operacion")
	private Date fechaRecepcionOperacion;

	@Column(name = "fecha_emision_presupuesto")
	private Date fechaEmisionPresupuesto;

	@Column(name = "integrado")
	private boolean integrado;

	@Column(name = "anyo_expedicion")
	private int ejercicioExpedicion;

	@Column(name = "id_mes_expedicion")
	private int idMesExpedicion;

	public int getEjercicioExpedicion() {
		return ejercicioExpedicion;
	}

	public void setEjercicioExpedicion(int ejercicioExpedicion) {
		this.ejercicioExpedicion = ejercicioExpedicion;
	}

	public int getIdMesExpedicion() {
		return idMesExpedicion;
	}

	public void setIdMesExpedicion(int idMesExpedicion) {
		this.idMesExpedicion = idMesExpedicion;
	}

	public void setIntegrado(boolean integrado) {
		this.integrado = integrado;
	}

	public Integer getIdPresupuesto() {
		return idPresupuesto;
	}

	public Integer getIdContribuyente() {
		return idContribuyente;
	}

	public void setIdContribuyente(Integer idContribuyente) {
		this.idContribuyente = idContribuyente;
	}

	public String getLcc() {
		return lcc;
	}

	public void setLcc(String lcc) {
		this.lcc = lcc;
	}

	public BigDecimal getImporteTotal() {
		return importeTotal;
	}

	public void setImporteTotal(BigDecimal importeTotal) {
		this.importeTotal = importeTotal;
	}

	public Integer getIdFormaPago() {
		return idFormaPago;
	}

	public void setIdFormaPago(Integer idFormaPago) {
		this.idFormaPago = idFormaPago;
	}

	public Integer getIdEstatus() {
		return idEstatus;
	}

	public void setIdEstatus(Integer idEstatus) {
		this.idEstatus = idEstatus;
	}

	public Date getFechaRecepcionOperacion() {
		return fechaRecepcionOperacion;
	}

	public void setFechaRecepcionOperacion(Date fechaRecepcionOperacion) {
		this.fechaRecepcionOperacion = fechaRecepcionOperacion;
	}

	public Date getFechaEmisionPresupuesto() {
		return fechaEmisionPresupuesto;
	}

	public void setFechaEmisionPresupuesto(Date fechaEmisionPresupuesto) {
		this.fechaEmisionPresupuesto = fechaEmisionPresupuesto;
	}

}
