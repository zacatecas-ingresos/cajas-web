package cajas.exception;

import javax.ejb.ApplicationException;

@ApplicationException(rollback=true)
public class CredencialesInvalidasException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CredencialesInvalidasException(){
		
	}
	
	public CredencialesInvalidasException(String arg0){
		super(arg0);
	}
	
	public CredencialesInvalidasException(Throwable arg0){
		super(arg0);
	}
	
	public CredencialesInvalidasException(String arg0, Throwable arg1){
		super(arg0, arg1);
	}
	
	public CredencialesInvalidasException(String arg0, Throwable arg1, boolean arg2, boolean arg3){
		super(arg0, arg1, arg2, arg3);
		
	}
}
