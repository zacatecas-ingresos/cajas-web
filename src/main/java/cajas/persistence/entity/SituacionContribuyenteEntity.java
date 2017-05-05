/*
 * SituacionContribuyenteQuery.java
 * Creado el 04/May/2017 4:07:30 PM
 * 
 */

package cajas.persistence.entity;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/** Entity implementation class for Entity: Estado */
@Entity
@Table(name = "SituacionContribuyente", schema = "Contribuyente")

public class SituacionContribuyenteEntity {
	  /**
	    * 
	    */
	    private static final long serialVersionUID = 8427786295811532056L;
	    @Id
	    @Column(name = "IdSituacionContribuyente")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)    
	    private Integer idSituacionContribuyente;
	    
	    @Column(name = "SituacionContribuyente")
	    private String situacionContribuyente;
	    
	    @Column(name = "EstatusSituacionContribuyente")    
	    private String estatusSituacionContribuyente;

		public Integer getIdSituacionContribuyente() {
			return idSituacionContribuyente;
		}

		public void setIdSituacionContribuyente(Integer idSituacionContribuyente) {
			this.idSituacionContribuyente = idSituacionContribuyente;
		}

		public String getSituacionContribuyente() {
			return situacionContribuyente;
		}

	    public void setSituacionContribuyente(String situacionContribuyente) {
	        this.situacionContribuyente = situacionContribuyente;
	    }

	    public String getEstatusSituacionContribuyente() {
	        return estatusSituacionContribuyente;
	    }

	    public void setEstatusSituacionContribuyente(String estatusSituacionContribuyente) {
	        this.estatusSituacionContribuyente = estatusSituacionContribuyente;
	    }

	}


