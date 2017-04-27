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
import cajas.persistence.entity.VerificacionAdeudoVehicularEntity;
import cajas.persistence.query.VerificacionAdeudoVehicularQuery;
import cajas.persistence.query.VerificacionVehicularQuery;



@Stateless
public class VerificacionAdeudoVehicularEJB {
	

	@Inject
	VerificacionAdeudoVehicularQuery vVehicularQuery; 
	
	@PersistenceContext(name = "sitDS")
	private EntityManager entityManager;
	
	public void creaVerificacionAdeudoVehicular(VerificacionAdeudoVehicular verificacionAdeudoVehicular ){
		
		VerificacionAdeudoVehicularEntity verificacionAdeudoVehicularEntity = new VerificacionAdeudoVehicularEntity();
		verificacionAdeudoVehicularEntity.setIdVerificacionVehicular(verificacionAdeudoVehicular.getIdVerificacionVehiculo());
		verificacionAdeudoVehicularEntity.setAnio0VerificacionAdeudo(verificacionAdeudoVehicular.getAnio0VerificacionAdeudo());
		verificacionAdeudoVehicularEntity.setAnio1VerificacionAdeudo(verificacionAdeudoVehicular.getAnio1VerificacionAdeudo());
		verificacionAdeudoVehicularEntity.setAnio2VerificacionAdeudo(verificacionAdeudoVehicular.getAnio2VerificacionAdeudo());
		verificacionAdeudoVehicularEntity.setAnio3VerificacionAdeudo(verificacionAdeudoVehicular.getAnio3VerificacionAdeudo());
		verificacionAdeudoVehicularEntity.setAnio4VerificacionAdeudo(verificacionAdeudoVehicular.getAnio4VerificacionAdeudo());
		verificacionAdeudoVehicularEntity.setAnio5VerificacionAdeudo(verificacionAdeudoVehicular.getAnio5VerificacionAdeudo());
		verificacionAdeudoVehicularEntity.setFolioVerificacionAdeudo(verificacionAdeudoVehicular.getFolioVerificacionAdeudo());
		
		//Si el vehiculo es extranjera se guarda estado, fecha regularizacion, folio pedimiento(calcamonia), documento ni estatus
		if(verificacionAdeudoVehicular.getProcedencia() > 0){
			verificacionAdeudoVehicularEntity.setIdEstado(verificacionAdeudoVehicular.getIdEstado());
			verificacionAdeudoVehicularEntity.setFolioCalcamonia(verificacionAdeudoVehicular.getFolioCalcamonia());
			verificacionAdeudoVehicularEntity.setDocumento(verificacionAdeudoVehicular.getDocumento());
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
		
		vVehicularQuery.registrarVerificacion(verificacionAdeudoVehicularEntity);
						
	}
}
