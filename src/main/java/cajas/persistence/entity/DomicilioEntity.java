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
	@Table(name = "direcciones", schema = "finanzas")
	public class DomicilioEntity implements Serializable {

		
		/**
		 * 
		 */
		private static final long serialVersionUID = -3237900983695423992L;

		@Id
		@Column(name = "id_direccion")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer idDireccion;

		@Column(name = "ciudad")
		private String ciudad;

		@Column(name = "colonia")
		private String Colonia;

		@Column(name = "numero_exterior")
		private String numeroExterior;

		@Column(name = "numero_interior")
		private String numeroInterior;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "id_estado")
		private EstadoEntity idEstado;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "id_municipio")
		private MunicipioEntity idMunicipio;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "id_localidad")
		private LocalidadEntity idLocalidad;
		
		@Column(name = "codigo_postal")
		private Integer codigoPostal;

		@Column(name = "lada")
		private String lada;

		@Column(name = "telefono")
		private String telefono;

		@Column(name = "cruzamiento1")
		private String cruzamiento1;

		@Column(name = "cruzamiento2")
		private String cruzamiento2;

		@Column(name = "referencia")
		private String referencia;

		@Column(name = "estatus")
		private Integer estatus;

		@Column(name = "usuario_registra")
		private String usuarioRegistra;

		@Column(name = "fecha_alta")
		private Date fechaAlta;

		@Column(name = "usuario_modifica")
		private String usuarioModifica;

		@Column(name = "fecha_ultima_modificacion")
		private Date fechaUltimaModificacion;

		@Column(name = "direccion_compuesta")
		private String direccionCompuesta;

		@Column(name = "calle")
		private String calle;

		@Column(name = "domicilio_homologado")
		private String domicilioHomologado;

		@Column(name = "caracteristica_inmueble")
		private String caracteristicaInmueble;
		
		@Column(name = "id_situacion_domicilio")
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
			return Colonia;
		}

		public void setColonia(String colonia) {
			Colonia = colonia;
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

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public Integer getIdSituacionDomicilio() {
			return idSituacionDomicilio;
		}

		public void setIdSituacionDomicilio(Integer idSituacionDomicilio) {
			this.idSituacionDomicilio = idSituacionDomicilio;
		}
		
		

		}
