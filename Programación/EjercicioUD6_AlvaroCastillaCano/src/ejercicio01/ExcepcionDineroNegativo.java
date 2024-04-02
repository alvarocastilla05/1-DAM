package ejercicio01;

public class ExcepcionDineroNegativo extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExcepcionDineroNegativo() {
		
	}
	
	public ExcepcionDineroNegativo(String mensaje) {
		super(mensaje);
	}
}
