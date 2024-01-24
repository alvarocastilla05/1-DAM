package ejercicio01;

public class Libro extends Publicaciones{

	//Atributos
	private String isbn;

	//Constructores
	public Libro(String nombre, String autor, String editorial, int anyoPublicacion, boolean prestado, String isbn) {
		super(nombre, autor, editorial, anyoPublicacion, prestado);
		this.isbn = isbn;
	}

	//Getters and Setters
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	//toString
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + "]";
	}

	//Métodos
	@Override
	public int cuentaPrestados(Publicaciones[] lista) {
		int contadorPrestados = 0;
		for (int i = 0; i < lista.length; i++) {
			if(lista[i]!=null) {
				if(lista[i].isPrestado()) {
					contadorPrestados++;
				}
			}
		}
		return contadorPrestados;
	}

	@Override
	public int publicacionesAnterioresA(Publicaciones[] lista, int anyo) {
		int contador = 0;
		for (int i = 0; i < lista.length; i++) {
			if(lista[i]!=null) {
				if(lista[i].getAnyoPublicacion() < anyo) {
					contador++;
				}
			}
		}
		return contador;
	}
	
	
}
