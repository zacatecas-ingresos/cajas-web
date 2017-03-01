package cajas.seguridad.ip;

import java.util.Date;

public class Ip {

	private Integer idIp;
	private String ip;
	private Date fechaExpiracion;
	private Date horaExpira;

	/********** Getters and Setters **********/

	public Integer getIdIp() {
		return idIp;
	}

	public void setIdIp(Integer idIp) {
		this.idIp = idIp;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getFechaExpiracion() {
		return fechaExpiracion;
	}

	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	public Date getHoraExpira() {
		return horaExpira;
	}

	public void setHoraExpira(Date horaExpira) {
		this.horaExpira = horaExpira;
	}

}