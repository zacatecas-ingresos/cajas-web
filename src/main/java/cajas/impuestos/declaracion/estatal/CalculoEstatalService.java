package cajas.impuestos.declaracion.estatal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cajas.actualizacionesrecargos.calculo.ActualizacionRecargo;
import cajas.actualizacionesrecargos.calculo.ActualizacionesRecargosService;
import cajas.actualizacionesrecargos.calculo.ContribucionFiscal;
import cajas.exception.BusinessException;
import cajas.persistence.entity.CalculoTemporalEstatalEntity;
import cajas.persistence.entity.PeriodosEntity;
import cajas.util.FechaUtil;
import cajas.util.ValidacionUtil;

public class CalculoEstatalService {
	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;

	@Inject
	private ActualizacionesRecargosService actualizacionesRecargosService;

	@Inject
	private ImporteImpuestoService calculoImpuestoService;

	
	
	protected List<Contribuyente> consultarContribuyentePorCriterio(String criterio) {
		List<Contribuyente> contribuyentes = new ArrayList<>();
		return contribuyentes;
	}

	protected List<Sucursal> consultarSucursalesPorIdContribuyente(Integer idContribuyente) {
		List<Sucursal> sucursales = new ArrayList<>();
		return sucursales;
	}

	protected ImpuestoEstatal calcularImpuesto(DeclaracionEstatal declaracion) {

		Integer idUsuarioLogeado = 1;// Obtener al usuario logeado

		// Validar datos requeridos
		validarDeclaracion(declaracion);

		// Validar contribuyente, asignación obligacion y sucursales
		validarAsignacion(declaracion.getIdContribuyente(), declaracion.getIdSucursal(), declaracion.getIdObligacion());

		// Validar periodo declarado
		int ejercicioFiscalDeclaracion = declaracion.getEjercicioFiscal();
		PeriodosEntity periodo = entityManager.find(PeriodosEntity.class, declaracion.getPeriodo());

		if (periodo == null) {
			throw new BusinessException("No se encontró configuración para el periodo seleccionado");
		}

		int mesDeclaracion = periodo.getIdMes(); // obtener el mes del periodo
		int mesActual = FechaUtil.mesActual();

		if (ejercicioFiscalDeclaracion == FechaUtil.ejercicioActual()) {
			if (mesActual < mesDeclaracion || mesActual == mesDeclaracion) {
				throw new BusinessException("El periodo que intenta declarar es improcedente");
			}
		}

		// Verificar los tipos de datos
		BigDecimal impuesto = BigDecimal.ZERO;
		BigDecimal uaz = BigDecimal.ZERO;

		impuesto = calculoImpuestoService.impuestoEstatal(declaracion.getTotalErogaciones(),
				declaracion.getEjercicioFiscal(), declaracion.getPeriodo(), TipoTasa.TASA_NOMINA);

		uaz = calculoImpuestoService.impuestoEstatal(impuesto, declaracion.getEjercicioFiscal(),
				declaracion.getPeriodo(), TipoTasa.TASA_UAZ);

		ContribucionFiscal contribucionFiscal = new ContribucionFiscal();
		contribucionFiscal.setaFiscalAdeudo(declaracion.getEjercicioFiscal());
		contribucionFiscal.setMesFiscalAdeudo(declaracion.getPeriodo());
		contribucionFiscal.setPagoVencido(false);
		contribucionFiscal.setCantidadAdeuda(declaracion.getTotalErogaciones());
		contribucionFiscal.setTipoRecargo("MORA");

		ActualizacionRecargo actualizacionRecargo = new ActualizacionRecargo();
		try {
			actualizacionRecargo = actualizacionesRecargosService.calculoActualizacion(contribucionFiscal);
		} catch (BusinessException ex) {
			throw new BusinessException(ex.getMessage());
		}

		BigDecimal actualizaciones = actualizacionRecargo.getImporteActualizacion();
		BigDecimal recargos = actualizacionRecargo.getImporteRecargo();

		BigDecimal total = impuesto.add(uaz).add(actualizaciones).add(recargos);

		CalculoTemporalEstatalEntity calculoTemporal = new CalculoTemporalEstatalEntity();
		calculoTemporal.setActualizaciones(actualizaciones);
		calculoTemporal.setBaseGravable(declaracion.getTotalErogaciones());
		calculoTemporal.setEjercicioFiscal(declaracion.getEjercicioFiscal());
		calculoTemporal.setFechaCalculo(FechaUtil.fechaActual());
		calculoTemporal.setIdContribuyente(declaracion.getIdContribuyente());
		calculoTemporal.setIdObligacion(declaracion.getIdObligacion());
		calculoTemporal.setIdPeriodo(declaracion.getPeriodo());
		calculoTemporal.setIdSucursal(declaracion.getIdSucursal());
		calculoTemporal.setIdUsuario(idUsuarioLogeado);
		calculoTemporal.setImpuesto(impuesto);
		calculoTemporal.setNumeroEmpleados(declaracion.getNumeroEmpleados());
		calculoTemporal.setRecargos(recargos);
		calculoTemporal.setTipoDeclaracion(declaracion.getIdTipoDeclaracion());
		calculoTemporal.setTotal(total);
		calculoTemporal.setUaz(uaz);

		entityManager.persist(calculoTemporal);

		ImpuestoEstatal impuestoEstatal = new ImpuestoEstatal();
		impuestoEstatal.setIdCalculoTemporal(calculoTemporal.getIdCalculoTemporal());
		impuestoEstatal.setImpuesto(impuesto);
		impuestoEstatal.setUaz(uaz);
		impuestoEstatal.setActualizaciones(actualizaciones);
		impuestoEstatal.setRecargos(recargos);
		return impuestoEstatal;
	}

	private void validarDeclaracion(DeclaracionEstatal declaracion) {

		if (!ValidacionUtil.esNumeroPositivo(declaracion.getEjercicioFiscal())) {
			throw new BusinessException("El ejercicio fiscal es requerido.");
		}

		if (!ValidacionUtil.esNumeroPositivo(declaracion.getTotalErogaciones())) {
			throw new BusinessException("El importe es requerido.");
		}

		if (!ValidacionUtil.esNumeroPositivo(declaracion.getNumeroEmpleados())) {
			throw new BusinessException("El número de empleados es requerido.");
		}

		if (!ValidacionUtil.esNumeroPositivo(declaracion.getIdContribuyente())) {
			throw new BusinessException("El número de empleados es requerido.");
		}

		if (!ValidacionUtil.esNumeroPositivo(declaracion.getIdObligacion())) {
			throw new BusinessException("El tipo de obligación es requerido.");
		}

		if (!ValidacionUtil.esNumeroPositivo(declaracion.getIdSucursal())) {
			throw new BusinessException("La sucursal es requerida.");
		}

		if (!ValidacionUtil.esCadenaVacia(declaracion.getIdTipoDeclaracion())) {
			throw new BusinessException("El tipo de declaración es requerido.");
		}

	}

	private void validarAsignacion(Integer idContribuyente, Integer idSucursal, Integer idObligacion) {
		// Agregar consulta
		// contribuyente por id

		// validar estatus del contribuyente lanzar excepcion si no está activo

		// Consultar que el contribuyente tenga la obligación asignada activa.

		// Consultar que tenga sucursales activas en la obligación

	}

}
