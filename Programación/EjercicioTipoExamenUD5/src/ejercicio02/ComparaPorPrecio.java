package ejercicio02;

import java.util.Comparator;

public class ComparaPorPrecio implements Comparator<Trastero>{

	@Override
	public int compare(Trastero t1, Trastero t2) {
		
		if(t1.getPrecio() < t2.getPrecio()) {
			return 1;
		}
		if(t1.getPrecio() > t2.getPrecio()) {
			return -1;
		}
		return 0;
	}

	
}
