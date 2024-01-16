package ejemploCasting;

public class Cuadrado extends Figura{

	
	private double lado;
	
	
	public Cuadrado(String nombre, String color, double lado) {
		super(nombre, color);
		this.lado = lado;
	}
	
	

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	
	
	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return lado*lado;
	}

	@Override
	public double calcularPerimetro() {
		int numLados = 4;
		return lado*numLados;
	}
	
	public void soyUnCuadrado () {
		
		System.out.println("Solo estoy solo.");
	}
	
	
}
