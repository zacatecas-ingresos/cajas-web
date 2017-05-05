/*
 * SituacionContribuyente.java
 * Creado el 04/May/2017 4:02:13 PM
 * 
 */
package cajas.config.situacioncontribuyente;

/**
 * 
 * @author Alejandro Perez
 */
public class SituacionContribuyente {
    private Integer idSituacionContribuyente;
    private String situacionContribuyente;
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

    @Override
    public String toString() {
        return "Estado{" 
                + "idSituacionContribuyente=" + idSituacionContribuyente
                + ", situacionContribuyente=" + situacionContribuyente
                + ", estatusSituacionContribuyente=" + estatusSituacionContribuyente + '}';
    }

}