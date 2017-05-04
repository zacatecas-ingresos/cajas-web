package cajas.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

	@Entity
	@Table(name = "Direcciones", schema = "contribuyente")
	public class DomicilioEntity implements Serializable {

		
		/**
		 * 
		 */
		private static final long serialVersionUID = -3237900983695423992L;

		@Id
		@Column(name = "idDireccion")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer idDireccion;

		@Column(name = "Ciudad")
		private String ciudad;
		
		@Column(name = "IdColonia")
		private Integer idColonia;

		@Column(name = "Colonia")
		private String colonia;

		@Column(name = "NumeroExterior")
		private String numeroExterior;

		@Column(name = "NumeroInterior")
		private String numeroInterior;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "idEstado")
		private EstadoEntity idEstado;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "IdMunicipio")
		private MunicipioEntity idMunicipio;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "IdLocalidad")
		private LocalidadEntity idLocalidad;
		
		@Column(name = "CodigoPostal")
		private Integer codigoPostal;

		@Column(name = "Lada")
		private String lada;

		@Column(name = "Telefono")
		private String telefono;

		@Column(name = "Cruzamiento1")
		private String cruzamiento1;

		@Column(name = "Cruzamiento2")
		private String cruzamiento2;

		@Column(name = "Referencia")
		private String referencia;
		
		@Column(name = "IdVialidad")
		private Integer idVialidad;
		
		@Column(name = "IdInmueble")
		private Integer idInmueble;

		@Column(name = "Estatus")
		private Integer estatus;

		@Column(name = "UsuarioRegistra")
		private String usuarioRegistra;

		@Column(name = "FechaAlta")
		private Date fechaAlta;

		@Column(name = "UsuarioModifica")
		private String usuarioModifica;

		@Column(name = "FechaUltimaModificacion")
		private Date fechaUltimaModificacion;

		@Column(name = "DireccionDompuesta")
		private String direccionCompuesta;

		@Column(name = "Calle")
		private String calle;

		@Column(name = "DomicilioHomologado")
		private String domicilioHomologado;

		@Column(name = "CaracteristicaInmueble")
		private String caracteristicaInmueble;
		
		@Column(name = "IdSituacionDomicilio")
		private Integer idSituacionDomicilio;

		public Integer getIdDireccion() {
			return idDireccion;
		}

		public void setIdDireccion(Integer idDireccion) {
			this.idDireccion = idDireccion;
		}

		public String getCiudad() {
			return ciudad;
		}

		public void setCiudad(String ciudad) {
			this.ciudad = ciudad;
		}

		public String getColonia() {
			return colonia;
		}

		public void setColonia(String colonia) {
			this.colonia = colonia;
		}

		public String getNumeroExterior() {
			return numeroExterior;
		}

		public void setNumeroExterior(String numeroExterior) {
			this.numeroExterior = numeroExterior;
		}

		public String getNumeroInterior() {
			return numeroInterior;
		}

		public void setNumeroInterior(String numeroInterior) {
			this.numeroInterior = numeroInterior;
		}

		public EstadoEntity getIdEstado() {
			return idEstado;
		}

		public void setIdEstado(EstadoEntity idEstado) {
			this.idEstado = idEstado;
		}

		public MunicipioEntity getIdMunicipio() {
			return idMunicipio;
		}

		public void setIdMunicipio(MunicipioEntity idMunicipio) {
			this.idMunicipio = idMunicipio;
		}

		public LocalidadEntity getIdLocalidad() {
			return idLocalidad;
		}

		public void setIdLocalidad(LocalidadEntity idLocalidad) {
			this.idLocalidad = idLocalidad;
		}

		public Integer getCodigoPostal() {
			return codigoPostal;
		}

		public void setCodigoPostal(Integer codigoPostal) {
			this.codigoPostal = codigoPostal;
		}

		public String getLada() {
			return lada;
		}

		public void setLada(String lada) {
			this.lada = lada;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		public String getCruzamiento1() {
			return cruzamiento1;
		}

		public void setCruzamiento1(String cruzamiento1) {
			this.cruzamiento1 = cruzamiento1;
		}

		public String getCruzamiento2() {
			return cruzamiento2;
		}

		public void setCruzamiento2(String cruzamiento2) {
			this.cruzamiento2 = cruzamiento2;
		}

		public String getReferencia() {
			return referencia;
		}

		public void setReferencia(String referencia) {
			this.referencia = referencia;
		}

		public Integer getEstatus() {
			return estatus;
		}

		public void setEstatus(Integer estatus) {
			this.estatus = estatus;
		}

		public String getUsuarioRegistra() {
			return usuarioRegistra;
		}

		public void setUsuarioRegistra(String usuarioRegistra) {
			this.usuarioRegistra = usuarioRegistra;
		}

		public Date getFechaAlta() {
			return fechaAlta;
		}

		public void setFechaAlta(Date fechaAlta) {
			this.fechaAlta = fechaAlta;
		}

		public String getUsuarioModifica() {
			return usuarioModifica;
		}

		public void setUsuarioModifica(String usuarioModifica) {
			this.usuarioModifica = usuarioModifica;
		}

		public Date getFechaUltimaModificacion() {
			return fechaUltimaModificacion;
		}

		public void setFechaUltimaModificacion(Date fechaUltimaModificacion) {
			this.fechaUltimaModificacion = fechaUltimaModificacion;
		}

		public String getDireccionCompuesta() {
			return direccionCompuesta;
		}

		public void setDireccionCompuesta(String direccionCompuesta) {
			this.direccionCompuesta = direccionCompuesta;
		}

		public String getCalle() {
			return calle;
		}

		public void setCalle(String calle) {
			this.calle = calle;
		}

		public String getDomicilioHomologado() {
			return domicilioHomologado;
		}

		public void setDomicilioHomologado(String domicilioHomologado) {
			this.domicilioHomologado = domicilioHomologado;
		}

		public String getCaracteristicaInmueble() {
			return caracteristicaInmueble;
		}

		public void setCaracteristicaInmueble(String caracteristicaInmueble) {
			this.caracteristicaInmueble = caracteristicaInmueble;
		}

		public Integer getIdSituacionDomicilio() {
			return idSituacionDomicilio;
		}

		public void setIdSituacionDomicilio(Integer idSituacionDomicilio) {
			this.idSituacionDomicilio = idSituacionDomicilio;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public Integer getIdColonia() {
			return idColonia;
		}

		public void setIdColonia(Integer idColonia) {
			this.idColonia = idColonia;
		}

		public Integer getIdVialidad() {
			return idVialidad;
		}

		public void setIdVialidad(Integer idVialidad) {
			this.idVialidad = idVialidad;
		}

		public Integer getIdInmueble() {
			return idInmueble;
		}

		public void setIdInmueble(Integer idInmueble) {
			this.idInmueble = idInmueble;
		}

		

		}
