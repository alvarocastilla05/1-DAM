package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {


		String nombre;
		String aula;
		String fecha;
		String aux;
		Cabecera c1;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Diga su nombre: ");
		nombre=sc.nextLine();
		
		System.out.println("Diga su aula: ");
		aula=sc.nextLine();
		
		System.out.println("Dia fecha: ");
		fecha=sc.nextLine();
		
		c1=new Cabecera(nombre, aula, fecha);
		
		c1.mostrarDatos();
		
		
		
	}

}
