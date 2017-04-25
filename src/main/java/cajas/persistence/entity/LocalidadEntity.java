package cajas.persistence.entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: LocalidadEntity
 *
 */
@Entity
@Table(name = "localidades", schema = "catalogos")
public class LocalidadEntity implements Serializable {

	   
	
	/**
     * 
     */
    private static final long serialVersionUID = 1034382473824926620L;
    @Id
    @Column(name = "id_localidad")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer idLocalidad;   
	
    @JoinColumn(name = "id_municipio")
    @ManyToOne(fetch = FetchType.LAZY)
    private EstadoEntity municipio;
   
	
	@JoinColumn(name = "id_estado")
	    @ManyToOne(fetch = FetchType.LAZY)
	    private EstadoEntity estado;
  
	@Column(name = "abreviacion_localidad")
	private String abreviacionLocalidad;   
	
	@Column(name = "localidad")
	private String localidad;
	

	public LocalidadEntity() {
		super();
	}   
	public Integer getIdLocalidad() {
		return this.idLocalidad;
	}

	public void setIdLocalidad(Integer idLocalidad) {
		this.idLocalidad = idLocalidad;
	}   
	
	public String getAbreviacionLocalidad() {
		return this.abreviacionLocalidad;
	}

	public void setAbreviacionLocalidad(String abreviacionLocalidad) {
		this.abreviacionLocalidad = abreviacionLocalidad;
	}   
	public String getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
   
}
