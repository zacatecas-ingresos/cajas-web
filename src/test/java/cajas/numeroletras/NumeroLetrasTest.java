package cajas.numeroletras;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;

import java.io.File;
import java.math.BigDecimal;
import org.jboss.logging.Logger;
import org.jboss.arquillian.container.test.api.Deployment;
import cajas.util.NumeroLetras;
import junit.framework.Assert;

@RunWith(Arquillian.class)
public class NumeroLetrasTest {


	private static final Logger LOGGER = Logger.getLogger(NumeroLetrasTest.class.getName());

	@Deployment
	public static WebArchive crearWar() {
		WebArchive war = ShrinkWrap.create(WebArchive.class);
		war.addAsWebInfResource(EmptyAsset.INSTANCE, ArchivePaths.create("beans.xml"));
		war.addAsManifestResource("log4j-jboss.properties", "log4j.properties");

		JavaArchive jar = ShrinkWrap.create(JavaArchive.class);
		jar.addAsManifestResource("META-INF/beans.xml", "beans.xml");
		jar.addAsManifestResource("META-INF/test-persistence.xml", "persistence.xml");
		jar.addClass(NumeroLetras.class);
		war.addAsLibrary(jar);

		File[] files = Maven.resolver().loadPomFromFile("pom.xml").importRuntimeDependencies().resolve()
				.withTransitivity().asFile();
		war.addAsLibraries(files);

		return war;

	}


	@Test
	public void convertidor() {
		LOGGER.info("Iniciando test");
		BigDecimal doubleNumber = new BigDecimal(123.05);
		System.out.println(doubleNumber);
		String actualizacionEsperada = "ciento veintitres PESOS 00/100 M.N.";
		
		String actualizacionActual = NumeroLetras.convertNumberToLetter(doubleNumber);
		System.out.println(actualizacionActual);		
		Assert.assertEquals(actualizacionEsperada, actualizacionActual);
	}
}
