package cajas.impuestos.declaracion.estatal;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class ValidarContribuyenteEJB {

	@Inject
	ValidacionContribuyenteService validacionContribuyenteService;
	
	public InfoContribuyente obtenerContribuyentePoRfc(String rfc){
		return validacionContribuyenteService.obtenerContribuyentePoRfc(rfc);
	}
	
	public List<Sucursal> obtenerSucursales(Integer idContribuyente,Integer idObligacion){
		return validacionContribuyenteService.obtenerSucursales(idContribuyente, idObligacion);
	}
	
	
}