package ejercicio09;

import java.util.Random;

public class Sorteo {



	
	//1. TE RECOMIENDO HACER UN METODO UNICO QUE SEA EL QUE GENERE EL NUMERO ALEATORIO, NO GENERAR UN NUMERO ALEATORIO POR CADA METODO
	//2. DESPUES EN CADA METODO LLAMAS AL METODO QUE TE GENERA EL NUMERO ALEATORIO.
	//3. A LA HORA DE COMPARAR SI TU DECIMO ES GANADOR PONES IF (DECIMO==DECIMOGANADOR)... 
	//LO QUE TENDRIAS QUE HACER ES IF(GENERARDECIMO==DECIMOGANADOR)
	
	/*public int generarRandom (int desde, int hasta) {
		Random rnd=new Random(System.nanoTime());
		
		int numRnd=rnd.nextInt(hasta-desde-1)+desde;
		
		return numRnd;
	}
>>>>>>> b114030eb025b5686a7d91384e41688bb52856e6

	public int generarDecimo () {
		int decimo;
		int desde=00001;
		int hasta=99999;
		decimo=generarRandom(desde, hasta);
		
		return decimo;	
	}
	
	public void mostrarDecimo (int decimo) {
		System.out.println("Su décimo es el número: "+decimo);
	}
	
	public int generarDecimoGan () {
		int desde=00001;
		int hasta=99999;
		int decimoGan;
		
		decimoGan=generarRandom(desde, hasta);
		
		return decimoGan;
	}
	public void mostrarDecimoGan (int decimoGan) {
		System.out.println("El número premiado es el: "+decimoGan);
	}
	
	public boolean comprobarGan () {
		if (generarDecimo()==generarDecimoGan()) {
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
	}*/
	
	
	
	//Corregido
	  
	private int decimoGan;

	public Sorteo(int decimoGan) {
		
		this.decimoGan = decimoGan;
	}

	public int getDecimoGan() {
		return decimoGan;
	}

	public void setDecimoGan(int decimoGan) {
		this.decimoGan = decimoGan;
	}
	
	public int generarDecimoAleatorio () {
		
	}
	
	 
	
	
	
	
}
