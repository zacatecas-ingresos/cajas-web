/**
 * 
 */
package cajas.persistence.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Leila Schiaffini Ehuan
 *
 * @Since 25/04/2017 15:34:34
 * 
 * 
 * 
 */
@Entity
@Table(name = "detalle_presupuesto_isn", schema = "presupuestos")
public class DetallePresupuestoIsnEntity {
	@Id
	@Column(name = "id_detalle_presupuesto_isn")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDetallePresupuestoIsn;

	@Column(name = "id_presupuesto_obligacion")
	private Integer idPresupuestoObligacion;

	@Column(name = "id_contribuyente")
	private Integer idContribuyente;

	@Column(name = "id_sucursal")
	private Integer idSucursal;

	@Column(name = "tipo_declaracion")
	private String tipoDeclaracion;

	@Column(name = "id_periodo")
	private Integer idPeriodo;

	@Column(name = "ejercicio_fiscal")
	private Integer ejercicioFiscal;

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

	public Integer getIdPresupuestoObligacion() {
		return idPresupuestoObligacion;
	}

	public void setIdPresupuestoObligacion(Integer idPresupuestoObligacion) {
		this.idPresupuestoObligacion = idPresupuestoObligacion;
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

	public Integer getEjercicioFiscal() {
		return ejercicioFiscal;
	}

	public void setEjercicioFiscal(Integer ejercicioFiscal) {
		this.ejercicioFiscal = ejercicioFiscal;
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

	public Integer getIdDetallePresupuestoIsn() {
		return idDetallePresupuestoIsn;
	}

}
