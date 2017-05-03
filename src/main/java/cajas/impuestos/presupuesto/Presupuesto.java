package cajas.impuestos.presupuesto;

import java.util.List;

public class Presupuesto {
	
	private Integer idPresupuesto;
	private List<Integer> calculos;
	private Integer idContribuyente;

	public List<Integer> getCalculos() {
		return calculos;
	}

	public void setCalculos(List<Integer> calculos) {
		this.calculos = calculos;
	}

	public Integer getIdContribuyente() {
		return idContribuyente;
	}

	public void setIdContribuyente(Integer idContribuyente) {
		this.idContribuyente = idContribuyente;
	}
	
	public Integer getIdPresupuesto() {
		return idPresupuesto;
	}
	
	public void setIdPresupuesto(Integer idPresupuesto) {
		this.idPresupuesto = idPresupuesto;
	}

}
