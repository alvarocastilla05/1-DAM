package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String aux;
		double celsius;
		
		Conversor c = new Conversor();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido, en el siguiente programa vamos a pasar de grados Celsius a grados Fahrenheit.");
		System.out.println("-".repeat(100));
		
		try {
			System.out.println("Introduzca grados Celsius:");
			aux=sc.nextLine();
			celsius=Double.parseDouble(aux);
			
			System.out.println(celsius+"ºC son: "+c.conversionGrados(celsius)+"ºF"); 
		}catch(Exception e) {
			
		}

	}

}
