package ejercicio06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Declarar varibales.
		double nota1, nota2, nota3, media;
		int tres=3;
		String aux;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido, en el siguiente programa vamos a calcular su nota media.");
		System.out.println("************************************************************************");
		System.out.println("   ");
		
		System.out.println("Introduzca tu primera nota:");
		aux=sc.nextLine();
		nota1=Double.parseDouble(aux);
		
		System.out.println("Introduzca tu segunda nota:");
		aux=sc.nextLine();
		nota2=Double.parseDouble(aux);
		
		System.out.println("Introduzca tu tercera nota:");
		aux=sc.nextLine();
		nota3=Double.parseDouble(aux);
		
		media=(nota1+nota2+nota3)/tres;
		
		if (media>=5) {
			System.out.printf("Tu media es de %.2f y estás aprobada.\n", media);
		}else {
			System.out.printf("Tu media es de %.2f y estás suspenso.\n", media);
		}
		System.out.println("   ");
		System.out.println("*************************************************************************");
		
		System.out.println("Gracias por utilizar este programa :)");

	}

}
