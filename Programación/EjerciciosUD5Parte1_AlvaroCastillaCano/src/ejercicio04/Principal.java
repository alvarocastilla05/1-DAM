package ejercicio04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String aux;
		int op, telefono;
		String nombre;
		String nombreNuevo;
		Scanner sc = new Scanner(System.in);
		
		
		
		Contacto c1 = new Contacto("Alvaro");
		Contacto c2 = new Contacto("Angel");
		Contacto c3 = new Contacto("Lucas");
		
		Map<Integer, Contacto> agenda = new HashMap<Integer, Contacto>();
		CrudContacto cr = new CrudContacto(agenda);
		
		agenda.put(675314070, c1);
		agenda.put(659883212, c2);
		agenda.put(611905014, c3);
		
		System.out.println("Bienvenido al programa de gestión de contactos.");
		System.out.println("**************************************************");
		
		do {
			System.out.println("""
					0-Salir.
					1-Agregar contacto.
					2-Borrar contacto.
					3-Mostrar contactos.
					4-Buscar contacto por nombre.
					5-Modificar nombre.
					""");
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch(op) {
				case 1:
					System.out.println("Indique el número de teléfono nuevo:");
					aux=sc.nextLine();
					telefono=Integer.parseInt(aux);
					
					System.out.println("Indique el nombre del contacto");
					nombre=sc.nextLine();
					
					Contacto c = new Contacto(nombre);
					
					cr.addContacto(telefono, c);
					
					System.out.println(agenda);
					break;
				case 2:
					System.out.println("Introduzca el nombre del contacto que desea eliminar:");
					nombre=sc.nextLine();
					
					cr.borrarContacto(nombre);
					
					System.out.println(agenda);
					
					break;
				case 3:
					System.out.println("Introduzca el nombre del contacto que desea modificar:");
					nombre = sc.nextLine();
					
					System.out.println("Introduzca el nuevo nombre:");
					nombreNuevo = sc.nextLine();
					
					break;
				case 4:
					System.out.println("Introduzca el nombre del contacto que busca:");
					nombre=sc.nextLine();
					
					System.out.println(cr.findByNombre(nombre));
					
					break;
				case 0:
					System.out.println("Gracias por utilizar este programa");
					break;
				default:
					System.out.println("Opción no válida");
					break;
						
			}
		}while(op!=0);
		
		
		
	}

}
