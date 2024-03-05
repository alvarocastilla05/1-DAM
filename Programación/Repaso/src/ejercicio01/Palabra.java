package ejercicio01;

import java.util.Objects;

public class Palabra {

	private int id;
	private String nombre;
	private String significado;
	
	public Palabra(int id, String nombre, String significado) {
		this.id = id;
		this.nombre = nombre;
		this.significado = significado;
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

	public String getSignificado() {
		return significado;
	}

	public void setSignificado(String significado) {
		this.significado = significado;
	}

	@Override
	public String toString() {
		return "Palabra [id=" + id + ", nombre=" + nombre + ", significado=" + significado + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, significado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Palabra other = (Palabra) obj;
		return id == other.id && Objects.equals(nombre, other.nombre) && Objects.equals(significado, other.significado);
	}
	
	
	
	
}
