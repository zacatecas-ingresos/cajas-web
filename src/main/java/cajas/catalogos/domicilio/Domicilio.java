package cajas.domicilio;

public class Domicilio {

	
    private Integer idDomicilio;			
	private String domicilio;
	private String calle;
	private Integer numExt;
	private Integer numInt;
	private String colonia;
	private String entreCalle1;
	private String entreCalle2;
	private Integer cp;
    private Integer idEstado;	
    private Integer idMunicipio;			
    private Integer idLocalida;			


	public String getDomicilio() {
		return domicilio;
	}

	public Integer getIdDomicilio() {
		return idDomicilio;
	}

	public void setIdDomicilio(Integer idDomicilio) {
		this.idDomicilio = idDomicilio;
	}

	
	


	public Integer getIdMunicipio() {
		return idMunicipio;
	}

	public void setIdMunicipio(Integer idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public Integer getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	public Integer getIdLocalida() {
		return idLocalida;
	}

	public void setIdLocalida(Integer idLocalida) {
		this.idLocalida = idLocalida;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getNumExt() {
		return numExt;
	}

	public void setNumExt(Integer numExt) {
		this.numExt = numExt;
	}

	public Integer getNumInt() {
		return numInt;
	}

	public void setNumInt(Integer numInt) {
		this.numInt = numInt;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getEntreCalle1() {
		return entreCalle1;
	}

	public void setEntreCalle1(String entreCalle1) {
		this.entreCalle1 = entreCalle1;
	}

	public String getEntreCalle2() {
		return entreCalle2;
	}

	public void setEntreCalle2(String entreCalle2) {
		this.entreCalle2 = entreCalle2;
	}

	public Integer getCp() {
		return cp;
	}

	public void setCp(Integer cp) {
		this.cp = cp;
	}
}