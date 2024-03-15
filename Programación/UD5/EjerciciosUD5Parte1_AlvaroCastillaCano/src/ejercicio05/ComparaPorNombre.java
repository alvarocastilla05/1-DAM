package ejercicio05;

import java.util.Comparator;

public class ComparaPorNombre implements Comparator <Persona>{

	@Override
	public int compare(Persona p1, Persona p2) {
		
		String nombrep1 = p1.getNombre();
		String nombrep2 = p2.getNombre();
		
		return nombrep1.toLowerCase().compareTo(nombrep2.toLowerCase());
	}

}
