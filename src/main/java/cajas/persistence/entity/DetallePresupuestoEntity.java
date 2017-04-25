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
@Table(name = "detalle_presupuesto", schema = "presupuestos")
public class DetallePresupuestoEntity implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7535560829211502363L;


	@Id
	@Column(name = "id_detalle_presupuesto")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idDetallePresupuesto;
	
	
	@Column(name="id_presupuesto")
	private Integer idPresupuesto;
	
	@Column(name="lcc")
	private String lcc;
	
	
	@Column(name="id_obligacion")
	private Integer idObligacion;
	
	
	@Column(name="id_cobro")
	private Integer idCobro;
	
	@Column(name="id_Contribuyente")
	private Integer idContribuyente;
	
	
	@Column(name="id_sucursal")
	private Integer idSucursal;
	
	@Column(name="tipo_declaracion")
	private String tipoDeclaracion;
	
	@Column(name="id_periodo")
	private Integer idPeriodo;
	
	
	@Column(name="ejercicio_fiscal")
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

	@Column(name = "id_usuario")
	private Integer idUsuario;

	@Column(name = "fecha_calculo")
	private Date fechaCalculo;

	@Column(name = "hora_calculo")
	private Date horaCalculo;

	/**
	 * @return the idDetallePresupuesto
	 */
	public Integer getIdDetallePresupuesto() {
		return idDetallePresupuesto;
	}

	/**
	 * @param idDetallePresupuesto the idDetallePresupuesto to set
	 */
	public void setIdDetallePresupuesto(Integer idDetallePresupuesto) {
		this.idDetallePresupuesto = idDetallePresupuesto;
	}

	/**
	 * @return the idPresupuesto
	 */
	public Integer getIdPresupuesto() {
		return idPresupuesto;
	}

	/**
	 * @param idPresupuesto the idPresupuesto to set
	 */
	public void setIdPresupuesto(Integer idPresupuesto) {
		this.idPresupuesto = idPresupuesto;
	}

	/**
	 * @return the lcc
	 */
	public String getLcc() {
		return lcc;
	}

	/**
	 * @param lcc the lcc to set
	 */
	public void setLcc(String lcc) {
		this.lcc = lcc;
	}

	/**
	 * @return the idObligacion
	 */
	public Integer getIdObligacion() {
		return idObligacion;
	}

	/**
	 * @param idObligacion the idObligacion to set
	 */
	public void setIdObligacion(Integer idObligacion) {
		this.idObligacion = idObligacion;
	}

	/**
	 * @return the idCobro
	 */
	public Integer getIdCobro() {
		return idCobro;
	}

	/**
	 * @param idCobro the idCobro to set
	 */
	public void setIdCobro(Integer idCobro) {
		this.idCobro = idCobro;
	}

	/**
	 * @return the idContribuyente
	 */
	public Integer getIdContribuyente() {
		return idContribuyente;
	}

	/**
	 * @param idContribuyente the idContribuyente to set
	 */
	public void setIdContribuyente(Integer idContribuyente) {
		this.idContribuyente = idContribuyente;
	}

	/**
	 * @return the idSucursal
	 */
	public Integer getIdSucursal() {
		return idSucursal;
	}

	/**
	 * @param idSucursal the idSucursal to set
	 */
	public void setIdSucursal(Integer idSucursal) {
		this.idSucursal = idSucursal;
	}

	/**
	 * @return the tipoDeclaracion
	 */
	public String getTipoDeclaracion() {
		return tipoDeclaracion;
	}

	/**
	 * @param tipoDeclaracion the tipoDeclaracion to set
	 */
	public void setTipoDeclaracion(String tipoDeclaracion) {
		this.tipoDeclaracion = tipoDeclaracion;
	}

	/**
	 * @return the idPeriodo
	 */
	public Integer getIdPeriodo() {
		return idPeriodo;
	}

	/**
	 * @param idPeriodo the idPeriodo to set
	 */
	public void setIdPeriodo(Integer idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

	/**
	 * @return the ejercicioFiscal
	 */
	public Integer getEjercicioFiscal() {
		return ejercicioFiscal;
	}

	/**
	 * @param ejercicioFiscal the ejercicioFiscal to set
	 */
	public void setEjercicioFiscal(Integer ejercicioFiscal) {
		this.ejercicioFiscal = ejercicioFiscal;
	}

	/**
	 * @return the baseGravable
	 */
	public BigDecimal getBaseGravable() {
		return baseGravable;
	}

	/**
	 * @param baseGravable the baseGravable to set
	 */
	public void setBaseGravable(BigDecimal baseGravable) {
		this.baseGravable = baseGravable;
	}

	/**
	 * @return the numeroEmpleados
	 */
	public Integer getNumeroEmpleados() {
		return numeroEmpleados;
	}

	/**
	 * @param numeroEmpleados the numeroEmpleados to set
	 */
	public void setNumeroEmpleados(Integer numeroEmpleados) {
		this.numeroEmpleados = numeroEmpleados;
	}

	/**
	 * @return the impuesto
	 */
	public BigDecimal getImpuesto() {
		return impuesto;
	}

	/**
	 * @param impuesto the impuesto to set
	 */
	public void setImpuesto(BigDecimal impuesto) {
		this.impuesto = impuesto;
	}

	/**
	 * @return the actualizaciones
	 */
	public BigDecimal getActualizaciones() {
		return actualizaciones;
	}

	/**
	 * @param actualizaciones the actualizaciones to set
	 */
	public void setActualizaciones(BigDecimal actualizaciones) {
		this.actualizaciones = actualizaciones;
	}

	/**
	 * @return the recargos
	 */
	public BigDecimal getRecargos() {
		return recargos;
	}

	/**
	 * @param recargos the recargos to set
	 */
	public void setRecargos(BigDecimal recargos) {
		this.recargos = recargos;
	}

	/**
	 * @return the uaz
	 */
	public BigDecimal getUaz() {
		return uaz;
	}

	/**
	 * @param uaz the uaz to set
	 */
	public void setUaz(BigDecimal uaz) {
		this.uaz = uaz;
	}

	/**
	 * @return the total
	 */
	public BigDecimal getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(BigDecimal total) {
		this.total = total;
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
	 * @return the fechaCalculo
	 */
	public Date getFechaCalculo() {
		return fechaCalculo;
	}

	/**
	 * @param fechaCalculo the fechaCalculo to set
	 */
	public void setFechaCalculo(Date fechaCalculo) {
		this.fechaCalculo = fechaCalculo;
	}

	/**
	 * @return the horaCalculo
	 */
	public Date getHoraCalculo() {
		return horaCalculo;
	}

	/**
	 * @param horaCalculo the horaCalculo to set
	 */
	public void setHoraCalculo(Date horaCalculo) {
		this.horaCalculo = horaCalculo;
	}

	
	
}
