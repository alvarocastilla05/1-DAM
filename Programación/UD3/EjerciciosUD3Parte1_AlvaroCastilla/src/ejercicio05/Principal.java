package ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Declarar variables.
		
		String texto;
		int num ;
		Frases f   ;
		String aux;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca la frase:");
		texto=sc.nextLine();
		
		System.out.println("Diga número de veces: ");
		aux=sc.nextLine();
		num=Integer.parseInt(aux);
		
		f=new Frases();
		
		
		f.mostrarFrases(texto, num);
		
		
	}

}
