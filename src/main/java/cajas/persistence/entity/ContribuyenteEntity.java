package cajas.persistence.entity;

import cajas.contribuyentes.Sexo;
import cajas.contribuyentes.TipoPersona;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "contribuyentes", schema = "contribuyentes")
public class ContribuyenteEntity implements Serializable {

    private static final long serialVersionUID = -5318651937091329981L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contribuyente")
    private Integer idContribuyente;

    @Column(name = "rfc")
    private String rfc;
    
    @Column(name = "curp")
    private String curp;
    
    @Column(name = "tipo_persona")
    @Enumerated(EnumType.STRING)
    private TipoPersona tipoPersona;
    
    @Column(name = "nombre_compuesto")
    private String nombreCompuesto;
    
    @Column(name = "nombres")
    private String nombre;
    
    @Column(name = "primer_apellido")
    private String primerApellido;
    
    @Column(name = "segundo_apellido")
    private String segundoApellido;

    @Column(name = "sexo")
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    @Column(name = "nacionalidad")
    private String nacionalidad;

//    @Column(name = "correo_electronico")
//    private String correoElectronico;

    @Column(name = "razon_social")
    private String razonSocial;
    
    @Column(name ="estatus")
    private Integer idEstatus;
    
    
    
    public Integer getIdContribuyente() {
        return idContribuyente;
    }

    public void setIdContribuyente(Integer idContribuyente) {
        this.idContribuyente = idContribuyente;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * Get the value of curp
     *
     * @return the value of curp
     */
    public String getCurp() {
        return curp;
    }

    /**
     * Set the value of curp
     *
     * @param curp new value of curp
     */
    public void setCurp(String curp) {
        this.curp = curp;
    }

    /**
     * Get the value of tipoPersona
     *
     * @return the value of tipoPersona
     */
    public TipoPersona getTipoPersona() {
        return tipoPersona;
    }

    /**
     * Set the value of tipoPersona
     *
     * @param tipoPersona new value of tipoPersona
     */
    public void setTipoPersona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    /**
     * Get the value of nombreCompuesto
     *
     * @return the value of nombreCompuesto
     */
    public String getNombreCompuesto() {
        return nombreCompuesto;
    }

    /**
     * Set the value of nombreCompuesto
     *
     * @param nombreCompuesto new value of nombreCompuesto
     */
    public void setNombreCompuesto(String nombreCompuesto) {
        this.nombreCompuesto = nombreCompuesto;
    }

    
    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Get the value of primerApellido
     *
     * @return the value of primerApellido
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Set the value of primerApellido
     *
     * @param primerApellido new value of primerApellido
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * Get the value of segundoApellido
     *
     * @return the value of segundoApellido
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * Set the value of segundoApellido
     *
     * @param segundoApellido new value of segundoApellido
     */
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    /**
     * Get the value of sexo
     *
     * @return the value of sexo
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * Set the value of sexo
     *
     * @param sexo new value of sexo
     */
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    
    /**
     * Get the value of fechaNacimiento
     *
     * @return the value of fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Set the value of fechaNacimiento
     *
     * @param fechaNacimiento new value of fechaNacimiento
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Get the value of nacionalidad
     *
     * @return the value of nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Set the value of nacionalidad
     *
     * @param nacionalidad new value of nacionalidad
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * Get the value of correoElectronico
     *
     * @return the value of correoElectronico
     */
//    public String getCorreoElectronico() {
//        return correoElectronico;
//    }

    /**
     * Set the value of correoElectronico
     *
     * @param correoElectronico new value of correoElectronico
     */
//    public void setCorreoElectronico(String correoElectronico) {
//        this.correoElectronico = correoElectronico;
//    }

    /**
     * Get the value of razonSocial
     *
     * @return the value of razonSocial
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Set the value of razonSocial
     *
     * @param razonSocial new value of razonSocial
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

}
