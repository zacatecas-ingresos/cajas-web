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
@Table(name = "Ips", schema = "seguridad")
public class IpEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6639491609997777677L;

	@Id
	@Column(name = "IdIp")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idIp;

	@Column(name = "Ip")
	private String ip;

	@Column(name = "FechaExpira")
	private Date fechaExpira;

	@Column(name = "HoraExpira")
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