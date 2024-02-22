package ejercicio01;


//Le indicamos al programa que la clase Circulo es hija de la clase Figura y que sea non-sealed
public non-sealed class Circulo extends Figura{
	
	//Atributos
	private double radio;
	
	//Constructores
	public Circulo(double precioBase, double radio) {
		super(precioBase);
		this.radio = radio;
	}
	
	//Getters y setters
	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	//toString
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	//Métodos
	@Override
	public double calcularArea() {
		return Math.PI*Math.pow(radio, 2);

	}
	
	@Override
	public double calcularPrecio() {
		return super.getPrecioBase()*calcularArea();
	}
	
	

}