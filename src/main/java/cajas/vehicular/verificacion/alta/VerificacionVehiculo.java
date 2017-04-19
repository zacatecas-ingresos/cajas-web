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
	private Boolean facturaVehiculoDocumentacion;
	private Boolean identificacionOficialDocumentacion;
	private Boolean comprobanteDomicilioDocumentacion;
	private Boolean rfcPersonaMoralDocumentacion;
	private Boolean identificacionRepresentanteLegalDocumentacion;
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
		
		VerificacionVehiculo verificacionVehiculo = new VerificacionVehiculo();
		
		verificacionVehiculo.setIdVerificacionVehiculo(verificacionVehicularEntity.getIdVerificacionVehiculo());
		verificacionVehiculo.setEjercicio(verificacionVehicularEntity.getEjercicio());
		verificacionVehiculo.setNoSeguimientoVerificion(verificacionVehicularEntity.getNoSeguimientoVerificacion());
		verificacionVehiculo.setFechaVerificacion(verificacionVehicularEntity.getFechaVerificacion());
		verificacionVehiculo.setTipoVerificacion(verificacionVehicularEntity.getTipoVerificacion());
		verificacionVehiculo.setVinVehiculo(verificacionVehicularEntity.getVinVehiculo());
		if (verificacionVehicularEntity.getMarcaVehiculo() != null) {
			verificacionVehiculo.setIdMarcaVehiculo(verificacionVehicularEntity.getMarcaVehiculo().getIdMarcaVehiculo());
		}
		verificacionVehiculo.setModeloVehiculo(verificacionVehicularEntity.getModeloVehiculo());
		verificacionVehiculo.setIdClaseVehiculo(verificacionVehicularEntity.getIdClaseVehiculo());
		verificacionVehiculo.setIdTipoVehiculo(verificacionVehicularEntity.getIdTipoVehiculo());
		verificacionVehiculo.setLineaVehiculo(verificacionVehicularEntity.getLineaVehiculo());
		verificacionVehiculo.setEstatusVerificacion(verificacionVehicularEntity.getEstatusVerificacion());
		verificacionVehiculo.setFacturaVehiculoDocumentacion(verificacionVehicularEntity.getFacturaVehiculoDocumentacion());
		verificacionVehiculo.setIdentificacionOficialDocumentacion(verificacionVehicularEntity.getIdentificacionOficialDocumentacion());
		verificacionVehiculo.setComprobanteDomicilioDocumentacion(verificacionVehicularEntity.getComprobanteDomicilioDocumentacion());
		verificacionVehiculo.setRfcPersonaMoralDocumentacion(verificacionVehicularEntity.getComprobanteDomicilioDocumentacion());
		verificacionVehiculo.setIdentificacionRepresentanteLegalDocumentacion(verificacionVehicularEntity.getIdentificacionRepresentanteLegalDocumentacion());
		verificacionVehiculo.setNombrePersonaVerificacion(verificacionVehicularEntity.getNombrePersonaVerificacion());
		verificacionVehiculo.setApellidoPaternoPersonaVerificacion(verificacionVehicularEntity.getApellidoPaternoPersonaVerificacion());
		verificacionVehiculo.setApellidoMaternoPersonaVerificacion(verificacionVehicularEntity.getApellidoMaternoPersonaVerificacion());
		verificacionVehiculo.setNumeroMotorVehiculo(verificacionVehicularEntity.getNumeroMotorVehiculo());
		verificacionVehiculo.setIdOficinaVerificacion(verificacionVehicularEntity.getIdOficinaVerificacion());
		verificacionVehiculo.setAnio1ComprobantePago(verificacionVehicularEntity.getAnio1ComprobantePago());
		verificacionVehiculo.setAnio2ComprobantePago(verificacionVehicularEntity.getAnio2ComprobantePago());
		verificacionVehiculo.setAnio3ComprobantePago(verificacionVehicularEntity.getAnio3ComprobantePago());
		verificacionVehiculo.setAnio4ComprobantePago(verificacionVehicularEntity.getAnio4ComprobantePago());
		verificacionVehiculo.setAnio5ComprobantePago(verificacionVehicularEntity.getAnio5ComprobantePago());
		verificacionVehiculo.setAnioActualComprobantePago(verificacionVehicularEntity.getAnioActualComprobantePago());
	
		return verificacionVehiculo;
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
