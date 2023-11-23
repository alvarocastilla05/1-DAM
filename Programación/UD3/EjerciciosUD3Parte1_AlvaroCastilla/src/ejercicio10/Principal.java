package ejercicio10;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precioTicket;
		String fecha;
		String contraseña;
		int cantBilletes;
		double dinEntregado;
		double cambio;
		
		int op;
		int op2;
		String aux;
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Introduzca el precio del ticket: ");
		aux=sc.nextLine();
		precioTicket=Double.parseDouble(aux);
		
		System.out.println("Introduzca la fecha de hoy: ");
		fecha=sc.nextLine();
		
		Ticket t = new Ticket (precioTicket, fecha);
		
		
		
		
		do {
			System.out.println("-----------------------");
			System.out.println("0-Salir");
			System.out.println("1-Comprar Tickets");
			System.out.println("2-Cambio a devolver");
			System.out.println("3-Imprimir billete");
			System.out.println("4-Opciones Operario");
			System.out.println("-----------------------");
			
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
		}while(op!=0);
		
		
	}

}
