package ejercicio10;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Declarar variables.
		String salaVip="Sala VIP";
		String sala3D="Sala 3D";
		String salaNor="Sala Normal";
		String salaNi="Sala Niños";
		String aux;
		int numeroEntradas, opcion;
		double precioVip, precio3D, precioNor, precioNi, precioTot;
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido, en el sigueinte programa vamos a calcular el dinero total gastado en un cine");
		System.out.println("*******************************************************************************************");
		
		System.out.println("Introduzca precio entrada sala VIP:");
		aux=sc.nextLine();
		precioVip=Double.parseDouble(aux);
		
		System.out.println("Introduzca precio sala 3D:");
		aux=sc.nextLine();
		precio3D=Double.parseDouble(aux);
		
		System.out.println("Introduca precio de la sala normal:");
		aux=sc.nextLine();
		precioNor=Double.parseDouble(aux);
		
		System.out.println("Introduzca precio de la sala para niños:");
		aux=sc.nextLine();
		precioNi=Double.parseDouble(aux);
		
		System.out.println("Introduzca número de entradas");
		aux=sc.nextLine();
		numeroEntradas=Integer.parseInt(aux);
		
		System.out.println("Introduzca 1 para sala VIP.");
		System.out.println("Introduzca 2 para sala 3D.");
		System.out.println("Introduzca 3 para sala normal.");
		System.out.println("Introduzca 4 para sala para niños.");
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		switch (opcion) {
			case 1:
				System.out.printf("Has escogido %d entradas de sala VIP.\n", numeroEntradas);
				break;
			case 2:
				System.out.printf("Has escogido %d entradas sala 3D.\n", numeroEntradas);
				break;
			case 3: 
				System.out.printf("Has escogido %d entradas sala normal.\n", numeroEntradas);
				break;
			case 4: 
				System.out.printf("Has escogido %d entradas sala para niños.\n", numeroEntradas);
				break;
			default:
				System.out.println("Opción no válida");
			
			
		}
				if (opcion==1) {
					precioTot=numeroEntradas*precioVip;
					System.out.printf("El precio total es de %.2f €\n", precioTot);
					}
				
				if (opcion==2) {
					precioTot=numeroEntradas*precio3D;
					System.out.printf("El precio total es de %.2f €\n", precioTot);
					}
				
				if (opcion==3) {
					precioTot=numeroEntradas*precioNor;
					System.out.printf("El precio total es de %.2f €\n", precioTot);
					}
				if (opcion==4) {
					precioTot=numeroEntradas*precioNi;
					System.out.printf("El precio total es de %.2f €\n", precioTot);
					}
		
		System.out.println("******************************************************************");
		System.out.println("Gracias por utilizar este programa");

	}

}
