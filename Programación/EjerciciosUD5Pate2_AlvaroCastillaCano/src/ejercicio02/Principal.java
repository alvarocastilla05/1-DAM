package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String aux;
		int op;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido al ejercicio2");
		System.out.println("-".repeat(100));
		
		do {
		
			System.out.println("""
					0-Salir.
					1-
					""");
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
		}while(op!=0);
		
	}

}
