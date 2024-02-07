package ejemploSet;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		
		Set <Persona> lista = new HashSet <Persona>();
		
		/*
		Set <String> lista = new HashSet <>();
		
		
		lista.add("Uno");
		lista.add("Dos");
		lista.add("Uno");
		lista.add("Tres");
		lista.add("Catorce");
		
		System.out.println(lista); //Como podemos ver no tiene el orden de introduccion, tiene un orden que desconocemos.

		lista.remove("Tres");
		
		System.out.println(lista);
		
		System.out.println(lista.contains("Uno")); //no ignora la mayusculas o minusculas, si cualquier letra es distinta devuelve false.*/
		
		//Con lista de persona
		
		lista.add(new Persona("Alvaro", 18, "17477928K"));
		lista.add(new Persona("Angel", 34, "123a"));
		lista.add(new Persona("Miguel", 67, "1234C"));
		
		System.out.println(lista);
	}

}
