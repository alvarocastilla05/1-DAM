package ejercicio1;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam=10;
		int id = 0;
		String direccion;
		int area;
		int estado;
		double precioVenta;
		int numVendedores = 10;
		int numPiso = 0;
		int op;
		
		Piso p;
		
		Piso p1=new Piso(1,  "c/Antonio Guerra", 50, 2, 120.5);
		Piso p2=new Piso(2,  "c/Merinos", 30, 1, 250.5);
		Piso p3=new Piso(3,  "c/Pureza", 100, 3, 500);
		id++;
		
		
		Piso [] lista=new Piso[tam];
		Inmobiliaria i = new Inmobiliaria(lista, numVendedores, numPiso );
		
		i.addPiso(p1);
		i.addPiso(p2);
		i.addPiso(p3);
		
		
		String aux;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("---------------------");
			System.out.println("1-Agregar piso.");
			System.out.println("2-Mostrar lista de pisos.");
			System.out.println("---------------------");
			
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch(op) {
			
				case 1:
					System.out.println("Introduzca la dirección del piso:");
					direccion=sc.nextLine();
					System.out.println("Introduzca el área del piso (sin decimales):");
					aux=sc.nextLine();
					area=Integer.parseInt(aux);
					System.out.println("Introduzca 1 nuevo, 2 seminuevo, 3 reformar:");
					aux=sc.nextLine();
					estado=Integer.parseInt(aux);
					System.out.println("Introduzca el precio de venta:");
					aux=sc.nextLine();
					precioVenta=Double.parseDouble(aux);
					
					i.addPiso(new Piso(id,direccion, area, estado, precioVenta));
					id++;
					
					break;
					
				case 2:
					i.mostrarLista(lista);
					break;
			}
			
			
			
			
		}while(op!=0);
	}

}
