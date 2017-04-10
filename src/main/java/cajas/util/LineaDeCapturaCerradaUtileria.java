package cajas.util;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LineaDeCapturaCerradaUtileria {

	
	/**
	 * Metodo para condensar la fecha de vencimiento.
	 * @param _fecha
	 * @return
	 */
		static String condensarFechaVencimiento(Date _fecha) {
		SimpleDateFormat formatoAnyo = new SimpleDateFormat("yyyy");
		SimpleDateFormat formatoMes = new SimpleDateFormat("MM");
		SimpleDateFormat formatoDia = new SimpleDateFormat("dd");

		Integer Anyo = new Integer(formatoAnyo.format(_fecha));
		Integer Mes = new Integer(formatoMes.format(_fecha));
		Integer Dia = new Integer(formatoDia.format(_fecha));

		// validar el anio que se le resta al anio de la fecha a condensar ya que segun la ultima actualizacion por parte de los bancos debia restarse 2013.
		
		Integer llaveAnyo = (Anyo - 1988) * 372;
		Integer llaveMes = (Mes - 1) * 31;
		Integer llaveDia = (Dia - 1);

		Integer dato = llaveAnyo + llaveMes + llaveDia;
		if (dato.toString().length() < 4) {

			return "0" + dato.toString();
		}

		System.out.println("Fecha Condensada: "+ dato.toString());
		return dato.toString();

	}
		/**
		 * Metodo para condensar el importe de la linea de captura
		 * @param _importe
		 * @return
		 */
		static String condesarImporte(String _importe) {
			String serie = "731";
			BigDecimal suma = new BigDecimal("0");
			Integer k = 0;
			_importe = _importe + ".00";
			for(int i = _importe.length()-1; i>=0; i--)
			{
				String importeTmp =String.valueOf(_importe.charAt(i)); 
				if(isInteger(importeTmp))
				{
					
					BigDecimal serieTmp = new BigDecimal(String.valueOf(serie.charAt(k)));
					suma =  suma.add(new BigDecimal(importeTmp).multiply(serieTmp));
					
					if(k == 2)
					{
						k= 0;
					}else
					{
						k++;
					}
					
				}
			}
			
			System.out.println("Importe Condensado: " + suma.remainder(new BigDecimal(10)).toString());
			
			return suma.remainder(new BigDecimal(10)).toString();
		}
		
		
		/**
		 * Metodo para generar el digito veridicador para la linea de captura
		 * @param lc
		 * @return
		 */
		public static String validarLineaCaptura(String lc) {
			String serie = "1113171923";
			Integer suma = 0;
			Integer k = 0;
			for(int i = lc.length()-1;i>=0; i-- )
			{
				
				if(isInteger(String.valueOf(lc.charAt(i))))
				{
					suma +=  Integer.parseInt(String.valueOf(lc.charAt(i)))* Integer.parseInt(serie.substring(k, k+2));
					if(k == 8)
					{
						k= 0;
					}else
					{
						k= k+2;
					}
					
				}
			}
			
			BigDecimal llave = new BigDecimal(suma%97);
			llave = llave.add(new BigDecimal(1));
			if(llave.toString().length()<2)
			{
				return "0"+llave.toString();
			}
			return llave.toString();
		}
		
		/**
		 * Metodo para obtener la linea de captura
		 * @param referencia
		 * @param fechaV
		 * @param importe
		 * @param digito
		 * @return
		 */
		public static String obtenerLineaCapturaCerrada(String  referencia,
				Date fechaV, String importe, Integer digito) {
			String LCC;
			LCC = referencia + condensarFechaVencimiento(fechaV) + condesarImporte(importe) + digito;		
			
			
			LCC = LCC + validarLineaCaptura(LCC);
			System.out.println("LINEA DE CAPTURA GENERADA " + LCC );
			
			return LCC;
		}
		
		
		
		static boolean isInteger( String input )  
		{  
		   try  
		   {  
		      Integer.parseInt( input );  
		      return true;  
		   }  
		   catch( Exception e )  
		   {  
		      return false;  
		   }  
		}

}
