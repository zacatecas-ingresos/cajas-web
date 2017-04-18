package cajas.config.ejerciciosfiscales;

import cajas.persistence.entity.EjercicioFiscalEntity;

public class EjercicioFiscal {

	private Integer idEjercicoFiscal;
	private Integer ejercicioFiscal;

	public EjercicioFiscal ejercicoFiscal(EjercicioFiscalEntity ejercicioFiscalEntity) {
		EjercicioFiscal ejercicio = new EjercicioFiscal();
		ejercicio.setIdEjercicoFiscal(ejercicioFiscalEntity.getIdEjercicioFiscal());
		ejercicio.setEjercicioFiscal(ejercicioFiscalEntity.getEjercicioFiscal());
		return ejercicio;
	}

	/*************** Getters and ***************/

	public Integer getIdEjercicoFiscal() {
		return idEjercicoFiscal;
	}

	public void setIdEjercicoFiscal(Integer idEjercicoFiscal) {
		this.idEjercicoFiscal = idEjercicoFiscal;
	}

	public Integer getEjercicioFiscal() {
		return ejercicioFiscal;
	}

	public void setEjercicioFiscal(Integer ejercicioFiscal) {
		this.ejercicioFiscal = ejercicioFiscal;
	}

}