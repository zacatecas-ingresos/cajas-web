package cajas.seguridad.ip;

import java.util.Calendar;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.NoResultException;

import cajas.exception.BusinessException;
import cajas.exception.PermisoException;
import cajas.persistence.entity.IpEntity;
import cajas.persistence.query.IpQuery;

@Stateless
public class IpService {

	@Inject
	IpQuery ipQuery;

	/**
	 * Registrar la ip del usuario al superar los intentos de login
	 * 
	 * @param ip
	 */
	public void registrarIP(Ip ip) {
		try {
			IpEntity ipEntity = new IpEntity();
			Calendar fechaExpira = Calendar.getInstance();
			fechaExpira.add(Calendar.MINUTE, 30);
			ipEntity.setFechaExpira(fechaExpira.getTime());
			ipEntity.setHoraExpira(fechaExpira.getTime());
			ipEntity.setIp(ip.getIp());
			ipQuery.registrarIp(ipEntity);
		} catch (PermisoException ex) {
			ex.printStackTrace();
			throw new BusinessException("Ocurrio un problema al registrar la IP.");
		}
	}

	/**
	 * Permite saber si una IP esta bloqueda.
	 * 
	 * @param ip
	 *            la IP que sera validada.
	 * @return true si la IP esta bloqueada en caso contrario false
	 * 
	 */
	public boolean ip(String ip) {
		try {
			IpEntity ipEntity = ipQuery.obtenerIP(ip);
			if (ipEntity != null) {
				Calendar fechaExpiraBloqueo = Calendar.getInstance();
				fechaExpiraBloqueo.setTime(ipEntity.getFechaExpira());
				Calendar horaExpiraBloqueo = Calendar.getInstance();
				horaExpiraBloqueo.setTime(ipEntity.getHoraExpira());

				fechaExpiraBloqueo.set(Calendar.HOUR_OF_DAY, horaExpiraBloqueo.get(Calendar.HOUR_OF_DAY));
				fechaExpiraBloqueo.set(Calendar.MINUTE, horaExpiraBloqueo.get(Calendar.MINUTE));
				fechaExpiraBloqueo.set(Calendar.SECOND, horaExpiraBloqueo.get(Calendar.SECOND));

				Calendar fechaActual = Calendar.getInstance();

				return fechaActual.compareTo(fechaExpiraBloqueo) < 0;
			}
			return false;
		} catch (NoResultException ex) {
			ex.printStackTrace();
			throw new BusinessException("Ocurrio un problema al obtener la IP.");
		}
	}

	/***********
	 * Obtiene los minutos restantes para volver a permitir el ingreso del
	 * usuario al sistema
	 *********/
	public Integer obtenerMinutosIP(String ip) {
		try {
			int minutos = 0;
			IpEntity ipEntity = ipQuery.obtenerIP(ip);
			Calendar horaExpiraBloqueo = Calendar.getInstance();

			horaExpiraBloqueo.setTime(ipEntity.getHoraExpira());
			Calendar fechaActual = Calendar.getInstance();

			int horaActual = fechaActual.get(Calendar.HOUR_OF_DAY);
			int horaExpira = horaExpiraBloqueo.get(Calendar.HOUR_OF_DAY);
			int minutosTiempoActual = fechaActual.get(Calendar.MINUTE);
			int minutosTiempoExpira = horaExpiraBloqueo.get(Calendar.MINUTE);

			if (horaActual == horaExpira) {
				minutos = minutosTiempoExpira - minutosTiempoActual;
			} else if (horaActual < horaExpira) {
				
				int resultadoHoras = horaExpira-horaActual;
				
				if(resultadoHoras == 1){
					
					int minutosRestaHoras = 60-minutosTiempoActual;
					
					minutosRestaHoras = minutosRestaHoras+minutosTiempoExpira;
					
					minutos = minutosRestaHoras;
					
				}else{
					
					resultadoHoras = resultadoHoras-1;
					
					int minutosRestaHoras = resultadoHoras*60;
					
					minutosRestaHoras = minutosRestaHoras+minutosTiempoExpira;
					int restaMinutosActual = 60-minutosTiempoActual;
									
					minutosRestaHoras = minutosRestaHoras+restaMinutosActual;
					
					minutos = minutosRestaHoras;
				}
		
			}else if(horaExpira < horaActual){
				
				int resultadoHoras = 24-horaActual;	
				int minutosRestaHoras = resultadoHoras*60;
				minutosRestaHoras = minutosRestaHoras+minutosTiempoExpira;
				int restaMinutosActual = 60-minutosTiempoActual;	
				minutosRestaHoras = minutosRestaHoras+restaMinutosActual;
				
				minutos = minutosRestaHoras;
				
			}
			return minutos;
		} catch (NoResultException ex) {
			ex.printStackTrace();
			throw new BusinessException(
					"Ocurrio un problema al obtener los minutos restantes para el ingreso al sistema.");
		}
	}

}