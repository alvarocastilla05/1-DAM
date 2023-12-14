package repaso;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		String nombre;
		double precioFabrica;
		int seccion; //1 alimentacion, 2 electronica, 3 ropa.
		boolean enVenta;
		int venta;
		int numProductos = 0;
		int numTrabajadores=3;
		int tam=10;
		
		Producto p;
		
		Producto p1= new Producto("PAntalon", 30.5, 3, true);
		Producto p2= new Producto("Pantalla", 100, 2, true);
		
		Producto [] lista=new Producto[tam];
		Tienda t = new Tienda(lista, numProductos, numTrabajadores);
		
		String aux;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Hola, bienvenido al programa de gestionar porductos.");
		
		
		do {
			System.out.println("---------------------------------");
			System.out.println("1-Agregar producto");
			System.out.println("2-Mostrar lista de productos");
			System.out.println("---------------------------------");
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch(op) {
				case 0:
					System.out.println("Gracias por utilizar este programa");
					break;
				case 1:
					System.out.println("Diga el nombre del porducto:");
					nombre=sc.nextLine();
					
					System.out.println("Diga el precio de fábrica:");
					aux=sc.nextLine();
					precioFabrica=Double.parseDouble(aux);
					
					System.out.println("Diga a la sección a la que pertenece: 1 alimentacion - 2 electrónica - 3 ropa");
					aux=sc.nextLine();
					seccion=Integer.parseInt(aux);
					
					System.out.println("Diga 1 si está en venta, y cualquier otro para no");
					aux=sc.nextLine();
					venta=Integer.parseInt(aux);
					
					if(venta==1) {
						enVenta=true;
					}else {
						enVenta=false;
					}
					
					//Dos formas
					//a)Creando un producto antes.
					
					p=new Producto (nombre, precioFabrica, seccion, enVenta);
					t.addProduct(p);
					t.addProduct(p1);
					t.addProduct(p2);
					
					
					//b)Instanciando directamente el producto.
					
					//t.addProduct(new Producto(nombre, precioFabrica, seccion, enVenta));
					
					break;	
					
				case 2:
					t.mostrarProductos();
					break;
					
			}
			
		}while(op!=0);
		
		
	}

}
