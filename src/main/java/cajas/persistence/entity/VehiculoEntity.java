package cajas.persistence.entity;

import java.io.Serializable;
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
@Table(name = "Vehiculos", schema = "vehicular")
public class VehiculoEntity implements Serializable{

	private static final long serialVersionUID = 5134453751135995174L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdVehiculo")
	private Integer idVehiculo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdCombustible")
	private CombustibleVehiculoEntity combustibleVehicular;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdMarca")
	private MarcaVehiculoEntity marcaVehicular;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdServicio")
	private ServicioVehiculoEntity servicioVehicular;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdUso")
	private UsoVehiculoEntity usoVehicular;
		
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdClase")
	private ClaseVehiculoEntity claseVehicular;
		
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdTipo")
	private TipoVehiculoEntity tipoVehicular;
		
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdDireccion")
	private DireccionEntity direccionVehicular;
	
	@Column(name = "Estatus")
	private Integer estatus;
	
	@Column(name = "PlacaActual")
	private String placaActual;
	
	@Column(name = "PlacaNueva")
	private String placaNueva;
	
	@Column(name = "Linea")
	private String linea;
	
	@Column(name = "Modelo")
	private Integer modelo;
	
	
	/*@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdModulo")
	private*/
	
	@Column(name = "idModulo")
	private Integer idModulo;
	
	@Column(name = "Vin")
	private String vin;
	
	@Column(name = "Motor")
	private String motor;
	
	@Column(name = "Rfv")
	private String rfv;
	
	@Column(name = "Nrpv")
	private String nrpv;
	
	@Column(name = "Color")
	private String color;
	
	@Column(name = "Version")
	private String version;
	
	@Column(name = "OficialGobierno")
	private Boolean oficialGobierno;
	
	@Column(name = "Cilindros")
	private Integer cilindros;
	
	@Column(name = "Capacidad")
	private Integer capacidad;
	
	@Column(name = "PesoBruto")
	private Integer pesoBruto;
	
	@Column(name = "CilindrosMotocicleta")
	private Integer cilindrosMotocicleta;
	
	@Column(name = "ExcentoPago")
	private Integer excentoPago;	
	
	@Column(name = "ImporteFactura")
	private Double importeFactura;
	
	@Column(name = "AgenciaRfc")
	private String agenciaRfc;
	
	@Column(name = "Fecha")
	private Date fecha;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idDocumentoPedimento")
	private DocumentoPedimentoEntity documentoPedimento;
	
	@Column(name = "FechaRegularizacion")
	private Date fechaRegularizacion;
	
	@Column(name = "Procedencia")
	private Boolean procedencia;
	
	@Column(name = "FolioCalcamonia")
	private Integer folioCalcamonia;
	
	@Column(name = "FolioRegularizacion")
	private String folioRegularizacion;
	
	@Column(name = "UltimoPago")
	private Integer ultimoPago;
	
	@Column(name = "NumeroPuertas")
	private Integer numeroPuertas;
	
	@Column(name = "NuevoAgencia")
	private Boolean nuevoAgencia;
	
	@Column(name = "FolioVerificacion")
	private Integer folioVerificacion;
	
	@Column(name = "FechaVerificacion")
	private Date fechaVerificacion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idAgencia")
	private AgenciaVehicularEntity agenciaVehicular;
	
	@Column(name = "Blindado")
	private Boolean blindado;

