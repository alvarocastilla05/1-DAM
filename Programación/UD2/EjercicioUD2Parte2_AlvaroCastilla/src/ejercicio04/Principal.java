package ejercicio04;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Declarar variables.
		
		int desde=1, hasta=99, tope=10;
		int tam=10, pos, opcion;
		int [] num=new int [tam];
		String aux;
		
		Scanner sc=new Scanner(System.in);
		
		Random r=new Random(System.nanoTime());
		
		for (int i = 0; i < num.length; i++) {
			num[i]=r.nextInt(hasta-desde+1)+desde;
		}
		
		System.out.println("Bienvenido, en el siguiente programa debe de introducir en qué lugar desea introducir un número.");
		System.out.println("*****************************************************************************************************");
		
		do {
			
			System.out.println("-----------------------------");
			System.out.println("0-Salir.");
			System.out.println("1-Inicializar programa.");
			System.out.println("-----------------------------");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch (opcion) {
				case 1:
					for (int i = 0; i < num.length; i++) {
						num[i]=r.nextInt(hasta-desde+1)+desde;
						System.out.println(num[i]+"\t\t");
					}
					
			}
			
			
		}while(opcion!=0);
		

	}

}
