package ejercicio08;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {


		double saldo;
		String nombre;
		double ingreso;
		double retiro;
		double dolares = 0;
		double tasaEurDol;
		String aux;
		int op;
		CuentaCorriente c;
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido al progama de ingreso y retiro de dinero.");
		System.out.println("********************************************************");
		System.out.println("  ");
		
		System.out.println("Introduzca su nombre:");
		nombre=sc.nextLine();
		System.out.println("Indique su saldo:");
		aux=sc.nextLine();
		saldo=Double.parseDouble(aux);
		System.out.println("  ");
		
		c=new CuentaCorriente(saldo, nombre);
		
		do {
			System.out.println("-------------");
			System.out.println("0-Salir.");
			System.out.println("1-Ingresar Dinero.");
			System.out.println("2-Retirar Dinero.");
			System.out.println("3-Calcular dólares americanos.");
			System.out.println("4-Consultar el saldo.");
			System.out.println("-------------");
			
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch(op) {
				
				case 1:
					System.out.println("Ingrese la cantidad que desea ingresar:");
					aux=sc.nextLine();
					ingreso=Double.parseDouble(aux);
					
					c.ingresarCant(ingreso);
					break;
				case 2:
					System.out.println("Ingrese la cantidad que desea retirar:");
					aux=sc.nextLine();
					retiro=Double.parseDouble(aux);
					if (retiro > c.getSaldo()) {
						
						System.out.println("Dinero insuficiente");
					}else {
						c.retirarCant(retiro);
					}
					
					break;
				case 3:
					System.out.println("Introduzca a cuánto está el dolar:");
					aux=sc.nextLine();
					tasaEurDol=Double.parseDouble(aux);
					c.mostrarDolares(c.calcularDolares(tasaEurDol));
					break;
				case 4:
					c.mostrarSaldo();
					break;
				case 0:
					System.out.println("Gracias por utilizar este programa.");
					break;
				default:
					System.out.println("Opción no válida.");
					break;
						
			}
			
			
		}while(op!=0);
		
		

	}

}
