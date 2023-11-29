package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam;
		Producto [] lista;
		double ganancias = 0;
		double gastosTot = 0;
		String nombre;
		int fragil = 0;
		Double precioVent = null;
		String codProduct = null;
		double precioFab;
		double porcentaje;
		int op;
		String aux;
		Scanner sc=new Scanner(System.in);
		Producto p;
		Tienda t=new Tienda(lista, ganancias, gastosTot);
		
		System.out.println("Indique cuántos productos hay:");
		aux=sc.nextLine();
		tam=Integer.parseInt(aux);
		
		
		
		
		
		
		
		
		
		
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
					System.out.println("Introduzca el precio de fabricacion: ");
					aux=sc.nextLine();
					precioFab=Double.parseDouble(aux);
					
					System.out.println("Introduzca el porcentaje de transporte: ");
					aux=sc.nextLine();
					porcentaje=Double.parseDouble(aux);
					
					System.out.println("Introduzca nombre del porducto:");
					nombre=sc.nextLine();
				
					System.out.println("Diga 1 si es fragil o 2 sino lo es:");
					aux=sc.nextLine();
					fragil=Integer.parseInt(aux);
					
					p= new Producto(precioFab, nombre, fragil, precioVent, codProduct);
					p.calcularPrecioTr(precioFab, porcentaje);
					
					
					p.mostrarCoste(p.calcularCoste(precioFab, p.calcularPrecioTr(precioFab, porcentaje) ));
					break;
				case 2:
					if(fragil==1) {
						System.out.println("El objeto es frágil");
					}else {
						System.out.println("El objeto no es frágil.");
					}
					break;
				case 3:
					
				
			}
			
		}while(op!=0);
		
	}

}
