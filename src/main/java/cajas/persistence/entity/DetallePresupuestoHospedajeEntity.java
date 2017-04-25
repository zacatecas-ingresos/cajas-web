package cajas.persistence.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_presupuesto_hospedaje", schema = "presupuestos")
public class DetallePresupuestoHospedajeEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_detalle_presupuesto_hospedaje")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDetallePresupuestoHospedaje;

	@Column(name = "id_presupuesto")
	private Integer idPresupuesto;

	@Column(name = "id_cobro")
	private Integer idCobro;

	@Column(name = "id_contribuyente")
	private Integer idContribuyente;

	@Column(name = "id_sucursal")
	private Integer idSucursal;

	@Column(name = "tipo_declaracion")
	private String tipoDeclaracion;

	@Column(name = "id_periodo")
	private Integer idPeriodo;

	@Column(name = "id_ejercicio_fiscal")
	private Integer idEjercicioFiscal;

	@Column(name = "base_gravable")
	private BigDecimal baseGravable;

	@Column(name = "numero_empleados")
	private Integer numeroEmpleados;

	@Column(name = "impuesto")
	private BigDecimal impuesto;

	@Column(name = "actualizaciones")
	private BigDecimal actualizaciones;

	@Column(name = "recargos")
	private BigDecimal recargos;

	@Column(name = "uaz")
	private BigDecimal uaz;

	@Column(name = "total")
	private BigDecimal total;

	/*************************************************************************************/

	public Integer getIdDetallePresupuestoHospedaje() {
		return idDetallePresupuestoHospedaje;
	}

	public void setIdDetallePresupuestoHospedaje(Integer idDetallePresupuestoHospedaje) {
		this.idDetallePresupuestoHospedaje = idDetallePresupuestoHospedaje;
	}

	public Integer getIdPresupuesto() {
		return idPresupuesto;
	}

	public void setIdPresupuesto(Integer idPresupuesto) {
		this.idPresupuesto = idPresupuesto;
	}

	public Integer getIdCobro() {
		return idCobro;
	}

	public void setIdCobro(Integer idCobro) {
		this.idCobro = idCobro;
	}

	public Integer getIdContribuyente() {
		return idContribuyente;
	}

	public void setIdContribuyente(Integer idContribuyente) {
		this.idContribuyente = idContribuyente;
	}

	public Integer getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(Integer idSucursal) {
		this.idSucursal = idSucursal;
	}

	public String getTipoDeclaracion() {
		return tipoDeclaracion;
	}

	public void setTipoDeclaracion(String tipoDeclaracion) {
		this.tipoDeclaracion = tipoDeclaracion;
	}

	public Integer getIdPeriodo() {
		return idPeriodo;
	}

	public void setIdPeriodo(Integer idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

	public Integer getIdEjercicioFiscal() {
		return idEjercicioFiscal;
	}

	public void setIdEjercicioFiscal(Integer idEjercicioFiscal) {
		this.idEjercicioFiscal = idEjercicioFiscal;
	}

	public BigDecimal getBaseGravable() {
		return baseGravable;
	}

	public void setBaseGravable(BigDecimal baseGravable) {
		this.baseGravable = baseGravable;
	}

	public Integer getNumeroEmpleados() {
		return numeroEmpleados;
	}

	public void setNumeroEmpleados(Integer numeroEmpleados) {
		this.numeroEmpleados = numeroEmpleados;
	}

	public BigDecimal getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(BigDecimal impuesto) {
		this.impuesto = impuesto;
	}

	public BigDecimal getActualizaciones() {
		return actualizaciones;
	}

	public void setActualizaciones(BigDecimal actualizaciones) {
		this.actualizaciones = actualizaciones;
	}

	public BigDecimal getRecargos() {
		return recargos;
	}

	public void setRecargos(BigDecimal recargos) {
		this.recargos = recargos;
	}

	public BigDecimal getUaz() {
		return uaz;
	}

	public void setUaz(BigDecimal uaz) {
		this.uaz = uaz;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

}