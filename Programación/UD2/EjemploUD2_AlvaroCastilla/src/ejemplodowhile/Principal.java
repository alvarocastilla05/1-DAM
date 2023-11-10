package ejemplodowhile;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Diferencia con while: el do while como mínimo aunque no se cumpla la condición se realiza una vez la acción.
		
		int num=0, salida=0;
		int num2=0, tope=0, uno=1;
		String aux;
		
		Scanner sc=new Scanner(System.in);

		//Ejercicio1
		do {
			
			System.out.println("Introduzca un número (act1):");
			aux=sc.nextLine();
			num=Integer.parseInt(aux);
			System.out.println(num);
			
		}while (num!=salida);
		
		//Ejercicio2
		System.out.println("Introduzca un tope (act2):");
		aux=sc.nextLine();
		tope=Integer.parseInt(aux);
		
		do {
			
			System.out.println(num2+uno);
			num2++;
			
		}while (num2<tope);
		
		System.out.println("Adiós.");
		
		//Ejercicio3(que se pare cuando se ponga 0 pero no imprima el 0)
		
		do {
			System.out.println(num);
			aux=sc.nextLine();
			num=Integer.parseInt(aux);
		}while (num!= tope);
		
		
		
		
	}

}
