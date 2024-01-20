package ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String aux;
		double porcentajeImpuestos;
		double incentivo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido, en el siguiente programa vamos a calcular el sueldo de los distintos tipos de empleado.");
		System.out.println("*******************************************************************************************************");
		
		System.out.println("Introduzca el porcentaje de impuestos que deberán de pagar los gerentes:");
		aux = sc.nextLine();
		porcentajeImpuestos = Double.parseDouble(aux);
		
		System.out.println("Introduzca el incentivo que se llevaran los vendedores con respeto del número de ventas:");
		aux = sc.nextLine();
		incentivo = Double.parseDouble(aux);
	}

}
