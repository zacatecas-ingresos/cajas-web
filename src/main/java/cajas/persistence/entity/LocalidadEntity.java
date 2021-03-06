package cajas.persistence.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: LocalidadEntity
 *
 */
@Entity
@Table(name = "Localidades", schema = "configuracion")
public class LocalidadEntity implements Serializable {

    private static final long serialVersionUID = 1034382473824926620L;
    
    @Id
    @Column(name = "IdLocalidad")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLocalidad;

    @JoinColumn(name = "IdMunicipio")
    @ManyToOne(fetch = FetchType.LAZY)
    private MunicipioEntity municipio;

    @JoinColumn(name = "IdEstado")
    @ManyToOne(fetch = FetchType.LAZY)
    private EstadoEntity estado;

    @Column(name = "AbreviacionLocalidad")
    private String abreviacionLocalidad;

    @Column(name = "Localidad")
    private String localidad;
    
    @Column(name = "IdLocalidadTemporal")
    private Integer idLocalidadTemporal;
    
    @JoinColumn(name = "IdMunicipioTemporal")
    @ManyToOne(fetch = FetchType.LAZY)
    private MunicipioEntity idMunicipioTemporal;

	public Integer getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(Integer idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public MunicipioEntity getMunicipio() {
		return municipio;
	}

	public void setMunicipio(MunicipioEntity municipio) {
		this.municipio = municipio;
	}

	public EstadoEntity getEstado() {
		return estado;
	}

	public void setEstado(EstadoEntity estado) {
		this.estado = estado;
	}

	public String getAbreviacionLocalidad() {
		return abreviacionLocalidad;
	}

	public void setAbreviacionLocalidad(String abreviacionLocalidad) {
		this.abreviacionLocalidad = abreviacionLocalidad;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Integer getIdLocalidadTemporal() {
		return idLocalidadTemporal;
	}

	public void setIdLocalidadTemporal(Integer idLocalidadTemporal) {
		this.idLocalidadTemporal = idLocalidadTemporal;
	}

	public MunicipioEntity getIdMunicipioTemporal() {
		return idMunicipioTemporal;
	}

	public void setIdMunicipioTemporal(MunicipioEntity idMunicipioTemporal) {
		this.idMunicipioTemporal = idMunicipioTemporal;
	}

    
    
    
}
