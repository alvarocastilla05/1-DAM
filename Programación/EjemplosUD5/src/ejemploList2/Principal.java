package ejemploList2;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Alumno> lista = new ArrayList <Alumno>();
		
		lista.add("Álvaro", "Castilla Cano", 18, true);
		lista.add(1, "Alvaro", "Castilla", 18, false);
		
		
	}

}
