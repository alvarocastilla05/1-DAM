package ejercicio01;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Declarar variables.
		
		double media;
		int tam=5, desde=1, hasta=99, suma = 0;
		String [] nombres;
		nombres=new String [tam];
		//Declarar un array.
		int [] numeros;
		//Instanciar un array.
		numeros=new int [tam];
		
		Random r=new Random (System.nanoTime());
		
		//Rellenar de forma aleatoria.
		
		for (int i = 0; i < numeros.length; i++) {
			numeros [i]=r.nextInt(hasta-desde+1)+desde;
		}
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido, en el siiguiente programa debe de introducir 5 nombres.");
		System.out.println("************************************************************************");
		
		//Rellenar.
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Introduzca un nombre:");
			nombres[i]=sc.nextLine();	
		}
		//Mostrar.
		for (int i = 0; i < nombres.length; i++) {
			System.out.print( nombres[i]+"\t\t");
		}
		
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+"\t\t");
		}
		System.out.println();
		System.out.println("Gracias por utilizar este programa :)");
		
		//Calculo de la media.
		
		for (int i = 0; i < numeros.length; i++) {
			suma+=numeros[i];
			}
				
		media=suma/numeros.length;
		System.out.println("La media de los número anteriores es "+media);
		
	}

}
