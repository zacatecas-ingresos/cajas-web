package cajas.seguridad.bitacora;

public class ActividadUsuario {
	
	private String ip;
	private String explorador;
	private Integer idPermiso;
	private String token;
	private String descripcion;
	private String fechaHora;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getExplorador() {
		return explorador;
	}

	public void setExplorador(String explorador) {
		this.explorador = explorador;
	}

	public int getIdPermiso() {
		return idPermiso;
	}

	public void setIdPermiso(int idPermiso) {
		this.idPermiso = idPermiso;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}	
}