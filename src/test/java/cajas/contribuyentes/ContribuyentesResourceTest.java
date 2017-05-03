/*
 * ContribuyentesResourceTest.java
 * Creado el 01/May/2017 9:16:47 AM
 * 
 */
package cajas.contribuyentes;

import cajas.config.JaxRsActivator;
import cajas.exception.BusinessException;
import cajas.persistence.entity.ContribuyenteEntity;
import cajas.persistence.query.ContribuyenteQuery;
import cajas.util.ValidarFormatoCURP;
import cajas.util.ValidarFormatoRFC;
import java.io.File;
import java.net.URL;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Path;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.runner.RunWith;

/**
 *
 * @author Freddy Barrera (freddy.barrera.moo@gmail.com)
 */
@RunWith(Arquillian.class)
@RunAsClient
public class ContribuyentesResourceTest {
    
    private static final String RESOURCE_PREFIX = JaxRsActivator.class.getAnnotation(ApplicationPath.class).value().substring(1);
    private static final String RESOURCE_NAME = ContribuyenteResource.class.getAnnotation(Path.class).value();
    
    @Deployment(testable = false)
    public static WebArchive createDeployment() {
        WebArchive war = ShrinkWrap.create(WebArchive.class, "test.war");
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
        jar.addClass(ContribuyenteResource.class);
        jar.addClass(TipoPersona.class);
        jar.addClass(Sexo.class);
        jar.addClass(ValidarFormatoRFC.class);
        jar.addClass(ValidarFormatoCURP.class);
        jar.addClass(JaxRsActivator.class);
        war.addAsLibrary(jar);
            
        File[] files = Maven.resolver().loadPomFromFile("pom.xml").importRuntimeDependencies().resolve()
                        .withTransitivity().asFile();
        war.addAsLibraries(files);

        return war; 
    }

    //@Ignore
    @Test
    public void buscarContribuyente(@ArquillianResource URL deploymentUrl) throws Exception {
        String url = deploymentUrl.toString() + RESOURCE_PREFIX + '/' + RESOURCE_NAME +  "/consulta";
        System.out.println(url);
        Client client = ClientBuilder.newClient();
        String get = client.target(url)
                .queryParam("porCriterio", "chavez")
                .request(MediaType.APPLICATION_JSON)
                .get(String.class);
        System.out.println(get);
    }
}
