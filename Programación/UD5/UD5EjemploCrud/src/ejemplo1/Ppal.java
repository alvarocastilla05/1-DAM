package ejemplo1;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// También se podría tener un método para agregar varios objetos y así cargar el
		// array directamente cuando comienza el programa

		Alumno alum1 = new Alumno("53353047Q", "Carlos Carlitos Carl");
		Alumno alum2 = new Alumno("11111111A", "Pepito Prevenciones García");
		Alumno alum3 = new Alumno("22222222B", "Benito Torres");

		List <Alumno> listado= new ArrayList<Alumno>();
		
		listado.add(alum1);
		listado.add(alum2);
		listado.add(alum3);
		
		Secretaria sec = new Secretaria(listado);

		String dni, nuevoNombre, nomAlum, dniTEMP;

		int opc;
		

		do {
			System.out.println(
					"================================================================================================================================");
			System.out.println("                                          BIENVENIDO A: GESTIÓN DE ALUMNOS");
			System.out.println(
					"================================================================================================================================");

			System.out.println("1) Agregar un alumno.\n");
			System.out.println("2) Mostrar todos los alumnos.\n");
			System.out.println("3) Mostrar un alumno.\n");
			System.out.println("4) Modificar alumno.\n");
			System.out.println("5) Borrar alumno.\n");
			System.out.println("0) SALIR DEL MENÚ.\n");

			opc = Leer.datoInt();

			switch (opc) {
			case 0:
				System.out.println("Adiós");
				break;
			case 1:
				System.out.println(
						"\n=================================== Agregar un alumno ===================================\n");

				System.out.print("Introduzca el nombre del alumno: ");
				nomAlum = Leer.dato();
				System.out.print("Introduzca el DNI del alumno: ");
				dni = Leer.dato();

				// sec.agregarAlum(new Alumno(dni, nomAlum));

				sec.mostrarErrorAgregar(sec.agregar2(new Alumno(dni, nomAlum)));

				break;
			case 2:
				System.out.println(
						"\n=================================== Mostrar alumnos ===================================\n");
				sec.imprimirLista();
				break;
			case 3:
				System.out.println(
						"\n=================================== Mostrar un alumno ===================================\n");
				System.out.print("Indique el dni del alumno que quiere mostrar: ");
				dniTEMP = Leer.dato();
				if (sec.buscarAlum(dniTEMP) < 0)
					System.out.println("\nNo encontrado");
				else
					System.out.println(sec.getListAlumnos().get(sec.buscarAlum(dniTEMP)));
				break;
			case 4:
				System.out.println(
						"\n=================================== Modificar alumno ===================================\n");
				sec.imprimirLista();
				System.out.print("Indique el dni del alumno que quiere modificar: ");
				dni = Leer.dato();
				System.out.println("Indique el nombre nuevo");
				nuevoNombre = Leer.dato();
				sec.modificarAlumno(dni, nuevoNombre);
				break;
			case 5:
				System.out.println(
						"\n=================================== Borrar alumno ===================================\n");
				System.out.print("Indique el dni del alumno que quiere modificar: ");
				sec.borrarAlumno(Leer.dato());
				break;
			default:
				System.out.println("\nERROR: número de opción fuera de rango. Inténtelo de nuevo.");
				break;
			}

		} while (opc!=0);
		
		System.out.println(
				"\n\n================================================================================================================================");
		System.out.println(
				"                                              GRACIAS POR USAR NUESTROS SERVICIOS. HASTA PRONTO");
		System.out.println(
				"================================================================================================================================");

	}

}
