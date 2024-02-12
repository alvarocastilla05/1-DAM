package ejercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int id;
		String aux;
		Scanner sc = new Scanner(System.in);
		double cuotaNueva;
		
		List <Socio> lista = new ArrayList <Socio>();
		
		
		
		lista.add(new Socio(1, "Alvaro", 25.5));
		lista.add(new Socio(2, "Lucas", 50));
		lista.add(new Socio(3, "Juan Carlos", 30));
		
		CRUDSocio cr = new CRUDSocio(lista);
		
		
		System.out.println("Bienvenido a mi programa donde vamos a gestionar los socios de un club");
		System.out.println("**************************************************************************");
		
		cr.mostrarLista();
		
		System.out.println("**************************************************************************");

		System.out.println("Introduzca el ID del socio que busca:");
		aux=sc.nextLine();
		id=Integer.parseInt(aux);
		
		System.out.println(cr.findById(id));
		System.out.println("***************************************************************************");
		
		System.out.println("Introduzca el id del socio que desea eliminar:");
		aux=sc.nextLine();
		id=Integer.parseInt(aux);
		
		cr.deleteSocio(id);
		cr.mostrarLista();
		
		System.out.println("****************************************************************************");
		
		System.out.println("Introduzca la cuota nueva:");
		aux=sc.nextLine();
		cuotaNueva=Double.parseDouble(aux);
		
		cr.modificarSocio(id, cuotaNueva);
		
		cr.mostrarLista();
		
		
	}

}
