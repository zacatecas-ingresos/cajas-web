package cajas.vehicular.padron;

import java.text.SimpleDateFormat;
import java.util.Date;
import cajas.persistence.entity.VehiculoEntity;


public class Vehiculo {

	private Integer idVehiculo;
	private Integer idCombustible;
	private Integer idMarca;
	private Integer idServicio;
	private Integer idUso;
	private Integer idClase;
	private Integer idTipo;
	private Integer IdDireccion;
	private Integer estatus;
	private String placaActual;
	private String placaAnterior;
	private String linea;
	private Integer modelo;
	private Integer idRecaudacionRegistra;
	private String serie;
	private String motor;
	private String rfv;
	private String nrpv;
	private String color;
	private String version;
	private Boolean oficialGobierno;
	private Integer cilindros;
	private Integer capacidad;
	private Integer pesoBruto;
	private Integer cilindrosMotocicleta;
	private Integer excentoPago;	
	private Double importeFactura;
	private String agenciaRfc;
	private String fecha;
	private Integer idDocumentoPedimento;
	private String fechaRegularizacion;
	private String procedencia;
	private Integer folioCalcamonia;
	private String folioRegularizacion;
	private Integer ultimoPago;
	private Integer numeroPuertas;
	private Boolean nuevoAgencia;
	private String folioVerificacion;
	private String fechaVerificacion;
	private Integer idAgencia;
	private Boolean blindado;
	
