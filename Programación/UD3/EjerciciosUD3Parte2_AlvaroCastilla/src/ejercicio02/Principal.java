package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int contH = 0;
		boolean servicioLimp = false, ocupacion = false;
		int numD, limpieza, ocupado;
		String nombre;
		String tipo;
		double precio;
		int extras;
		String aux;
		int op;
		int op2;
		int tam;
		int pos;
		String nombreHot;
		Habitacion [] lista;
		Scanner sc=new Scanner(System.in);
		
		Habitacion h;
		
		
		System.out.println("Introduzca el nombre del hotel:");
		nombreHot=sc.nextLine();
		
		System.out.println("Diga cuantas habitaciones tiene el hotel: ");
		aux=sc.nextLine();
		tam=Integer.parseInt(aux);
		
		lista=new Habitacion [tam];
		
		Hotel hotel=new Hotel (lista, nombreHot);
		
		
		do {
			
			System.out.println("------------------------");
			System.out.println("0-Salir.");
			System.out.println("1-Añadir habitación.");
			System.out.println("--------------------------");
			
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch(op) {
			
				case 1: 
					System.out.println("Indique dónde quiere añadir la habitacion:");
					aux=sc.nextLine();
					pos=Integer.parseInt(aux);
					
					System.out.println("Indique tipo de la habitación:");
					tipo=sc.nextLine();
					
					System.out.println("Indique precio de la habitacion:");
					aux=sc.nextLine();
					precio=Double.parseDouble(aux);
					
					System.out.println("Indique extras:");
					aux=sc.nextLine();
					extras=Integer.parseInt(aux);
					
					System.out.println("Indique el nombre del cliente:");
					nombre=sc.nextLine();
					
					System.out.println("Indique el número de días:");
					aux=sc.nextLine();
					numD=Integer.parseInt(aux);
					
					System.out.println("Pulse 1 si esta limpio o 2 si está sucio:");
					aux=sc.nextLine();
					limpieza=Integer.parseInt(aux);
					if(limpieza==1) {
						servicioLimp=true;
					}
					if(limpieza==2) {
						servicioLimp=false;
					}
					
					System.out.println("Pulse 1 si está ocupado, 2 si no lo está:");
					aux=sc.nextLine();
					ocupado=Integer.parseInt(aux);
					if(ocupado==1) {
						ocupacion=true;
					}
				    if(ocupado==2) {
				    	ocupacion=false;
				    }
					
					h=new Habitacion(tipo, precio, extras, nombre, numD, servicioLimp, ocupacion);
				    
					hotel.add(new Habitacion(tipo, precio, extras, nombre, numD, servicioLimp, ocupacion), pos);
					contH++;
					
					h.mostrarHab(lista, contH, pos);
					do {
						System.out.println("------------------------");
						System.out.println("0-Salir.");
						System.out.println("2-Ver habitaciones disponibles.");
						System.out.println("3-Calcular precio final.");
						System.out.println("4-Mostra ticket.");
						System.out.println("--------------------------");
						
						aux=sc.nextLine();
						op2=Integer.parseInt(aux);
						
						
						switch(op2) {
						
							case 2:
								h.comprobarOcupacion(ocupacion, lista);
								break;
							case 3:
								
						}
						
					}while (op2!=0);
				
					
					
			}
			
			
			
			
		}while(op!=0);
		
	}

}
