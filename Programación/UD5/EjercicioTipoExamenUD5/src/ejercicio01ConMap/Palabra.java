package ejercicio01ConMap;

public class Palabra{

	//Atributos
	private int id;
	private String nombre;
	private String significado;
	
	//Constructores
	public Palabra(int id, String nombre, String significado) {
		this.id = id;
		this.nombre = nombre;
		this.significado = significado;
	}

	//Getters and Setters
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

	public String getSignificado() {
		return significado;
	}

	public void setSignificado(String significado) {
		this.significado = significado;
	}

	//toString 
	@Override
	public String toString() {
		return "Palabra [id=" + id + ", nombre=" + nombre + ", significado=" + significado + "]";
	}


	
	
	
	
	
	
}
