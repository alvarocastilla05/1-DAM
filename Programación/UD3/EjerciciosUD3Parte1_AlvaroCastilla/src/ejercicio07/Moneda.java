package ejercicio07;

import java.util.Random;

public class Moneda {

	//generarNum 
	//lanzar {if(gen==1){return true}}else{return false}
	//public void mostrarResult(){ if (lanzar=true){syso(cara)} else { syso(cruz)}
	
	public int generarNum (int hasta, int desde) {
		Random rnd=new Random(System.nanoTime());
		int num;
		num=rnd.nextInt(hasta-desde+1)+desde;
		
		return num;
	}
	public boolean lanzar(int num) {
		if (num==1) {
			return true;
		}else {
			return false;
		}
			
	}
	
	public void mostrarResult (boolean lanzar) {
		if (lanzar) {
			System.out.println("Cara");
		}else {
			System.out.println("Cruz");
		}
	}
	public void comprobarGan (int num, int numJug) {
		if (num==numJug) {
			System.out.println("Has ganado.");
		}else {
			System.out.println("Has perdido.");
		}
	}
	
	}
