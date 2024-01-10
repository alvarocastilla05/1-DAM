package ejercicio02;

public class Carta extends Documento {

	private String fecha;

	public Carta(String nombreEmpresa, int telefono, String correo, String fecha) {
		super(nombreEmpresa, telefono, correo);
		this.fecha = fecha;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Carta [fecha=" + fecha + "]";
	}
	
	public void cabecera () {
		super.cabecera();
		System.out.println(fecha);
	}
	
}
