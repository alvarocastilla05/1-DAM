package ejemplofor;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Ejemplos bucle for.
		int tope;
		String aux, palabra;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca una palabra cualquiera:");
		palabra=sc.nextLine();
		
		System.out.println("Introduzca el número de veces:");
		aux=sc.nextLine();
		tope=Integer.parseInt(aux);
		
		
		for (int i =0; i<tope; i++) {
			System.out.println(palabra);
		}

	}

}
