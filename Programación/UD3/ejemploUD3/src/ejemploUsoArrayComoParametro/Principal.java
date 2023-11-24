package ejemploUsoArrayComoParametro;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int desde, hasta,tam;
		Listas listado=new Listas();
		int [] lista1;
		
		String aux;
		Scanner sc=new Scanner(System.in);
		

		System.out.println("Diga tamaño de la lista:");
		aux=sc.nextLine();
		tam=Integer.parseInt(aux);
		
		lista1=new int [tam];
		System.out.println("Diga desde:");
		aux=sc.nextLine();
		desde=Integer.parseInt(aux);
		System.out.println("Diga hasta:");
		aux=sc.nextLine();
		hasta=Integer.parseInt(aux);
		
		listado.rellenarAle(desde, hasta, lista1);
		
		listado.mostrarLista(lista1);
		
		listado.trucarLista(lista1);
		System.out.println();
		listado.mostrarLista(listado.trucarLista(lista1));
	}

}
