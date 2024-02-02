package ejemploList2;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Alumno> lista = new ArrayList <Alumno>();
		
		Alumno a1 = new Alumno("Álvaro", "Castilla Cano", 18, true);
		Alumno a2 = new Alumno("Alejandro", "Blazquez Cano", 26, true);
		Alumno a3 = new Alumno("Carlos", "Roman Abad", 19, false);

		
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		
		System.out.println(lista);
		System.out.println("************************");
		System.out.println(lista.get(0));
		
		
		
	}

}
