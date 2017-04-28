/**
 * 
 */
package cajas.impuestos.declaracion.estatal;

/**
 * @author Leila Schiaffini Ehuan
 *
 * @Since 27/04/2017 13:14:53 Información básica del contribuyente para
 *        visualizar en las coincidencias de búsqueda.
 */
public class InfoContribuyente {
	private Integer idContribuyente;
	private String contribuyente;
	private String rfc;
	private int idEstatusContribuyente;
	private String estatusContribuyente;

	public InfoContribuyente(Integer idContribuyente, String contribuyente, String rfc, int idEstatusContribuyente,
			int idEstatusAsignacion) {

		this.idContribuyente = idContribuyente;
		this.contribuyente = contribuyente;
		this.rfc = rfc;
		this.idEstatusContribuyente = idEstatusContribuyente;

		if (this.idEstatusContribuyente == 1) {
			this.estatusContribuyente = "ACTIVO";
		}
	}

	public InfoContribuyente(Integer idContribuyente, String contribuyente, String rfc) {
		this.idContribuyente = idContribuyente;
		this.contribuyente = contribuyente;
		this.rfc = rfc;
	}

	public int getIdEstatusContribuyente() {
		return idEstatusContribuyente;
	}

	public void setIdEstatusContribuyente(int idEstatusContribuyente) {
		this.idEstatusContribuyente = idEstatusContribuyente;
	}

	public String getEstatusContribuyente() {
		return estatusContribuyente;
	}

	public void setEstatusContribuyente(String estatusContribuyente) {
		this.estatusContribuyente = estatusContribuyente;
	}

	public Integer getIdContribuyente() {
		return idContribuyente;
	}

	public void setIdContribuyente(Integer idContribuyente) {
		this.idContribuyente = idContribuyente;
	}

	public String getContribuyente() {
		return contribuyente;
	}

	public void setContribuyente(String contribuyente) {
		this.contribuyente = contribuyente;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

}
