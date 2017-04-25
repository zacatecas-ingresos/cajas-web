/*
 * ContribuyenteEJBTest.java
 * 
 */
package cajas.contribuyentes;

import cajas.exception.BusinessException;
import cajas.persistence.entity.ContribuyenteEntity;
import cajas.persistence.query.ContribuyenteQuery;
import java.io.File;
import javax.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.logging.Logger;
import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Freddy Barrera (freddy.barrera.moo@gmail.com)
 */
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
        war.addAsLibrary(jar);
            
        File[] files = Maven.resolver().loadPomFromFile("pom.xml").importRuntimeDependencies().resolve()
                        .withTransitivity().asFile();
        war.addAsLibraries(files);

        return war;    
    }

    @Ignore
    @Test
    public void crearContribuyente() {
        LOGGER.infov(PLANTILLA_INICANDO_TEST, "crearContribuyente");
        Contribuyente contribuyente = new Contribuyente();
        contribuyente.setId(null);
        contribuyente.setRfc("BARK870510MCCJXR00");
        
        Integer idContribuyente = contribuyenteEJB.crearContribuyente(contribuyente);
        assertNotNull(idContribuyente);
    }
    
    @Ignore
    @Test
    public void obtenerContribuyente() {
        LOGGER.infov(PLANTILLA_INICANDO_TEST, "obtenerContribuyente");
        Contribuyente contribuyente = contribuyenteEJB.obtenerContribuyente(1);
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
