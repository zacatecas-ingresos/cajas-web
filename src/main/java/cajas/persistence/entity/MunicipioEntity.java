
package cajas.persistence.entity;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/** Entity implementation class for Entity: Municipios */
@Entity
@Table(name = "Municipios", schema = "configuracion")
public class MunicipioEntity implements Serializable {

    /**
    * 
    */
    private static final long serialVersionUID = 7466571805450936423L;
    @Id
    @Column(name = "IdMunicipio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMunicipio;
    
    @Column(name = "AbreviacionMunicipio")
    private String abreviacionMunicipio;
    
    @Column(name = "Municipio")
    private String municipio;
    
    @JoinColumn(name = "IdEstado")
    @ManyToOne(fetch = FetchType.LAZY)
    private EstadoEntity estado;

    @Column(name = "IdMunicipioTemporal")
    private Integer idMunicipioTemporal;

	public Integer getIdMunicipio() {
		return idMunicipio;
	}

	public void setIdMunicipio(Integer idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public String getAbreviacionMunicipio() {
		return abreviacionMunicipio;
	}

	public void setAbreviacionMunicipio(String abreviacionMunicipio) {
		this.abreviacionMunicipio = abreviacionMunicipio;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public EstadoEntity getEstado() {
		return estado;
	}

	public void setEstado(EstadoEntity estado) {
		this.estado = estado;
	}

	public Integer getIdMunicipioTemporal() {
		return idMunicipioTemporal;
	}

	public void setIdMunicipioTemporal(Integer idMunicipioTemporal) {
		this.idMunicipioTemporal = idMunicipioTemporal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
