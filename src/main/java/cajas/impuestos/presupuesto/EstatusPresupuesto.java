package cajas.impuestos.presupuesto;

public class EstatusPresupuesto {

	private EstatusPresupuesto() {

	}

	public static final int ESPERA_CONFIRMACION_PAGO = 1; //Cuando se hace una transaccion en linea se genera este estatus al momento de establecer conexion con banco.
	public static final int CANCELADO = 2; //
	public static final int RESPONDIDO = 3;//Cuando el banco responde de manera positiva y se espera la confirmacion de transaccion via integracion 
	
	public static final int VENTANILLA = 4; //Se usa para identificar calculos que se usaron para realizar pagos via ventanilla bancaria.
	public static final int RECHAZADO = 5;  // cuando el banco rechaza la transaccion.
	public static final int INTEGRADO = 6; // cuando el presupuesto se encuentra ya integrado.


}

