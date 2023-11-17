package repasoArrays;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int tam, tam2=4;
		String aux;
		int hasta, desde, contCeros = 0;
		int elemento, nuevoValor;
		int total = 0;
		Scanner sc=new Scanner(System.in);
		Random rnd=new Random(System.nanoTime());
		
		// Declaración de arrays, varias formas.
		//a) Dando valores inicialmente, inicializando
		//Como no damos el tamaño, el tamaño es directamente el número de elementos que ponemos.
		int []lista= {2,3,6}; //Tamaño -->3. Ya se puede usar el array.
		
		//b) Declarando e instancaindo en diferentes líneas.
		
		//Primero se declara, siempre primero.
		
		int []lista2;
		
		//necesito el tamaño, lo pido, tengo que declarar la variable al comienzo para guardarlo.
		
		System.out.println("Diga el tamaño");
		aux=sc.nextLine();
		tam=Integer.parseInt(aux);
		//Instancio ese tamaño
		
		lista2= new int [tam]; //El tamaño es el leido, ya se puede usar.
		
		//c) Todo en la misma linea, debemos tener el tamaño antes.
		
		int []lista3=new int [tam2];
		
		//El mejor el segundo, aunque puede ser que nos encontremos el primero.
		
		
		//2. Cargar, rellenar el array.
		// Varias formas.
		
		//a)Leyendo por teclado.
		
		//SI ponemos un -1 al lado de lista.length, se rellenan todas las posiciones menos la última.
		for (int i = 0; i < lista.length; i++) {
			aux=sc.nextLine();
			lista[i]=Integer.parseInt(aux);
		}
		
		
		//b) Aleatorio.
		//Necesitamos declarar arriba el hasta y el desde y generar un random.
		System.out.println("Diga desde:");
		aux=sc.nextLine();
		desde=Integer.parseInt(aux);
		
		System.out.println("Diga hasta:");
		aux=sc.nextLine();
		hasta=Integer.parseInt(aux);
		
		for (int i = 0; i < lista.length; i++) {
			lista[i]=rnd.nextInt(hasta-desde+1)+desde;
		}
		//c) cascaporra style.
		
		int lista4 []= {12, 3, 4, 5};
		
		//Mostrar el array.
		
		for (int i = 0; i < lista4.length; i++) {
			System.out.println("  "+lista4[i]);
		}
		
		//4. Acceso a un único elemento.
		
		System.out.println("Indique el elemento que desea cambiar:");
		aux=sc.nextLine();
		elemento = Integer.parseInt(aux)-1;
		System.out.println("Introduzca el nuevo valor:");
		aux=sc.nextLine();
		nuevoValor=Integer.parseInt(aux);
		
		lista4 [elemento]=nuevoValor;
		
		
		//5. Sumamos elementos.
		
		for (int i = 0; i < lista4.length; i++) {
			total += lista4[i];
			
		}
		
		//Operaciones variadas.
		
		for (int i = 0; i < lista4.length; i++) {
			if(lista4[i]%2==0) {
				lista4[i]= lista4[i]*2;
			}
		}
		
		//Contar número de 0.
		
		for (int i = 0; i < lista4.length; i++) {
			if(lista4[i]==0) {
				contCeros++;
			}
		}
		
		
		

	}

}
