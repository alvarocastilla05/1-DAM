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
		int op3;
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
			System.out.println("2-Opciones Operario");
			System.out.println("-----------------------");
			
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch(op) {
			
				case 1:
					System.out.println("¿Cuántos tickets desea comprar?");
					aux=sc.nextLine();
					cantBilletes=Integer.parseInt(aux);
					
					System.out.println("Introduzca dinero:");
					aux=sc.nextLine();
					dinEntregado=Double.parseDouble(aux);
					
					t.calcularPrecio(precioTicket, cantBilletes);
					
					if(t.calcularPrecio(precioTicket, cantBilletes)>dinEntregado) {
						System.out.println("No tiene dinero suficiente ");
					}
					t.mostrarPrecio(t.calcularPrecio(precioTicket, cantBilletes));
					
					do {
						System.out.println("  ");
						System.out.println("**********************");
						System.out.println("1-Cambio a devolver");
						System.out.println("2-Imprimir billete");
						System.out.println("0-Volver");
						System.out.println("**********************");
						
						aux=sc.nextLine();
						op2=Integer.parseInt(aux);
						
						switch(op2) {
						
							case 1:
								if(t.calcularPrecio(precioTicket, cantBilletes)<dinEntregado) {
									t.mostrarDev(t.calcularDev(precioTicket, dinEntregado));
								}else {
									System.out.println("No le corresponde devolución");
								}
								break;
							case 2: 
								t.imprimirTicket(t.calcularDev(precioTicket, dinEntregado),t.calcularPrecio(precioTicket, cantBilletes), precioTicket, cantBilletes, fecha);
								break;
							case 0:
								System.out.println("  ");
								break;
							default:
								System.out.println("Opción no válida");
						
						}
						
						
						
					}while(op2!=0);
					
					break;
				case 2:
					do {
						System.out.println("-----------------------");
						System.out.println("0-Volver al menú principal");
						System.out.println("1-Saldo total.");
						System.out.println("2-Reiniciar Saldo");
						System.out.println("3-Modificar precio Tickets");
						System.out.println("-----------------------");
						
						aux=sc.nextLine();
						op3=Integer.parseInt(aux);
						
						switch (op3) {
							case 1:
						}
						
					}while(op3!=0);
				case 0:
					System.out.println("Gracias por utilizar este programa :)");
					break;
				default:
					System.out.println("Opción no válida.");
			}
			
			
			
			
			
		}while(op!=0);
		
		
	}

}
