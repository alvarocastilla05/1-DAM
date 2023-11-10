package ejemplo02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {


		Alumno a1;
		String aux;
		String nombre;
		double notaPro;
		double notaBD;
		double media;
		
		Scanner sc=new Scanner(System.in);
		
		//Instanciamos un objeto con valores.
		
		System.out.println("Diga nombre: ");
		nombre=sc.nextLine();
		System.out.println("Diga su nota de Programación:");
		aux=sc.nextLine();
		notaPro=Double.parseDouble(aux);
		System.out.println("Diga su nota de BD:");
		aux=sc.nextLine();
		notaBD=Double.parseDouble(aux);
		
		a1=new Alumno(nombre, notaPro, notaBD);
		
		media=a1.calcularMedia();
		
		a1.mostrarMedia(media);

	}

}
