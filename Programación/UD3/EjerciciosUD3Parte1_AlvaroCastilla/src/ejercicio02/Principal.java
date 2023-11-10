package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String aux;
		double radio;
		double area;
		Circulo a1;

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Diga radio del círculo:");
		aux=sc.nextLine();
		radio=Double.parseDouble(aux);
		
		a1=new Circulo(radio);
		
		area=a1.calcularArea();
		
		System.out.printf("El área del círculo es: %.2f cm2\n", area);
		
		area=a1.calcularAreaM2(area);
		
		a1.mostrarAreaM2(area);
	}

}
