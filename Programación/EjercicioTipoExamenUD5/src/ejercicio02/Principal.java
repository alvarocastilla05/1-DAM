package ejercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		/*Gestionaremos una empresa de alquileres de trasteros. Tendremos la clase Trastero cuyas características son la capacidad
		en metros cuadrados, dirección (String con la calle), número de trastero, precio y si está ocupado o no.
		Crear también una clase Oficina donde tendremos como atributo una lista de trasteros de tipo List y donde se tendrá
		métodos para hacer realizar las siguientes funcionalidades (no todas tienen que coincidir con un método):
			• Añadir un nuevo trastero al final de la lista con los datos leídos por teclado.
			• Buscar un trastero por precio.
			• Buscar un trastero por número devolviendo el trastero en cuestión.
			• Buscar al trastero más caro, es decir, el de precio mayor.
			• Eliminar un trastero.
			• Modificar un trastero elegido por el usuario, modificando únicamente su precio.
			• Ordenar la lista de trasteros por número (orden natural) y por precio (orden no natural) de mayor a menor.
			• Mostrar usando for each solo los trasteros no ocupados.
		Crear una clase principal con un menú donde se puedan comprobar las funcionalidades del programa, pudiéndose repetir
		el mismo hasta que el usuario decida.
		Se pueden agregar al comienzo algunos objetos a la colección para tener elementos de prueba o un método que cargue la
		lista con varios elementos*/
		
		String aux;
		int op;
		double metros2;
		String direccion;
		int numTrastero;
		boolean ocupado;
		double precio;
		Scanner sc = new Scanner(System.in);
		
		List<Trastero> lista = new ArrayList<Trastero>();
		
		Oficina o = new Oficina(lista);
		
		lista.add(new Trastero(100, "Condes del Bustillo", 1, 10, true));
		lista.add(new Trastero(80, "Antonio Guerra Gonzalez", 2, 20, false));
		lista.add(new Trastero(500, "Carretera de Carmona", 3, 10, true));
		lista.add(new Trastero(200, "Calle Merinos", 4, 15, false));
		
		System.out.println("Bienvenido a la gestión de alquiler de trasteros.");
		System.out.println("-".repeat(100));
		
		do {
			System.out.println("""
					0-Salir.
					1-Añadir trastero.
					2-Buscar por precio.
					3-Buscar por número de trastero.
					4-Buscar el trastero de mayor precio.
					5-Eliminar trastero.
					6-Modificar precio de trastero.
					7-Ordenar por número de trastero y por precio. 
					8-Mostrar trasteros no ocupados. 
					""");
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch(op) {
				case 1:
					System.out.println("Introduzca los metros cuadrados del trastero:");
					aux=sc.nextLine();
					metros2=Double.parseDouble(aux);
					
					System.out.println("Inroduzca la direccion del trastero:");
					direccion=sc.nextLine();
					
					System.out.println("Introduzca el número del trastero:");
					aux=sc.nextLine();
					numTrastero=Integer.parseInt(aux);
					
					System.out.println("Introduzca el precio del trastero:");
					aux=sc.nextLine();
					precio=Double.parseDouble(aux);
					
					
					System.out.println("Introduzca 1 si esta ocupado, 2 sino lo está:");
					switch(op1) {
					
					}
					
					
					o.addTrastero(new Trastero(metros2, direccion, numTrastero, precio,ocupado));
					break;
			}
		}while(op!=0);
		
		
		

	}

}
