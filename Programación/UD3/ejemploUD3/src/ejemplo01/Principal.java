package ejemplo01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Programación Orientada a Objetos.
		
		String aux;
		String nombre;
		int edad;
		double notaMedia;
		String calle;
		Alumno a1;
		
		
		Scanner sc=new Scanner(System.in);
		
		//Instanciamos un objeto con valores.
		
		
		System.out.println("Diga el nombre: ");
		nombre=sc.nextLine();
		
		System.out.println("Diga edad: ");
		aux=sc.nextLine();
		edad=Integer.parseInt(aux);
		
		System.out.println("Diga nota media:");
		aux=sc.nextLine();
		notaMedia=Double.parseDouble(aux);
		
		System.out.println("Diga su dirección: ");
		calle=sc.nextLine();
		
		 a1=new Alumno(nombre, edad, notaMedia);
		
		 System.out.println(a1.edad);
		
		 a1.mostrarDatos(calle);
		
		
		}
	

}
