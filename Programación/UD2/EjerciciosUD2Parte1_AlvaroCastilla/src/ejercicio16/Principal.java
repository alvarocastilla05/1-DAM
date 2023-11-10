package ejercicio16;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Declarar varibales.
		
		String aux;
		int opcion;
		double horas, sueldo, sueldoHor=16, sueldoHorEx=20, horasTot, horasEx;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido, en el siguiente programa vamos a calcular el salario que le corresponde.");
		System.out.println("*******************************************************************************************");
		
		do {
			System.out.println("---------------------------------");
			System.out.println("0-Salir");
			System.out.println("1-Inicializar programa");
			System.out.println("---------------------------------");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch (opcion) {
				case 1:
					System.out.println("Introduzca número de horas trabajadas:");
					aux=sc.nextLine();
					horas=Double.parseDouble(aux);
					
					System.out.println("Introduzca número de horas extras:");
					aux=sc.nextLine();
					horasEx=Double.parseDouble(aux);
					
					horasTot=horasEx+horas;
					
					
					if (horasTot<=40) {
						sueldo=sueldoHor*horas;
						System.out.printf("Su sueldo es de %.2f € \n", sueldo);
						
					}else {
						sueldo=(sueldoHorEx*horasEx)+(sueldoHor*horas);
						System.out.printf("Su sueldo es de %.2f €.\n", sueldo);
					}
					break;
				case 0:
					System.out.println("Gracias por utilizar este programa :)");
					break;
				default:
					System.out.println("Opción no válida.");
					break;
					
			}
			
			
				
		}while (opcion!=0);

	}

}
