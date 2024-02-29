package ejercicio06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import ejercicio05.ComparaPorNombre;
import ejercicio05.Persona;


public class Principal {

	public static void main(String[] args) {
		
		int op;
		String aux;
		Scanner sc = new Scanner(System.in);
		
		List<Trabajador> lista = new ArrayList<Trabajador>();
		
		lista.add(new Trabajador("Alvaro", "123456789K", 24, 1200));
		lista.add(new Trabajador("Carlos", "987456123Z", 8, 800));
		lista.add(new Trabajador("Angel", "456789213Y", 10, 1000));
		lista.add(new Trabajador("Manuel", "456789213G", 20, 1100));
		lista.add(new Trabajador("Manuel", "456789213G", 20, 100));


		
		System.out.println("\tBienvenido al programa de ordenar trabajadores :)");
		System.out.println("*******************************************************************");
		System.out.println();

		for (Trabajador t : lista) {
			System.out.println(t);
		}
		
		do {
			System.out.println("********************************************");
			System.out.println("""
					0-Salir.
					1-Ordenar por horas Trabajadas.
					2-Ordenado por horas trabajadas.
					3-Ordenador por horas y sueldo.
					""");
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch(op) {
				case 1:
					System.out.println("Ordenado por horas");
					
					Collections.sort(lista, new ComparaPorHoras());
					System.out.println();
					for (Trabajador t  : lista) {
						System.out.println(t);
					}
					break;
				case 2:
					System.out.println("Ordenado por sueldo:");
					Collections.sort(lista);
					
					for (Trabajador t : lista) {
						System.out.println(t);
					}
					break;
			}
		}while(op!=0);
	}

}
