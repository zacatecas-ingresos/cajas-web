package cajas.actualizacionesrecargos.calculos;

import java.math.BigDecimal;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.Assert;

import cajas.impuestos.declaracion.estatal.ImporteImpuestoService;

public class TestCalculoSorteos {

	@Inject
	ImporteImpuestoService importeImpuestoService;

	@Deployment
	public static WebArchive createDeployment() {
		return CalculoSorteosArchiveWar.crearWar();
	}

	@Test
	public void calculoSorteos() {

		BigDecimal impuestoGravable = new BigDecimal("1686");
		BigDecimal resultado = new BigDecimal("101");

		Integer aFiscal = 2017;
		Integer idPeriodo = 1;
		Integer tipoIngreso = 3;

		BigDecimal importe = importeImpuestoService.impuestoConcursos(impuestoGravable, aFiscal, idPeriodo,
				tipoIngreso);

		Assert.assertEquals(resultado, importe);

	}

}