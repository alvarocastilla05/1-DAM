package ejercicio01;

/*Esto es una sealed class y nos permite indicar que clases pueden heredar de ella*/
public sealed class Figura permits Cuadrado, Circulo{
	
	private double precioBase;
	
	public Figura(double precioBase) {
		this.precioBase = precioBase;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	@Override
	public String toString() {
		return "Figura [precioBase=" + precioBase + "]";
	}
	
	//Metodos.

	public  double calcularArea() {
		return 0;
	}
	
	public double calcularPrecio() {
		return precioBase;
	}

}