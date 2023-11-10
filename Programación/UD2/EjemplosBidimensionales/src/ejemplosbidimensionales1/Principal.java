package ejemplosbidimensionales1;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Arrays Bidimensionales.
		//Primer corchete siempre es el número de filas, y el segundo es el número de columnas.
		
		int fil, col;
		int [][] lista;
		String aux;
		int desde, hasta;
		
		
		Random rnd=new Random(System.nanoTime());
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca número de filas:");
		aux=sc.nextLine();
		fil=Integer.parseInt(aux);
		
		System.out.println("Introduzca número de columnas:");
		aux=sc.nextLine();
		col=Integer.parseInt(aux);
		
		lista=new int [fil][col];
		
		//El primer for nos moverá por filas y el segundo por columnas.
		
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista[i].length; j++) {
				lista[i][j]=5;
			}
			
		}
		
		//Mostrar en forma de tabla.
		
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista[i].length; j++) {
				System.out.print(lista[i][j]+"\t\t");	
			}
			System.out.println();
		}
		
		//rellenar con aleatorio.
		
		System.out.println("Introduzca desde:");
		aux=sc.nextLine();
		desde=Integer.parseInt(aux);
		
		System.out.println("Introduzca hasta:");
		aux=sc.nextLine();
		hasta=Integer.parseInt(aux);
		
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista.length; j++) {
				lista[i][j]=rnd.nextInt(hasta-desde+1)+desde;
			}
		}
		
		//Mostrar.
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista[i].length; j++) {
				System.out.print(lista[i][j]+"\t\t");
			}
			System.out.println();
		}
		
		

	}

}
