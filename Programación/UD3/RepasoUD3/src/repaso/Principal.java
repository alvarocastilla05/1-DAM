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
		int id;
		double porcentaje, precioNuevo, descuento;
		double ganancia;
		
		Producto p;
		Producto prod=new Producto();
		
		Producto p1= new Producto("PAntalon", 30.5, 3, true, 1);
		Producto p2= new Producto("Pantalla", 100, 2, true, 2);
		Producto p3= new Producto("Portátil", 500, 2, true, 3);
		id=4;
		
		Producto [] lista=new Producto[tam];
		Tienda t = new Tienda(lista, numProductos, numTrabajadores);
		
		String aux;
		Scanner sc=new Scanner(System.in);
		
		t.addProduct(p1);
		t.addProduct(p2);
		t.addProduct(p3);
		
		System.out.println("Hola, bienvenido al programa de gestionar porductos.");
		
		
		do {
			System.out.println("---------------------------------");
			System.out.println("1-Agregar producto");
			System.out.println("2-Mostrar lista de productos");
			System.out.println("3-Buscar por sección");
			System.out.println("4-Buscar por id");
			System.out.println("5-Calcular precio de venta al público");
			System.out.println("6-Modificar precio de la seccion");
			System.out.println("7-Calcular descuento");
			System.out.println("8-Eliminar sección");
			System.out.println("9-Mostrar activos");
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
					
					p=new Producto (nombre, precioFabrica, seccion, enVenta, id);
					id++;
					t.addProduct(p);
					
					
					
					//b)Instanciando directamente el producto.
					
					//t.addProduct(new Producto(nombre, precioFabrica, seccion, enVenta));
					
					break;	
					
				case 2:
					t.mostrarProductos();
					break;
				case 3:
					System.out.println("¿Qué sección quieres buscar?");
					aux=sc.nextLine();
					seccion=Integer.parseInt(aux);
					
					t.mostrarLista(t.buscarBySeccion(seccion));
					
					break;
				case 4:
					
					System.out.println("Introduzca id para bsucar producto:");
					aux=sc.nextLine();
					id=Integer.parseInt(aux);
					prod=t.findById2(id);
					
					if(prod==null) {
						System.out.println("Producto no encontrado");
					}else {
						System.out.println(prod);
					}
					break;
				case 5:
					System.out.println("Diga el id del producto que quiera modificar:");
					aux=sc.nextLine();
					id=Integer.parseInt(aux);
					
					System.out.println("Diga el porcentaje de ganancias:");
					aux=sc.nextLine();
					porcentaje=Double.parseDouble(aux);
					System.out.printf("El precio de venta al público es: %.2f € \n", t.calcularPrecioFinal(porcentaje, id));
					break;
				case 6:
					System.out.println("Introduzca la sección que deseas modificar:");
					aux=sc.nextLine();
					seccion=Integer.parseInt(aux);
					
					System.out.println("Introduzca el precio nuevo de la seccion");
					aux=sc.nextLine();
					precioNuevo=Double.parseDouble(aux);
					
					t.modifyPrecio(precioNuevo, seccion);
					break;
				case 7:
					System.out.println("Introduzca el ID del producto que desea aplicarle el descuento:");
					aux=sc.nextLine();
					id=Integer.parseInt(aux);
					
					System.out.println("Diga la ganancia");
					aux=sc.nextLine();
					ganancia=Double.parseDouble(aux);
					
					System.out.println("Introduzca el porcentaje de descuento que desea aplicar:");
					aux=sc.nextLine();
					descuento=Double.parseDouble(aux);
					
					System.out.printf("El precio con decuento es: € %.2f\n\n", t.hacerDescuento(descuento, ganancia, id));
					break;
				case 8:
					System.out.println("Diga la sección que desea eliminar:");
					aux=sc.nextLine();
					seccion=Integer.parseInt(aux);
					
					System.out.println("Se han eliminado "+ t.eliminarSeccion(seccion) +" productos");
					break;
				case 9:
					t.mostrarActivos();
					break;

			}
			
		}while(op!=0);
		
		
	}

}
