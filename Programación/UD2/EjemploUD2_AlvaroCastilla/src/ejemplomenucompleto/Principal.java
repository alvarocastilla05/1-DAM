package ejemplomenucompleto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Menú completo.
		
		int opcion, cero=0;
		String aux;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Refranero semanal");
		System.out.println("  ");
		
		do {
			
		System.out.println("0. Para salir");
		System.out.println("1. Lunes");
		System.out.println("2. Martes");
		System.out.println("3. Miércoles");
		System.out.println("4. Jueves");
		System.out.println("5. Viernes");
		System.out.println("6. Sábado");
		System.out.println("7. Domingo");
		
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		switch (opcion) {
		
			case 1:
				System.out.println("Lunes a mediodía, alegría.");
				break;
			case 2: 
				System.out.println("Martes, ni te cases ni...");
				break;
			case 3:
				System.out.println("Miercoles, uff media semana.");
				break;
			case 4:
				System.out.println("Jueves, ehhh qué.");
				break;
			case 5:
				System.out.println("Viernes, ¿Cómo? ¿Ya?");
				break;
			case 6:
				System.out.println("Sábado, oeeee");
				break;
			case 7:
				System.out.println("Domingo, ¿Cómo? ¿Ya");
				break;
			case 0:
				System.out.println("Hasta luego Lucarrrr");
				break;
			default:
				System.out.println("Opción no válida.");
		}
		
		}while (opcion!=cero);
		
		
	}

}
