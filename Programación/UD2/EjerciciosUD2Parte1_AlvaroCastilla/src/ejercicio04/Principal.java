package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Declarar variables.
		double dineroInicial, dineroFinal, dineroRetir;
		String aux;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido, en el siguiente programa vamos a comprobar el dinero que le queda en su cuenta bancaria.");
		System.out.println("********************************************************************************************************");
		System.out.println("  ");
		
		System.out.println("Introduzca  el dinero que tienes en tu ceunta bancaria:");
		aux=sc.nextLine();
		dineroInicial=Double.parseDouble(aux);
		
		System.out.println("Introduzca la cantidad que desea retirar:");
		aux=sc.nextLine();
		dineroRetir=Double.parseDouble(aux);
		
		if (dineroInicial<dineroRetir) {
			System.out.println("No es posible, no dispones de ese dinero");
		}else {
			dineroFinal=dineroInicial-dineroRetir;
			System.out.printf("Has retirado %.2f € y te quedan %.2f € en tu cuenta bancaria.\n", dineroRetir, dineroFinal);
			}
		
		System.out.println("  ");
		System.out.println("********************************************************************************************************");
		
		System.out.println("Gracias por utilizar este programa :)");
		

	}

}
