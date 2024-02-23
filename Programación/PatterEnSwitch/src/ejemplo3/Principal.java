package ejemplo3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object obj = "Hello";

		switch (obj) {
		    case String s -> System.out.println("Es una cadena: " + s);
		    case Integer i -> System.out.println("Es un entero: " + i);
		    default -> System.out.println("No es ni una cadena ni un entero.");
		}

	}
	
	
}
