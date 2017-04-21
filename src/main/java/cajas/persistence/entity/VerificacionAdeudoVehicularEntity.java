package cajas.persistence.entity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "verificaciones_adeudos_vehiculos", schema = "vehicular")
public class VerificacionAdeudoVehicularEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -695960574215574953L;
	@Id
	@Column(name = "id_verificacion_adeudo_vehiculo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVerificacionAdeudoVehiculo;
	
	/*
	 * LLave foranea hacia Verificaciones Vehiculos
	 * */
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_verificacion_vehiculo")
	private VerificacionVehicularEntity verificacionVehicularEntity;
	
	@Column( name = "anio0_verificacion_adeudo")
	private Integer anio0VerificacionAdeudo;
	
	@Column( name = "anio1_verificacion_adeudo")
	private Integer anio1VerificacionAdeudo;
	
	@Column( name = "anio2_verificacion_adeudo")
	private Integer anio2VerificacionAdeudo;
	
	@Column( name = "anio3_verificacion_adeudo")
	private Integer anio3VerificacionAdeudo;
	
	@Column( name = "anio4_verificacion_adeudo")
	private Integer anio4VerificacionAdeudo;
	
	@Column( name = "anio5_verificacion_adeudo")
	private Integer anio5VerificacionAdeudo;
	
	@Column( name = "folio_verificacion_adeudo")
	private Integer folioVerificacionAdeudo;
	
	@Column( name = "procedencia" )
	private Integer procedencia;
	
	/*
	 * Llave foranea Estado
	 * */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_estado")
	private EstadoEntity estado;
	
	
	@Column( name = "folio_calcamonia" )
	private Integer folioCalcamonia;
	
	@Column( name = "fecha_regularizacion" )
	private Date fechaRegularizacion;
	
	@Column( name = "documento" )
	private Integer documento;
	
	@Column( name = "estatus" )
	private Integer estatus;
	
	@Column( name = "observaciones" )
	private String observaciones;
	
	@Column( name = "baja" )
	private Integer baja;
	
	@Column( name = "baja_placa" )
	private String bajaPlaca;
	
	@Column( name = "fecha_verificacion_adeudo" )
	private String fechaVerificacionAdeudo;

	public Integer getIdVerificacionAdeudoVehiculo() {
		return idVerificacionAdeudoVehiculo;
	}

	public void setIdVerificacionAdeudoVehiculo(Integer idVerificacionAdeudoVehiculo) {
		this.idVerificacionAdeudoVehiculo = idVerificacionAdeudoVehiculo;
	}

	public Integer getAnio0VerificacionAdeudo() {
		return anio0VerificacionAdeudo;
	}

	public void setAnio0VerificacionAdeudo(Integer anio0VerificacionAdeudo) {
		this.anio0VerificacionAdeudo = anio0VerificacionAdeudo;
	}

	public Integer getAnio1VerificacionAdeudo() {
		return anio1VerificacionAdeudo;
	}

	public void setAnio1VerificacionAdeudo(Integer anio1VerificacionAdeudo) {
		this.anio1VerificacionAdeudo = anio1VerificacionAdeudo;
	}

	public Integer getAnio2VerificacionAdeudo() {
		return anio2VerificacionAdeudo;
	}

	public void setAnio2VerificacionAdeudo(Integer anio2VerificacionAdeudo) {
		this.anio2VerificacionAdeudo = anio2VerificacionAdeudo;
	}

	public Integer getAnio3VerificacionAdeudo() {
		return anio3VerificacionAdeudo;
	}

	public void setAnio3VerificacionAdeudo(Integer anio3VerificacionAdeudo) {
		this.anio3VerificacionAdeudo = anio3VerificacionAdeudo;
	}

	public Integer getAnio4VerificacionAdeudo() {
		return anio4VerificacionAdeudo;
	}

	public void setAnio4VerificacionAdeudo(Integer anio4VerificacionAdeudo) {
		this.anio4VerificacionAdeudo = anio4VerificacionAdeudo;
	}

	public Integer getAnio5VerificacionAdeudo() {
		return anio5VerificacionAdeudo;
	}

	public void setAnio5VerificacionAdeudo(Integer anio5VerificacionAdeudo) {
		this.anio5VerificacionAdeudo = anio5VerificacionAdeudo;
	}

	public Integer getFolioVerificacionAdeudo() {
		return folioVerificacionAdeudo;
	}

	public void setFolioVerificacionAdeudo(Integer folioVerificacionAdeudo) {
		this.folioVerificacionAdeudo = folioVerificacionAdeudo;
	}

	public Integer getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(Integer procedencia) {
		this.procedencia = procedencia;
	}

	public VerificacionVehicularEntity getVerificacionVehicularEntity() {
		return verificacionVehicularEntity;
	}

	public void setVerificacionVehicularEntity(VerificacionVehicularEntity verificacionVehicularEntity) {
		this.verificacionVehicularEntity = verificacionVehicularEntity;
	}

	public EstadoEntity getEstado() {
		return estado;
	}

	public void setEstado(EstadoEntity estado) {
		this.estado = estado;
	}

	public Integer getFolioCalcamonia() {
		return folioCalcamonia;
	}

	public void setFolioCalcamonia(Integer folioCalcamonia) {
		this.folioCalcamonia = folioCalcamonia;
	}

	public Date getFechaRegularizacion() {
		return fechaRegularizacion;
	}

	public void setFechaRegularizacion(Date fechaRegularizacion) {
		this.fechaRegularizacion = fechaRegularizacion;
	}

	public Integer getDocumento() {
		return documento;
	}

	public void setDocumento(Integer documento) {
		this.documento = documento;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Integer getBaja() {
		return baja;
	}

	public void setBaja(Integer baja) {
		this.baja = baja;
	}

	public String getBajaPlaca() {
		return bajaPlaca;
	}

	public void setBajaPlaca(String bajaPlaca) {
		this.bajaPlaca = bajaPlaca;
	}

	public String getFechaVerificacionAdeudo() {
		return fechaVerificacionAdeudo;
	}

	public void setFechaVerificacionAdeudo(String fechaVerificacionAdeudo) {
		this.fechaVerificacionAdeudo = fechaVerificacionAdeudo;
	}	
	
}
