package net.cobros.utilerias;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

import cajas.util.LineaDeCapturaCerradaUtileria;
import junit.framework.Assert;

@RunWith(Arquillian.class)
public class GenerarLineaCapturaTest {

	private static final Logger LOGGER = Logger.getLogger(GenerarLineaCapturaTest.class.getName());

	@Deployment
	public static WebArchive crearWar() {
		WebArchive war = ShrinkWrap.create(WebArchive.class);
		war.addAsWebInfResource(EmptyAsset.INSTANCE, ArchivePaths.create("beans.xml"));
		war.addAsManifestResource("log4j-jboss.properties", "log4j.properties");

		JavaArchive jar = ShrinkWrap.create(JavaArchive.class);
		jar.addAsManifestResource("META-INF/beans.xml", "beans.xml");
	//	jar.addAsManifestResource("META-INF/test-persistence.xml", "persistence.xml");
		jar.addClass(LineaDeCapturaCerradaUtileria.class);
		war.addAsLibrary(jar);

		File[] files = Maven.resolver().loadPomFromFile("pom.xml").importRuntimeDependencies().resolve()
				.withTransitivity().asFile();
		war.addAsLibraries(files);

		return war;

	}
	
	@Test
	public void generarLCC() {
		LOGGER.info("Iniciando test");
		String referencia = "01325601000000000069";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String dateInString = "20121031";
		Date fechaVencimiento = null;
		try {
			fechaVencimiento = formatter.parse(dateInString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String importe = "9814";
		Integer digito = 2;
		String lcc = LineaDeCapturaCerradaUtileria.obtenerLineaCapturaCerrada(referencia, fechaVencimiento, importe, digito);
		System.out.println(lcc);
		
		
		String lccEsperada = "0132560100000000006992374206";
		
		Assert.assertEquals(lccEsperada, lcc);
	}
	
}
