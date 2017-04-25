
package cajas.persistence.entity;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/** Entity implementation class for Entity: Municipios */
@Entity
@Table(name = "municipios", schema = "catalogos")
public class MunicipioEntity implements Serializable {

    /**
    * 
    */
    private static final long serialVersionUID = 7466571805450936423L;
    @Id
    @Column(name = "id_municipio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMunicipio;
    
    @Column(name = "abreviacion_municipio")
    private String abreviacionMunicipio;
    
    @Column(name = "municipio")
    private String municipio;
    
    @JoinColumn(name = "id_estado")
    @ManyToOne(fetch = FetchType.LAZY)
    private EstadoEntity estado;

    public Integer getIdMunicipio() {
        return this.idMunicipio;
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

}
