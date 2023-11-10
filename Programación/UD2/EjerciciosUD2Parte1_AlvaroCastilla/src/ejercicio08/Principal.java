package ejercicio08;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Declarar variables.
		String nombreUs;
		String contra;
		String nombreUsuario;
		String contraUs;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca el nombre de usuario que desee:");
		nombreUsuario=sc.nextLine();
		
		System.out.println("Introduzca la contraseña que desee:");
		contraUs=sc.nextLine();
		
		
		System.out.println("Bienvenido en el siguiente programa vamos a iniciar sesión");
		System.out.println("**************************************************************************************************");
		System.out.println("  ");
		
		System.out.println("Introduzca nombre de usuario:");
		nombreUs=sc.nextLine();
		
		System.out.println("Introduzca contraseña:");
		contra=sc.nextLine();
		
		if (nombreUs.equals (nombreUsuario) && contra.equals(contraUs)) {
			System.out.println("Acceso correcto.");
		}else {
			System.out.println("Contraseña o usuario incorrecto.");
		}
		System.out.println("Gracias por utilizar este programa :)");
	}

}
