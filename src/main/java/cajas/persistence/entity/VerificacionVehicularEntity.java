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
@Table(name = "VerificacionesVehiculo", schema = "vehicular")
public class VerificacionVehicularEntity implements Serializable {

	private static final long serialVersionUID = 4520026756457631203L;

	@Id
	@Column(name = "IdVerificacionVehiculo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVerificacionVehiculo;

	@Column(name = "Ejercicio")
	private Integer ejercicio;

	@Column(name = "NoSeguimientoVerificacion")
	private Integer noSeguimientoVerificacion;

	@Column(name = "FechaVerificacion")
	private Date fechaVerificacion;

	@Column(name = "VinVehiculo")
	private String vinVehiculo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdMarcaVehiculo")
	private MarcaVehiculoEntity marcaVehiculo;
	
	@Column(name = "ModeloVehiculo")
	private Integer modeloVehiculo;

	@Column(name = "IdClaseVehiculo")
	private Integer idClaseVehiculo;

	@Column(name = "IdTipoVehiculo")
	private Integer idTipoVehiculo;

	@Column(name = "LineaVehiculo")
	private String lineaVehiculo;

	@Column(name = "EstatusVerificacion")
	private Integer estatusVerificacion;

	@Column(name = "FacturaVehiculoDocumentacion")
	private Boolean facturaVehiculoDocumentacion;

	@Column(name = "IdentificacionOficialDocumentacion")
	private Boolean identificacionOficialDocumentacion;

	@Column(name = "ComprobanteDomicilioDocumentacion")
	private Boolean comprobanteDomicilioDocumentacion;

	@Column(name = "RFCpersonaMoralDocumentacion")
	private Boolean rfcPersonaMoralDocumentacion;

	@Column(name = "IdentificacionRepresentanteLegalDocumentacion")
	private Boolean identificacionRepresentanteLegalDocumentacion;

	@Column(name = "NombrePersonaVerificacion")
	private String nombrePersonaVerificacion;

	@Column(name = "ApellidoPaternoPersonaVerificacion")
	private String apellidoPaternoPersonaVerificacion;

	@Column(name = "ApellidoMaternoPersonaVerificacion")
	private String apellidoMaternoPersonaVerificacion;

	@Column(name = "NumeroMotorVehiculo")
	private String numeroMotorVehiculo;

	@Column(name = "IdOficinaVerificacion")
	private Integer idOficinaVerificacion;

	@Column(name = "Anio1ComprobantePago")
	private Integer anio1ComprobantePago;

	@Column(name = "Anio2ComprobantePago")
	private Integer anio2ComprobantePago;

	@Column(name = "Anio3ComprobantePago")
	private Integer anio3ComprobantePago;

	@Column(name = "Anio4ComprobantePago")
	private Integer anio4ComprobantePago;

	@Column(name = "Anio5ComprobantePago")
	private Integer anio5ComprobantePago;

	@Column(name = "AnioActualComprobantePago")
	private Integer anioActualComprobantePago;

	@Column(name = "FechaVerificacionMinisterial")
	private Date fechaVerificacionMinisterial;

	@Column(name = "FolioVerificacionMinisterial")
	private Integer folioVerificacionMinisterial;

	@Column(name = "ObservacionesMinisterial")
	private String observacionesMinisterial;

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

	public String getVinVehiculo() {
		return vinVehiculo;
	}

	public void setVinVehiculo(String vinVehiculo) {
		this.vinVehiculo = vinVehiculo;
	}
	public MarcaVehiculoEntity getMarcaVehiculo() {
		return marcaVehiculo;
	}
	public void setMarcaVehiculo(MarcaVehiculoEntity marcaVehiculo) {
		this.marcaVehiculo = marcaVehiculo;
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

	public void setIdentificacionRepresentanteLegalDocumentacion(
			Boolean identificacionRepresentanteLegalDocumentacion) {
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

	
	public Date getFechaVerificacionMinisterial() {
		return fechaVerificacionMinisterial;
	}

	public void setFechaVerificacionMinisterial(Date fechaVerificacionMinisterial) {
		this.fechaVerificacionMinisterial = fechaVerificacionMinisterial;
	}

	
	public Integer getFolioVerificacionMinisterial() {
		return folioVerificacionMinisterial;
	}

	public void setFolioVerificacionMinisterial(Integer folioVerificacionMinisterial) {
		this.folioVerificacionMinisterial = folioVerificacionMinisterial;
	}

	public String getObservacionesMinisterial() {
		return observacionesMinisterial;
	}

	public void setObservacionesMinisterial(String observacionesMinisterial) {
		this.observacionesMinisterial = observacionesMinisterial;
	} 
}
