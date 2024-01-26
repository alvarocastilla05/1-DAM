package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String aux;
		double descuento;
		double impuestoLujo;
		Scanner sc = new Scanner(System.in);
		int tam = 4;
		int cantidad = 0;
		
		
		System.out.println("Bienvenido, en el siguiente programa vamos a generar un ticket de compra.");
		System.out.println("**************************************************************************");
		
		System.out.println("Introduzca el descuento que recibiran los productos que le quedan menos de dos dias para caducar:");
		aux=sc.nextLine();
		descuento=Double.parseDouble(aux);
		
		System.out.println("Introduzca el impuesto especial por Lujo:");
		aux=sc.nextLine();
		impuestoLujo=Double.parseDouble(aux);
		
		
		Producto [] lista = new Producto[tam];
		
		Venta v = new Venta(lista);
		Producto p = new Producto (12, "Alcachofa", 2);
		LineaDeVenta lv = new LineaDeVenta(p, cantidad);
		
		
		Producto a1 = new Alimentacion(20, "Aceite", 1, 2 );
		Producto a2 = new Alimentacion(10, "Salmon", 3, 5);
		
		Producto e1 = new Electronica(100, "Movil", 2);
		Producto e2 = new Electronica(500, "TV", 4);
		
		lv.addProduct(lista, a1);
		lv.addProduct(lista, a2);
		lv.addProduct(lista, e1);
		lv.addProduct(lista, e2);
		
		//System.out.println(v.calcularPrecioUnProducto(e1, impuestoLujo, descuento));
		
		//System.out.println(v.calcularPrecioUnProducto(a1, impuestoLujo, descuento));
		
		System.out.println("***************************************************************");
		
		v.mostrarCabeceraTicket();
		System.out.println("***************************************************************");
		
		v.mostrarTicket(impuestoLujo, descuento);
		
		System.out.println("*****************************************************************");
		
		v.mostrarTotal(lv, impuestoLujo, descuento);
		
		
	}

}
