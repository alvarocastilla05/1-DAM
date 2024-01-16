package repaso;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre;
		int dorsal;
		String apellidos;
		int categoria;
		double tiempo;
		int tam = 10;
		int op;
		
		Corredor c;
		int km=10;
		int numCorredor = 3;
		
		Corredor c1 = new Corredor("Alvaro", 1, "Castilla", 2, 20.2);
		Corredor c2 = new Corredor("Alvaro", 2, "Cano", 2, 5.2);
		Corredor c3 = new Corredor("Ines", 3, "Ruiz", 3, 25.2);
		dorsal=4;
		
		Corredor [] lista = new Corredor[tam];
		Carrera ca = new Carrera(lista, km, numCorredor);
		
		String aux;
		Scanner sc=new Scanner(System.in);
		
		ca.addCorredor(c1);
		ca.addCorredor(c2);
		ca.addCorredor(c3);
		
		System.out.println("Bienvenido, en el siguiente programa vamos a gestionar una carrera.");
		
		do {
			System.out.println("****************************");
			System.out.println("1-Añadir corredor.");
			System.out.println("2-Mostrar lista de corredores.");
			System.out.println("3-Calcular el tiempo en segundos de un corredor.");
			System.out.println("****************************");
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch(op) {
			
				case 1:
					System.out.println("Introduzca el nombre del corredor: ");
					nombre=sc.nextLine();
					
					System.out.println("Introduzca los apellidos del corredor:");
					apellidos=sc.nextLine();
					
					
					System.out.println("Introduzca la categoria del corredor(1-juvenil, 2-senior, 3-veterano)");
					aux=sc.nextLine();
					categoria=Integer.parseInt(aux);
					
					System.out.println("Introduzca el tiempo en minutos del corredor:");
					aux=sc.nextLine();
					tiempo=Double.parseDouble(aux);
					
					c=new Corredor(nombre, dorsal, apellidos, categoria, tiempo);
					dorsal++;
					ca.addCorredor(c);
					break;
				case 2:
					ca.mostrarLista(lista);
					break;
				case 3:
					System.out.println("Introduzca el dorsal del corredor que desea calcularle el tiempo en segundos");
					aux=sc.nextLine();
					dorsal=Integer.parseInt(aux);
					
					System.out.println(ca.calcularSeg(tiempo, ca.findByDorsal(dorsal)));
			}
		}while(op!=0);

		
		
		
		
	}

}
