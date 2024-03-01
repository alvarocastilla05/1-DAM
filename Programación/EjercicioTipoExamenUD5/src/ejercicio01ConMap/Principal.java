package ejercicio01ConMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		int id;
		String significado, significadoNuevo;
		String aux;
		String nombre;
		Scanner sc = new Scanner(System.in);
		
		
		List<Palabra> lista = new ArrayList<Palabra>();
		
		lista.add(new Palabra(1, "Food", "Comida"));
		lista.add(new Palabra (2, "Car", "Coche"));
		lista.add(new Palabra(3, "Ball", "Pelota"));
		
		Diccionario d = new Diccionario(lista);
		
		
		System.out.println("Bienvenido a tu diccionario de inglés virtual favorito!!");
		System.out.println("*".repeat(100));
		System.out.println();
		
		do {
			System.out.println("""
					0-Salir.
					1-Imprimir Lista.
					2-Buscar palabra.
					3-Añadir palabra.
					4-Modificar significado.
					5-Ordenar la lista por nombre.
					6-Borrar una palabra.
					""");
			System.out.println("-".repeat(100));
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch(op) {
				case 1:
					d.mostrarLista();
					break;
				case 2:
					System.out.println("Introduzca el nombre de la palabra que busca:");
					nombre=sc.nextLine();
					
					System.out.println(d.findByNombre(nombre)); 
					break;
				case 3:
					System.out.println("Introduzca el id de la nueva palabra");
					aux=sc.nextLine();
					id=Integer.parseInt(aux);
					
					System.out.println("Introduzca el nombre de la palabra que desea añadir:");
					nombre=sc.nextLine();
					
					System.out.println("Introduzca el significa de la palabra que desea añadir:");
					significado=sc.nextLine();
					
					d.addPalabra(new Palabra(id, nombre, significado));
					break;
				case 4:
					System.out.println("Introduzca el nombre de la palabra que desea modificar:");
					nombre=sc.nextLine();
					
					System.out.println("Introduzca su nuevo significado:");
					significadoNuevo=sc.nextLine();
					
					d.modificarSignificado(d.findByNombre(nombre), significadoNuevo);
					break;
				case 5:
					/*
					Collections.sort(lista, new ComparaPorNombre());
					System.out.println();
					for (Palabra p : lista) {
						System.out.println(p);
					}*/
					break;
				case 6:
					System.out.println("Introduzca la palabra que desea eliminar:");
					nombre=sc.nextLine();
					
					d.deletePalabra(d.findByNombre(nombre));
					break;
				case 0:
					System.out.println("Gracias por utilizar este programa :)");
					break;
				default:
					System.out.println("Opcion no válida");
					break;
					
					
					
			}
		}while(op!=0);
	}

}
