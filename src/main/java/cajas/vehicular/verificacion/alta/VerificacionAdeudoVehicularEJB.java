package cajas.vehicular.verificacion.alta;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.joda.time.DateTime;

import cajas.persistence.entity.DocumentoPedimentoEntity;
import cajas.persistence.entity.EstadoEntity;
import cajas.persistence.entity.EstatusVerificacionEntity;
import cajas.persistence.entity.VerificacionAdeudoVehicularEntity;
import cajas.persistence.entity.VerificacionVehicularEntity;



@Stateless
public class VerificacionAdeudoVehicularEJB {

	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;
	
	public void creaVerificacionAdeudoVehicular(VerificacionAdeudoVehicular verificacionAdeudoVehicular ){
		
		VerificacionAdeudoVehicularEntity verificacionAdeudoVehicularEntity = new VerificacionAdeudoVehicularEntity();
		VerificacionVehicularEntity verificacionVehicular = entityManager.find(VerificacionVehicularEntity.class, verificacionAdeudoVehicular.getIdVerificacionVehiculo());
		if (verificacionAdeudoVehicular.getEstatus() == 0) {
			EstatusVerificacionEntity estatusVerificacion = entityManager.find(EstatusVerificacionEntity.class, 1);
			verificacionVehicular.setEstatusVerificacion(estatusVerificacion);
		}
		
		verificacionAdeudoVehicularEntity.setVerificacionVehicular(verificacionVehicular);

		verificacionAdeudoVehicularEntity.setAnio0VerificacionAdeudo(verificacionAdeudoVehicular.getAnio0VerificacionAdeudo());
		verificacionAdeudoVehicularEntity.setAnio1VerificacionAdeudo(verificacionAdeudoVehicular.getAnio1VerificacionAdeudo());
		verificacionAdeudoVehicularEntity.setAnio2VerificacionAdeudo(verificacionAdeudoVehicular.getAnio2VerificacionAdeudo());
		verificacionAdeudoVehicularEntity.setAnio3VerificacionAdeudo(verificacionAdeudoVehicular.getAnio3VerificacionAdeudo());
		verificacionAdeudoVehicularEntity.setAnio4VerificacionAdeudo(verificacionAdeudoVehicular.getAnio4VerificacionAdeudo());
		verificacionAdeudoVehicularEntity.setAnio5VerificacionAdeudo(verificacionAdeudoVehicular.getAnio5VerificacionAdeudo());
		verificacionAdeudoVehicularEntity.setFolioVerificacionAdeudo(verificacionAdeudoVehicular.getFolioVerificacionAdeudo());
		
		//Si el vehiculo es extranjera se guarda estado, fecha regularizacion, folio pedimiento(calcamonia), documento ni estatus
		if(verificacionAdeudoVehicular.getProcedencia() > 0){
			EstadoEntity estadoEntity = entityManager.find(EstadoEntity.class, verificacionAdeudoVehicular.getIdEstado());
			verificacionAdeudoVehicularEntity.setEstado(estadoEntity);
			verificacionAdeudoVehicularEntity.setFolioCalcamonia(verificacionAdeudoVehicular.getFolioCalcamonia());
			DocumentoPedimentoEntity documentoPedimentoEntity = entityManager.find(DocumentoPedimentoEntity.class, verificacionAdeudoVehicular.getIdEstado());
			verificacionAdeudoVehicularEntity.setDocumentoPedimento(documentoPedimentoEntity);
			String pattern = "dd-MM-yyyy";
		    SimpleDateFormat format = new SimpleDateFormat(pattern);
			
			try {
				verificacionAdeudoVehicularEntity.setFechaRegularizacion(format.parse(verificacionAdeudoVehicular.getFechaRegularizacion()));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		verificacionAdeudoVehicularEntity.setEstatus(verificacionAdeudoVehicular.getEstatus());
		verificacionAdeudoVehicularEntity.setProcedencia(verificacionAdeudoVehicular.getProcedencia());
		verificacionAdeudoVehicularEntity.setObservaciones(verificacionAdeudoVehicular.getObservaciones());
		verificacionAdeudoVehicularEntity.setBaja(verificacionAdeudoVehicular.getBaja());
		verificacionAdeudoVehicularEntity.setBajaPlaca(verificacionAdeudoVehicular.getBajaPlaca());		
		verificacionAdeudoVehicularEntity.setFechaVerificacionAdeudo(DateTime.now().toDate());
		entityManager.persist(verificacionAdeudoVehicularEntity);
	}
}
