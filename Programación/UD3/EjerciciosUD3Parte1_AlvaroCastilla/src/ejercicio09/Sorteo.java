package ejercicio09;

import java.util.Random;

public class Sorteo {


	public int generarDecimo (int decimo) {
		int desde=00001;
		int hasta=99999;
		Random rnd=new Random(System.nanoTime());
		decimo=rnd.nextInt(hasta-desde-1)+desde;
		
		return decimo;	
	}
	
	public void mostrarDecimo (int decimo) {
		System.out.println("Su décimo es el número: "+decimo);
	}
	
	public int generarDecimoGan (int decimoGan) {
		int desde=00001;
		int hasta=99999;
		Random rnd=new Random(System.nanoTime());
		decimoGan=rnd.nextInt(hasta-desde-1)+desde;
		
		return decimoGan;
	}
	public void mostrarDecimoGan (int decimoGan) {
		System.out.println("El número premiado es el: "+decimoGan);
	}
	
	public boolean comprobarGan (int decimo, int decimoGan) {
		if (decimo==decimoGan) {
			return true;
		}else {
			return false;
		}
	}
	
	public void mostrarGan (boolean comprobarGan) {
		if (comprobarGan) {
			System.out.println("Has ganado.");
		}else {
			System.out.println("Has perdido.");
		}
	}
	
	
	
	
}
