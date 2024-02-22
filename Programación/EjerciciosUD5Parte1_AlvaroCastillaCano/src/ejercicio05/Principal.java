package ejercicio05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int op;
		String aux;
		Scanner sc = new Scanner(System.in);
		
		List<Persona> lista = new ArrayList <Persona>();
		
		lista.add(new Persona("Alvaro", "Castilla Cano", 18, 1.78));
		lista.add(new Persona("Lucas", "Falla Urtiaga", 18, 1.80));
		lista.add(new Persona("Jose Antonio", "Aguilar Bascón", 18, 1.81));
		lista.add(new Persona("Inés", "Ruíz Gómez", 18, 1.58));
		lista.add(new Persona("Pilar", "Cano Diaz", 48, 1.56));

		
		System.out.println("\tBienvenido al programa de ordenar personas :)");
		System.out.println("*******************************************************************");
		System.out.println();

		for (Persona p : lista) {
			System.out.println(p);
		}
		
		do {
			System.out.println("********************************************");
			System.out.println("""
					0-Salir.
					1-Ordenar por nombre.
					2-Ordenado por edad.
					""");
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch(op) {
				case 1:
					System.out.println("Ordenado por Nombre");
					
					Collections.sort(lista, new ComparaPorNombre());
					System.out.println();
					for (Persona p : lista) {
						System.out.println(p);
					}
					break;
				case 2:
					Collections.sort(lista);
					
					for (Persona p : lista) {
						System.out.println(p);
					}
					break;
					
			}
			
		}while(op!=0);
	}

}
