package cajas.actualizacionesrecargos.calculos;

import java.math.BigDecimal;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import cajas.actualizacionesrecargos.calculo.ActualizacionRecargo;
import cajas.actualizacionesrecargos.calculo.ActualizacionesRecargosService;
import cajas.actualizacionesrecargos.calculo.ContribucionFiscal;

@RunWith(Arquillian.class)
public class TestActualizacionesRecargos {

	BigDecimal impuestoGravable = new BigDecimal("16000");
	BigDecimal actualizacion = new BigDecimal("16069");
	BigDecimal recargo = new BigDecimal("363.16");

	@Inject
	ActualizacionesRecargosService actualizacionesRecargosService;

	@Deployment
	public static WebArchive createDeployment() {
		return ActualizacionesRecargosArchiveWar.crearWar();
	}

	/****** Calculando actualizaciones y recargos ******/
	@Test
	public void calcularActualizacion() {

		ContribucionFiscal contibucionFiscal = new ContribucionFiscal();
		ActualizacionRecargo actualizacionRecargo = new ActualizacionRecargo();
//		contibucionFiscal.setaFiscalAdeudo(2017);
//		contibucionFiscal.setMesFiscalAdeudo(1);

		contibucionFiscal.setCantidadAdeuda(new BigDecimal(16000));
		
//		contibucionFiscal.setaFiscalPago(2017);
//		contibucionFiscal.setMesFiscalPago(3);
//		
		actualizacionRecargo  = actualizacionesRecargosService.calculoActualizacion(contibucionFiscal);
				
		Assert.assertEquals(actualizacionRecargo.getImporteActualizacion(), actualizacion);
		
		Assert.assertEquals(actualizacionRecargo.getImporteRecargo(), recargo);

		
	}


}