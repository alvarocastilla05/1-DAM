package ejercicio;

public class Cliente {

	private String nombre;
	private String dni;
	private int edad;
	private int cantidadBotellas;

	public Cliente(String nombre, String dni, int edad, int cantidadBotellas) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.cantidadBotellas = cantidadBotellas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCantidadBotellas() {
		return cantidadBotellas;
	}

	public void setCantidadBotellas(int cantidadBotellas) {
		this.cantidadBotellas = cantidadBotellas;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", cantidadBotellas="
				+ cantidadBotellas + "]";
	}

}