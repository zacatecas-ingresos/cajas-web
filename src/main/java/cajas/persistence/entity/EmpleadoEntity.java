package cajas.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleados", schema = "seguridad")
public class EmpleadoEntity implements Serializable {
	private static final long serialVersionUID = 1301384922683817336L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_empleado")
	private Integer idEmpleado;
	
	@Column(name = "num_empleado")
	private String numEmpleado;
	
	@Column(name ="rfc")
	private String rfc;
	
	@Column(name ="curp")
	private String curp;
	
	@Column(name ="apellido_paterno")
	private String apellidoPaterno;
	
	@Column(name ="apellido_materno")
	private String apellidoMaterno;
	
	@Column(name ="nombres")
	private String nombres;
	
	@Column(name ="calles")
	private String calles;
	
	@Column(name ="numero_exterior")
	private String numeroExterior;
	
	@Column(name ="numero_interior")
	private String numeroInterior;
	
	@Column(name ="colonia")
	private String colonia;
	
	@Column(name ="codigo_postal")
	private String codigoPostal;
	
	@Column(name ="activo")
	private Boolean activo;

	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(String numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getCalles() {
		return calles;
	}

	public void setCalles(String calles) {
		this.calles = calles;
	}

	public String getNumeroExterior() {
		return numeroExterior;
	}

	public void setNumeroExterior(String numeroExterior) {
		this.numeroExterior = numeroExterior;
	}

	public String getNumeroInterior() {
		return numeroInterior;
	}

	public void setNumeroInterior(String numeroInterior) {
		this.numeroInterior = numeroInterior;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
		

}
