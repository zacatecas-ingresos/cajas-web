package cajas.actualizacionesrecargos;

import java.math.BigDecimal;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class TestActualizacionesRecargos {

	BigDecimal impuestoGravable = new BigDecimal("16000");
	BigDecimal actualizacion = new BigDecimal("16070.4000");
	BigDecimal importeActualizacion = new BigDecimal("70.4000");
	BigDecimal recargo = new BigDecimal("363.19");

	@Inject
	ActualizacionesRecargosService actualizacionesRecargosService;

	@Deployment
	public static WebArchive createDeployment() {
		return ActualizacionesRecargosArchiveWar.crearWar();
	}

	/****** Calculando actualizaciones ******/
	@Test
	public void calcularActualizacion() {

		Integer aFiscal = 2017;
		Integer mesFiscal = 1;

		BigDecimal resultadoActualizacion = actualizacionesRecargosService.calculoActualizacion(aFiscal, mesFiscal,
				impuestoGravable);

		Assert.assertEquals(resultadoActualizacion, actualizacion);

	}

	/******** Calculando el importe de la actualizacón ********/
	@Test
	public void calcularImporteActualizacion() {

		BigDecimal resultadoImporteActualizacion = actualizacionesRecargosService.importeActualizacion(actualizacion,
				impuestoGravable);

		Assert.assertEquals(resultadoImporteActualizacion, importeActualizacion);
	}

	/*********** Calculando recargos ***********/
	@Test
	public void calcualrRecargos() {

		Integer aFiscal = 2017;
		Integer mesFiscal = 1;

		BigDecimal resultadoRecargo = actualizacionesRecargosService.calculoRecargo(aFiscal, mesFiscal, false,actualizacion);
		
		Assert.assertEquals(resultadoRecargo, recargo);

	}

}