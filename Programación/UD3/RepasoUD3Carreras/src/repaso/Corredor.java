package repaso;

public class Corredor {

	private String nombre;
	private int dorsal;
	private String apellidos;
	private int categoria;
	private double tiempo;
	
	public Corredor(String nombre, int dorsal, String apellidos, int categoria, double tiempo) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.apellidos = apellidos;
		this.categoria = categoria;
		this.tiempo = tiempo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
		return "Corredor [nombre=" + nombre + ", dorsal=" + dorsal + ", apellidos=" + apellidos + ", categoria="
				+ categoria + ", tiempo=" + tiempo + "]";
	}
	
	
	
	
	
	

	
	
	
	
	
}
