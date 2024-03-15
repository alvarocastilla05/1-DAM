package ejemploOrdenar;

import java.util.Comparator;


public class ComparaPorMarca implements Comparator<Corredor> {

	//Comparamos 2 objetos tipo corredor
	@Override
	public int compare(Corredor c1, Corredor c2) {

		//Creamos las 2 variables tipo double (marca es double) 
		//que vamos a comparar, no haría falta
		double marcac1 =c1.getMarca();
		double marcac2 = c2.getMarca();
		
		//Si el primero es menor que el segundo devuelve -1
		//si el mayor 1 y si son iguales 0, consulta el API
		
		if(marcac1 < marcac2) {
			return -1;
		}else {
			if(marcac1 > marcac2) {
				return 1;
			}
		}
		return 0;

	}
	
	
}
