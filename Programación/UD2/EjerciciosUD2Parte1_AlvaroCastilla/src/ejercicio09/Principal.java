package ejercicio09;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Declarar Variables.
		double precioEntrada, precioTot, porcentaje=30, precioMier;
		int numEntradas, cien=100;
		String aux, diaSemana, miercoles="miercoles";
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido, en el siguiente programa vamos a calcular el precio total gastado en el cine.");
		System.out.println("********************************************************************************************");
		System.out.println("  ");
		
		System.out.println("Introduzca el día de la semana:");
		diaSemana=sc.nextLine();
		
		System.out.println("Introduzca el número de entradas que deseas comprar:");
		aux=sc.nextLine();
		numEntradas=Integer.parseInt(aux);
		
		System.out.println("Introduzca el precio de las entradas:");
		aux=sc.nextLine();
		precioEntrada=Double.parseDouble(aux);
		
		precioTot=precioEntrada*numEntradas;
		
		if (diaSemana.equals(miercoles)) {
			precioMier=(precioTot*porcentaje)/cien;
			System.out.printf("El precio total es de %.2f €\n", precioMier);
		}else {
			System.out.printf("El precio total es de %.2f €\n", precioTot);
		}
		System.out.println("  ");
		System.out.println("****************************************************************************************************");
		System.out.println("Gracias por utilizar este programa :)");
		
		
	}

}
