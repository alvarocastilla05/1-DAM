package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String aux;
		Scanner sc = new Scanner(System.in);
		double fijoBatmovil;
		int id = 0;
		int tam = 10;
		int op;
		int numeroDias;
		
		
		Vehiculos v = new Vehiculos(1,"JBB 12345", 50, 2000);
		Vehiculos b = new Batmoviles(2, "CZP 1245", 10, 1000, 4);
		Vehiculos p = new PatineteVoladores(3, "JDA 12345", 5,2100 ,500);
		id = 4;
		id++;
		
		Vehiculos [] lista = new Vehiculos[tam];
		
		lista[0]=v;
		lista[1]=b;
		lista[2]=p;
		
		TiendaAlquileres t = new TiendaAlquileres(lista);
		
		System.out.println("Bienvenido al programa de alquileres de vehículos fantásticos.");
		System.out.println("*********************************************************************");
		
		System.out.println("Introduzca el fijo de los Batmoviles:");
		aux=sc.nextLine();
		fijoBatmovil=Double.parseDouble(aux);
		
		
		System.out.println(v.calcularPrecio(fijoBatmovil));
		System.out.println(b.calcularPrecio(fijoBatmovil));
		System.out.println(p.calcularPrecio(fijoBatmovil));
		
		
		do {
			System.out.println("***************");
			System.out.println("0-Salir");
			System.out.println("1-Calcular precio de un Vehiculo");
			System.out.println("2-Mostrar vehículos");
			System.out.println("3-Calcular total recaudado");
			System.out.println("4-Calcular alquiler para varios dias");
			System.out.println("***************");
			
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch (op) {
			
				case 1:
					System.out.println("Indique de que vehiculo desea calcular el precio");
					aux=sc.nextLine();
					id = Integer.parseInt(aux);
					
					System.out.println(t.calcularPrecioBuscado(t.findById(id), fijoBatmovil, v)); 
					break;
				case 2:
					t.mostrarListaConAviso();
					break;
				case 3:
						System.out.println("El dinero total recaudado es de "+t.calcularTotalRecaudado(fijoBatmovil)+" €");
					break;
				case 4:
					System.out.println("Introduzca cuantos dias desea de alquilar un vehiculo:");
					aux=sc.nextLine();
					numeroDias=Integer.parseInt(aux);
					
					System.out.println("El precio de un vehiculo alquilado "+numeroDias+" dias es de "+t.calcularPrecioVariosDias(v, fijoBatmovil, numeroDias)+" €");
					System.out.println("El precio de un batmovil alquilado "+numeroDias+" dias es de "+t.calcularPrecioVariosDias(b, fijoBatmovil, numeroDias)+" €");
					System.out.println("El precio de un un Patinete Volador alquilado "+numeroDias+" dias es de "+t.calcularPrecioVariosDias(p, fijoBatmovil, numeroDias)+" €");
					break;
				case 0:
					System.out.println("Gracias por utilizar este programa, que disfrute de esta maginifico vehiculo:)");
					break;
				default:
					System.out.println("Opcion no valida");
					break;
					
						
			}
			
			
		}while(op!=0);
	}

}
