package ejercicio15;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Ejercicio corregido.
		
		//Declarar variables
		double media,   nota = 0, numAsig = 0, sumaNotas = 0;
		int tope=6, opcion = 0, numSuspensos = 0;
		String aux;
		
		Scanner sc=new Scanner(System.in);
		
		do {
		
		System.out.println("Bienvenido, vamos a hacer un registro de notas de un alumno.");
		System.out.println("**************************************************************");
		System.out.println("Introduzca 0 para salir.");
		System.out.println("Introduzca 1 para obtener media.");
		
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		
		switch (opcion) {
		
			case 1:
				System.out.println("Introduzca el número de asignaturas:");
				aux=sc.nextLine();
				tope=Integer.parseInt(aux);
				
				for(int i=0; i<tope ; i++) {
					
					System.out.println("Diga "+(i+1)+ "º nota");
					aux=sc.nextLine();
					nota=Double.parseDouble(aux);
					
					sumaNotas+=nota;
					
					
				if (nota<5) {
					numSuspensos++;
				}
				
				
				}
				break;
					
			case 0:	
				System.out.println("Saliendo...");
				break;
				
			default:
				System.out.println("Opción no válida.");
				break;
							
		}
		media=sumaNotas/tope;
		System.out.printf("Su nota media es: %.2f\n", media);
		System.out.printf("Tiene un total de %d suspensos\n", numSuspensos);
		}while (opcion!=0);
		
		}
		
		
		

}
