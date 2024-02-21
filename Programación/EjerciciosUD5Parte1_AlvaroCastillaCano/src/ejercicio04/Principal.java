package ejercicio04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String aux;
		int op;
		String telefono;
		String nombre;
		String nombreNuevo;
		Scanner sc = new Scanner(System.in);
		
		
		
		Contacto c1 = new Contacto("Alvaro", "675314070");
		Contacto c2 = new Contacto("Angel", "659883212");
		Contacto c3 = new Contacto("Lucas", "611905014");
		
		Map<Contacto, String> agenda = new HashMap<Contacto, String>();
		CrudContacto cr = new CrudContacto(agenda);
		
		agenda.put(c1, "675314070");
		agenda.put(c2,"659883212");
		agenda.put(c3, "611905014");
		
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
					telefono=sc.nextLine();
					
					System.out.println("Indique el nombre del contacto");
					nombre=sc.nextLine();
					
					Contacto c = new Contacto(nombre, telefono);
					
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
					
				case 4:
					System.out.println("Introduzca el nombre del contacto que busca:");
					nombre=sc.nextLine();
					
					System.out.println(cr.findByNombreV2(nombre));
					
					break;
				case 5:
					System.out.println("Introduzca el nombre del contacto que desea modificar:");
					nombre = sc.nextLine();
					
					System.out.println("Introduzca el nuevo nombre:");
					nombreNuevo = sc.nextLine();
					
					cr.modificarContacto(nombre, nombreNuevo);
					
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
