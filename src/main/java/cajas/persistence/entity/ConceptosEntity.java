package cajas.persistence.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conceptos")
public class ConceptosEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7029374644978562533L;
	
	@Id
	@Column(name = "id_concepto")
	private Integer IdConcepto;
	
	@Column(name = "descripcion")
	private String Descripcion;
	
	@Column(name = "nivel_1")
	private String nivel1;
	
	@Column(name = "nivel_2")
	private String nivel2;
	
	@Column(name = "nivel_3")
	private String nivel3;
	
	@Column(name = "nivel_4")
	private String nivel4;
	
	@Column(name = "nivel_5")
	private String nivel5;
	
	@Column(name = "nivel_6")
	private String nivel6;
	
	@Column(name = "clave")
	private String clave;
	
	@Column(name = "cobro_derecho")
	private BigDecimal cobroDerecho;
	
	@Column(name = "ejercicio_fiscal")
	private Integer ejercicioFiscal;
	
	@Column(name = "tipo_nivel")
	private Integer tipoNivel;
	
	@Column(name = "activo")
	private boolean activo;

	public Integer getIdConcepto() {
		return IdConcepto;
	}

	public void setIdConcepto(Integer idConcepto) {
		IdConcepto = idConcepto;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getNivel1() {
		return nivel1;
	}

	public void setNivel1(String nivel1) {
		this.nivel1 = nivel1;
	}

	public String getNivel2() {
		return nivel2;
	}

	public void setNivel2(String nivel2) {
		this.nivel2 = nivel2;
	}

	public String getNivel3() {
		return nivel3;
	}

	public void setNivel3(String nivel3) {
		this.nivel3 = nivel3;
	}

	public String getNivel4() {
		return nivel4;
	}

	public void setNivel4(String nivel4) {
		this.nivel4 = nivel4;
	}

	public String getNivel5() {
		return nivel5;
	}

	public void setNivel5(String nivel5) {
		this.nivel5 = nivel5;
	}

	public String getNivel6() {
		return nivel6;
	}

	public void setNivel6(String nivel6) {
		this.nivel6 = nivel6;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public BigDecimal getCobroDerecho() {
		return cobroDerecho;
	}

	public void setCobroDerecho(BigDecimal cobroDerecho) {
		this.cobroDerecho = cobroDerecho;
	}

	public Integer getEjercicioFiscal() {
		return ejercicioFiscal;
	}

	public void setEjercicioFiscal(Integer ejercicioFiscal) {
		this.ejercicioFiscal = ejercicioFiscal;
	}

	public Integer getTipoNivel() {
		return tipoNivel;
	}

	public void setTipoNivel(Integer tipoNivel) {
		this.tipoNivel = tipoNivel;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	

}
