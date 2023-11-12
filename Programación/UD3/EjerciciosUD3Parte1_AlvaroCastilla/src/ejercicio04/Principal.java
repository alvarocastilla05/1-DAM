package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	//Declarar variables.
		
		double radio;
		double altura;
		double volumen = 0;
		String aux;
		Cilindro c;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido, en el siguiente programa vamos a calcular el volumen de un cilindro");
		System.out.println("*********************************************************************************");
		
		System.out.println("Introduzca el radio del cilindro: ");
		aux=sc.nextLine();
		radio=Double.parseDouble(aux);
		
		System.out.println("Introduzca la altura del cilindro: ");
		aux=sc.nextLine();
		altura=Double.parseDouble(aux);
		
		c=new Cilindro(radio, altura, volumen);
		
		c.calcularVol();
		
		c.mostrarArea();
	}

}
