package cajas.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "marcas_vehiculos", schema = "catalogos")
public class VerificacionVehicularEntity implements Serializable{

	private static final long serialVersionUID = 4520026756457631203L;
	
	@Id
	@Column( name = "id_verificacion_vehiculo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVerificacionVehiculo;
	
	@Column( name = "ejercicio" )
	private Integer ejercicio;
	
	@Column( name = "no_seguimiento_verificacion" )
	private Integer noSeguimientoVerificacion;
	
	@Column( name = "fecha_verificacion" )
	private Date fechaVerificacion;
	
	@Column( name = "tipo_verificacion" )
	private Integer tipoVerificacion;
	
	@Column( name = "vin_vehiculo" )
	private String vinVehiculo;
	
	@Column( name = "id_marca_vehiculo" )
	private Integer idMarcaVehiculo;
	
	@Column( name = "modelo_vehiculo" )
	private Integer modeloVehiculo;
	
	@Column( name = "id_clase_vehiculo" )
	private Integer idClaseVehiculo;
	
	@Column( name = "id_tipo_vehiculo" )
	private Integer idTipoVehiculo;
	
	@Column( name = "linea_vehiculo" )
	private String lineaVehiculo;
	
	@Column( name = "estatus_verificacion" )
	private Integer estatusVerificacion;
	
	@Column( name = "factura_vehiculo_documentacion" )
	private Boolean facturaVehiculoDocumentacion;
	
	@Column( name = "identificacion_oficial_documentacion" )
	private Boolean identificacionOficialDocumentacion;
	
	@Column( name = "comprobante_domicilio_documentacion" )
	private Boolean comprobanteDomicilioDocumentacion;
	
	@Column( name = "rfc_persona_moral_documentacion" )
	private Boolean rfcPersonaMoralDocumentacion;
	
	@Column( name = "identificacion_representante_legal_documentacion" )
	private Boolean identificacionRepresentanteLegalDocumentacion;
	
	@Column( name = "nombre_persona_verificacion" )
	private String nombrePersonaVerificacion;
	
	@Column( name = "apellido_paterno_persona_verificacion" )
	private String apellidoPaternoPersonaVerificacion;
	
	@Column( name = "apellido_materno_persona_verificacion" )
	private String apellidoMaternoPersonaVerificacion;
	
	@Column( name = "numero_motor_vehiculo" )
	private String numeroMotorVehiculo;

	public Integer getIdVerificacionVehiculo() {
		return idVerificacionVehiculo;
	}

	public void setIdVerificacionVehiculo(Integer idVerificacionVehiculo) {
		this.idVerificacionVehiculo = idVerificacionVehiculo;
	}

	public Integer getEjercicio() {
		return ejercicio;
	}

	public void setEjercicio(Integer ejercicio) {
		this.ejercicio = ejercicio;
	}

	public Integer getNoSeguimientoVerificacion() {
		return noSeguimientoVerificacion;
	}

	public void setNoSeguimientoVerificacion(Integer noSeguimientoVerificacion) {
		this.noSeguimientoVerificacion = noSeguimientoVerificacion;
	}

	public Date getFechaVerificacion() {
		return fechaVerificacion;
	}

	public void setFechaVerificacion(Date fechaVerificacion) {
		this.fechaVerificacion = fechaVerificacion;
	}

	public Integer getTipoVerificacion() {
		return tipoVerificacion;
	}

	public void setTipoVerificacion(Integer tipoVerificacion) {
		this.tipoVerificacion = tipoVerificacion;
	}

	public String getVinVehiculo() {
		return vinVehiculo;
	}

	public void setVinVehiculo(String vinVehiculo) {
		this.vinVehiculo = vinVehiculo;
	}

	public Integer getIdMarcaVehiculo() {
		return idMarcaVehiculo;
	}

	public void setIdMarcaVehiculo(Integer idMarcaVehiculo) {
		this.idMarcaVehiculo = idMarcaVehiculo;
	}

	public Integer getModeloVehiculo() {
		return modeloVehiculo;
	}

	public void setModeloVehiculo(Integer modeloVehiculo) {
		this.modeloVehiculo = modeloVehiculo;
	}

	public Integer getIdClaseVehiculo() {
		return idClaseVehiculo;
	}

	public void setIdClaseVehiculo(Integer idClaseVehiculo) {
		this.idClaseVehiculo = idClaseVehiculo;
	}

	public Integer getIdTipoVehiculo() {
		return idTipoVehiculo;
	}

	public void setIdTipoVehiculo(Integer idTipoVehiculo) {
		this.idTipoVehiculo = idTipoVehiculo;
	}

	public String getLineaVehiculo() {
		return lineaVehiculo;
	}

	public void setLineaVehiculo(String lineaVehiculo) {
		this.lineaVehiculo = lineaVehiculo;
	}

	public Integer getEstatusVerificacion() {
		return estatusVerificacion;
	}

	public void setEstatusVerificacion(Integer estatusVerificacion) {
		this.estatusVerificacion = estatusVerificacion;
	}

	public Boolean getFacturaVehiculoDocumentacion() {
		return facturaVehiculoDocumentacion;
	}

	public void setFacturaVehiculoDocumentacion(Boolean facturaVehiculoDocumentacion) {
		this.facturaVehiculoDocumentacion = facturaVehiculoDocumentacion;
	}

	public Boolean getIdentificacionOficialDocumentacion() {
		return identificacionOficialDocumentacion;
	}

	public void setIdentificacionOficialDocumentacion(Boolean identificacionOficialDocumentacion) {
		this.identificacionOficialDocumentacion = identificacionOficialDocumentacion;
	}

	public Boolean getComprobanteDomicilioDocumentacion() {
		return comprobanteDomicilioDocumentacion;
	}

	public void setComprobanteDomicilioDocumentacion(Boolean comprobanteDomicilioDocumentacion) {
		this.comprobanteDomicilioDocumentacion = comprobanteDomicilioDocumentacion;
	}

	public Boolean getRfcPersonaMoralDocumentacion() {
		return rfcPersonaMoralDocumentacion;
	}

	public void setRfcPersonaMoralDocumentacion(Boolean rfcPersonaMoralDocumentacion) {
		this.rfcPersonaMoralDocumentacion = rfcPersonaMoralDocumentacion;
	}

	public Boolean getIdentificacionRepresentanteLegalDocumentacion() {
		return identificacionRepresentanteLegalDocumentacion;
	}

	public void setIdentificacionRepresentanteLegalDocumentacion(Boolean identificacionRepresentanteLegalDocumentacion) {
		this.identificacionRepresentanteLegalDocumentacion = identificacionRepresentanteLegalDocumentacion;
	}

	public String getNombrePersonaVerificacion() {
		return nombrePersonaVerificacion;
	}

	public void setNombrePersonaVerificacion(String nombrePersonaVerificacion) {
		this.nombrePersonaVerificacion = nombrePersonaVerificacion;
	}

	public String getApellidoPaternoPersonaVerificacion() {
		return apellidoPaternoPersonaVerificacion;
	}

	public void setApellidoPaternoPersonaVerificacion(String apellidoPaternoPersonaVerificacion) {
		this.apellidoPaternoPersonaVerificacion = apellidoPaternoPersonaVerificacion;
	}

	public String getApellidoMaternoPersonaVerificacion() {
		return apellidoMaternoPersonaVerificacion;
	}

	public void setApellidoMaternoPersonaVerificacion(String apellidoMaternoPersonaVerificacion) {
		this.apellidoMaternoPersonaVerificacion = apellidoMaternoPersonaVerificacion;
	}

	public String getNumeroMotorVehiculo() {
		return numeroMotorVehiculo;
	}

	public void setNumeroMotorVehiculo(String numeroMotorVehiculo) {
		this.numeroMotorVehiculo = numeroMotorVehiculo;
	}
	
	

}
