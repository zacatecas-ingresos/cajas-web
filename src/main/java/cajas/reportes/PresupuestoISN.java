package cajas.reportes;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import cajas.exception.BusinessException;

public class PresupuestoISN extends ReporteJasper {

	public PresupuestoISN(HttpServletRequest request, HttpServletResponse response) {
		super(request, response);
	}
	
	@Override
	public String path() {
		return "/reportes/ImpuestosEstatales.jasper";
	}

	@Override
	public Map<String, Object> params() {
		
		Integer idPresupuesto = null;
		
		if(StringUtils.isBlank(request.getParameter("idPresupuesto"))){
			throw new BusinessException("El idPresupuesto es requerido");
		}
		
		try {
			idPresupuesto = Integer.parseInt(request.getParameter("idPresupuesto"));
		} catch (NumberFormatException ex) {
			throw new BusinessException("El formato del idPresupuesto debe ser numerico");
		}
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id_presupuesto_consultar", idPresupuesto);
		
		return params;
	}

	@Override
	public String nombreReporte() {
		return "ImpuestosEstatales.pdf";
	}
	

}
