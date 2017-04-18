/**
 * 
 */
package cajas.impuestos.declaracion.estatal;

/**
 * @author Leila Schiaffini Ehuan
 *
 * @since 11/04/2017
 */
public class Contribuyente {

	private String rfc;
	private String contribuyente;
	private String domicilio;
	private String estatus;

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getContribuyente() {
		return contribuyente;
	}

	public void setContribuyente(String contribuyente) {
		this.contribuyente = contribuyente;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

}
