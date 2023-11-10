package ejercicio07;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Declarar variables.
		double precioUn, precioTot, precioFinal;
		int cantidad, descuento, cien=100;
		String aux;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido en el siguiente programa vamos a calcular el precio final de eun producto.");
		System.out.println("*****************************************************************************************");
		
		System.out.println("Introduzca el precio del producto:");
		aux=sc.nextLine();
		precioUn=Double.parseDouble(aux);
		

		System.out.println("Introduzca la cantidad del producto:");
		aux=sc.nextLine();
		cantidad=Integer.parseInt(aux);
		precioTot=cantidad*precioUn;
		
		if (precioTot>=100) {
			System.out.println("Introduzca el porcentaje de descuento:");
			aux=sc.nextLine();
			descuento=Integer.parseInt(aux);
			
			precioFinal=(precioTot*descuento)/cien;
			System.out.printf("El precio final es de %.2f €\n", precioFinal);
		}else {
			System.out.printf("El precio final es de %.2f €\n", precioTot);
		
		}
		System.out.println(  );
		System.out.println("Gracias por utilizar este programa.");
		
		
		
		
		
		
		
	}

}
