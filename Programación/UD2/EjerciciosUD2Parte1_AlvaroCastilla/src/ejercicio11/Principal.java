package ejercicio11;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Declarar variables.
		
		double equiMer=0.38, equiVen=0.91, equiTie=1.00, equiMar=0.38, equiJu=2.53, equiUr=0.92, equiNe=1.2;
		double nuevoPeso;
		double masa;
		String aux;
		int opcion;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido, en el siguiente programa vamos a calcular el peso de una persona en lso distintos planetas.");
		System.out.println("***********************************************************************************************************");
		
		System.out.println("Introduzca su masa:");
		aux=sc.nextLine();
		masa=Double.parseDouble(aux);
		
		System.out.println("Pulse 1 para seleccionar Mercurio");
		System.out.println("Pulse 2 para seleccionar Venus");
		System.out.println("Pulse 3 para seleccionar Tierra");
		System.out.println("Pulse 4 para seleccionar Marte");
		System.out.println("Pulse 5 para seleccionar Júpiter");
		System.out.println("Pulse 6 para seleccionar Urano");
		System.out.println("Pulse 7 para seleccionar Neptuno");
		
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		
		//Menú.
		
		switch (opcion) {
			case 1: 
				nuevoPeso=masa*equiMer;
				System.out.printf("Tu peso en Mercurio será de %.2f Newton\n", nuevoPeso);
				break;
			case 2: 
				nuevoPeso=masa*equiVen;
				System.out.printf("Tu peso en Venus será de %.2f Newton\n", nuevoPeso);
				break;
			case 3:
				nuevoPeso=masa*equiTie;
				System.out.printf("Tu peso en la Tierra será de %.2f Newton\n", nuevoPeso);
				break;
			case 4:
				nuevoPeso=masa*equiMar;
				System.out.printf("Tu peso en Marte será de %.2f Newton\n", nuevoPeso);
				break;
			case 5:
				nuevoPeso=masa*equiJu;
				System.out.printf("Tu peso en Júpiter será de %.2f Newton\n", nuevoPeso);
				break;
			case 6:
				nuevoPeso=masa*equiUr;
				System.out.printf("Tu peso en Urano será de %.2f Newton\n", nuevoPeso);
				break;
			case 7:
				nuevoPeso=masa*equiNe;
				System.out.printf("Tu peso en Neptuno será de %.2f Newton\n", nuevoPeso);
				break;
			default:
				System.out.println("Opción no válida");
				}
		
		System.out.println("**************************************************************");
		System.out.println("Gracias por utilizar este programa :)");
		
		

		
		
		
		
		
		
		
	}

}
