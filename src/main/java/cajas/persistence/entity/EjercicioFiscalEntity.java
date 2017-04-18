package cajas.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ejercicios_fiscales", schema = "catalogos")
public class EjercicioFiscalEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4864280056252738036L;

	@Id
	@Column(name = "id_ejercicio_fiscal")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEjercicioFiscal;

	@Column(name = "ejercicio_fiscal")
	private Integer ejercicioFiscal;

	/************ Getters and Setters ************/

	public Integer getIdEjercicioFiscal() {
		return idEjercicioFiscal;
	}

	public void setIdEjercicioFiscal(Integer idEjercicioFiscal) {
		this.idEjercicioFiscal = idEjercicioFiscal;
	}

	public Integer getEjercicioFiscal() {
		return ejercicioFiscal;
	}

	public void setEjercicioFiscal(Integer ejercicioFiscal) {
		this.ejercicioFiscal = ejercicioFiscal;
	}

}