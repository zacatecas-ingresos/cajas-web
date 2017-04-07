package cajas.persistence.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "calculo_temporal")
public class CalculoTemporalEstatalEntity {

	@Id
	@Column(name = "id_calculo_temporal")
	private Integer idCalculoTemporal;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name = "id_contribuyente")
	private ContribuyenteEntity idContribuyente;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name = "id_sucursal")
	private SucursalEntity idSucursal;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name = "id_obligacion")
	private ObligacionesEntity idObligacion;
	
	@Column(name = "tipo_declaracion")
	private String tipoDeclaracion;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name = "id_periodo")
	private PeriodosEntity idPeriodo;
	
	@Column(name = "ejercicio_fiscal")
	private Integer ejercicioFiscal;
	
	@Column(name = "base_gravable")
	private BigDecimal baseGravable;
	
	@Column(name = "numero_empleados")
	private Integer numeroEmpleados;
	
	@Column(name = "impuestos")
	private BigDecimal impuestos;
	
	@Column(name = "actualizaciones")
	private BigDecimal actualizaciones;
	
	@Column(name = "recargos")
	private BigDecimal recargos;
	
	@Column(name = "uaz")
	private BigDecimal uaz;
	
	@Column(name = "total")
	private BigDecimal total;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name = "id_usuario")
	private UsuarioEntity idUsuario;
	
	@Column(name = "fecha_calculo")
	private Date fechaCalculo;
	
	@Column(name = "hora_calculo")
	private Time horaCalculo;
}
