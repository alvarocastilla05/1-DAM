package ejercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String aux;
		int op;
		String buscado;
		Scanner sc = new Scanner(System.in);
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("Coche");
		lista.add("Alvaro");
		lista.add("Mercadona");
		lista.add("Tractor");
		
		Cadenas c = new Cadenas(lista);
		
		System.out.println("Bienvenido al ejercicio2");
		System.out.println("-".repeat(100));
		
		do {
		
			System.out.println("""
					0-Salir.
					1-Ordenar cadenas por orden alfabético.
					2-Buscar cadena por teclado.
					3-Crear un nuevo String formado por la primera letra de cada palabra que contiene la lista.
					4-Borra las palabras de longitud impar.
					5-Pasar la palbras a mayúsculas.
					""");
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch(op) {
				case 1:
					c.ordenarOrdenAlfabetico();
					c.mostrarLista();
					break;
				case 2:
					System.out.println("Introduzca el nombre de la cadena buscada:");
					buscado = sc.nextLine();
					
					/*Mirar posible Fallo*/
					System.out.println(c.findByNombre(buscado));
					break;
				case 3:
					
					break;
				case 0:
					System.out.println("Gracias por utilizar este programa :)");
					break;
				default: 
					System.out.println("Opción no válida");
					break;
					
			}
		}while(op!=0);
		
	}

}
