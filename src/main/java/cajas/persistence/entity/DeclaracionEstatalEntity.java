package cajas.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "declaracion_estatal")
public class DeclaracionEstatalEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8096211526669784314L;
	
	@Id
	@Column(name = "id_declaracion")
	private Integer idDeclaracion;

	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name = "id_contribuyente")
	private ContribuyenteEntity idContribuyente;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name = "id_sucursal")
	private SucursalEntity idSucursal;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name = "id_obligacion")
	private ObligacionesEntity idObligacion;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name = "id_periodo")
	private PeriodosEntity idPeriodo;
	
	@Column(name = "ejercicio_fiscal")
	private Integer ejercicioFiscal;
	
	@Column(name = "tipo_declaracion")
	private String tipoDeclaracion;

	public Integer getIdDeclaracion() {
		return idDeclaracion;
	}

	public void setIdDeclaracion(Integer idDeclaracion) {
		this.idDeclaracion = idDeclaracion;
	}

	public ContribuyenteEntity getIdContribuyente() {
		return idContribuyente;
	}

	public void setIdContribuyente(ContribuyenteEntity idContribuyente) {
		this.idContribuyente = idContribuyente;
	}

	public SucursalEntity getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(SucursalEntity idSucursal) {
		this.idSucursal = idSucursal;
	}

	public ObligacionesEntity getIdObligacion() {
		return idObligacion;
	}

	public void setIdObligacion(ObligacionesEntity idObligacion) {
		this.idObligacion = idObligacion;
	}

	public PeriodosEntity getIdPeriodo() {
		return idPeriodo;
	}

	public void setIdPeriodo(PeriodosEntity idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

	public Integer getEjercicioFiscal() {
		return ejercicioFiscal;
	}

	public void setEjercicioFiscal(Integer ejercicioFiscal) {
		this.ejercicioFiscal = ejercicioFiscal;
	}

	public String getTipoDeclaracion() {
		return tipoDeclaracion;
	}

	public void setTipoDeclaracion(String tipoDeclaracion) {
		this.tipoDeclaracion = tipoDeclaracion;
	}

	
}
