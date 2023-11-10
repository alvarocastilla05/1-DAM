package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Declarar variables.
		
		int tam=8, suma = 0;
		int [] num=new int [tam];
		String aux;
		double media;
		int contador = 0, cero=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido, en el siguiente programa vamos a calcular la media de los números introducidos y decir cuántos 0 hay.");
		System.out.println("*******************************************************************************************************************");
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("Introduzca un número:");
			aux=sc.nextLine();
			num[i]=Integer.parseInt(aux);
		}
		
		//Calculo de la media.
		
		for (int i = 0; i < num.length; i++) {
			suma+=num[i];
			
			}
		
		
		for (int i = 0; i < num.length; i++) {
			if (num[i]==cero) {
				contador++;
		}
		}
		media=suma/num.length;
		System.out.println("La media de los número anteriores es "+media);
		System.out.printf("Hay un total de %d ceros", contador);
		
		
		
	}

}
