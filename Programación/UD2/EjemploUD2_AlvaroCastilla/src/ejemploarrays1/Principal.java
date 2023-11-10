package ejemploarrays1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//ARRARYS.
		
		//Como declarar arrays.
		
		int tam=4; //Declarar tamaño.
		int pos;
		String aux;
		int edadLeida;
		
		//primera forma.
		int [] edades;
		edades=new int [tam];
		
		//Segunda forma.
		int []edades2=new int [tam];
		
		//Tercera forma. Inicializando con valores:
		
		int [] edades3= {20, 18, 21};
		
		//Guardar valores.
		
		edades[2]=47;
		
		//System.out.println(edades[2]);
		
		//Usuario
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Diga su edad");
		aux=sc.nextLine();
		edadLeida=Integer.parseInt(aux);
		
		System.out.println("¿Posición?");
		aux=sc.nextLine();
		pos=Integer.parseInt(aux)-1;
		
		edades[pos]=edadLeida;
		
		System.out.println(edades[pos]);
		
		
		
	}

}
