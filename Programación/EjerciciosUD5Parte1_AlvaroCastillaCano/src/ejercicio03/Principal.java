package ejercicio03;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
	
		String aux;
		int op;
		int id;
		double notaMediaNueva;
		Scanner sc = new Scanner(System.in);
		Set<Alumno> lista = new HashSet <> ();
		
		CrudAlumno cr = new CrudAlumno(lista);
		CentroEducativo ce = new CentroEducativo("Colegio", cr);
		
		
		cr.addAlumno(new Alumno(1, "Alvaro", 18, 8.5));
		cr.addAlumno(new Alumno(2, "Lucas", 18, 9));
		cr.addAlumno(new Alumno(3, "Carlos", 19, 7));

		System.out.println("Bienvenido al programa de gestión de alumnos");
		do {
			System.out.println("""
					1-Buscar un alumno.
					2-Eliminar alumno.
					3-Modificar alumno
					""");
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch(op) {
				case 1:
					ce.mostrarLista();
					System.out.println("**************************************");
					
					System.out.println("Introduzca el id del alumno que busca:");
					aux=sc.nextLine();
					id=Integer.parseInt(aux);
					
					System.out.println(cr.findById(id));
					
					break;
				case 2: 
					ce.mostrarLista();
					System.out.println("**************************************");
					
					System.out.println("Introduzca el id del alumno que desea eliminar:");
					aux=sc.nextLine();
					id=Integer.parseInt(aux);
					
					cr.eliminarAlumno(id);
					ce.mostrarLista();
					break;
				case 3:
					ce.mostrarLista();
					System.out.println("**************************************");
					
					System.out.println("Introduzca el id del alumno que desea modificar:");
					aux=sc.nextLine();
					id=Integer.parseInt(aux);
					
					System.out.println("Introduzca su nueva nota media:");
					aux=sc.nextLine();
					notaMediaNueva=Double.parseDouble(aux);
					
					cr.modificarAlumno(id, notaMediaNueva);
					
					ce.mostrarLista();
			}
		}while(op!=0);
	}

}
