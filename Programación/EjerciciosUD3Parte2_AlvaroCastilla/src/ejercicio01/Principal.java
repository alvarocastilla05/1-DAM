package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double precioFab;
		double porcentaje;
		int op;
		String aux;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca el precio de fabricacion: ");
		aux=sc.nextLine();
		precioFab=Double.parseDouble(aux);
		
		System.out.println("Introduzca el porcentaje de transporte: ");
		aux=sc.nextLine();
		porcentaje=Double.parseDouble(aux);
		
		
		
		do {
			System.out.println("---------------------");
			System.out.println("0-Salir");
			System.out.println("1-Listar productos.");
			System.out.println("2-Comprobar si es frágil o no.");
			System.out.println("3-Añadir producto.");
			System.out.println("4-Suma de todos los precios.");
			System.out.println("5-Calcular Precio de Venta al Publico.");
			System.out.println("6-Calcular ganancias.");
			System.out.println("---------------------");
			
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch(op) {
			
				case 1:
				
			}
			
		}while(op!=0);
		
	}

}
