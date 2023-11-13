package ejercicio06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		int num = 0, hasta, desde;
		int primitiva = 6;
		int num2;
		String aux;
		Generadora g=new Generadora();
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido, en el siguiente programa vamos a crear un generador de números.");
		System.out.println("******************************************************************************");
		
		
		
		do {
			System.out.println("-----------------");
			System.out.println("0-Salir");
			System.out.println("1-Primitiva");
			System.out.println("2-Par o Impar");
			System.out.println("3-Chinos");
			System.out.println("4-Quiniela");
			System.out.println("-----------------");
			
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch(op) {
				case 0:
					System.out.println("Gracias por utilizar este programa. :)");
					break;
				case 1:
					System.out.println("Introduzca desde: ");
					aux=sc.nextLine();
					desde=Integer.parseInt(aux);
					
					System.out.println("Introduzca hasta: ");
					aux=sc.nextLine();
					hasta=Integer.parseInt(aux);
					
					for (int i = 0; i < primitiva; i++) {
						System.out.print(" "+g.generarPrimitiva(desde, hasta)); 
					}
					System.out.println();
					break;
					
				case 2:
					System.out.println("Introduzca desde: ");
					aux=sc.nextLine();
					desde=Integer.parseInt(aux);
					
					System.out.println("Introduzca hasta: ");
					aux=sc.nextLine();
					hasta=Integer.parseInt(aux);
					
					System.out.println("Introduzca un número para jugar a pares o nones: ");
					aux=sc.nextLine();
					num2=Integer.parseInt(aux);
					
					g.mostrarGanador(g.generarParImpar(desde, hasta));
					
					
			}
			
		}while(op!=0);
	}

}
