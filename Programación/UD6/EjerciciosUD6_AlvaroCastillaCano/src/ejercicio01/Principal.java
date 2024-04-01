package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int op;
		int suma;
		int resta;
		int multi;
		double division;
		double raiz;
		
		String aux;
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("""
					0-Salir.
					1-Suma.
					2-Resta.
					3-Multiplicacion.
					4-Division.
					5-Raíz Cudrada.
					""");
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch(op) {
				case 1:
					try {
						System.out.println("Introduzca el número 1:");
						aux=sc.nextLine();
						num1=Integer.parseInt(aux);
						
						System.out.println("Introduzca el número 2:");
						aux=sc.nextLine();
						num2=Integer.parseInt(aux);
						
						suma = num1+num2;
						
						System.out.println("La suma es: "+ suma);
						
					}catch(RuntimeException e) {
						System.err.println("Solo puedes introducir número enteros");
					}
					break;
				case 2:
					try {
						System.out.println("Introduzca el número 1:");
						aux=sc.nextLine();
						num1=Integer.parseInt(aux);
						
						System.out.println("Introduzca el número 2:");
						aux=sc.nextLine();
						num2=Integer.parseInt(aux);
						
						resta = num1-num2;
						
						System.out.println("La resta es: "+ resta);
					}catch(RuntimeException e) {
						System.err.println("Solo puede introducir número enteros");
					}
				break;
				case 3:
					try {
						System.out.println("Introduzca el número 1:");
						aux=sc.nextLine();
						num1=Integer.parseInt(aux);
						
						System.out.println("Introduzca el número 2:");
						aux=sc.nextLine();
						num2=Integer.parseInt(aux);
						
						multi = num1*num2;
						
						System.out.println("La multiplicacion es: "+ multi);
					}catch(RuntimeException e) {
						System.err.println("Solo puede introducir número enteros");
					}
					break;
				case 4:
					try {
						System.out.println("Introduzca el número 1:");
						aux=sc.nextLine();
						num1=Integer.parseInt(aux);
						
						System.out.println("Introduzca el número 2:");
						aux=sc.nextLine();
						num2=Integer.parseInt(aux);
						
						division = num1/num2;
						
						System.out.println("La division es: "+ division);
					}catch(RuntimeException e) {
						System.err.println("No se puede dividir entre 0");
					}
					break;
				case 5:
					try {
						System.out.println("Introduzca el número del que quiere conocer su raíz cuadrada:");
						aux=sc.nextLine();
						num1=Integer.parseInt(aux);
						
						raiz= Math.sqrt(num1);
						
						System.out.println("La raiz cuadrada de "+num1+" es "+raiz);
					}catch(RuntimeException e) {
						System.err.println("No se puede hacer la raíz de un número negativo");
					}
					break;
				case 0:
					System.out.println("Gracias por utilizar este programa :)");
					break;
				default:
					System.out.println("Opción no válida.");
					break;
			}
			
			
		}while(op!=0);
		

	}

}
