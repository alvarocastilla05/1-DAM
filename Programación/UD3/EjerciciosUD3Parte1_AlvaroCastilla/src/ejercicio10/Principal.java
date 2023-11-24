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
		double saldoTotal;
		String contrasenia1 ;
		Ticket ticket = null;
		double precioN;
		
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
		
		
		System.out.println("Introduzca nueva contraseña:");
		contrasenia1=sc.nextLine();
		Máquina m= new Máquina (ticket, contrasenia1);
		
		
		
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
					
					System.out.println("Indique la cantidad que va a abonar:");
					aux=sc.nextLine();
					dinEntregado=Double.parseDouble(aux);
					
					m.calcularPrecio(precioTicket, cantBilletes);
					
					if(m.calcularPrecio(precioTicket, cantBilletes)>dinEntregado) {
						System.out.println("No tiene dinero suficiente ");
					}
					m.mostrarPrecio(m.calcularPrecio(precioTicket, cantBilletes));
					
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
								if(m.calcularPrecio(precioTicket, cantBilletes)<dinEntregado) {
									m.mostrarDev(m.calcularDev(precioTicket, dinEntregado));
								}else {
									System.out.println("No le corresponde devolución");
								}
								break;
							case 2: 
								t.imprimirTicket(m.calcularDev(precioTicket, dinEntregado),m.calcularPrecio( precioTicket, cantBilletes), precioTicket, cantBilletes, fecha);
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
					
					if(contrasenia1.equals(contrasenia1))
					
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
								
								break;
							case 2:
								System.out.println("Introduzca el precio nuevo:");
								aux=sc.nextLine();
								precioN=Double.parseDouble(aux);
								
								m.cambiarPrecio(precioN);
								break;
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
