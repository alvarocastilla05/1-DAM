package ejercicio06;

import java.util.Random;

public class Generadora {

	//Primitiva.
	
	public int generarNum(int desde, int hasta) {
		int num=0;
		Random rnd=new Random(System.nanoTime());
		num=rnd.nextInt(hasta-desde+1)+desde;
		return num;
	}
	
	public int generarPrimitiva (int desde, int hasta) {
		
		int num=0;
		num=generarNum(desde,hasta);
		return num;
	}
	
	public boolean generarParImpar (int desde, int hasta) {
		int dos =2, num1, num2;
		boolean resultado;
		num1=generarNum(desde, hasta);
		num2=0;
		
		if((num1+num2)% dos==0) {
			resultado=true;
		}else {
			resultado=false;
		}
		return resultado;
		
	}
	
	public void mostrarGanador (boolean resultado) {
		if (resultado=true) {
			System.out.println("Ha ganado pares.");
		}else 
			System.out.println("Ha ganado nones.");
	}
	
	public int generarChinos (int desde, int hasta) {
		int num1Chinos = 0;
		int num2Chinos=generarNum(desde,hasta);
		int suma;
		suma=num1Chinos+num2Chinos;
		
		return suma;
		
	}
	
	public void mostrarChinos(int suma) {
		System.out.println(suma);
	}

}
