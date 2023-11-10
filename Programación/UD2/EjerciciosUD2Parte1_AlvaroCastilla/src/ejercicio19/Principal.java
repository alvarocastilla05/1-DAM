package ejercicio19;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Declarar variables.
		
		int num1, num2, opcion , result, dos=2;
		String aux;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido, el siguiente programa desempeña las funciones de una mini-calculadora.");
		
		do {
			System.out.println("--------------------------------------------");
			System.out.println("0-Salir.");
			System.out.println("1-Sumar");
			System.out.println("2-Resta");
			System.out.println("3-Multiplicación");
			System.out.println("4-División");
			System.out.println("--------------------------------------------");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			System.out.println("Intorduzca número 1:");
			aux=sc.nextLine();
			num1=Integer.parseInt(aux);
			
			System.out.println("Intorduzca número 2:");
			aux=sc.nextLine();
			num2=Integer.parseInt(aux);
			
			
			
			switch (opcion) {
				case 1:
					result=num1+num2;
					System.out.println(num1+"+"+num2+"="+result);
					if (result% dos==0) {
						System.out.println("Es par");
					}else {
						System.out.println("Es impar");
					}
					break;
				case 2:
					result= num1-num2;
					System.out.println(num1+"-"+num2+"="+result);
					if (result% dos==0) {
						System.out.println("Es par");
					}else {
						System.out.println("Es impar");
					}
					break;
				case 3:
					result=num1*num2;
					System.out.println(num1+"*"+num2+"="+result);
					if (result% dos==0) {
						System.out.println("Es par");
					}else {
						System.out.println("Es impar");
					}
					break;
				case 4:
					if(num2==0) {
						System.out.println("Error.");
					}else {
						
					
						
					result=num1/num2;
					System.out.println(num1+"/"+num2+"="+result);
					if (result% dos==0) {
						System.out.println("Es par");
					}else {
						System.out.println("Es impar");
					}
					}
					break;
				case 0:
					System.out.println("Gracias por utilizar este programa");
				default:
					System.out.println("Opción no válida.");
					break;
					
			}
			
		}while(opcion!=0);

	}

}
