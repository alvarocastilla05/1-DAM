package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int pin;
		String letraPin;
		String aux;
		double dineroRetirado;
		double dineroIngresado;
		boolean salir = false;
		
		Tarjeta t = new Tarjeta(1000);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido al programa donde vamos gestionar la tarjeta de un banco.");
		System.out.println("-".repeat(100));
		
		do {
			try {
				
				//Retirar Dinero
				System.out.println("Introduzca la cantidad de dinero que desea retirar:");
				aux=sc.nextLine();
				dineroRetirado=Double.parseDouble(aux);
				
				System.out.println("Se ha retirado"+dineroRetirado+" y le quedan "+t.retirarDinero(dineroRetirado));
				
				//Ingresar Dinero.
				System.out.println("Introduzca la cantidad de dinero que desea ingresar:");
				aux=sc.nextLine();
				dineroIngresado=Double.parseDouble(aux);
				
				System.out.println("Se ha ingresado "+dineroIngresado+" y le quedan "+t.ingresarDinero(dineroIngresado));
				
				//Comprobar PIN
				System.out.println("Introduzca el PIN de la tarjeta:");
				aux=sc.nextLine();
				pin=Integer.parseInt(aux);
				
				System.out.println("Introduzca la letra del PIN");
				letraPin=sc.nextLine();
				
				t.comprobarPin(pin, letraPin);
				salir =false;
				
				
			}catch(ExcepcionDineroInsuficiente e) {
				System.err.println(e.getMessage());
				salir = true;
			}catch(ExcepcionDineroNegativo e) {
				System.err.println(e.getMessage());
				salir = true;
			}catch(ExcepcionPin e) {
				System.err.println(e.getMessage());
				salir = true;
			}
			catch(Exception e) {
				System.err.println("Error inesperado");
				salir = true;
			}
		}while(salir);
		
		
		

	}

}
