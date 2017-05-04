package cajas.vehicular.verificacion.ministerial;

import java.text.SimpleDateFormat;

import cajas.persistence.entity.VerificacionVehicularEntity;

public class VerificacionVehiculoMinisterial {
	private Integer idVerificacionVehiculo;
	private Integer noSeguimientoVerificion;
	private String fechaVerificacionMinisterial;
	private String vinVehiculo;
	private Integer idMarcaVehiculo;
	private Integer modeloVehiculo;
	private Integer idClaseVehiculo;
	private Integer idTipoVehiculo;
	private String lineaVehiculo;
	private Integer IdEstatusVerificacion;
	private String numeroMotorVehiculo;
	private Integer folioVerificacionMinisterial;
	private String observacionesMinisterial;
	private Integer idfolioVerificacionMinisterial;

	public VerificacionVehiculoMinisterial() {
	}

	public VerificacionVehiculoMinisterial(VerificacionVehicularEntity verificacionVehicularEntity) {
		this.setIdVerificacionVehiculo(verificacionVehicularEntity.getIdVerificacionVehiculo());
		this.setNoSeguimientoVerificion(verificacionVehicularEntity.getNoSeguimientoVerificacion());
		
		String pattern = "dd-MM-yyyy";
	    SimpleDateFormat format = new SimpleDateFormat(pattern);
	    String fechaVerificacionMinisterial = format.format(verificacionVehicularEntity.getFechaVerificacionMinisterial());
	    this.setFechaVerificacionMinisterial(fechaVerificacionMinisterial);	
	    this.setVinVehiculo(verificacionVehicularEntity.getVinVehiculo());
		if (verificacionVehicularEntity.getMarcaVehiculo() != null) {
			this.setIdMarcaVehiculo(verificacionVehicularEntity.getMarcaVehiculo().getIdMarcaVehiculo());
		}
		this.setModeloVehiculo(verificacionVehicularEntity.getModeloVehiculo());
		this.setVinVehiculo(verificacionVehicularEntity.getVinVehiculo());
		if (verificacionVehicularEntity.getMarcaVehiculo() != null) {
			this.setIdMarcaVehiculo(verificacionVehicularEntity.getMarcaVehiculo().getIdMarcaVehiculo());
		}
		this.setModeloVehiculo(verificacionVehicularEntity.getModeloVehiculo());
		if (verificacionVehicularEntity.getClaseVehiculo() != null) {
			this.setIdClaseVehiculo(verificacionVehicularEntity.getClaseVehiculo().getIdClaseVehiculo());
		}
		if (verificacionVehicularEntity.getTipoVehiculo() != null) {
			this.setIdTipoVehiculo(verificacionVehicularEntity.getTipoVehiculo().getIdTipoVehiculo());
		}
		
		this.setLineaVehiculo(verificacionVehicularEntity.getLineaVehiculo());
		if (verificacionVehicularEntity.getEstatusVerificacion() != null) {
			this.setIdEstatusVerificacion(
					verificacionVehicularEntity.getEstatusVerificacion().getIdEstatusVerificacion());
		}

		this.setNumeroMotorVehiculo(verificacionVehicularEntity.getNumeroMotorVehiculo());
		this.setFolioVerificacionMinisterial(verificacionVehicularEntity.getFolioVerificacionMinisterial());
		this.setObservacionesMinisterial(verificacionVehicularEntity.getObservacionesMinisterial());
	}

	public Integer getIdVerificacionVehiculo() {
		return idVerificacionVehiculo;
	}
	public void setIdVerificacionVehiculo(Integer idVerificacionVehiculo) {
		this.idVerificacionVehiculo = idVerificacionVehiculo;
	}
	public Integer getNoSeguimientoVerificion() {
		return noSeguimientoVerificion;
	}
	public void setNoSeguimientoVerificion(Integer noSeguimientoVerificion) {
		this.noSeguimientoVerificion = noSeguimientoVerificion;
	}
	public String getFechaVerificacionMinisterial() {
		return fechaVerificacionMinisterial;
	}
	public void setFechaVerificacionMinisterial(String fechaVerificacionMinisterial) {
		this.fechaVerificacionMinisterial = fechaVerificacionMinisterial;
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
	public Integer getIdEstatusVerificacion() {
		return IdEstatusVerificacion;
	}

	public void setIdEstatusVerificacion(Integer idEstatusVerificacion) {
		IdEstatusVerificacion = idEstatusVerificacion;
	}

	public String getNumeroMotorVehiculo() {
		return numeroMotorVehiculo;
	}

	public void setNumeroMotorVehiculo(String numeroMotorVehiculo) {
		this.numeroMotorVehiculo = numeroMotorVehiculo;
	}

	public String getObservacionesMinisterial() {
		return observacionesMinisterial;
	}

	public void setObservacionesMinisterial(String observacionesMinisterial) {
		this.observacionesMinisterial = observacionesMinisterial;
	}

	public Integer getIdfolioVerificacionMinisterial() {
		return idfolioVerificacionMinisterial;
	}

	public void setIdfolioVerificacionMinisterial(Integer idfolioVerificacionMinisterial) {
		this.idfolioVerificacionMinisterial = idfolioVerificacionMinisterial;
	}

	public void setFolioVerificacionMinisterial(Integer folioVerificacionMinisterial) {
		this.folioVerificacionMinisterial = folioVerificacionMinisterial;
	}

	public Integer getFolioVerificacionMinisterial() {
		return folioVerificacionMinisterial;
	}
}