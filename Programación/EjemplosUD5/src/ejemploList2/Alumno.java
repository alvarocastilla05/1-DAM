package ejemploList2;

public class Alumno {

	private String nombre;
	private String apellidos;
	private int edad;
	private boolean activo;
	
	public Alumno(String nombre, String apellidos, int edad, boolean activo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.activo = activo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", activo=" + activo + "]";
	}
	
	
	
	
}
