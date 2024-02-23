package ejercicio01;


//Le indicamos al programa que la clase Cuadrado es hija de la clase Figura y que sea non-sealed 
public non-sealed class Cuadrado extends Figura{
	
	//Atributos
	private double lado;	
	
	//Constructores
	public Cuadrado(double precioBase, double lado) {
		super(precioBase);
		this.lado = lado;
	}
	
	//Getters y setters
	public double getLado() {
		return lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}

	//toString
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}

	//Metodos
	@Override
	public double calcularArea() {
		return lado*lado;
	}
	
	@Override
	public double calcularPrecio() {
		return super.getPrecioBase()*calcularArea();
	}

	public void avisoCuadrado() {
		System.out.println("Que cuadrado más chuli!!");
	}
	
	
	
	
	
		
}