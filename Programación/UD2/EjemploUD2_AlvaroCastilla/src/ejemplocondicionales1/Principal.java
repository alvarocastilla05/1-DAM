package ejemplocondicionales1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, num3, tope=5;
		String aux;
		boolean a=false;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Diga número 1:");
		aux=sc.nextLine();
		num1=Integer.parseInt(aux);
		
		System.out.println("Diga número 2");
		aux=sc.nextLine();
		num2=Integer.parseInt(aux);
		
		System.out.println("Diga número 3");
		aux=sc.nextLine();
		num3=Integer.parseInt(aux);
		
		//Cómo hacer condicionales.
		if(num1>=tope) {	
			System.out.println("Aprobado");
		}
		else {
			System.out.println("Suspenso");
			
		if(num3>num1 && num3<num2) {
			System.out.println(num1+" menor que "+num3+" menor que "+num2);
		}
		}
		
		
		
		
		
		
		
		System.out.println("Adiós");
		
		//Si el boolean es true se hace todo, si es falso no se hace nada.
		if(a) {
			System.out.println("no pasa nada porque es falso");
		}
				
	}

}
