package ejemploPasoPorReferencia;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int diaAct, mesAct;
		String aux;
		Fecha nacimiento = new Fecha(6, 11, 2005);
		Fecha contratacion = new Fecha (17, 10, 2004);
		Empleado empleado = new Empleado ("Álvaro", "Castilla", nacimiento,
				contratacion);
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(empleado);
		System.out.println("Qué día es hoy: ");
		aux=sc.nextLine();
		diaAct=Integer.parseInt(aux);
		
		System.out.println("¿Qué mes?");
		aux=sc.nextLine();
		mesAct=Integer.parseInt(aux);
		
		Fecha acutal = new Fecha (diaAct, mesAct);
		empleado.felicitarCumple(acutal);
		
		System.out.println(empleado);
		System.out.println("***************************");
		empleado.rejuvenecer(nacimiento);
		System.out.println(empleado);
		
		//Compara con el paso por copia
		/*
		int a=2;
		Numero miNumero= new Numero ();
		System.out.println(miNumero.modificar(a));//Cambia la copia, vale 6
		miNumero.mostrar(a);*///El a del main no ha cambiado, vale 2
		
		
	}

}
