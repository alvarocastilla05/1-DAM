package ejercicio03;

import java.util.Objects;

public class Alumno {

	//Atributos
	private int id;
	private String nombre;
	private int edad;
	private double notaMedia;
	
	//Constructores
	public Alumno(int id, String nombre, int edad, double notaMedia) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.notaMedia = notaMedia;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public double getNotaMedia() {
		return notaMedia;
	}
	
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	//toString
	
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", notaMedia=" + notaMedia + "]";
	}

	//hashCode y equals
	@Override
	public int hashCode() {
		return Objects.hash(edad, id, nombre);
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return edad == other.edad && id == other.id && Objects.equals(nombre, other.nombre);
	}
	

	
	
	
	
	
	
}