	public Integer getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(Integer idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public CombustibleVehiculoEntity getCombustibleVehicular() {
		return combustibleVehicular;
	}

	public void setCombustibleVehicular(CombustibleVehiculoEntity combustibleVehicular) {
		this.combustibleVehicular = combustibleVehicular;
	}

	public MarcaVehiculoEntity getMarcaVehicular() {
		return marcaVehicular;
	}

	public void setMarcaVehicular(MarcaVehiculoEntity marcaVehicular) {
		this.marcaVehicular = marcaVehicular;
	}

	public ServicioVehiculoEntity getServicioVehicular() {
		return servicioVehicular;
	}

	public void setServicioVehicular(ServicioVehiculoEntity servicioVehicular) {
		this.servicioVehicular = servicioVehicular;
	}

	public UsoVehiculoEntity getUsoVehicular() {
		return usoVehicular;
	}

	public void setUsoVehicular(UsoVehiculoEntity usoVehicular) {
		this.usoVehicular = usoVehicular;
	}

	public ClaseVehiculoEntity getClaseVehicular() {
		return claseVehicular;
	}

	public void setClaseVehicular(ClaseVehiculoEntity claseVehicular) {
		this.claseVehicular = claseVehicular;
	}

	public TipoVehiculoEntity getTipoVehicular() {
		return tipoVehicular;
	}

	public void setTipoVehicular(TipoVehiculoEntity tipoVehicular) {
		this.tipoVehicular = tipoVehicular;
	}

	public DireccionEntity getDireccionVehicular() {
		return direccionVehicular;
	}

	public void setDireccionVehicular(DireccionEntity direccionVehicular) {
		this.direccionVehicular = direccionVehicular;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	public String getPlacaActual() {
		return placaActual;
	}

	public void setPlacaActual(String placaActual) {
		this.placaActual = placaActual;
	}

	public String getPlacaNueva() {
		return placaNueva;
	}

	public void setPlacaNueva(String placaNueva) {
		this.placaNueva = placaNueva;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	public Integer getModelo() {
		return modelo;
	}

	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}

	public Integer getIdModulo() {
		return idModulo;
	}

	public void setIdModulo(Integer idModulo) {
		this.idModulo = idModulo;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getRfv() {
		return rfv;
	}

	public void setRfv(String rfv) {
		this.rfv = rfv;
	}

	public String getNrpv() {
		return nrpv;
	}

	public void setNrpv(String nrpv) {
		this.nrpv = nrpv;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Boolean getOficialGobierno() {
		return oficialGobierno;
	}

	public void setOficialGobierno(Boolean oficialGobierno) {
		this.oficialGobierno = oficialGobierno;
	}

	public Integer getCilindros() {
		return cilindros;
	}

	public void setCilindros(Integer cilindros) {
		this.cilindros = cilindros;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public Integer getPesoBruto() {
		return pesoBruto;
	}

	public void setPesoBruto(Integer pesoBruto) {
		this.pesoBruto = pesoBruto;
	}

	public Integer getCilindrosMotocicleta() {
		return cilindrosMotocicleta;
	}

	public void setCilindrosMotocicleta(Integer cilindrosMotocicleta) {
		this.cilindrosMotocicleta = cilindrosMotocicleta;
	}

	public Integer getExcentoPago() {
		return excentoPago;
	}

	public void setExcentoPago(Integer excentoPago) {
		this.excentoPago = excentoPago;
	}

	public Double getImporteFactura() {
		return importeFactura;
	}

	public void setImporteFactura(Double importeFactura) {
		this.importeFactura = importeFactura;
	}

	public String getAgenciaRfc() {
		return agenciaRfc;
	}

	public void setAgenciaRfc(String agenciaRfc) {
		this.agenciaRfc = agenciaRfc;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public DocumentoPedimentoEntity getDocumentoPedimento() {
		return documentoPedimento;
	}

	public void setDocumentoPedimento(DocumentoPedimentoEntity documentoPedimento) {
		this.documentoPedimento = documentoPedimento;
	}

	public Date getFechaRegularizacion() {
		return fechaRegularizacion;
	}

	public void setFechaRegularizacion(Date fechaRegularizacion) {
		this.fechaRegularizacion = fechaRegularizacion;
	}

	public Boolean getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(Boolean procedencia) {
		this.procedencia = procedencia;
	}

	public Integer getFolioCalcamonia() {
		return folioCalcamonia;
	}

	public void setFolioCalcamonia(Integer folioCalcamonia) {
		this.folioCalcamonia = folioCalcamonia;
	}

	public String getFolioRegularizacion() {
		return folioRegularizacion;
	}

	public void setFolioRegularizacion(String folioRegularizacion) {
		this.folioRegularizacion = folioRegularizacion;
	}

	public Integer getUltimoPago() {
		return ultimoPago;
	}

	public void setUltimoPago(Integer ultimoPago) {
		this.ultimoPago = ultimoPago;
	}

	public Integer getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(Integer numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public Boolean getNuevoAgencia() {
		return nuevoAgencia;
	}

	public void setNuevoAgencia(Boolean nuevoAgencia) {
		this.nuevoAgencia = nuevoAgencia;
	}

	public Integer getFolioVerificacion() {
		return folioVerificacion;
	}

	public void setFolioVerificacion(Integer folioVerificacion) {
		this.folioVerificacion = folioVerificacion;
	}

	public Date getFechaVerificacion() {
		return fechaVerificacion;
	}

	public void setFechaVerificacion(Date fechaVerificacion) {
		this.fechaVerificacion = fechaVerificacion;
	}

	public AgenciaVehicularEntity getAgenciaVehicular() {
		return agenciaVehicular;
	}

	public void setAgenciaVehicular(AgenciaVehicularEntity agenciaVehicular) {
		this.agenciaVehicular = agenciaVehicular;
	}

	public Boolean getBlindado() {
		return blindado;
	}

	public void setBlindado(Boolean blindado) {
		this.blindado = blindado;
	}
	
	
	
	
	
	
	
	
	
	
	

}
