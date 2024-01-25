package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {


		String aux;
		Scanner sc = new Scanner(System.in);
		double porcentajeGanancias = 50;
		double fijoEspadaDoble = 10;
		int cantidadProductos;
		int tam = 10;
		double dineroEntregado;
		int cantidadBuscada;
		
		Producto m1 = new Moviles(50, 1, "iPhone 15 Pro Max", true);
		Producto m2 = new Moviles(100, 2, "Xiaomi Redmi note 11 pro", false);
		Producto m3 = new Moviles(200, 3, "iPhone 12 Pro ", false);
		
		Producto el1 = new EspadaLaser(10, 4, "Espada de Luke Skywalker", false, "simple");
		Producto el2 = new EspadaLaser(20, 5, "Espada de Darth Vader", false, "simple");
		Producto el3 = new EspadaLaser(30, 6, "Espada de Darth Maul", true, "doble");
		cantidadProductos = 6;
		cantidadProductos++;
			
		Producto [] lista = new Producto[tam];
		
		lista[0]=m1;
		lista[1]=m2;
		lista[2]=m3;
		lista[3]=el1;
		lista[4]=el2;
		lista[5]=el3;
		
		
		Ventas v = new Ventas(lista, cantidadProductos);
		
		//Mostrar vendidos
		System.out.println(v.mostrarNumeroVendidos());
		
		//Calculo de precios
		System.out.println(m1.calcularPVP(porcentajeGanancias, fijoEspadaDoble));
		System.out.println(v.calcularPrecioUnProducto(m1, porcentajeGanancias, fijoEspadaDoble));
		System.out.println(v.calcularPrecioUnProducto(el3, porcentajeGanancias, fijoEspadaDoble));
		System.out.println(v.calcularDineroRecaudado(porcentajeGanancias, fijoEspadaDoble));
		
		
		//Calculo de devolucion
		System.out.println("Se debe de entregar "+v.calcularDineroRecaudado(porcentajeGanancias, fijoEspadaDoble)+" €");
		
		aux=sc.nextLine();
		dineroEntregado=Double.parseDouble(aux);
		
		if(v.calcularDineroRecaudado(porcentajeGanancias, fijoEspadaDoble)>dineroEntregado) {
			System.out.println("Dinero Insuficiente");
		}else {
			System.out.println("La devolución es de "+v.calcularDevolucion(dineroEntregado, porcentajeGanancias, fijoEspadaDoble));
		}
		
		v.mostrarListaConAvisos();
		
		System.out.println("Indique el producto que busca:");
		aux=sc.nextLine();
		cantidadBuscada=Integer.parseInt(aux);
		
		System.out.println(v.findByCantidad(cantidadBuscada));
		
	}

}
