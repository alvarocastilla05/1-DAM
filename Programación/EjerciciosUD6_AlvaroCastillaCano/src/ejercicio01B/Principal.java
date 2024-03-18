package ejercicio01B;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int num, den;
		String aux;
		Calculadora c = new Calculadora();
		Scanner sc = new Scanner(System.in);
			
		//do {
			
			try {
				System.out.println("Diga numerador");
				aux=sc.nextLine();
				num = Integer.parseInt(aux);
				
				System.out.println("Introduzca denominador:");
				aux=sc.nextLine();
				den=Integer.parseInt(aux);
				
				System.out.println(c.dividir(2, 0));
				//System.out.println(c.raizCuadrada(-2));
				
			}catch(ArithmeticException e) {
				System.err.println("El denominador no puede ser 0.");
			//}catch(){
				
			
			
			}catch(Exception e) {
				System.err.println("Error inesperado.");
			}
		//}while ();
		
		
		
	}

}
