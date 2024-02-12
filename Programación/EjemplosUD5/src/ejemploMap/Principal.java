package ejemploMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
/*
		//Como map es una interfaz, debemos de poner una de las clases que implemente despues del new.
		//En este caso utilizamos HashMap. HashMap no tiene en cuenta el orden de insercción
		Map <String, String> lista = new HashMap <String, String>();
		Set <String> listaClaves = lista.keySet();
		
		
		lista.put("Uno", "One");
		lista.put("Dos", "Two");
		// no permite claves iguales.Guarda la segunda y machaca el valor de la primera, por eso al mostrarlo nos va a salir la de Umm.
		lista.put("Uno", "Ummm");
		lista.put("First", "One");
		
		System.out.println(lista);
		System.out.println(listaClaves); //Esta nos muestra solo las claves de la lista Map. 

		Collection listaValores = lista.values(); //No se le pone el <> porque sino se infiere.
		System.out.println(listaValores); //Nos muestra los valores de la lista Map.
		*/
		
		Map <Integer, Alumno> lista2 = new HashMap <Integer, Alumno>();
		
		Alumno a = new Alumno(1, "Alvaro", 7.9);
		lista2.put(6, a);
		
		//La referencia es el identificador que le hemos puesto al objeto donde guardamos la direccion de memoria.
		
		System.out.println(lista2);
		a.setNombre("Miguel");
		System.out.println(lista2);
	}

}
