package ejercicio04;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int a, b;
		String aux;
		boolean salir = false;
		
		Scanner sc = new Scanner(System.in);
		Calculadora c = new Calculadora();
		
		
		System.out.println("Bienvenido al programa donde vamos a sumar dos valores.");
		System.out.println("-".repeat(100));
		
		
		do {
			try {
				System.out.println("Introduzca el valor de a:");
				aux=sc.nextLine();
				a = Integer.parseInt(aux);
				
				System.out.println("Introduzca el valor de b:");
				aux=sc.nextLine();
				b = Integer.parseInt(aux);
				
				System.out.println(c.sumar(a, b)); 
				salir = false;

			}catch(ExcepcionMasDiez e) {
				System.err.println(e.getMessage());
				salir = true;
			}catch(Exception e) {
				System.err.println("Error inesperado");
				salir = true;
			}
		}while(salir);
		
		
	}

}
