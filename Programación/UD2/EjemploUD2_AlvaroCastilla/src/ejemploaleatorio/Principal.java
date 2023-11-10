package ejemploaleatorio;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Clase java.util.Random
		int hasta=0, desde=0, tope=0;
		int ale;
		String aux;
		
		Scanner sc=new Scanner(System.in);
		
		Random num=new Random(System.nanoTime());
		
		System.out.println("Dida desde qué valor:");
		aux=sc.nextLine();
		desde=Integer.parseInt(aux);
		
		System.out.println("Dida hasta qué valor:");
		aux=sc.nextLine();
		hasta=Integer.parseInt(aux);
		
		System.out.println("Dida cuántos números quiere:");
		aux=sc.nextLine();
		tope=Integer.parseInt(aux);
		
			for (int i=0; i<tope; i++) {
			ale=num.nextInt(hasta-desde+1)+desde;
			System.out.println(ale);
		}
		
		
		

	}

}
