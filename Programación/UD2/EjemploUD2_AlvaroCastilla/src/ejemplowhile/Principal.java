package ejemplowhile;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// declarar variables

		int num=1, tope=10;
		int tope2=0;
		String aux;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca el número tope:");
		aux=sc.nextLine();
		tope=Integer.parseInt(aux);
		
		while (num<=tope) {
			System.out.println(num);
			num++;
		}
		
		//Parte 2.
		
		System.out.println("Diga un número, cero para salir.");
		aux=sc.nextLine();
		num=Integer.parseInt(aux);
		
		while (num!=tope2) {
			System.out.println(num);
			System.out.println("Diga otro número:");
			aux=sc.nextLine();
			num=Integer.parseInt(aux);
		}
		
	}

}
