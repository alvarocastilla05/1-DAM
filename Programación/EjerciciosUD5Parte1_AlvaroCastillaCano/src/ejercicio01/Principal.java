package ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String aux;
		Scanner sc = new Scanner(System.in);
		int id;
		String tituloNuevo;
		
		List <Nota> lista = new ArrayList <Nota>();
		
		lista.add(new Nota(1, "Mi Nota", "Ponme un 10"));
		lista.add(new Nota(2, "La nota", "Siempre dando la nota"));
		
		CrudNotas cr = new CrudNotas(lista);
		
		System.out.println(lista.get(0));
		System.out.println("****************");
		
		cr.imprimirLista();
		
		System.out.println("Introduzca el ID de la nota que desea eliminar:");
		aux=sc.nextLine();
		id = Integer.parseInt(aux);
		
		cr.deleteNota(id);
		
		cr.imprimirLista();
		
		System.out.println("**********************");
		
		System.out.println("Introduzca el id de la nota que desea modificar:");
		aux=sc.nextLine();
		id = Integer.parseInt(aux);
		
		System.out.println("Introduzca el nuevo título:");
		tituloNuevo = sc.nextLine();
		
		cr.modificarNota(id, lista, tituloNuevo);
		
		
		

	}

}
