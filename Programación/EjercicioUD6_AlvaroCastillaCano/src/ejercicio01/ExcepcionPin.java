package ejercicio01;

public class ExcepcionPin extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExcepcionPin() {
		
	}
	
	public ExcepcionPin(String mensaje) {
		super(mensaje);
	}
}
