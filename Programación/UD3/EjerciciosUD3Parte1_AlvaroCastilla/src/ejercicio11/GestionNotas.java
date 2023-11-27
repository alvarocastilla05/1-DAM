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
		
		public void mostrarNuevasNotas (double []notas) {
			for (int i = 0; i < notas.length; i++) {
				System.out.printf("%d. %.2f",(i+1),notas[i]);
				System.out.println();
			}
		}
		
		public int contarSuspensos(double []notas) {
			int contador = 0;
			for (int i = 0; i < notas.length; i++) {
				if(notas[i]<5) {
					contador++;
				}
			}
			return contador;
		}
		public void mostrarSuspensos (int contador) {
			System.out.println(contador);
		}
		
		public double calcularMedia (double []notas, int tam) {
			double suma = 0;
			double media = 0;
			for (int i = 0; i < notas.length; i++) {
				suma=notas[i]++;
			}
			for (int i = 0; i < notas.length; i++) {
				media=suma/tam;
			}
			return media;
			
			
		}
		public void mostrarMedia(double media) {
			System.out.println(media);
		}
	
	
}
