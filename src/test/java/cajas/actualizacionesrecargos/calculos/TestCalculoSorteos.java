package cajas.actualizacionesrecargos.calculos;

import java.math.BigDecimal;

import javax.ejb.EJB;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;

import cajas.impuestos.declaracion.estatal.ImpuestoConcurso;
import cajas.impuestos.declaracion.estatal.ImpuestoConcursoEJB;

@RunWith(Arquillian.class)
public class TestCalculoSorteos {

	@EJB
	ImpuestoConcursoEJB impuestoSorteoEJB;

	@Deployment
	public static WebArchive createDeployment() {
		return CalculoSorteosArchiveWar.crearWar();
	}

	@Test
	public void calculoSorteos() {

		BigDecimal resultado = new BigDecimal("101");
		ImpuestoConcurso impuestoConcurso = new ImpuestoConcurso();
		impuestoConcurso.setBaseGravableEnajenacion(new BigDecimal("1686"));
		impuestoConcurso.setaFiscal(2017);
		impuestoConcurso.setIdPeriodo(41);
		impuestoConcurso.setTipoIngreso(4);

		BigDecimal importe = impuestoSorteoEJB.impuestoConcurso(impuestoConcurso);

		Assert.assertEquals(resultado, importe);

	}

}