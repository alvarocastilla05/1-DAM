package ejercicio06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		String aux;
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido, en el siguiente programa vamos a crear un generador de números.");
		System.out.println("******************************************************************************");
		
		do {
			System.out.println("0-Salir");
			System.out.println("1-1x2");
			System.out.println("2-Par o Impar");
			System.out.println("3-Chinos");
			System.out.println("4-Primitiva");
			
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch(op) {
				case 0:
					System.out.println("Gracias por utilizar este programa. :)");
					break;
					
					
			}
			
		}while(op!=0);
	}

}
