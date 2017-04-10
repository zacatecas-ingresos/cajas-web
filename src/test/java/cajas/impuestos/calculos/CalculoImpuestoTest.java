package cajas.impuestos.calculos;

import java.io.File;
import java.math.BigDecimal;
import java.text.ParseException;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.logging.Logger;
import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.Test;
import org.junit.runner.RunWith;

import cajas.exception.BusinessException;
import cajas.impuestos.calculo.CalculoImpuestoService;
import cajas.persistence.entity.PeriodosEntity;
import cajas.persistence.entity.TasaImpuestoEntity;
import cajas.persistence.query.PeriodosQuery;
import cajas.persistence.query.TasaImpuestoQuery;
import junit.framework.Assert;

@RunWith(Arquillian.class)
public class CalculoImpuestoTest {

	private static final Logger LOGGER = Logger.getLogger(CalculoImpuestoTest.class.getName());

	@Inject
	CalculoImpuestoService calculoImpuestoService;

	@Deployment
	public static WebArchive crearWar() {
		WebArchive war = ShrinkWrap.create(WebArchive.class);
		war.addAsWebInfResource(EmptyAsset.INSTANCE, ArchivePaths.create("beans.xml"));
		war.addAsManifestResource("log4j-jboss.properties", "log4j.properties");

		JavaArchive jar = ShrinkWrap.create(JavaArchive.class);
		jar.addAsManifestResource("META-INF/beans.xml", "beans.xml");
		jar.addAsManifestResource("META-INF/persistence.xml", "persistence.xml");
		jar.addClass(TasaImpuestoQuery.class);
		jar.addClass(TasaImpuestoEntity.class);
		jar.addClass(BusinessException.class);
		jar.addClass(PeriodosEntity.class);
		jar.addClass(PeriodosQuery.class);
		jar.addClass(CalculoImpuestoService.class);
		war.addAsLibrary(jar);

		File[] files = Maven.resolver().loadPomFromFile("pom.xml").importRuntimeDependencies().resolve()
				.withTransitivity().asFile();
		war.addAsLibraries(files);

		return war;

	}

	@Test
	public void convertidor() throws ParseException {

		LOGGER.info("Iniciando Test Calculo Impuestos Estatales");
		Integer aFiscal = 2017;
		String periodo = "ENERO";
		Integer tipoPeriodo = 2;
		BigDecimal impuesto = new BigDecimal("150.00");
		String tipoImpuesto = "SERVICIO HOSPEDAJE";
		BigDecimal baseGravable = new BigDecimal(5000);

		BigDecimal impuestoCalculado = calculoImpuestoService.impuestoEstatal(baseGravable, tipoImpuesto, aFiscal,periodo,tipoPeriodo);

		Assert.assertEquals(impuesto, impuestoCalculado);
	}

}