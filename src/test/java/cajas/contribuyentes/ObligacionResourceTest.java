package cajas.contribuyentes;

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
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import cajas.config.JaxRsActivator;
import cajas.persistence.entity.ObligacionEntity;
import cajas.persistence.query.ObligacionQuery;

@RunWith(Arquillian.class)
@RunAsClient
public class ObligacionResourceTest {
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
        jar.addClass(Obligacion.class);
        jar.addClass(ObligacionResource.class);
        jar.addClass(ObligacionFactory.class);
        jar.addClass(ObligacionEJB.class);
        jar.addClass(ObligacionQuery.class);
        jar.addClass(ObligacionEntity.class);
        jar.addClass(JaxRsActivator.class);
        war.addAsLibrary(jar);
            
        File[] files = Maven.resolver().loadPomFromFile("pom.xml").importRuntimeDependencies().resolve()
                        .withTransitivity().asFile();
        war.addAsLibraries(files);

        return war; 
    }
    
//    @Ignore
    @Test
    public void obtenerObligaciones(@ArquillianResource URL deploymentUrl) throws Exception {
        String url = deploymentUrl.toString() + RESOURCE_PREFIX + '/' + RESOURCE_NAME +  "/obligaciones";
        System.out.println(url);
        Client client = ClientBuilder.newClient();
        String get = client.target(url)
                .request(MediaType.APPLICATION_JSON)
                .get(String.class);
        System.out.println(get);
    }

}
