package ejemploCasting;

public class Circulo extends Figura{

	private double radio;

	public Circulo(String nombre, String color, double radio) {
		super(nombre, color);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	@Override
	public double calcularArea() {
		
		return Math.PI* Math.pow(radio,2);
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radio;
	}
	
	public void mostrarRadianes () {
		
		System.out.println("Solo estoy en el circulo porque solo sirvo para los circulos");
	}
	
	
}
