package ejercicio02;

import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Declarar variables.
		
		
		int  tam=10;
		String aux;
		double [] num=new double [tam];

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido, en el siguiente programa vamos a generar 10 dobles a su índice.");
		System.out.println("******************************************************************************");
		
		
		for (int i = 0; i < num.length; i++) {
			System.out.println((i*2));
		}
	
	
	}

}
