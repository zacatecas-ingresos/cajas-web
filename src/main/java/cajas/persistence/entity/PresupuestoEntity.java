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
public class PresupuestoEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2289520626451249665L;

	
	@Id
	@Column(name = "id_presupuesto")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idPresupuestoDetalle;

	@Column(name="id_contribuyente")
	private Integer idContribuyente;
	
	
	@Column(name="id_obligacion")
	private Integer idObligacion;
	
	@Column(name="es_mixta")
	private Boolean esMixta;
	
	@Column(name="id_consecutivo")
	private Integer idConsecutivo;
	
	@Column(name="concecutivo_operacion")
	private Integer concecutivoOperacion;
	
	
	@Column(name="lcc")
	private String lcc;
	
	@Column(name="numero_operaciones")
	private Integer numero_operaciones;
	
	@Column(name="importe_total")
	private BigDecimal importeTotal;
	
	
	@Column(name="id_forma_pago")
	private Integer idFormaPago;
	
	@Column(name="id_estatus")
	private Integer idEstatus;
	
	
	@Column(name="fecha_recepcion_operacion")
	private Date fechaRecepcionOperacion;
	
	
	@Column(name="fecha_emision_presupuesto")
	private Date fechaEmisionPresupuesto;

	@Column(name="integrado")
	private Boolean integrado;

	public Integer getIdPresupuestoDetalle() {
		return idPresupuestoDetalle;
	}

	public void setIdPresupuestoDetalle(Integer idPresupuestoDetalle) {
		this.idPresupuestoDetalle = idPresupuestoDetalle;
	}

	public Integer getIdContribuyente() {
		return idContribuyente;
	}

	public void setIdContribuyente(Integer idContribuyente) {
		this.idContribuyente = idContribuyente;
	}

	public Integer getIdObligacion() {
		return idObligacion;
	}

	public void setIdObligacion(Integer idObligacion) {
		this.idObligacion = idObligacion;
	}

	public Boolean getEsMixta() {
		return esMixta;
	}

	public void setEsMixta(Boolean esMixta) {
		this.esMixta = esMixta;
	}

	public Integer getIdConsecutivo() {
		return idConsecutivo;
	}

	public void setIdConsecutivo(Integer idConsecutivo) {
		this.idConsecutivo = idConsecutivo;
	}

	public Integer getConcecutivoOperacion() {
		return concecutivoOperacion;
	}

	public void setConcecutivoOperacion(Integer concecutivoOperacion) {
		this.concecutivoOperacion = concecutivoOperacion;
	}

	public String getLcc() {
		return lcc;
	}

	public void setLcc(String lcc) {
		this.lcc = lcc;
	}

	public Integer getNumero_operaciones() {
		return numero_operaciones;
	}

	public void setNumero_operaciones(Integer numero_operaciones) {
		this.numero_operaciones = numero_operaciones;
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

	public Boolean getIntegrado() {
		return integrado;
	}

	public void setIntegrado(Boolean integrado) {
		this.integrado = integrado;
	}
	
	
	
}
