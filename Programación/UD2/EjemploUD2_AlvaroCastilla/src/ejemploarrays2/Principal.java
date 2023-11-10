package ejemploarrays2;

import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//ARRAYS 2.
		
		int tam, opcion;
		int [] edades;
		String aux;
		int suma = 0;
		
		Scanner sc=new Scanner(System.in);
		
		//Pedimos tamaño.
		System.out.println("Diga tamaño:");
		aux=sc.nextLine();
		tam=Integer.parseInt(aux);
		
		//Iniciamos array.
		edades=new int [tam];
		
		
		
		//System.out.println(tam);
		//System.out.println(edades.length);
		
		//tam=9;
		
		//System.out.println(tam);
		//System.out.println(edades.length);
		
		//No usamos como tope del for tam, siempre se usa length, ya que este siempre va a tener el primer recibido y no se puede modificar, el tam si.
		
		//Rellenar
		for (int i = 0; i < edades.length; i++) {
			System.out.println("Introduzca una edad:");
			aux=sc.nextLine();
			edades[i]=Integer.parseInt(aux);
		}
			
		//Mostrar.
			for (int i = 0; i < edades.length; i++) {
				
				System.out.println((i+1)+"."+"la edad es:"+edades[i]);	
			}
		//Sumar todas las edades.
			
			for (int i = 0; i < edades.length; i++) {
				suma+=edades[i];			
			}
			System.out.println("La suma es igual a "+suma);
			
			
			//Hay que poner un bucle para cada cosa que hagamos con el arrays.
			
			//Mostrar un elemento elegido.
			
			System.out.println("Diga posición a mostrar");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux)-1;
			
			System.out.println(edades[opcion]);
			
			//Modificar un valor elegido por el usuario.
			

			
			System.out.println("Diga la posición que quieres cambiar:");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux)-1;
			
			System.out.println("Diga nueva edad:");
			aux=sc.nextLine();
			edades[opcion]=Integer.parseInt(aux);
			
			
			
		
	
		
		
		

	}

}
