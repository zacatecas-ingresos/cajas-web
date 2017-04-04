package cajas.actualizacionesrecargos.calculos;

import java.io.Serializable;

import org.jboss.shrinkwrap.api.ArchivePaths;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.api.spec.WebArchive;

import cajas.actualizacionesrecargos.calculo.ActualizacionRecargo;
import cajas.actualizacionesrecargos.calculo.ActualizacionesRecargosService;
import cajas.actualizacionesrecargos.calculo.ContribucionFiscal;
import cajas.exception.BusinessException;
import cajas.persistence.entity.INPCEntity;
import cajas.persistence.query.INPCQuery;

public class ActualizacionesRecargosArchiveWar implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8900339943614029228L;

	public static WebArchive crearWar() {

		WebArchive war = ShrinkWrap.create(WebArchive.class).addAsWebInfResource(EmptyAsset.INSTANCE,ArchivePaths.create("beans.xml"));

		JavaArchive jar = ShrinkWrap.create(JavaArchive.class)
				.addClass(ActualizacionesRecargosService.class)
				.addClass(INPCEntity.class)
				.addClass(INPCQuery.class)
				.addClass(BusinessException.class)
				.addClass(ContribucionFiscal.class)
				.addClass(ActualizacionRecargo.class)
				.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml")
				.addAsManifestResource("META-INF/persistence.xml", "persistence.xml");

		war.addAsLibraries(jar);

		return war;
	}

}