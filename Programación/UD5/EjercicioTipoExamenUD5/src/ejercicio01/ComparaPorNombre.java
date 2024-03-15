package ejercicio01;

import java.util.Comparator;

public class ComparaPorNombre implements Comparator<Palabra>{

	@Override
	public int compare(Palabra p1, Palabra p2) {
		
		String nombrep1 = p1.getNombre();
		String nombrep2 = p2.getNombre();
		
		return nombrep1.toLowerCase().compareTo(nombrep2.toLowerCase())*-1;
	}

	

}
