package cajas.contribuyentes;

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

import cajas.exception.BusinessException;
import cajas.persistence.entity.ContribuyenteEntity;
import cajas.persistence.entity.ContribuyentesObligacionesEntity;
import cajas.persistence.entity.ObligacionesEntity;
import cajas.persistence.query.ContribuyenteQuery;
import cajas.persistence.query.ContribuyentesObligacionesQuery;

public class ContribuyentesObligacionesTest {

    private static final Logger LOGGER = Logger.getLogger(ContribuyentesObligacionesTest.class.getName());
    
    @Inject 
    ContribuyentesObligacionesQuery contribuyentesObligacionesQuery;

    @Deployment
    public static WebArchive crearWar() {
        WebArchive war = ShrinkWrap.create(WebArchive.class);
        war.addAsWebInfResource(EmptyAsset.INSTANCE, ArchivePaths.create("beans.xml"));
        war.addAsManifestResource("log4j-jboss.properties", "log4j.properties");

        JavaArchive jar = ShrinkWrap.create(JavaArchive.class);
        jar.addAsManifestResource("META-INF/beans.xml", "beans.xml");
        jar.addAsManifestResource("META-INF/persistence.xml", "persistence.xml");
        jar.addClass(BusinessException.class);
        jar.addClass(ContribuyentesObligacionesQuery.class);
        jar.addClass(ContribuyentesObligacionesEntity.class);
        jar.addClass(ContribuyenteEntity.class);
        jar.addClass(ContribuyenteQuery.class);
        jar.addClass(ObligacionesEntity.class);
        war.addAsLibrary(jar);
            
        File[] files = Maven.resolver().loadPomFromFile("pom.xml").importRuntimeDependencies().resolve()
                        .withTransitivity().asFile();
        war.addAsLibraries(files);

        return war;    
    }
    
    
    @Test
    public void obtenerAsignacioActiva() {
        LOGGER.infov("Obtener Asignacio Activa");
        Contribuyente contribuyente = new Contribuyente();
        ObligacionesEntity obligaciones = new ObligacionesEntity();
        ContribuyentesObligacionesEntity contribuyentesObligaciones = new ContribuyentesObligacionesEntity();
        obligaciones.setIdObligacion(1);
        contribuyente.setRfc("RAPJ650310");
        contribuyentesObligaciones.setEstatus(1);
        
}

}
