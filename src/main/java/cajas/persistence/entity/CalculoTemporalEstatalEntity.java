package cajas.persistence.entity;

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
@Table(name = "CalculoTemporalEstatal", schema = "recaudacion")
public class CalculoTemporalEstatalEntity {

	@Id
	@Column(name = "IdCalculoTemporal")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idCalculoTemporal;

	@Column(name = "IdContribuyente")
	private Integer idContribuyente;

	@Column(name = "IdSucursal")
	private Integer idSucursal;

	@Column(name = "IdObligacion")
	private Integer idObligacion;

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

	@Column(name = "IdUsuario")
	private Integer idUsuario;

	@Column(name = "FechaCalculo")
	private Date fechaCalculo;

	@Column(name = "HoraCalculo")
	private Time horaCalculo;
	
	/**************** Getters and Setters ****************/

	public Integer getIdCalculoTemporal() {
		return idCalculoTemporal;
	}

	public void setIdCalculoTemporal(Integer idCalculoTemporal) {
		this.idCalculoTemporal = idCalculoTemporal;
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

	public Integer getIdObligacion() {
		return idObligacion;
	}

	public void setIdObligacion(Integer idObligacion) {
		this.idObligacion = idObligacion;
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

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Date getFechaCalculo() {
		return fechaCalculo;
	}

	public void setFechaCalculo(Date fechaCalculo) {
		this.fechaCalculo = fechaCalculo;
	}

	public Time getHoraCalculo() {
		return horaCalculo;
	}

	public void setHoraCalculo(Time horaCalculo) {
		this.horaCalculo = horaCalculo;
	}
}
