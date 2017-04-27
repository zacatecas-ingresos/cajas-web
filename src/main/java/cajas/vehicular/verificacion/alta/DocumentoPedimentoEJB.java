package cajas.vehicular.verificacion.alta;

import javax.ejb.Stateless;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import org.joda.time.DateTime;

import cajas.exception.BusinessException;
import cajas.persistence.entity.DocumentoPedimentoEntity;
import cajas.persistence.query.DocumentoPedimentoQuery;

@Stateless
public class DocumentoPedimentoEJB {
	
	@Inject
	DocumentoPedimentoQuery documentoPedimentoQuery;
	
	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;
	
	/*******Obtiene la lista de Documentos Pedimento Registrados********/
	public List<DocumentoPedimento> obtenerDocumentos() {
		try {
			List<DocumentoPedimentoEntity> documentosPedimentoEntity = documentoPedimentoQuery.obtenerVerificaciones();
			List<DocumentoPedimento> documentos = new ArrayList<>();
			
			for (DocumentoPedimentoEntity documentoPedimentoEntity : documentosPedimentoEntity) {
				DocumentoPedimento documento = new DocumentoPedimento();
				documento = documento.documentoPedimentoEntity(documentoPedimentoEntity);
				documentos.add(documento);
			}
			return documentos;
		} catch (NoResultException ex) {
			throw new BusinessException("No hay Documentos Registrados.");
		}
	}
	

}
