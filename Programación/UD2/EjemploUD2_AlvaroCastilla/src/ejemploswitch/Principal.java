package ejemploswitch;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion1, opcion2;
		String aux;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Pulse 1 para buenos dias");
		System.out.println("Pulse 2 para buenas tardes");
		System.out.println("Pulse 3 para buenas noches");
		
		aux=sc.nextLine();
		opcion1=Integer.parseInt(aux);
		
		
		switch (opcion1) {
			case 1:
				System.out.println("Buenos Días");
				
				System.out.println("Pulse 1 para feliz cumple.");
				System.out.println("Pulse 2 para feliz santo.");
				System.out.println("Pulse 3 para callarte.");
				
				aux=sc.nextLine();
				opcion2=Integer.parseInt(aux);
				switch (opcion2) {
					case 1:
						System.out.println("Feliz Cumpleaños!");
						break;
					case 2:
						System.out.println("Feliz Santo");
						break;
					case 3:
						System.out.println("Que te calles");
					default:
						System.out.println("Opción no válida.");
						}
				break;
				
			case 2: 
				System.out.println("Buenas Tardes");
				break;
			case 3:
				System.out.println("Buenas Noches");
				break;
			default:
				System.out.println("Opción no válida");
		
		}
		
		System.out.println("Gracias por usar este programa");

	}

}
