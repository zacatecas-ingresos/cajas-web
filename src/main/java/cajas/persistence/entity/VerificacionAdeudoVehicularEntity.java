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
@Table(name = "VerificacionesAdeudosVehiculos", schema = "vehicular")
public class VerificacionAdeudoVehicularEntity implements Serializable{
	private static final long serialVersionUID = -695960574215574953L;

	@Id
	@Column(name = "IdVerificacionAdeudoVehiculo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVerificacionAdeudoVehiculo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdVerificacionVehiculo")
	private VerificacionVehicularEntity verificacionVehicular;
	
	@Column( name = "Anio0VerificacionAdeudo")
	private Integer anio0VerificacionAdeudo;
	
	@Column( name = "Anio1VerificacionAdeudo")
	private Integer anio1VerificacionAdeudo;
	
	@Column( name = "Anio2VerificacionAdeudo")
	private Integer anio2VerificacionAdeudo;
	
	@Column( name = "Anio3VerificacionAdeudo")
	private Integer anio3VerificacionAdeudo;
	
	@Column( name = "Anio4VerificacionAdeudo")
	private Integer anio4VerificacionAdeudo;
	
	@Column( name = "Anio5VerificacionAdeudo")
	private Integer anio5VerificacionAdeudo;
	
	@Column( name = "FolioVerificacionAdeudo")
	private Integer folioVerificacionAdeudo;
	
	@Column( name = "Procedencia" )
	private Integer procedencia;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdEstado")
	private EstadoEntity estado;

	@Column( name = "FolioCalcamonia" )
	private Integer folioCalcamonia;
	
	@Column( name = "FechaRegularizacion" )
	private Date fechaRegularizacion;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdDocumentoPedimento")
	private DocumentoPedimentoEntity documentoPedimento;
/*
 * Crear EstatusVerificacionVehicularEntoty
 */
	@Column( name = "Estatus" )
	private Integer estatus;

	@Column( name = "Observaciones" )
	private String observaciones;

	/*
	 * Cambiar boolean
	 */
	@Column( name = "Baja" )
	private Integer baja;

	@Column( name = "BajaPlaca" )
	private String bajaPlaca;

	@Column( name = "FechaVerificacionAdeudo" )
	private Date fechaVerificacionAdeudo;

	public Integer getIdVerificacionAdeudoVehiculo() {
		return idVerificacionAdeudoVehiculo;
	}
	public void setIdVerificacionAdeudoVehiculo(Integer idVerificacionAdeudoVehiculo) {
		this.idVerificacionAdeudoVehiculo = idVerificacionAdeudoVehiculo;
	}
	public VerificacionVehicularEntity getVerificacionVehicular() {
		return verificacionVehicular;
	}
	public void setVerificacionVehicular(VerificacionVehicularEntity verificacionVehicular) {
		this.verificacionVehicular = verificacionVehicular;
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
	public DocumentoPedimentoEntity getDocumentoPedimento() {
		return documentoPedimento;
	}
	public void setDocumentoPedimento(DocumentoPedimentoEntity documentoPedimento) {
		this.documentoPedimento = documentoPedimento;
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
	public Date getFechaVerificacionAdeudo() {
		return fechaVerificacionAdeudo;
	}
	public void setFechaVerificacionAdeudo(Date fechaVerificacionAdeudo) {
		this.fechaVerificacionAdeudo = fechaVerificacionAdeudo;
	}
}