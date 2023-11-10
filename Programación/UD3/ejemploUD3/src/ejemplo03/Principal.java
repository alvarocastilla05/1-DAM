package ejemplo03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre;
		String aux;
		double precio, precioNuevo;
		int numeroRuedas;
		Vehiculo v;
		
		//Vendedor.
		Vendedor v1=new Vendedor("Alvaro", 120.00, 2);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Diga nombre: ");
		nombre=sc.nextLine();
		
		System.out.println("Diga precio:");
		aux=sc.nextLine();
		precio=Double.parseDouble(aux);
		
		System.out.println("Diga número de ruedas:");
		aux=sc.nextLine();
		numeroRuedas=Integer.parseInt(aux);
		
		 v=new Vehiculo(nombre, precio, numeroRuedas);
		 
		//Mostar.
		 
		 System.out.println(v.getNombre());
		 
		 System.out.println(v.getPrecio());
		 
		 //Modificar.
		System.out.println("Diga nuevo precio");
		aux=sc.nextLine();
		precioNuevo=Double.parseDouble(aux);
		v.setPrecio(precioNuevo);
		
		System.out.printf("El nuevo precio es %.2f €\n", v.getPrecio());
		
		//Mostrar clase vendedor.
		System.out.println(v1);
		 
	}

}
