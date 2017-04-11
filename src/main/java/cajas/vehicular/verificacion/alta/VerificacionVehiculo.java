package cajas.vehicular.verificacion.alta;

import cajas.persistence.entity.VerificacionVehicularEntity;

import java.util.Date;

public class VerificacionVehiculo {
	
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
	private Integer facturaVehiculoDocumentacion;
	private Integer identificacionOficialDocumentacion;
	private Integer comprobanteDomicilioDocumentacion;
	private Integer rfcPersonaMoralDocumentacion;
	private Integer identificacionRepresentanteLegalDocumentacion;
	private String nombrePersonaVerificacion;
	private String apellidoPaternoPersonaVerificacion;
	private String apellidoMaternoPersonaVerificacion;
	private String numeroMotorVehiculo;
	private Integer idOficinaVerificacion;
	private Integer anio1ComprobantePago;
	private Integer anio2ComprobantePago;
	private Integer anio3ComprobantePago;
	private Integer anio4ComprobantePago;
	private Integer anio5ComprobantePago;
	private Integer anioActualComprobantePago;
	
	/*
	public VerificacionVehiculo()
	{
		
	} */
	
	public VerificacionVehiculo verificacionVehiculoEntity(VerificacionVehicularEntity verificacionVehicularEntity) {
		
		VerificacionVehiculo vVehiculo = new VerificacionVehiculo();
		
		vVehiculo.setIdVerificacionVehiculo(verificacionVehicularEntity.getIdVerificacionVehiculo());
		vVehiculo.setEjercicio(verificacionVehicularEntity.getEjercicio());
		vVehiculo.setNoSeguimientoVerificion(verificacionVehicularEntity.getNoSeguimientoVerificacion());
		vVehiculo.setFechaVerificacion(verificacionVehicularEntity.getFechaVerificacion());
		vVehiculo.setTipoVerificacion(verificacionVehicularEntity.getTipoVerificacion());
		vVehiculo.setVinVehiculo(verificacionVehicularEntity.getVinVehiculo());
		vVehiculo.setIdMarcaVehiculo(verificacionVehicularEntity.getIdMarcaVehiculo());
		vVehiculo.setModeloVehiculo(verificacionVehicularEntity.getModeloVehiculo());
		vVehiculo.setIdClaseVehiculo(verificacionVehicularEntity.getIdClaseVehiculo());
		vVehiculo.setIdTipoVehiculo(verificacionVehicularEntity.getIdTipoVehiculo());
		vVehiculo.setLineaVehiculo(verificacionVehicularEntity.getLineaVehiculo());
		vVehiculo.setEstatusVerificacion(verificacionVehicularEntity.getEstatusVerificacion());
		vVehiculo.setFacturaVehiculoDocumentacion(verificacionVehicularEntity.getFacturaVehiculoDocumentacion());
		vVehiculo.setIdentificacionOficialDocumentacion(verificacionVehicularEntity.getIdentificacionOficialDocumentacion());
		vVehiculo.setComprobanteDomicilioDocumentacion(verificacionVehicularEntity.getComprobanteDomicilioDocumentacion());
		vVehiculo.setRfcPersonaMoralDocumentacion(verificacionVehicularEntity.getComprobanteDomicilioDocumentacion());
		vVehiculo.setIdentificacionRepresentanteLegalDocumentacion(verificacionVehicularEntity.getIdentificacionRepresentanteLegalDocumentacion());
		vVehiculo.setNombrePersonaVerificacion(verificacionVehicularEntity.getNombrePersonaVerificacion());
		vVehiculo.setApellidoPaternoPersonaVerificacion(verificacionVehicularEntity.getApellidoPaternoPersonaVerificacion());
		vVehiculo.setApellidoMaternoPersonaVerificacion(verificacionVehicularEntity.getApellidoMaternoPersonaVerificacion());
		vVehiculo.setNumeroMotorVehiculo(verificacionVehicularEntity.getNumeroMotorVehiculo());
		vVehiculo.setIdOficinaVerificacion(verificacionVehicularEntity.getIdOficinaVerificacion());
		vVehiculo.setAnio1ComprobantePago(verificacionVehicularEntity.getAnio1ComprobantePago());
		vVehiculo.setAnio2ComprobantePago(verificacionVehicularEntity.getAnio2ComprobantePago());
		vVehiculo.setAnio3ComprobantePago(verificacionVehicularEntity.getAnio3ComprobantePago());
		vVehiculo.setAnio4ComprobantePago(verificacionVehicularEntity.getAnio4ComprobantePago());
		vVehiculo.setAnio5ComprobantePago(verificacionVehicularEntity.getAnio5ComprobantePago());
		vVehiculo.setAnioActualComprobantePago(verificacionVehicularEntity.getAnioActualComprobantePago());
	
		return vVehiculo;
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
	public Integer getFacturaVehiculoDocumentacion() {
		return facturaVehiculoDocumentacion;
	}
	public void setFacturaVehiculoDocumentacion(Integer facturaVehiculoDocumentacion) {
		this.facturaVehiculoDocumentacion = facturaVehiculoDocumentacion;
	}
	public Integer getIdentificacionOficialDocumentacion() {
		return identificacionOficialDocumentacion;
	}
	public void setIdentificacionOficialDocumentacion(Integer identificacionOficialDocumentacion) {
		this.identificacionOficialDocumentacion = identificacionOficialDocumentacion;
	}
	public Integer getComprobanteDomicilioDocumentacion() {
		return comprobanteDomicilioDocumentacion;
	}
	public void setComprobanteDomicilioDocumentacion(Integer comprobanteDomicilioDocumentacion) {
		this.comprobanteDomicilioDocumentacion = comprobanteDomicilioDocumentacion;
	}
	public Integer getRfcPersonaMoralDocumentacion() {
		return rfcPersonaMoralDocumentacion;
	}
	public void setRfcPersonaMoralDocumentacion(Integer rfcPersonaMoralDocumentacion) {
		this.rfcPersonaMoralDocumentacion = rfcPersonaMoralDocumentacion;
	}
	public Integer getIdentificacionRepresentanteLegalDocumentacion() {
		return identificacionRepresentanteLegalDocumentacion;
	}
	public void setIdentificacionRepresentanteLegalDocumentacion(Integer identificacionRepresentanteLegalDocumentacion) {
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

	public Integer getIdOficinaVerificacion() {
		return idOficinaVerificacion;
	}

	public void setIdOficinaVerificacion(Integer idOficinaVerificacion) {
		this.idOficinaVerificacion = idOficinaVerificacion;
	}

	public Integer getAnio1ComprobantePago() {
		return anio1ComprobantePago;
	}

	public void setAnio1ComprobantePago(Integer anio1ComprobantePago) {
		this.anio1ComprobantePago = anio1ComprobantePago;
	}

	public Integer getAnio2ComprobantePago() {
		return anio2ComprobantePago;
	}

	public void setAnio2ComprobantePago(Integer anio2ComprobantePago) {
		this.anio2ComprobantePago = anio2ComprobantePago;
	}

	public Integer getAnio3ComprobantePago() {
		return anio3ComprobantePago;
	}

	public void setAnio3ComprobantePago(Integer anio3ComprobantePago) {
		this.anio3ComprobantePago = anio3ComprobantePago;
	}

	public Integer getAnio4ComprobantePago() {
		return anio4ComprobantePago;
	}

	public void setAnio4ComprobantePago(Integer anio4ComprobantePago) {
		this.anio4ComprobantePago = anio4ComprobantePago;
	}

	public Integer getAnio5ComprobantePago() {
		return anio5ComprobantePago;
	}

	public void setAnio5ComprobantePago(Integer anio5ComprobantePago) {
		this.anio5ComprobantePago = anio5ComprobantePago;
	}

	public Integer getAnioActualComprobantePago() {
		return anioActualComprobantePago;
	}

	public void setAnioActualComprobantePago(Integer anioActualComprobantePago) {
		this.anioActualComprobantePago = anioActualComprobantePago;
	}
	
	
	
}
