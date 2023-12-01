package ejercicio1;

public class Corredor {

	private String nombre;
	private String apellidos;
	private int num;
	private int categoria;
	private double tiempo;
	
	public Corredor(String nombre, String apellidos, int num, int categoria, double tiempo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.num = num;
		this.categoria = categoria;
		this.tiempo = tiempo;
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

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public double getTiempo() {
		return tiempo;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public String toString() {
		return "Corredor [nombre=" + nombre + ", apellidos=" + apellidos + ", num=" + num + ", categoria=" + categoria
				+ ", tiempo=" + tiempo + "]";
	}
	
	
	
	
	
	
}
