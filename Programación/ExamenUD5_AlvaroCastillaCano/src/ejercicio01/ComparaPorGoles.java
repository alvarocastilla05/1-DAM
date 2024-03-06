package ejercicio01;

import java.util.Comparator;

public class ComparaPorGoles implements Comparator<Jugador>{

	@Override
	public int compare(Jugador j1, Jugador j2) {
		
		if(j1.getGolesMarcados() < j2.getGolesMarcados()) {
			return 1;
		}
		if(j1.getGolesMarcados() > j2.getGolesMarcados()) {
			return -1;
		}
		return 0;
	}

}
