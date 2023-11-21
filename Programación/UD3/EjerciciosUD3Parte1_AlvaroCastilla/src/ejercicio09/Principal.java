package ejercicio09;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int op;
		String aux;

		int decimo ;
		
		int decimoGan ;
		Sorteo s=new Sorteo();

		int decimo = 0 ;
		
		int decimoGan = 0;
		Sorteo s=new Sorteo(decimoGan);

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido, en el siguiente programa vamos a generar un decimo para usted y diremos si es ganador o no.");
		System.out.println("**********************************************************************************************************");
		System.out.println("  ");
		
		do {
			
		System.out.println("-----------------------");
		System.out.println("0-Salir.");
		System.out.println("1-Comprar décimo.");
		System.out.println("2-Comprar décimo al azar.");
		System.out.println("3-Mostrar ganador.");
		System.out.println("-----------------------");
		
		aux=sc.nextLine();
		op=Integer.parseInt(aux);
		
		switch(op) {
		
			case 1:
				System.out.println("Introduzca el número que desea comprar:");
				aux=sc.nextLine();
				decimo=Integer.parseInt(aux);
				if (decimo<=99999) {
					System.out.println("Su número es :"+decimo);
				}else {
					System.out.println("Opción no válida");
				}
				break;
			case 2:
				s.mostrarDecimo(s.generarDecimo());
				break;
			case 3:
				s.mostrarDecimoGan(s.generarDecimoGan());
				s.mostrarGan(s.comprobarGan());
				break;
			case 0:
				System.out.println("Gracias por utilizar este programa :)");
				break;
			default:
				System.out.println("Opción no válida.");
				break;
		
		}
		
		
		}while (op!=0);
		
		

	}

}
