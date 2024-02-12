package ejercicio02;

public class Socio {

	private int id;
	private String nombre;
	private double cuota;
	
	public Socio(int id, String nombre, double cuota) {
		this.id = id;
		this.nombre = nombre;
		this.cuota = cuota;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ", cuota=" + cuota + "]";
	}
	
	
	
	
}
