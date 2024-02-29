package ejercicio06;

import java.util.Comparator;

public class ComparaPorHoras implements Comparator<Double>{

	@Override
	public int compare(Double horas1, Double horas2) {
		
		if(horas1< horas2) {
			return -1;
		}else {
			return 1;
		}
	}

}
