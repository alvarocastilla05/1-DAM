package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String aux;
		Scanner sc = new Scanner(System.in);
		
		int tam = 100;
		int anyo;
		
		Publicaciones l1 = new Libro ("Hola", "Donato", "nose", 2005, true, "65465");
		Publicaciones r1 = new Revista("El dandy", "Angel", "nocenoce", 2023, true, 5);
		Publicaciones l2 = new Libro("Programacion", "Paco", "eureka", 2023, false, "456");
		Publicaciones r2 = new Revista("Mujer", "Mario", "nocenoce", 2005, false, 2);
		
		Publicaciones [] lista = new Publicaciones[tam];
		
		lista[0]=l1;
		lista[1]=r1;
		lista[2]=l2;
		lista[3]=r2;
	}

}
