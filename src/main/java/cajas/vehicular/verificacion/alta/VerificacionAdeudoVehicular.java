package cajas.vehicular.verificacion.alta;
import cajas.persistence.entity.VerificacionAdeudoVehicularEntity;
import java.text.SimpleDateFormat;

public class VerificacionAdeudoVehicular {
	private Integer idVerificacionAdeudoVehiculo;
	private Integer idVerificacionVehiculo;
	private Integer anio0VerificacionAdeudo;
	private Integer anio1VerificacionAdeudo;
	private Integer anio2VerificacionAdeudo;
	private Integer anio3VerificacionAdeudo;
	private Integer anio4VerificacionAdeudo;
	private Integer anio5VerificacionAdeudo;
	private Integer folioVerificacionAdeudo;
	private Integer procedencia;
	private Integer idEstado;
	private Integer folioCalcamonia;
	private String fechaRegularizacion;
	private Integer documento;
	private Integer estatus;
	private String observaciones;
	private Integer baja;
	private String bajaPlaca;
	private String fechaVerificacion;
	
	public VerificacionAdeudoVehicular verificacionAdeudoVehiculoEntity(VerificacionAdeudoVehicularEntity verificacionAdeudoVehiculoEntity){
			
		VerificacionAdeudoVehicular verificacionAdeudoVehiculo = new VerificacionAdeudoVehicular();
		verificacionAdeudoVehiculo.setIdVerificacionVehiculo(verificacionAdeudoVehiculoEntity.getIdVerificacionVehicular());
		verificacionAdeudoVehiculo.setAnio0VerificacionAdeudo(verificacionAdeudoVehiculoEntity.getAnio0VerificacionAdeudo());
		verificacionAdeudoVehiculo.setAnio1VerificacionAdeudo(verificacionAdeudoVehiculoEntity.getAnio1VerificacionAdeudo());
		verificacionAdeudoVehiculo.setAnio2VerificacionAdeudo(verificacionAdeudoVehiculoEntity.getAnio2VerificacionAdeudo());
		verificacionAdeudoVehiculo.setAnio3VerificacionAdeudo(verificacionAdeudoVehiculoEntity.getAnio3VerificacionAdeudo());
		verificacionAdeudoVehiculo.setAnio4VerificacionAdeudo(verificacionAdeudoVehiculoEntity.getAnio4VerificacionAdeudo());
		verificacionAdeudoVehiculo.setAnio5VerificacionAdeudo(verificacionAdeudoVehiculoEntity.getAnio5VerificacionAdeudo());
		verificacionAdeudoVehiculo.setFolioVerificacionAdeudo(verificacionAdeudoVehiculoEntity.getFolioVerificacionAdeudo());
		verificacionAdeudoVehiculo.setProcedencia(verificacionAdeudoVehiculoEntity.getProcedencia());
		verificacionAdeudoVehiculo.setIdEstado(verificacionAdeudoVehiculoEntity.getIdEstado());
		verificacionAdeudoVehiculo.setFolioCalcamonia(verificacionAdeudoVehiculoEntity.getFolioCalcamonia());	
		verificacionAdeudoVehiculo.setDocumento(verificacionAdeudoVehiculoEntity.getDocumento());
		verificacionAdeudoVehiculo.setEstatus(verificacionAdeudoVehiculoEntity.getEstatus());
		verificacionAdeudoVehiculo.setObservaciones(verificacionAdeudoVehiculoEntity.getObservaciones());
		verificacionAdeudoVehiculo.setBaja(verificacionAdeudoVehiculoEntity.getBaja());
		verificacionAdeudoVehiculo.setBajaPlaca(verificacionAdeudoVehiculoEntity.getBajaPlaca());
				
		String pattern = "dd-MM-yyyy";
	    SimpleDateFormat format = new SimpleDateFormat(pattern);
	    
	    String fechaVerificacionAdeudo = format.format(verificacionAdeudoVehiculoEntity.getFechaVerificacionAdeudo());
	    verificacionAdeudoVehiculo.setFechaVerificacion(fechaVerificacionAdeudo);
	    
	    String fechaRegularizacion= format.format(verificacionAdeudoVehiculoEntity.getFechaRegularizacion());
		verificacionAdeudoVehiculo.setFechaRegularizacion(fechaRegularizacion);
				
		return verificacionAdeudoVehiculo;
	}


	

	public Integer getIdVerificacionAdeudoVehiculo() {
		return idVerificacionAdeudoVehiculo;
	}
	public void setIdVerificacionAdeudoVehiculo(Integer idVerificacionAdeudoVehiculo) {
		this.idVerificacionAdeudoVehiculo = idVerificacionAdeudoVehiculo;
	}
	public Integer getIdVerificacionVehiculo() {
		return idVerificacionVehiculo;
	}
	public void setIdVerificacionVehiculo(Integer idVerificacionVehiculo) {
		this.idVerificacionVehiculo = idVerificacionVehiculo;
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
	public Integer getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}
	public Integer getFolioCalcamonia() {
		return folioCalcamonia;
	}
	public void setFolioCalcamonia(Integer folioCalcamonia) {
		this.folioCalcamonia = folioCalcamonia;
	}
	public String getFechaRegularizacion() {
		return fechaRegularizacion;
	}
	public void setFechaRegularizacion(String fechaRegularizacion) {
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
	public String getFechaVerificacion() {
		return fechaVerificacion;
	}
	public void setFechaVerificacion(String fechaVerificacion) {
		this.fechaVerificacion = fechaVerificacion;
	}
		
}
