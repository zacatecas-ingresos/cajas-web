package cajas.vehicular.verificacion.alta;

import cajas.persistence.entity.VerificacionVehicularEntity;

import java.util.Date;

public class VerficacionVehiculo {
	private Integer idVerificacionVehiculo;
	private Integer ejercicio;
	private Integer noSeguimientoVerificion;
	private Date fechaVerificacion;
	private Integer tipoVerificacion;
	private String vinVehiculo;
	private Integer idMarcaVehiculo;
	private Integer modeloVehiculo;
	private Integer idClaseVehiculo;
	private Integer idTipoVehiculo;
	private String lineaVehiculo;
	private Integer estatusVerificacion;
	private Boolean facturaVehiculoDocumentacion;
	private Boolean identificacionOficialDocumentacion;
	private Boolean comprobanteDomicilioDocumentacion;
	private Boolean rfcPersonaMoralDocumentacion;
	private Boolean identificacionRepresentanteLegalDocumentacion;
	private String nombrePersonaVerificacion;
	private String apellidoPaternoPersonaVerificacion;
	private String apellidoMaternoPersonaVerificacion;
	private String numeroMotorVehiculo;
	
	
	
	public VerficacionVehiculo(VerificacionVehicularEntity verificacionVehicularEntity) {
		
		this.setIdVerificacionVehiculo(verificacionVehicularEntity.getIdVerificacionVehiculo());
		this.setEjercicio(verificacionVehicularEntity.getEjercicio());
		this.setNoSeguimientoVerificion(verificacionVehicularEntity.getNoSeguimientoVerificacion());
		this.setFechaVerificacion(verificacionVehicularEntity.getFechaVerificacion());
		this.setTipoVerificacion(verificacionVehicularEntity.getTipoVerificacion());
		this.setVinVehiculo(verificacionVehicularEntity.getVinVehiculo());
		this.setIdMarcaVehiculo(verificacionVehicularEntity.getIdMarcaVehiculo());
		this.setModeloVehiculo(verificacionVehicularEntity.getModeloVehiculo());
		this.setIdClaseVehiculo(verificacionVehicularEntity.getIdClaseVehiculo());
		this.setIdTipoVehiculo(verificacionVehicularEntity.getIdTipoVehiculo());
		this.setLineaVehiculo(verificacionVehicularEntity.getLineaVehiculo());
		this.setEstatusVerificacion(verificacionVehicularEntity.getEstatusVerificacion());
		this.setFacturaVehiculoDocumentacion(verificacionVehicularEntity.getFacturaVehiculoDocumentacion());
		this.setIdentificacionOficialDocumentacion(verificacionVehicularEntity.getIdentificacionOficialDocumentacion());
		this.setComprobanteDomicilioDocumentacion(verificacionVehicularEntity.getComprobanteDomicilioDocumentacion());
		this.setRfcPersonaMoralDocumentacion(verificacionVehicularEntity.getComprobanteDomicilioDocumentacion());
		this.setIdentificacionRepresentanteLegalDocumentacion(verificacionVehicularEntity.getIdentificacionRepresentanteLegalDocumentacion());
		this.setNombrePersonaVerificacion(verificacionVehicularEntity.getNombrePersonaVerificacion());
		this.setApellidoPaternoPersonaVerificacion(verificacionVehicularEntity.getApellidoPaternoPersonaVerificacion());
		this.setApellidoMaternoPersonaVerificacion(verificacionVehicularEntity.getApellidoMaternoPersonaVerificacion());
		this.setNumeroMotorVehiculo(verificacionVehicularEntity.getNumeroMotorVehiculo());
	
	}
	
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
	public Integer getNoSeguimientoVerificion() {
		return noSeguimientoVerificion;
	}
	public void setNoSeguimientoVerificion(Integer noSeguimientoVerificion) {
		this.noSeguimientoVerificion = noSeguimientoVerificion;
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
