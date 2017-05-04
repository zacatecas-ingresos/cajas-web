package cajas.impuestos.presupuesto;

public class EstatusPresupuesto {

	private EstatusPresupuesto() {

	}

	public static final int ESPERA_CONFIRMACION_PAGO = 1; //Cuando el contribuyente ha expedido su presupuesto para pagar en ventanilla.
	public static final int CANCELADO = 2; //Para generar otro presupuesto o por que lo rechazo el banco.
	public static final int PROCESO_PAGO = 3;//Cuando se realizó un pago en línea 
	

}
