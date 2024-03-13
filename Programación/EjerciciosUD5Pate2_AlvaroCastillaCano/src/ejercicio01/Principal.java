package ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {


		int op;
		String aux;
		String nombre;
		String letra;
		
		Scanner sc = new Scanner(System.in);
		
		List<Alumno> lista = new ArrayList<Alumno>();
		
		lista.add(new Alumno("Alvaro", "Castilla", "DAM", 8, 18));
		lista.add(new Alumno("Lucas", "Falla", "DAM", 7.5, 18));
		lista.add(new Alumno("Alberto", "Rodriguez", "ESO", 8, 18));
		lista.add(new Alumno("Angel", "Naranjo", "Primaria", 10, 10));
		lista.add(new Alumno("Francisco Manuel", "Sanchez", "Infantil", 10, 5));
		
		Secretaria s = new Secretaria(lista);
		
		System.out.println("Bienvenido a al gestion de alumnos de un colegio");
		System.out.println("-".repeat(100));
		
		do {
			System.out.println("""
					0-Salir.
					1-Obtener alumno por nombre (con filter).
					2-Mostrar todos los alumnos con foreach.
					3-Imprimir alumnos que comiencen por la letra indicada.
					4-Dar tamaño a la lista con count.
					5-Obtener alumnos con nota media superior a 9.
					6-Imprimir los 3 primeros alumnos.
					7-Obtener menor de edad.
					8-Obtener primer alumno.
					9-Obtener lista con alumnos con nombre con más de 10 caracteres.
					10-Obtener alumnos cuyo nombre comience por la A y su nombre sea menor o igual a 6.
					""");
			System.out.println("-".repeat(100));
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch(op) {
				case 1: 
					System.out.println("Introduzca el nombre del alumno que busca:");
					nombre = sc.nextLine();
					
					System.out.println(s.obtenerAlumnos(nombre)); 
					break;
				case 2:
					s.mostrarLista();
					break;
				case 3:
					System.out.println("Indica la letra por la que debe de comenzar el nombre");
					letra= sc.nextLine();
					
					System.out.println(s.filtrarPorLetra(letra));
					break;
				case 4:
					System.out.println(s.darTamanio());
					break;
				case 5:
					System.out.println(s.mostrarNotaMediaAlta());
					break;
				case 6:
					s.mostrarTresPrimeros();
					break;
				case 7:
					System.out.println(s.buscarMenorEdad());
					break;
				case 8:
					System.out.println(s.obtenerPrimerAlumno()); 
					break;
				case 9:
					System.out.println(s.obtenerNombre10());
					break;
				case 10:
					System.out.println(s.mostrarNombreConCondiciones());
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
