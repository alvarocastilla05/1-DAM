package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Declarar variables.
		int num1, num2;
		String aux;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido, en el siguiente programa vamos a comprobar que valor es mayor");
		System.out.println("*****************************************************************************");
		
		System.out.println("Introduzca número 1:");
		aux=sc.nextLine();
		num1=Integer.parseInt(aux);
		
		System.out.println("Introduzca número 2");
		aux=sc.nextLine();
		num2=Integer.parseInt(aux);
		
		
		if (num1==num2) {
			
			System.out.println("Los dos números son iguales.");
		}else if (num1<num2) {
			
			System.out.printf("%d es mayor que %d\n", num2, num1);
		
		}else {
			
			System.out.printf("%d es mayor que %d\n", num1, num2);
		
		}
		
		
		 
		System.out.println("***************************************");
		
		 System.out.println("Gracias por utilizar este programa.");
		

	}

}
