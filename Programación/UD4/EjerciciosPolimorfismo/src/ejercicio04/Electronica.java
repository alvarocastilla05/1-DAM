package ejercicio04;

public class Electronica extends Producto {

	public Electronica(double precioUnitario, String nombre, int codIdentificacion) {
		super(precioUnitario, nombre, codIdentificacion);

	}

	@Override
	public double calcularPrecio(double impuestoLujo, double descuento) {
		
		return super.calcularPrecio(impuestoLujo, descuento)+impuestoLujo;
	}
	
	

	
}
