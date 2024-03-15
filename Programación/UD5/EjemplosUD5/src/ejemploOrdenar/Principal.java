package ejemploOrdenar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String aux;
		Scanner sc = new Scanner(System.in);
		int opcioUser, pos = 0;
		//Coleccion de corredores 
		List <Corredor> corredores = new ArrayList <Corredor>();
		
		corredores.add(new Corredor(4, 1.43, "Jesse Owens"));
		corredores.add(new Corredor(8, 1.11, "Angel Naranjo"));
		corredores.add(new Corredor(3, 2.23, "Abel Antón"));
		corredores.add(new Corredor(1, 1.12, "Luis Miguel Lopez"));
		corredores.add(new Corredor(6, 1.14, "Miguel Campos"));
		
		for (Corredor co : corredores) {
			System.out.println(co);
			
			do {
				System.out.println("""
						0-Salir.
						1-Ordenar por nombre.
						2-Ordenar por marca.
						3-Ordenar por dorsal.
						""");
				aux=sc.nextLine();
				opcioUser=Integer.parseInt(aux);
				
				
				
				
				
			}while(opcioUser!=0);
		}
	}

}
