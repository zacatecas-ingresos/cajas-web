package cajas.domicilio;

public class Domicilio {

	
    private Integer idDomicilio;
	private String Domicilio;

	
	public String getDomicilio() {
		return Domicilio;
	}

	public Integer getIdDomicilio() {
		return idDomicilio;
	}

	public void setIdDomicilio(Integer idDomicilio) {
		this.idDomicilio = idDomicilio;
	}

	public String setDomicilio(String domicilio) {
		Domicilio = domicilio;
		return Domicilio;
	
}
}