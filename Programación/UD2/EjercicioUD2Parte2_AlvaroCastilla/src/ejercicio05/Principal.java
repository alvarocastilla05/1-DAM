package ejercicio05;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Declarar Variables
		
		int tam, opcion, contador = 0;
		int desde, hasta, suma = 0, mayor = 0, menor = 0, pos, valor;
		String aux;
		int [] numeros;
		
		Scanner sc=new Scanner(System.in);
		
		Random r=new Random(System.nanoTime());
		
		System.out.println("Bienvenido :)");
		System.out.println("**************************************************");
		
		do {
			System.out.println("-------------------------------");
			System.out.println("Pulse 0 para salir.");
			System.out.println("Pulse 1 para inicializar");
			System.out.println("-------------------------------");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
		
			switch (opcion) {
				case 1:
					System.out.println("Introduzca el tamaño del array:");
					aux=sc.nextLine();
					tam=Integer.parseInt(aux);
					
					numeros=new int [tam];
					
					System.out.println("Indica desde qué número:");
					aux=sc.nextLine();
					desde=Integer.parseInt(aux);
					
					System.out.println("Introduzca hasta qué número:");
					aux=sc.nextLine();
					hasta=Integer.parseInt(aux);
					
					//rellenar
					for (int i = 0; i < numeros.length; i++) {
						numeros[i]=r.nextInt(hasta-desde+1)+desde;
					}
					
					//mostrar.
					for (int i = 0; i < numeros.length; i++) {
						System.out.print(numeros[i]+"\t\t");
						System.out.println();
					}
					
					
					for (int i = 0; i < numeros.length; i++) {
						suma+=numeros[i];
					}
					System.out.printf("La suma es= %d\n", suma);
					System.out.println("*****************************");
					
					
					//número mayor y menor
					for (int i = 0; i < numeros.length; i++) {
						if (i==0) {
							mayor=numeros[i];
						}
						if(mayor<numeros[i]) {
							mayor=numeros[i];
						}	
					}
					System.out.printf("El número mayor es %d\n", mayor);
					System.out.println("**********************************");
					
					for (int i = 0; i < numeros.length; i++) {
						if (i==0) {
							menor=numeros[i];
						}
						if(menor>numeros[i]) {
							menor=numeros[i];
						}
					}
					System.out.printf("El número menor es %d\n", menor);
					System.out.println("**********************************");
					
					
					//modificar un valor
					System.out.println("Por favor indica la posición que desea modificar:");
					aux=sc.nextLine();
					pos=Integer.parseInt(aux)-1;
					
					System.out.println("Introduzca el nuevo valor:");
					aux=sc.nextLine();
					valor=Integer.parseInt(aux);
					
					numeros[pos]=valor;
					
					for (int i = 0; i < numeros.length; i++) {
						System.out.print(numeros[i]+"\t\t");
					}
					
					//contar 0.
					for (int i = 0; i < numeros.length; i++) {
						if(numeros[i]==0) {
							contador++;
						}
						System.out.printf("Hay un total de %d ceros", contador);
					}
					break;
				case 0:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opción no válida.");
					break;
					
			}
			
		
		
		}while(opcion!=0);
	}

}
