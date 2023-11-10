package ejercicio13;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Declarar variables.
		int num = 0, multi, opcion;
		String aux;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido, en el siguiente programa vamos a calcular las tablas de multiplicar de los números que desee.");
		System.out.println("**********************************************************************************************************");
		
		do {
			System.out.println("-------------------------------");
			System.out.println("Pulse 0 para salir.");
			System.out.println("Pulse 1 para inicializar");
			System.out.println("-------------------------------");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
		
		switch (opcion) {
			case 1:
				System.out.println("Introduzca la tabla que desee:");
				aux=sc.nextLine();
				num=Integer.parseInt(aux);
		
				for(int i=1; i<=10; i++) {
					multi=num*i;
					System.out.printf("%d * %d = %d\n", num, i, multi );
				}
			break;
			case 0:
				System.out.println("Gracias por utiliza este programa :)");
				break;
			default:
				System.out.println("Opción no válida.");
		}
		
		}while (opcion!=0);
	}

}
