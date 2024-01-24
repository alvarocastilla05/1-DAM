package ejercicio01;

public class Revista extends Publicaciones{
	
	//Atributos
	private int edicion;

	//Constructores
	public Revista(String nombre, String autor, String editorial, int anyoPublicacion, boolean prestado, int edicion) {
		super(nombre, autor, editorial, anyoPublicacion, prestado);
		this.edicion = edicion;
	}

	//Getters and Setters
	public int getEdicion() {
		return edicion;
	}

	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}

	//toString
	@Override
	public String toString() {
		return "Revista [edicion=" + edicion + "]";
	}

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
	
	public void avisoRevistas(int numRevistas) {
		
		if (edicion == numRevistas) {
			System.out.println("Oleeee! Has publicado "+numRevistas+" revistaaas");
		}
	}
	
	
	
	

}
