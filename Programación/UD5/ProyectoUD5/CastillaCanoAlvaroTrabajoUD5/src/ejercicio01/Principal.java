package ejercicio01;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	/*Crea una tienda de figuras, todas las figuras van a tener un precio base, y su precio final se calculará multiplicando este por su área.
	 *  Crea la tienda con record para así implementar una de las novedades de Java.
		Crea una clase Figura, que tan solo permita heredar a sus dos hijas y tenga un método para calcular el área. Crea dos 
		hijas de Figura (Cuadrado y Círculo). La clase Cuadrado debe de tener como atributo lado, y Círculo debe de tener como 
		atributo radio. El círculo tendrá un método que muestre el mensaje que desees.
		Debemos de crear un menú en el que tengamos las distinta opciones:
				Mostrar lista de figuras con aviso
				Un case donde se realice un sorteo y dependiendo del número obtenido obtenga una recompensa u otra (esta recompensa será de elección libre).
				Mostrar área de Círculo con un mensaje
*/


	public static void main(String[] args) {

		String aux;
		int op, ale;
		int desde = 0;
		int hasta = 10;
		int tam = 10;
		double precioBase = 10;
		double descuento;
		
		
		Random num=new Random(System.nanoTime());
		
		Scanner sc = new Scanner(System.in);
		
		Figura c1 = new Circulo(10, precioBase);
		Figura cu1 = new Cuadrado(5, precioBase);
		Figura c2 = new Circulo(5, precioBase);
		Figura cu2 = new Cuadrado(10, precioBase);
		
		Figura [] lista = new Figura[tam];
		
		lista[0]=c1;
		lista[1]=cu1;
		lista[3]=c2;
		lista[4]=cu2;
		
		TiendaFiguras t = new TiendaFiguras(lista);
		
		System.out.println("Bienvenido al programa de gestión de una tienda de figuras :)");
		System.out.println("-".repeat(100));
		
		do {
			System.out.println("""
					1-Mostrar lista con aviso
					2-Sorteooo!!
					3-Calcular area de un circulo con mensaje.
					""");
			System.out.println("-".repeat(100));

			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch(op) {
				case 1:
					t.mostrarListaConAviso();
					System.out.println(cu1.calcularArea());
					break;
				case 2:
					/*Aquí tenemos el switch mejorado en el cuál dependiendo del número aleatorio que salga devuelve un valor u otro*/
					for (int i=0; i<1; i++) {
						ale=num.nextInt(hasta-desde+1)+desde;
						descuento=switch(ale) {
						case 1,2,3,4,5->{
							descuento = cu1.calcularArea()/80;
							yield descuento;
						}
						case 6,7,8,9,10 ->{
							descuento = cu1.calcularArea()/50;
							yield descuento;
						}
						default -> 0;
					};
					System.out.println("Oh has recibido un descuento del "+descuento+"%");
					System.out.println();
					System.out.println("El precio final es:");
					System.out.println(t.calcularPrecioFigura(precioBase, cu1)-(t.calcularPrecioFigura(precioBase, cu1)*descuento/100));
					}
					
					break;
				case 3:
					/*Como podemos ver, en este ejemplo de Pattern en switchs, comprueba de que tipo es la figura, y depende del tipo que sea
					 * mostrara una frase u otra*/
					 */
					String mensaje = switch (c1) {
					case Circulo c -> "Circulo con area de " + c.area();
					case Cuadrado cu -> "Cuadrado con area de" + cu.area();
					default -> "Figura desconocida";
					
					/*De sin usar String y double, ees un ejemplo para comprobar si de esta manera no da error*/
					double area2=switch(Figura f) {
					case Circulo c -> Math.PI*c.getRadio()*c.getRadio();
					case Cuadrado cu -> cu.getLado()*cu.getLado();
					default ->0;
					};
					break;
				case 0: 
					System.out.println("Gracias por utilizar este extraño programa");
					break;
				default:
					System.out.println("Opción no válida.");
						


			}
		}while(op!=0);
		
		
		
	}
	

}
