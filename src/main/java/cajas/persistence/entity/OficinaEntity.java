package cajas.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Oficina", schema = "seguridad" )
public class OficinaEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdOficina")
	private Integer ifOficina;
	
	@Column(name = "Oficina")
	private String oficina;

	public Integer getIfOficina() {
		return ifOficina;
	}

	public void setIfOficina(Integer ifOficina) {
		this.ifOficina = ifOficina;
	}

	public String getOficina() {
		return oficina;
	}

	public void setOficina(String oficina) {
		this.oficina = oficina;
	}
	
	

}
