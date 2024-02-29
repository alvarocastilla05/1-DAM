package ejercicio06;

import java.util.Comparator;

public class ComparaPorHoras implements Comparator<Trabajador>{

	@Override
	public int compare(Trabajador t1, Trabajador t2) {
		
		if(t1.getHorasTrabajadas()< t2.getHorasTrabajadas()) {
			return -1;
		}else {
			return 1;
		}
	}

}
