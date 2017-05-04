package cajas.vehicular.verificacion.estatusverificacion;

import cajas.persistence.entity.EstatusVerificacionEntity;

public class EstatusVerificacion {
	private Integer idEstatusVerificacion;
	private String estatusVerificacion;
	public EstatusVerificacion() {
	}
	public EstatusVerificacion(EstatusVerificacionEntity estatusVerificacionEntity) {
		this.idEstatusVerificacion = estatusVerificacionEntity.getIdEstatusVerificacion();
		this.estatusVerificacion = estatusVerificacionEntity.getEstatusVerificacion();
	}
	public Integer getIdEstatusVerificacion() {
		return idEstatusVerificacion;
	}
	public void setIdEstatusVerificacion(Integer idEstatusVerificacion) {
		this.idEstatusVerificacion = idEstatusVerificacion;
	}
	public String getEstatusVerificacion() {
		return estatusVerificacion;
	}
	public void setEstatusVerificacion(String estatusVerificacion) {
		this.estatusVerificacion = estatusVerificacion;
	}
}
