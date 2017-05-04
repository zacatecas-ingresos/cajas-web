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
@Table(name = "DetallesPresupuestosISAN", schema = "recaudacion")
public class DetallePresupuestoIsnEntity {
	@Id
	@Column(name = "DdDetallePresupuestoIsan")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDetallePresupuestoIsn;

	@Column(name = "IdPresupuestoObligacion")
	private Integer idPresupuestoObligacion;
	
	@Column(name = "IdCobro")
	private Integer idCobro;

	@Column(name = "IdContribuyente")
	private Integer idContribuyente;

	@Column(name = "IdSucursal")
	private Integer idSucursal;

	@Column(name = "TipoDeclaracion")
	private String tipoDeclaracion;

	@Column(name = "IdPeriodo")
	private Integer idPeriodo;

	@Column(name = "EjercicioFiscal")
	private Integer ejercicioFiscal;

	@Column(name = "BaseGravable")
	private BigDecimal baseGravable;

	@Column(name = "NumeroEmpleados")
	private Integer numeroEmpleados;

	@Column(name = "Impuesto")
	private BigDecimal impuesto;

	@Column(name = "Actualizaciones")
	private BigDecimal actualizaciones;

	@Column(name = "Recargos")
	private BigDecimal recargos;

	@Column(name = "UAZ")
	private BigDecimal uaz;

	@Column(name = "Total")
	private BigDecimal total;
	
	/************ Getters and Setters ************/

	public Integer getIdDetallePresupuestoIsn() {
		return idDetallePresupuestoIsn;
	}

	public void setIdDetallePresupuestoIsn(Integer idDetallePresupuestoIsn) {
		this.idDetallePresupuestoIsn = idDetallePresupuestoIsn;
	}

	public Integer getIdPresupuestoObligacion() {
		return idPresupuestoObligacion;
	}

	public void setIdPresupuestoObligacion(Integer idPresupuestoObligacion) {
		this.idPresupuestoObligacion = idPresupuestoObligacion;
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

	
}