	public Vehiculo vehiculo(VehiculoEntity vehiculoEntity){
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setIdVehiculo(vehiculoEntity.getIdVehiculo());
		
		if(vehiculoEntity.getCombustibleVehicular() != null){
			vehiculo.setIdCombustible(vehiculoEntity.getCombustibleVehicular().getIdCombustible());
		}
		
		if(vehiculoEntity.getMarcaVehicular() != null){
			vehiculo.setIdMarca(vehiculoEntity.getMarcaVehicular().getIdMarcaVehiculo());
		}
		
		if(vehiculoEntity.getServicioVehicular() != null){
			vehiculo.setIdServicio(vehiculoEntity.getServicioVehicular().getIdServicio());
		}
		
		if(vehiculoEntity.getUsoVehicular() != null){
			vehiculo.setIdUso(vehiculoEntity.getUsoVehicular().getIdUso());
		}
		
		if(vehiculoEntity.getMarcaVehicular() != null){
			vehiculo.setIdMarca(vehiculoEntity.getMarcaVehicular().getIdMarcaVehiculo());
		}
		
		if(vehiculoEntity.getTipoVehicular() != null){
			vehiculo.setIdTipo(vehiculoEntity.getTipoVehicular().getIdTipoVehiculo());
		}
		
		if(vehiculoEntity.getDireccionVehicular() != null){
			vehiculo.setIdDireccion(vehiculoEntity.getDireccionVehicular().getIdDireccion());
		}
		
		vehiculo.setEstatus(vehiculoEntity.getEstatus());
		vehiculo.setPlacaAnterior(vehiculoEntity.getPlacaAnterior());
		vehiculo.setPlacaActual(vehiculoEntity.getPlacaActual());
		vehiculo.setLinea(vehiculoEntity.getLinea());
		vehiculo.setModelo(vehiculoEntity.getModelo());
		vehiculo.setIdRecaudacionRegistra(vehiculoEntity.getIdRecaudacionRegistra());
		vehiculo.setSerie(vehiculoEntity.getSerie());
		vehiculo.setMotor(vehiculoEntity.getMotor());
		vehiculo.setRfv(vehiculoEntity.getRfv());
		vehiculo.setNrpv(vehiculoEntity.getNrpv());
		vehiculo.setColor(vehiculoEntity.getColor());
		vehiculo.setVersion(vehiculoEntity.getVersion());
		vehiculo.setOficialGobierno(vehiculoEntity.getOficialGobierno());
		vehiculo.setCilindros(vehiculoEntity.getCilindros());
		vehiculo.setCapacidad(vehiculoEntity.getCapacidad());
		vehiculo.setPesoBruto(vehiculoEntity.getPesoBruto());
		vehiculo.setCilindrosMotocicleta(vehiculoEntity.getCilindrosMotocicleta());
		vehiculo.setExcentoPago(vehiculoEntity.getExcentoPago());
		vehiculo.setImporteFactura(vehiculoEntity.getImporteFactura());
		vehiculo.setAgenciaRfc(vehiculoEntity.getAgenciaRfc());

		String pattern = "dd-MM-yyyy";
	    SimpleDateFormat format = new SimpleDateFormat(pattern);	    
	    
	    if(vehiculoEntity.getFecha() != null){
		    String fecha= format.format(vehiculoEntity.getFecha());
			vehiculo.setFecha(fecha);
	    }
	    
	    if(vehiculoEntity.getFechaRegularizacion() != null){
		    String fechaRegularizacion= format.format(vehiculoEntity.getFechaRegularizacion());
		    vehiculo.setFechaRegularizacion(fechaRegularizacion);
	    }
		
	    if(vehiculoEntity.getDocumentoPedimento() != null){
	    	vehiculo.setIdDocumentoPedimento(vehiculoEntity.getDocumentoPedimento().getIdDocumentoPedimento());	    	
	    }
	    
	    vehiculo.setProcedencia(vehiculoEntity.getProcedencia());
	    vehiculo.setFolioCalcamonia(vehiculoEntity.getFolioCalcamonia());
	    vehiculo.setFolioRegularizacion(vehiculoEntity.getFolioRegularizacion());
	    vehiculo.setUltimoPago(vehiculoEntity.getUltimoPago());
	    vehiculo.setNumeroPuertas(vehiculoEntity.getNumeroPuertas());
	    vehiculo.setNuevoAgencia(vehiculoEntity.getNuevoAgencia());
	    vehiculo.setFolioVerificacion(vehiculoEntity.getFolioVerificacion());
	   
	    if(vehiculoEntity.getFechaVerificacion() != null){
		    String fechaVerificacion= format.format(vehiculoEntity.getFechaVerificacion());
		    vehiculo.setFechaVerificacion(fechaVerificacion);
	    }
		
	    if(vehiculoEntity.getAgenciaVehicular() != null){
	    	vehiculo.setIdAgencia(vehiculoEntity.getAgenciaVehicular().getIdAgencia());
	    }
		
	    vehiculo.setBlindado(vehiculoEntity.getBlindado());
		
		return vehiculo;
	}
	
	
	
	
	public Integer getIdVehiculo() {
		return idVehiculo;
	}
	public void setIdVehiculo(Integer idVehiculo) {
		this.idVehiculo = idVehiculo;
	}
	public Integer getIdCombustible() {
		return idCombustible;
	}
	public void setIdCombustible(Integer idCombustible) {
		this.idCombustible = idCombustible;
	}
	public Integer getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}
	public Integer getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(Integer idServicio) {
		this.idServicio = idServicio;
	}
	public Integer getIdUso() {
		return idUso;
	}
	public void setIdUso(Integer idUso) {
		this.idUso = idUso;
	}
	public Integer getIdClase() {
		return idClase;
	}
	public void setIdClase(Integer idClase) {
		this.idClase = idClase;
	}
	public Integer getIdTipo() {
		return idTipo;
	}
	public void setIdTipo(Integer idTipo) {
		this.idTipo = idTipo;
	}
	public Integer getIdDireccion() {
		return IdDireccion;
	}
	public void setIdDireccion(Integer idDireccion) {
		IdDireccion = idDireccion;
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

	public String getPlacaAnterior() {
		return placaAnterior;
	}

	public void setPlacaAnterior(String placaAnterior) {
		this.placaAnterior = placaAnterior;
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

	public Integer getIdRecaudacionRegistra() {
		return idRecaudacionRegistra;
	}

	public void setIdRecaudacionRegistra(Integer idRecaudacionRegistra) {
		this.idRecaudacionRegistra = idRecaudacionRegistra;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
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
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Integer getIdDocumentoPedimento() {
		return idDocumentoPedimento;
	}
	public void setIdDocumentoPedimento(Integer idDocumentoPedimento) {
		this.idDocumentoPedimento = idDocumentoPedimento;
	}
	public String getFechaRegularizacion() {
		return fechaRegularizacion;
	}
	public void setFechaRegularizacion(String fechaRegularizacion) {
		this.fechaRegularizacion = fechaRegularizacion;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
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
	public String getFolioVerificacion() {
		return folioVerificacion;
	}
	public void setFolioVerificacion(String folioVerificacion) {
		this.folioVerificacion = folioVerificacion;
	}
	public String getFechaVerificacion() {
		return fechaVerificacion;
	}
	public void setFechaVerificacion(String fechaVerificacion) {
		this.fechaVerificacion = fechaVerificacion;
	}
	public Integer getIdAgencia() {
		return idAgencia;
	}
	public void setIdAgencia(Integer idAgencia) {
		this.idAgencia = idAgencia;
	}
	public Boolean getBlindado() {
		return blindado;
	}
	public void setBlindado(Boolean blindado) {
		this.blindado = blindado;
	}
	
	
	
	
}
