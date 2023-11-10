package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Declarar variables.
		double num1, num2, division;
		String aux;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido vamos a dividir dos números.");
		System.out.println("***********************************************");
		
		System.out.println("Introduzca número 1:");
		aux=sc.nextLine();
		num1=Double.parseDouble(aux);
		
		System.out.println("Introduzca número 2:");
		aux=sc.nextLine();
		num2=Double.parseDouble(aux);
		
		if (num2==0) {
			System.out.println("Error al dividir.");
		}else {
		
		division=num1/num2;
		System.out.printf("El resultado es: %.2f\n", division);
		
		
		}

		System.out.println("***********************************************");
		System.out.println("Gracias por utilizar mi programa :)");
		
		
	}

}
