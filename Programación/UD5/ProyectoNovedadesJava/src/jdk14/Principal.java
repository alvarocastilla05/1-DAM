package jdk14;

public class Principal {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p = new Persona("Alvaro", "a@oaihdf", 654564560);
		
		System.out.println(p);
		
		

	}
	
	
	
	
	
	

	public record Persona(String nombre, String email, int telefono) {
		
	}
}
