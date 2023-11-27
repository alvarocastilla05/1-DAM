package ejercicio11;

import java.util.Random;

public class GestionNotas {

	public void generarNotas (int hasta, int desde, double []notas) {
		Random rnd= new Random(System.nanoTime());
		
		for (int i = 0; i < notas.length; i++) {
			
			notas[i]=rnd.nextDouble(hasta-desde+1)+desde;
			
		}
	}
	
	public void mostrarNotas(double []notas) {
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("%d. %.2f",(i+1),notas[i]);
			System.out.println();
		}
	}
		public void modificarNotas(double []notas, int pos, double notaNueva) {
			
			notas[pos]=notaNueva;
		
	}
	
	
}
