package ejercicio01;

public class Biblioteca {

	public Biblioteca() {
		
	}
	
	//Metodos
	public void imprimirDatos(Publicaciones[]lista, int numRevistas) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] instanceof Revista) {
				((Revista)lista[i]).avisoRevistas(numRevistas);
			}
		}
	}
}
