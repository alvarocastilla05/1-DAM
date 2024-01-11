package ejercicio02;

public class TarjetaDeVisita extends Documento {

	private String nombreContacto;

	public TarjetaDeVisita(String nombreEmpresa, int telefono, String correo, String nombreContacto) {
		super(nombreEmpresa, telefono, correo);
		this.nombreContacto = nombreContacto;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	@Override
	public String toString() {
		return "TarjetaDeVisita [nombreContacto=" + nombreContacto + "]";
	}

	public void mostrarCabecera () {
		super.mostrarCabecera();
		System.out.println(nombreContacto);
	}
	
	
}
