package ejercicio18;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Declarar variables.
		
		Scanner sc=new Scanner(System.in);
		
		String aux;
		int opcion, numEntradas;
		double retiro, saldoIn, saldoFin, ingresar, precioEntradas, precioTot;
		
		System.out.println("Bienvenido al cajero automático, ¿cuál es su saldo?");
		aux=sc.nextLine();
		saldoIn=Double.parseDouble(aux);
		
		
		do {
			System.out.println("""
					-------------------
					0-Salir.
					1-Ver Saldo.
					2-Retirar saldo.
					3-Comprar entradas.
					4-Ingresar dinero.
					---------------------
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch (opcion) {
				case 1:
					System.out.printf("Su saldo es de %.2f €\n", saldoIn);
					break;
				case 2:
					System.out.println("Indique cuánto dinero desea retirar:");
					aux=sc.nextLine();
					retiro=Double.parseDouble(aux);
					saldoFin=saldoIn-retiro;
					System.out.printf("Ha retirado un total de %.2f € y le quedan %.2f €\n", retiro, saldoFin);
					break;
				case 3:
					System.out.println("¿Cuántas entradas desea comprar?");
					aux=sc.nextLine();
					numEntradas=Integer.parseInt(aux);
					
					System.out.println("Introduzca el precio de cada entrada:");
					aux=sc.nextLine();
					precioEntradas=Double.parseDouble(aux);
					
					precioTot=numEntradas*precioEntradas;
					
					if (precioTot>saldoIn)
						System.out.println("Dinero Insuficiente.");
					else {
						saldoFin=saldoIn-precioTot;
						System.out.printf("El precio total de las entradas es de %.2f € y te quedan un total de %.2f €\n", precioTot, saldoFin);
					}
						
					break;
				case 4:
					System.out.println("Diga cuánto dinero desea ingresar:");
					aux=sc.nextLine();
					ingresar=Double.parseDouble(aux);
					saldoFin=ingresar+saldoIn;
					
					System.out.printf("Ha ingresado %.2f € y tiene un saldo total de %.2f €", ingresar, saldoFin);
					break;
				case 0:
					System.out.println("Gracais por utilizar este programa :)");
					break;
				default:
					System.out.println("Opción no válida");
					break;
					
				
			}
			
			
		}while (opcion!=0);

	}

}
