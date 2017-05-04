package cajas.actualizacionesrecargos.calculos;

import java.io.File;
import java.io.Serializable;

import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;

import cajas.exception.BusinessException;
import cajas.impuestos.declaracion.estatal.ImporteImpuestoService;
import cajas.impuestos.declaracion.estatal.ImpuestoConcurso;
import cajas.impuestos.declaracion.estatal.ImpuestoConcursoEJB;
import cajas.impuestos.declaracion.estatal.TipoTasa;
import cajas.persistence.entity.PeriodosEntity;
import cajas.persistence.entity.TasaImpuestoEntity;
import cajas.persistence.query.PeriodosQuery;
import cajas.persistence.query.TasaImpuestoQuery;

public class CalculoSorteosArchiveWar implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7539304648114081908L;
	
	public static WebArchive crearWar() {

		WebArchive war = ShrinkWrap.create(WebArchive.class).addAsWebInfResource(EmptyAsset.INSTANCE,ArchivePaths.create("beans.xml"));
		war.addAsManifestResource("log4j-jboss.properties", "log4j.properties");

		JavaArchive jar = ShrinkWrap.create(JavaArchive.class)
				.addClass(TasaImpuestoQuery.class)
				.addClass(TasaImpuestoEntity.class)
				.addClass(PeriodosEntity.class)
				.addClass(PeriodosQuery.class)
				.addClass(ImpuestoConcursoEJB.class)
				.addClass(ImpuestoConcurso.class)
				.addClass(BusinessException.class)
				.addClass(TipoTasa.class)
				.addClass(ImporteImpuestoService.class)
				.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml")
				.addAsManifestResource("META-INF/persistence.xml", "persistence.xml");

		File[] files = Maven.resolver().loadPomFromFile("pom.xml").importRuntimeDependencies().resolve()
                 .withTransitivity().asFile();
		war.addAsLibraries(files);
		war.addAsLibraries(jar);

		return war;
	}


}