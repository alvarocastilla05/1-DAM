package ejercicio17;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Declarar variables.
		String aux;
		int numVentas, sueldoFijo=1000, cien=100;
		double sueldoTot, sueldoVen;
		int opcion;
		double porcen=20;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido, en el sigueinte programa vamos a calular el salario mensual de un vendedor.");
		System.out.println("****************************************************************************************");
		
		do {
			System.out.println("-------------------------");
			System.out.println("0-Salir.");
			System.out.println("1-Inicializar programa.");
			System.out.println("-------------------------");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch (opcion) {
				case 1:
					System.out.println("Introduzca el número de ventas:");
					aux=sc.nextLine();
					numVentas=Integer.parseInt(aux);
					
					sueldoVen=((sueldoFijo*porcen)/cien)*numVentas;
					
					sueldoTot=sueldoVen+sueldoFijo;
					
					System.out.printf("El salario total del vendedor es de %.2f €\n", sueldoTot);
					break;
				case 0:
					System.out.println("Gracias por utilizar este programa :)");
					break;
				default:
					System.out.println("Opción no válida.");
					break;
							
			}
			
			
			
		}while (opcion !=0);

	}

}
