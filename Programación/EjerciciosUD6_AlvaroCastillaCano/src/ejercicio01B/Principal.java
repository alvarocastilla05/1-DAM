package ejercicio01B;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int num, den;
		String aux;
		boolean error = false;
		Calculadora c = new Calculadora();
		Scanner sc = new Scanner(System.in);
			
		do {
			
			try {
				
				System.out.println("Diga numerador");
				aux=sc.nextLine();
				num = Integer.parseInt(aux);
				
				System.out.println("Introduzca denominador:");
				aux=sc.nextLine();
				den=Integer.parseInt(aux);
				
				System.out.println(c.dividir(num, den));
				//System.out.println(c.raizCuadrada(-2));
				error = true;
				
			}catch(ArithmeticException e) {
				System.err.println("El denominador no puede ser 0.");
				error = false;
			}catch(NumberFormatException e){
				System.err.println("Dato incorrecto, debe de ser un entero.");
				error = false;
			}catch(Exception e) {
				System.err.println("Error inesperado.");
				error = false;
			}
		}while (!error);
		
		
		
	}

}
