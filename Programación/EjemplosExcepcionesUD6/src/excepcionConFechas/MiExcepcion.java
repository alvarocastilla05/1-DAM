package excepcionConFechas;

public class MiExcepcion extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MiExcepcion() {}
	
	public MiExcepcion(String mensaje) {
		super(mensaje);
	}
}
