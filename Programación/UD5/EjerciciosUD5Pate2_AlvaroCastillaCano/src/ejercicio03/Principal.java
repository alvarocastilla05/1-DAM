package ejercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String aux;
		int op;
		String nombre;
		String autor;
		
		
		Scanner sc = new Scanner(System.in);
		
		List<Cancion> lista = new ArrayList<Cancion>();
		
		lista.add(new Cancion("Caminando Por la Vida", "Melendi", 3.5, "Pop"));
		lista.add(new Cancion("Tu Jardin con Enanitos", "Melendi", 3, "Pop"));
		lista.add(new Cancion("Yonaguni", "Bad Bunny", 3.28, "Reggeaton"));
		lista.add(new Cancion("Amorfoda", "Bad Bunny", 2.57, "Trap"));
		
		Playlist p = new Playlist(lista);
		
		System.out.println("Bienvenido a mi programa de gestión de canciones :)");
		System.out.println("-".repeat(100));
		
		do {
			System.out.println("""
					0-Salir.
					1-Buscar por nombre.
					2-Buscar por autor.
					3-Buscar por duracion.
					4-Buscar por género.
					""");
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch(op) {
				case 0:
					System.out.println("Gracias por utilizar este programa :)");
					break;
				case 1:
					System.out.println("Introduzca el nombre de la canción que busca:");
					nombre = sc.nextLine();
					
					System.out.println(p.findByNombre(nombre));
					break;
				case 2:
					System.out.println("Introduzca el nombre del autor:");
					autor=sc.nextLine();
					
					System.out.println(p.findByAutor(autor));
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				default:
					
					break;
				
			}
		}while(op!=0);

	}

}
