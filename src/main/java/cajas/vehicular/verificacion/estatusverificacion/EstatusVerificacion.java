package cajas.vehicular.verificacion.estatusverificacion;

import cajas.persistence.entity.EstatusVerificacionEntity;

public class EstatusVerificacion {
	private Integer idEstatusVerificacion;
	private String estatusverificacion;
	public EstatusVerificacion() {
	}
	public EstatusVerificacion(EstatusVerificacionEntity estatusVerificacionEntity) {
		this.idEstatusVerificacion = estatusVerificacionEntity.getIdEstatusVerificacion();
		this.estatusverificacion = estatusVerificacionEntity.getEstatusVerificacion();
	}
	public Integer getIdEstatusVerificacion() {
		return idEstatusVerificacion;
	}
	public void setIdEstatusVerificacion(Integer idEstatusVerificacion) {
		this.idEstatusVerificacion = idEstatusVerificacion;
	}
	public String getEstatusverificacion() {
		return estatusverificacion;
	}
	public void setEstatusverificacion(String estatusverificacion) {
		this.estatusverificacion = estatusverificacion;
	}
}
