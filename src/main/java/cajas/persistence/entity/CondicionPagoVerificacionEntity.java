package cajas.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "condicion_pago_verificacion" , schema = "vehicular" )
public class CondicionPagoVerificacionEntity implements Serializable{
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_condicion_pago_verificacion")
    private Integer idCondicionPagoVerificacion;
    
    @Column(name = "condicion_pago")
    private String condicionPago;

	public Integer getIdCondicionPagoVerificacion() {
		return idCondicionPagoVerificacion;
	}

	public void setIdCondicionPagoVerificacion(Integer idCondicionPagoVerificacion) {
		this.idCondicionPagoVerificacion = idCondicionPagoVerificacion;
	}

	public String getCondicionPago() {
		return condicionPago;
	}

	public void setCondicionPago(String condicionPago) {
		this.condicionPago = condicionPago;
	}

}
