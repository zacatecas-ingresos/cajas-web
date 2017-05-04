package cajas.actualizacionesrecargos.calculos;

import java.io.Serializable;

import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.api.spec.WebArchive;

import cajas.exception.BusinessException;
import cajas.impuestos.declaracion.estatal.ImporteImpuestoService;
import cajas.impuestos.declaracion.estatal.TipoTasa;
import cajas.persistence.entity.TasaImpuestoEntity;
import cajas.persistence.query.TasaImpuestoQuery;

public class CalculoSorteosArchiveWar implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7539304648114081908L;
	
	public static WebArchive crearWar() {

		WebArchive war = ShrinkWrap.create(WebArchive.class).addAsWebInfResource(EmptyAsset.INSTANCE,ArchivePaths.create("beans.xml"));

		JavaArchive jar = ShrinkWrap.create(JavaArchive.class)
				.addClass(TasaImpuestoQuery.class)
				.addClass(TasaImpuestoEntity.class)
				.addClass(BusinessException.class)
				.addClass(TipoTasa.class)
				.addClass(ImporteImpuestoService.class)
				.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml")
				.addAsManifestResource("META-INF/persistence.xml", "persistence.xml");

		war.addAsLibraries(jar);

		return war;
	}


}