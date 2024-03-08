package ejemploLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Persona> lista = new ArrayList<Persona>();
		
		lista.add(new Persona("Alvaro"));
		lista.add(new Persona("Angel"));
		lista.add(new Persona("Lucas"));
		lista.add(new Persona("Carlos"));
		
		/*z -> z +2;*/
		
		IBienvenida bienvenida = () -> System.out.println("Hola Mundo");

		bienvenida.mostrarBienvenida();
		
		ISumar suma = (z) -> z+2;
		
		System.out.println(suma.sumarZ(2));
		
		//Ahora un Supplier que es un proveedor. No se le pasan parametros y se encarga de dar cosas
		
		Supplier <Double> kmR = () -> Math.random();
		
		System.out.println(kmR.get());
		
		//Consumer.
		Consumer<String> mostrarLista = (m) -> System.out.println(m);
		
		for (Persona persona : lista) {
			mostrarLista.accept(persona.nombre());
		}
		
		
		//Interfaz Funcional Function.
		
		//apply
		
		
	}
	
	
	
	public record Persona(String nombre) {

}
}
