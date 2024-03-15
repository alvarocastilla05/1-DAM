package ejemploList3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		String dni;
		String aux;
		
		Scanner sc = new Scanner(System.in);
		
		List <Persona> lista = new ArrayList <Persona>();
		
		Persona p = new Persona ("Angel", 36, "123456789A");
		lista.add(p);
		lista.add(p);//Estos dos son el mismo objeto porque tienen el mismo new.
		
		lista.add(new Persona ("Alvaro", 18, "17477928K"));
		lista.add(new Persona("Angel", 36, "123456789A"));//Estos dos no son el mismo objetos porque son new diferentes
		lista.add(new Persona("Angel", 36, "123456789A"));
		
		CrudPersona cr = new CrudPersona(lista);
		
		System.out.println(lista);
		
		System.out.println(lista.get(0));
		
		System.out.println("*************************************************************");
		
		System.out.println("Introduzca el dni de la persona que busca:");
		dni = sc.nextLine();
		
		System.out.println(cr.findByDni(dni));
		System.out.println(cr.findByDniV2(dni));
		
		System.out.println("***************************************************************");
		
		cr.imprimirLista();
		System.out.println("******************");
		
		cr.deletePersona("123456789A"); //Este borrara el primer objeto que encuentre con ese DNI. 
		
		cr.imprimirLista();
		
		
		

	}

}
