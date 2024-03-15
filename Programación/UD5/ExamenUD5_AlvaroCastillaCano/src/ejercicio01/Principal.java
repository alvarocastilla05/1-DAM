package ejercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String aux;
		int op;
		int dorsal;
		String nuevaPosicion;
		
		Scanner sc = new Scanner(System.in);
		
		List<Jugador> lista = new ArrayList<Jugador>();
		
		lista.add(new Jugador("Alvaro", "Delantero", 7, 5, true));
		lista.add(new Jugador("Carlos", "Defensa", 3, 2, false));
		lista.add(new Jugador("Messi", "Delantero", 10, 91, true));
		lista.add(new Jugador("Ter Stegen", "Portero", 1, 0, true));
		lista.add(new Jugador("Oblak", "Portero", 13, 0, true));


		
		Equipo e = new Equipo("FC Barcelona", lista);
		
		System.out.println("Bienvenido a mi programa de gestión de un equipo de futbol");
		System.out.println("-".repeat(100));
		
		do {
			System.out.println("-".repeat(100));
			System.out.println("""
					0-Salir.
					1-Buscar jugadores sin goles.
					2-Buscar por número de la camiseta.
					3-Calcular media de goles de todos los jugadores.
					4-Modificar posición de un jugador.
					5-Mostrar con Iterator.
					6-Ordenar por posición.
					7-Ordenar por goles.
					""");
			System.out.println("-".repeat(100));

			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch(op) {
				case 1:
					 System.out.println(e.findByGoles()); 
					break;
				case 2:
					System.out.println("Indique el dorsal del jugador que busca:");
					aux=sc.nextLine();
					dorsal=Integer.parseInt(aux);
					
					if(e.findByNumero(dorsal)!=null) {
						System.out.println(e.findByNumero(dorsal));
					}else {
						System.out.println("No existe ese jugador");
					}
					
					break;
				case 3:
					System.out.println(e.calcularMediaGoles());
					break;
				case 4:
					System.out.println("Indica el dorsal del jugador que desea modificar:");
					aux=sc.nextLine();
					dorsal=Integer.parseInt(aux);
					
					System.out.println("Introduzca su nueva posición:");
					nuevaPosicion=sc.nextLine();
					
					if(e.findByNumero(dorsal)!=null) {
						e.modifyPosicion(e.findByNumero(dorsal), nuevaPosicion);
					}else {
						System.out.println("No existe ese jugador");
					}
					break;
				case 5:
					e.mostrarJugadores();
					break;
				case 6:
					System.out.println("Ordenado por posición:");
					Collections.sort(lista);
					
					e.mostrarJugadores();
					break;
				case 7:
					System.out.println("Ordenado por número de goles:");
					
					Collections.sort(lista, new ComparaPorGoles());
					
					e.mostrarJugadores();
					break;
				case 0:
					System.out.println("Gracias por utilizar este programa :)");
					break;
				default:
					System.out.println("Opción no válida");
					break;
					
			}
			
			
		}while(op!=0);
	}

}
