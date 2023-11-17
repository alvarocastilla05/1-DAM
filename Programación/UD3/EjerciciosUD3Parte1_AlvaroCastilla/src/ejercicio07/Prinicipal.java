package ejercicio07;

import java.util.Scanner;

public class Prinicipal {

	public static void main(String[] args) {
		
		
		int hasta = 2;
		int desde = 1;
		int num=0;
		int numJug;
		
		String aux;
		Moneda m;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido al juego de cara o cruz.");
		System.out.println("*******************************************");
		
		System.out.println();
		
		System.out.println("Diga 1 para cara.");
		System.out.println("Diga 2 para cruz.");
		aux=sc.nextLine();
		numJug=Integer.parseInt(aux);
		
		m=new Moneda();
		
		m.generarNum(hasta, desde);
		
		
		m.lanzar(m.generarNum(hasta, desde));
		m.mostrarResult(m.lanzar(num));
		m.comprobarGan(num, numJug);
		
		

	}

}
