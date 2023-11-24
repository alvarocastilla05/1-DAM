package ejemploUsoArrayComoParametro;

import java.util.Random;

public class Listas {

	public void rellenarAle (int desde, int hasta, int []lista1) {
		Random rnd=new Random(System.nanoTime());
		for (int i = 0; i < lista1.length; i++) {
		
			lista1[i]=rnd.nextInt(hasta-desde+1)+desde;
		}
	}
	
	public void mostrarLista(int []lista1) {
		
		for (int i = 0; i < lista1.length; i++) {
			System.out.print(" "+lista1[i]);
			
		}
	}
	
	//Pueden haber dos versiones para trucar la lista, una pasando la lista como parametro 
	//y la otra instanciando dentro del metodo.
	
	
	//ejemplo pasando.
	public int [] trucarLista(int []lista1){
		
		int diez=10;
		for (int i = 0; i < lista1.length; i++) {
			lista1[i]=diez;
		}
		return lista1;
		//en el caso de que lista sea un atributo por ejemplo las notas de un alumno, deben de aparecer en azul en vez de marron(tema blanco)
	}
}
