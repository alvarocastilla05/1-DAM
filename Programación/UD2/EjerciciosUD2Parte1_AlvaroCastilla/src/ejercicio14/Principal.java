package ejercicio14;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Variables.
		int num, suma = 0, producto=1, opcion;
		String aux;

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido, en el sigueinte programa vamos a generar 10 números y a mostrar su suma y su producto");
		System.out.println("**************************************************************************************************");
		System.out.println("  ");
		
		do {
		
		System.out.println("---------------------------");
		System.out.println("0-Salir");
		System.out.println("1-Inicializar programa");
		System.out.println("---------------------------");
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		
		
		switch (opcion) {
			case 1:
				for(int i=0;i<10;i++) {
				System.out.println("Diga "+(i+1)+"º número");
				aux=sc.nextLine();
				num=Integer.parseInt(aux);
				
				suma+=num;
				producto*=num;
			
				}
				break;
			case 0:
				System.out.println("Gracias por utilizar este programa :)");
			break;
			
			default:
				System.out.println("Opción no válida.");
				}
		System.out.printf("La suma total de los números anteriores es: %d\n", suma);
		System.out.printf("El producto de los número anteriores es: %d \n", producto);
		
			
		}while (opcion!=0);
	}

}
