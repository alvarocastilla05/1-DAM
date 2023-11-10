package ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Declarar Variables.
		
		int tam=10, suma = 0, menor5 = 0, maximo = 0, menor = 0 ;
		int [] valorTir=new int [tam];
		String aux;
		double media = 0;
		int desde, hasta = 0;
		int opcion, diez=10, cien=100, pos, sumaTir;
		double porcenMax = 0;
		String []tiradas=new String [tam];
		
		Scanner sc=new Scanner(System.in);
		
		Random rnd=new Random(System.nanoTime());
		
		
		System.out.println("Bienvenido, en el siguiente programa vamos a generar un dado con el número de caras que desee y realizaremos distintas opciones con él");
		System.out.println("******************************************************************************************************************************************");
		
		
		do {
			System.out.println("--------------------------------------------------------");
			System.out.println("0-Salir");
			System.out.println("1-Generar 10 tiradas del un dado personalizado por usted.");
			System.out.println("2-Suma de todas las tiradas.");
			System.out.println("3-Número medio de todas las tiradas.");
			System.out.println("4-Tiradas menor de 5.");
			System.out.println("5-Porcentaje del valor máximo.");
			System.out.println("6-Impresión Bonita.");
			System.out.println("7-Valor de tirada menor.");
			System.out.println("8-Sumar valor a una tirada.");
			System.out.println("--------------------------------------------------------");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch (opcion) {
				case 1:
					System.out.println("Introduzca desde qué número desea el dado: ");
					aux=sc.nextLine();
					desde=Integer.parseInt(aux);
					
					System.out.println("********************************************************");
					
					System.out.println("Introduzca hasta qué número desea el dado:");
					aux=sc.nextLine();
					hasta=Integer.parseInt(aux);
					
					System.out.println("********************************************************");
					
					for (int i = 0; i < valorTir.length; i++) {
						valorTir [i]=rnd.nextInt(hasta-desde+1)+desde;
					}
					for (int i = 0; i < tiradas.length; i++) {
						System.out.print("Tirada "+(i+1)+"\t\t");
					}
					System.out.println();
					for (int i = 0; i < valorTir.length; i++) {
						System.out.print(valorTir[i]+"\t\t\t");	
					}
					System.out.println();
					break;
					
				case 2:
					for (int i = 0; i < valorTir.length; i++) {
						suma+=valorTir[i];
					}
					System.out.printf("La suma de todos los valores del caso 1 es: %d\n", suma);
					break;
					
				case 3:	
					for (int i = 0; i < valorTir.length; i++) {
						suma+=valorTir[i];
					}	
					media=suma/diez;
					System.out.printf("La media de las tiradas anteriores es: %.2f\n", media);
					
					
					break;
					
				case 4:
					for (int i = 0; i < valorTir.length; i++) {
						if(valorTir[i]<5) {
							menor5++;
						}	
					}
					System.out.printf("Hay un total de %d tiradas menor que 5.\n", menor5);
					break;
					
				case 5:
					for (int i = 0; i < valorTir.length; i++) {
						if(valorTir[i]==hasta) {
							maximo++;
							
						}
					}
					System.out.println("El número máximo se repite "+maximo+" veces");
					porcenMax=(maximo*diez)/cien;
					System.out.printf("El porcentaje de números máximos es: %.2f\n", porcenMax);
					
					
					break;
					
				case 6:
					for (int i = 0; i < tiradas.length; i++) {
						System.out.print("Tirada "+(i+1)+"\t\t");
					}
					System.out.println();
					for (int i = 0; i < valorTir.length; i++) {
						System.out.print(valorTir[i]+"\t\t\t");	
					}
					System.out.println();
					break;
					
				case 7:
					for (int i = 0; i < valorTir.length; i++) {
						if(valorTir[i]==0) {
							menor=valorTir[i];
						}
						if(menor>valorTir[i]) {
							menor=valorTir[i];
						}
					}
					System.out.printf("El valor menor de las tiradas es: %d\n", menor);
					break;
					
				case 8:
					System.out.println("Indique que tirada desea sumarle un número:");
					aux=sc.nextLine();
					pos=Integer.parseInt(aux)-1;
					
					System.out.println("Introduzca cuánto desea sumarle:");
					aux=sc.nextLine();
					sumaTir=Integer.parseInt(aux);
					
					valorTir[pos]+=sumaTir;
					
					for (int i = 0; i < tiradas.length; i++) {
						System.out.print("Tirada "+(i+1)+"\t\t");
					}
					System.out.println();
					for (int i = 0; i < valorTir.length; i++) {
						System.out.print(valorTir[i]+"\t\t\t");	
					}
					System.out.println();
					break;
				case 0:
					System.out.println("Gracias por utilizar este programa :)");
					break;
					
				default:
					System.out.println("Opción no válida");
					break;
					
			}
			
		}while(opcion!=0);
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
