package ejercicio05;

import java.util.Scanner;

public class Prinicipal {

	public static void main(String[] args) {
		//Ejercicio Corregido.
		// Declarar variables.
		double exp, base, resultado,  menos1=-1, expM1, resultadoDec;
		String aux;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido, en el siguiente programa vamos a calcular la potencia de uan base y un exponente.");
		System.out.println("************************************************************************************************");
		System.out.println("   ");
		
		System.out.println("Introduzca la base de la potencia:");
		aux=sc.nextLine();
		base=Double.parseDouble(aux);
		
		System.out.println("Introduzca el valor del exponente:");
		aux=sc.nextLine();
		exp=Integer.parseInt(aux);
		
		if (exp==0) {
			System.out.println("El resultado es igual a 1.");
			
		}
		else if (exp<0) {
			expM1=exp*menos1;
			
			resultado=Math.pow(base, expM1);
			resultadoDec=1/resultado;
			
			System.out.printf("El resultado en forma de fracción es 1/%.2f, y en decimales es %.3f.\n", resultado, resultadoDec);
		}else {
			resultado=Math.pow(base, exp);
			System.out.printf("El resultado es %.2f.\n", resultado);
		}
		
		System.out.println("  ");
		System.out.println("*********************************************************************************************************");
		System.out.println("Gracias por utilizar este programa :)");
	}

}
