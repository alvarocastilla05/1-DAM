package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Declara variables.
		int num1, dos=2;
		String aux;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido, vamos a comprobar si el número es par o impar.");
		System.out.println("*****************************************************************");
		
		System.out.println("Introduzca un número:");
		aux=sc.nextLine();
		num1=Integer.parseInt(aux);
		
		if (num1% dos==0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
		
		
		System.out.println("**********************************");
		System.out.println("Gracias por utilizaR este programa.");
		
	}

}
