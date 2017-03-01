package cajas.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ips")
public class IpEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6639491609997777677L;

	@Id
	@Column(name = "id_ip")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idIp;

	@Column(name = "ip")
	private String ip;

	@Column(name = "fecha_expira")
	private Date fechaExpira;

	@Column(name = "hora_expira")
	private Date horaExpira;

	/********* Getters and Setters *********/

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

	public Date getFechaExpira() {
		return fechaExpira;
	}

	public void setFechaExpira(Date fechaExpira) {
		this.fechaExpira = fechaExpira;
	}

	public Date getHoraExpira() {
		return horaExpira;
	}

	public void setHoraExpira(Date horaExpira) {
		this.horaExpira = horaExpira;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}