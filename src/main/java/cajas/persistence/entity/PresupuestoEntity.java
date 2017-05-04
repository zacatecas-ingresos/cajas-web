package cajas.persistence.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Presupuestos", schema = "recaudacion")
public class PresupuestoEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2289520626451249665L;

	@Id
	@Column(name = "IdPresupuesto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPresupuesto;

	@Column(name = "IdContribuyente")
	private Integer idContribuyente;

	@Column(name = "LCCBancos")
	private String lccBanco;
	
	@Column(name = "ImporteTotal")
	private BigDecimal importeTotal;

	@Column(name = "IdFormaPago")
	private Integer idFormaPago;

	@Column(name = "IdEstatus")
	private Integer idEstatus;

	@Column(name = "FechaEnvioOperacion")
	private Date fechaEnvioOperacion;

	@Column(name = "FechaRecepcionOperacion")
	private Date fechaRecepcionOperacion;

	@Column(name = "FechaEmisionPresupuesto")
	private Date fechaEmisionPresupuesto;

	@Column(name = "HoraEmisionPresupuesto")
	private Time horaEmisionPresupuesto;

	@Column(name = "AnyoExpedicion")
	private Integer anyoExpedicion;
	
	@Column(name = "IdMesExpedicion")
	private Integer idMesExpedicion;
	
	@Column(name = "TipoPago")
	private Integer tipoPago; 
	
	@Column(name = "LCCoxxo")
	private String lccOxxo;
	
	@Column(name = "Integrado")
	private Integer integrado;
	
	/************ Getters and Setters ************/

	public Integer getIdPresupuesto() {
		return idPresupuesto;
	}

	public void setIdPresupuesto(Integer idPresupuesto) {
		this.idPresupuesto = idPresupuesto;
	}

	public Integer getIdContribuyente() {
		return idContribuyente;
	}

	public void setIdContribuyente(Integer idContribuyente) {
		this.idContribuyente = idContribuyente;
	}

	public String getLccBanco() {
		return lccBanco;
	}

	public void setLccBanco(String lccBanco) {
		this.lccBanco = lccBanco;
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

	public Date getFechaEnvioOperacion() {
		return fechaEnvioOperacion;
	}

	public void setFechaEnvioOperacion(Date fechaEnvioOperacion) {
		this.fechaEnvioOperacion = fechaEnvioOperacion;
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

	public Time getHoraEmisionPresupuesto() {
		return horaEmisionPresupuesto;
	}

	public void setHoraEmisionPresupuesto(Time horaEmisionPresupuesto) {
		this.horaEmisionPresupuesto = horaEmisionPresupuesto;
	}

	public Integer getAnyoExpedicion() {
		return anyoExpedicion;
	}

	public void setAnyoExpedicion(Integer anyoExpedicion) {
		this.anyoExpedicion = anyoExpedicion;
	}

	public Integer getIdMesExpedicion() {
		return idMesExpedicion;
	}

	public void setIdMesExpedicion(Integer idMesExpedicion) {
		this.idMesExpedicion = idMesExpedicion;
	}

	public Integer getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(Integer tipoPago) {
		this.tipoPago = tipoPago;
	}

	public String getLccOxxo() {
		return lccOxxo;
	}

	public void setLccOxxo(String lccOxxo) {
		this.lccOxxo = lccOxxo;
	}

	public Integer getIntegrado() {
		return integrado;
	}

	public void setIntegrado(Integer integrado) {
		this.integrado = integrado;
	}
}
