package ejercicio02;

public class Documento {

	private String nombreEmpresa;
	private int telefono;
	private String correo;
	
	public Documento(String nombreEmpresa, int telefono, String correo) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.telefono = telefono;
		this.correo = correo;
	}

	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}


	@Override
	public String toString() {
		return "Documento [nombreEmpresa=" + nombreEmpresa + ", telefono=" + telefono + ", correo=" + correo + "]";
	}
	
	public void cabecera () {
		System.out.println(nombreEmpresa);
		System.out.println(telefono);
		System.out.println(correo);
	}
	
	
	
	
}
