package jdk17;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figura f = new Circulo(10);
		Cuadrado cu = new Cuadrado(5);
		Circulo c = new Circulo(8);

		String mensaje = switch (f) {
		case Circulo c -> "Circulo con area de " + c.area();
		case Cuadrado cu -> "Cuadrado con area de" + cu.area();
		default -> "Figura desconocida";
		};
	}

}
