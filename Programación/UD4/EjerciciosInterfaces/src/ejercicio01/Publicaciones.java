package ejercicio01;

/*Hay que implementar la interfaz a las clases que se van a comportar así*/
public abstract class Publicaciones implements IPublicaciones{

	private String nombre;
	private String autor;
	private String editorial;
	private int anyoPublicacion;
	private boolean prestado;
	
	public Publicaciones(String nombre, String autor, String editorial, int anyoPublicacion, boolean prestado) {
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
		this.anyoPublicacion = anyoPublicacion;
		this.prestado = prestado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getAnyoPublicacion() {
		return anyoPublicacion;
	}

	public void setAnyoPublicacion(int anyoPublicacion) {
		this.anyoPublicacion = anyoPublicacion;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public String toString() {
		return "Publicaciones [nombre=" + nombre + ", autor=" + autor + ", editorial=" + editorial
				+ ", anyoPublicacion=" + anyoPublicacion + ", prestado=" + prestado + "]";
	}

	@Override
	public abstract int cuentaPrestados(Publicaciones[] lista);

	@Override
	public abstract int publicacionesAnterioresA(Publicaciones[] lista, int anyo);
	
	
	
	
}
