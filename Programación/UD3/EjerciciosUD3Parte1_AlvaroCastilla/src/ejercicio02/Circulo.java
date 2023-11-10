package ejercicio02;

public class Circulo {

	private double radio;
	
	//constructor.
	public Circulo (double radio) {
		this.radio=radio;
	}
	
	public double calcularArea() {
		double area;
		double dos=2;
		area=Math.PI*Math.pow(radio, dos);
		return area;
	}
	
	
	
	public double calcularAreaM2(double area) {
		int m2=10000;
		return area/m2;
	}
	
	
	public void mostrarAreaM2 (double area) {
		System.out.printf("El área del círculo es: %.4f m2", area);
	}
	
}
