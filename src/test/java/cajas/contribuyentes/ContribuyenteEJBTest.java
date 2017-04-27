/*
 * ContribuyenteEJBTest.java
 * 
 */
package cajas.contribuyentes;

import cajas.exception.BusinessException;
import cajas.persistence.entity.ContribuyenteEntity;
import cajas.persistence.query.ContribuyenteQuery;
import cajas.util.ValidarFormatoCURP;
import cajas.util.ValidarFormatoRFC;
import java.io.File;
import java.util.Calendar;
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
import org.junit.Ignore;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 *
 * @author Freddy Barrera (freddy.barrera.moo@gmail.com)
 */
@RunWith(Arquillian.class)
public class ContribuyenteEJBTest {

    private static final Logger LOGGER = Logger.getLogger(ContribuyenteEJBTest.class.getName());
    private static final String PLANTILLA_INICANDO_TEST = "Iniciando test {0}";
    
    @Inject private ContribuyenteEJB contribuyenteEJB;

    @Deployment
    public static WebArchive crearWar() {
        WebArchive war = ShrinkWrap.create(WebArchive.class);
        war.addAsWebInfResource(EmptyAsset.INSTANCE, ArchivePaths.create("beans.xml"));
        war.addAsManifestResource("log4j-jboss.properties", "log4j.properties");

        JavaArchive jar = ShrinkWrap.create(JavaArchive.class);
        jar.addAsManifestResource("META-INF/beans.xml", "beans.xml");
        jar.addAsManifestResource("META-INF/persistence.xml", "persistence.xml");
        jar.addClass(BusinessException.class);
        jar.addClass(Contribuyente.class);
        jar.addClass(ContribuyenteEJB.class);
        jar.addClass(ContribuyenteEntity.class);
        jar.addClass(ContribuyenteFactory.class);
        jar.addClass(ContribuyenteQuery.class);
        jar.addClass(TipoPersona.class);
        jar.addClass(Sexo.class);
        jar.addClass(ValidarFormatoRFC.class);
        jar.addClass(ValidarFormatoCURP.class);
        war.addAsLibrary(jar);
            
        File[] files = Maven.resolver().loadPomFromFile("pom.xml").importRuntimeDependencies().resolve()
                        .withTransitivity().asFile();
        war.addAsLibraries(files);

        return war;    
    }
    
    //@Ignore
    @Test
    public void crearContribuyente() {
        LOGGER.infov(PLANTILLA_INICANDO_TEST, "crearContribuyente");
        Contribuyente contribuyente = new Contribuyente();
        contribuyente.setId(null);
        contribuyente.setRfc("BARK870510MJX");
        contribuyente.setCurp("BARK870510HCCJXR00");
        contribuyente.setTipoPersona(TipoPersona.FISICA);
        contribuyente.setNombre("Kevin");
        contribuyente.setPrimerApellido("Barancos");
        contribuyente.setSegundoApellido("Reyes");
        contribuyente.setSexo(Sexo.M);
        Calendar fechaNaciminto = Calendar.getInstance();
        fechaNaciminto.set(Calendar.YEAR, 1987);
        fechaNaciminto.set(Calendar.MONTH, Calendar.MAY);
        fechaNaciminto.set(Calendar.DAY_OF_MONTH, 10);
        contribuyente.setFechaNacimiento(fechaNaciminto.getTime());
        contribuyente.setNacionalidad("MEXICANA");
        
        Integer idContribuyente = contribuyenteEJB.crearContribuyente(contribuyente);
        LOGGER.infov("Contribuyente guardado con ID: {0}", idContribuyente);
        assertNotNull(idContribuyente);
    }
    
    @Ignore
    @Test
    public void obtenerContribuyente() {
        LOGGER.infov(PLANTILLA_INICANDO_TEST, "obtenerContribuyente");
        Contribuyente contribuyente = contribuyenteEJB.obtenerContribuyente(1);
        String claveValor = "{0} : {1}";
        LOGGER.infov(claveValor, "RFC" , contribuyente.getRfc());
        LOGGER.infov(claveValor, "CURP", contribuyente.getCurp());
        LOGGER.infov(claveValor, "Tipo persona", contribuyente.getTipoPersona());
        LOGGER.infov(claveValor, "Nombre", contribuyente.getNombre());
        LOGGER.infov(claveValor, "Primer apellido", contribuyente.getPrimerApellido());
        LOGGER.infov(claveValor, "Segundo apellido", contribuyente.getSegundoApellido());
        LOGGER.infov(claveValor, "Sexo", contribuyente.getSexo());
        LOGGER.infov(claveValor, "Fecha de nacimiento", contribuyente.getFechaNacimiento());
        LOGGER.infov(claveValor, "Nacionalidad", contribuyente.getNacionalidad());
        
        assertNotNull(contribuyente);
    }
    
    @Ignore
    @Test
    public void editarContribuyente() {
        LOGGER.infov(PLANTILLA_INICANDO_TEST, "editarContribuyente");
        Contribuyente contribuyente = new Contribuyente();
        contribuyente.setId(1);
        contribuyente.setRfc("MARK870510MCCJXR00");
        contribuyenteEJB.editarContribuyente(contribuyente);
    }
    
    @Ignore
    @Test
    public void eliminarContribuyente() {
        LOGGER.infov(PLANTILLA_INICANDO_TEST, "eliminarContribuyente");
        contribuyenteEJB.eliminarContribuyente(1);
    }

}
