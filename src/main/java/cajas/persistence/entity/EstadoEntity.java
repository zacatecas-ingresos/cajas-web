
package cajas.persistence.entity;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/** Entity implementation class for Entity: Estado */
@Entity
@Table(name = "estados", schema = "catalogos")
public class EstadoEntity implements Serializable {

    /**
    * 
    */
    private static final long serialVersionUID = 8427786295811532056L;
    @Id
    @Column(name = "id_estado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEstado;
    @Column(name = "abreviacion_estado")
    private String abreviacionEstado;
    @Column(name = "estado")
    private String estado;

    public Integer getIdEstado() {
        return this.idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getAbreviacionEstado() {
        return abreviacionEstado;
    }

    public void setAbreviacionEstado(String abreviacionEstado) {
        this.abreviacionEstado = abreviacionEstado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
