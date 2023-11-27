package ejercicio11;

import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int desde, hasta, pos;
		double notaNueva;
		int tam;
		int op;
		String aux;
		Scanner sc=new Scanner(System.in);
		double [] notas;
		GestionNotas g=new GestionNotas();
		
		System.out.println("Introduzca el número de asignaturas:");
		aux=sc.nextLine();
		tam=Integer.parseInt(aux);
		notas = new double [tam];
		
		
		System.out.println("Introduzca nota mínima:");
		aux=sc.nextLine();
		desde=Integer.parseInt(aux);
		
		System.out.println("Introduzca máxima nota:");
		aux=sc.nextLine();
		hasta=Integer.parseInt(aux);
		
		do {
			
			System.out.println("---------------------");
			System.out.println("0-Salir.");
			System.out.println("1-Mostrar notas.");
			System.out.println("2-Modificar notas.");
			System.out.println("3-Número de suspensos.");
			System.out.println("4-Calcular nota media.");
			System.out.println("-----------------------");
			
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch (op) {
				case 1:
					g.generarNotas(hasta, desde, notas);
					g.mostrarNotas(notas);
					break;
				case 2:
					System.out.println("Diga que nota desea modificar:");
					aux=sc.nextLine();
					pos=Integer.parseInt(aux)-1;
					
					System.out.println("Introduzca la nueva nota:");
					aux=sc.nextLine();
					notaNueva=Double.parseDouble(aux);
					
					g.modificarNotas(notas, pos, notaNueva);
					g.mostrarNuevasNotas(notas);
					break;
				case 3:
					g.mostrarSuspensos(g.contarSuspensos(notas));
					break;
				case 4:
					g.mostrarMedia(g.calcularMedia(notas, tam));
					break;
				case 0:
					System.out.println("Gracias por utilizar este programa :)");
					break;
				default:
					System.out.println("Opcion no valida");
					break;
			}
			
			
		}while(op!=0);
		
	}

}
