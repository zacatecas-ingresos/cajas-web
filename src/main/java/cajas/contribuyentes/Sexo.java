/*
 * Sexo.java
 * Creado el 25/Apr/2017 10:22:09 AM
 * 
 */
package cajas.contribuyentes;

/**
 *
 * @author Freddy Barrera (freddy.barrera.moo@gmail.com)
 */
public enum Sexo {
    /**
     * Femenino.
     */
    F("FEMENINO"),
    /**
     * Masculino.
     */
    M("MASCULINO");
    
    Sexo(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
    
    private final String valor;
}
