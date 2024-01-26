package ejercicio01;

public class Moviles extends Producto{

	public Moviles(double precioBase, int cantidad, String nombre, boolean vendido) {
		super(precioBase, cantidad, nombre, vendido);
	}

	@Override
	public double calcularPVP(double porcentaje, double fijoEspadaDoble) {
		double cien = 100;
		return super.getPrecioBase()+(super.getPrecioBase()*(porcentaje/cien));
	}
	
	

}
