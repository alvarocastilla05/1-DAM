package ejemploList;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List <String> lista = new ArrayList <String>();
		
		lista.add("Álvaro");
		lista.add("Ángel");
		
		System.out.println(lista);
		System.out.println(lista.contains("Rafa")); //Es como un buscar pero no te devuelve ni datos ni nada, tan solo si está o no
													//En este caso va a devoler false porque rafa no lo hemos añadido

		/*lista.remove(4);*/ //Este peta porque no tenemos ningun elemento en el 4.
		
		lista.remove(0); //Este borra el que esta en la posición 0, es decir, elimina a Álvaro. 
		System.out.println(lista);
		
		System.out.println(lista.size()); //Devuelve el número de elementos de la lista.
		
		System.out.println(lista.get(0)); //Esto es como un findByIndice. 
		
		
	}
	

}
