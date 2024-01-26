package ejemploInterfaces;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new Animal("Tigre", 4);
		Persona p = new Persona("Alvaro", 18);
	
		a.cazar(a);
		a.localizar(a);
		p.cazar(a);
		p.localizar(a);
		a.huir();
	}

}