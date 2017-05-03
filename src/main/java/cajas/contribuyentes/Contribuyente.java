/*
 * Contribuyente.java
 * 
 */
package cajas.contribuyentes;

import java.util.Date;

/**
 * Esta clase define un DTO con los datos del contribuyente.
 * 
 * @author Freddy Barrera (freddy.barrera.moo@gmail.com)
 */
public class Contribuyente {

    private Integer id;
    private String rfc;
    private String curp;
    private TipoPersona tipoPersona;
    private String nombreCompuesto;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private Sexo sexo;
    private Date fechaNacimiento;
    private String nacionalidad;
    private String razonSocial;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public TipoPersona getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    /**
     * Obtiene el valor de nombreCompuesto
     *
     * @return the value of nombreCompuesto
     */
    public String getNombreCompuesto() {
        return nombreCompuesto;
    }

    /**
     * Pone el valor de nombreCompuesto
     *
     * @param nombreCompuesto new value of nombreCompuesto
     */
    public void setNombreCompuesto(String nombreCompuesto) {
        this.nombreCompuesto = nombreCompuesto;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * Obtiene el valor de razonSocial
     *
     * @return the value of razonSocial
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Pone el valor de razonSocial
     *
     * @param razonSocial new value of razonSocial
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
}
