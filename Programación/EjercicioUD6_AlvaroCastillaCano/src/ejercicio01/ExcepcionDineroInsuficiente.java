package ejercicio01;

public class ExcepcionDineroInsuficiente extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExcepcionDineroInsuficiente () {
		
	}
	
	public ExcepcionDineroInsuficiente (String mensaje) {
		super(mensaje);
	}
	
	
}
