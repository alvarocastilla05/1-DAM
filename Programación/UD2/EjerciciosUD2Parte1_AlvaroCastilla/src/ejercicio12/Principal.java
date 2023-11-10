package ejercicio12;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Declarar Variables.
		double pesoKg, altura, imc;
		int cuadrado=2;
		String aux;
		int opcion;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido, vamos a calcular su IMC.");
		System.out.println("*********************************************");
		
		System.out.println("Introduzca su peso en kg: ");
		aux=sc.nextLine();
		pesoKg=Double.parseDouble(aux);
		
		System.out.println("Introduzca su altura:");
		aux=sc.nextLine();
		altura=Double.parseDouble(aux);
		
		imc=pesoKg/(Math.pow(altura, cuadrado));
		
		System.out.printf("Su IMC es: %.2f\n", imc);
		System.out.println("************************");
		
		System.out.println("1. Si su imc es <16.");
		System.out.println("2. Si su imc es de 16 a 17.");
		System.out.println("3. Si su imc es de 17 a 18.");
		System.out.println("4. Si su imc es de 18 a 25.");
		System.out.println("5. Si su imc es de 25 a 30.");
		System.out.println("6. Si su imc es de 30 a 35.");
		System.out.println("7. Si su imc es de 35 a 40.");
		System.out.println("8. Si su imc es >40.");
		
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		switch (opcion) {
			case 1: 
				System.out.println("Criterio de ingreso en hospital.");
				break;
			case 2:
				System.out.println("Infrapeso");
				break;
			case 3:
				System.out.println("Bajo peso.");
				break;
			case 4:
				System.out.println("Peso normal (saludable).");
				break;
			case 5:
				System.out.println("Sobrepeso (obesidad grado I).");
				break;
			case 6:
				System.out.println("Sobrepeso crónico (obesidad grado II).");
				break;
			case 7:
				System.out.println("Sobrepeso premórbida(obesidad grado III).");
				break;
			case 8:
				System.out.println("obesidad mórbida (obesidad grado IV).");
				break;
			default:
				System.out.println("Opción no válida.");
			break;		
				}
		System.out.println("***********************************************************");
		System.out.println("Gracias por utilizar este programa.");
		

	}

}
