/**
 * 
 */
package cajas.contribuyentes;

import java.util.Date;

/**
 * @author saul
 *
 */
public class Obligacion {
	private Integer idObligacion;
    private String Obligacion;
    private Integer DiaVencimiento;
    private Date FechaInicio;
    private String UsuarioAlta;
    private String TipoObligacion;
    private Integer DiasTiempoProrroga;
    
 

    public Integer getIdObligacion() {
		return idObligacion;
	}
	public void setIdObligacion(Integer idObligacion) {
		this.idObligacion = idObligacion;
	}
	public String getObligacion() {
		return Obligacion;
	}
	public void setObligacion(String obligacion) {
		Obligacion = obligacion;
	}
	public Integer getDiaVencimiento() {
		return DiaVencimiento;
	}
	public void setDiaVencimiento(Integer diaVencimiento) {
		DiaVencimiento = diaVencimiento;
	}
	public Date getFechaInicio() {
		return FechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		FechaInicio = fechaInicio;
	}
	public String getUsuarioAlta() {
		return UsuarioAlta;
	}
	public void setUsuarioAlta(String usuarioAlta) {
		UsuarioAlta = usuarioAlta;
	}
	public String getTipoObligacion() {
		return TipoObligacion;
	}
	public void setTipoObligacion(String tipoObligacion) {
		TipoObligacion = tipoObligacion;
	}
	public Integer getDiasTiempoProrroga() {
		return DiasTiempoProrroga;
	}
	public void setDiasTiempoProrroga(Integer diasTiempoProrroga) {
		DiasTiempoProrroga = diasTiempoProrroga;
	}
	@Override
    public String toString() {
        return "Obligacion{" 
                + "idObligacion=" + idObligacion
                + ", obligacion=" + Obligacion
                + ", diaVencimiento=" + DiaVencimiento
                + ", fechaInicio=" + FechaInicio
                + ", usuarioAlta=" + UsuarioAlta
                + ", tipoObligacion=" + TipoObligacion
                + ", diasTiempoProrroga=" + DiasTiempoProrroga
                + '}';
    }

}
