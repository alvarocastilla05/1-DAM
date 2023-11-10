package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Declarar.
		
		int num;
		String aux;
		Operaciones o;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Diga un número:");
		aux=sc.nextLine();
		num=Integer.parseInt(aux);
		
		o=new Operaciones();
		
		o.decirParImpar(num);
		
		o.decirSigno(num);
		
		

	}

}
