package ejercicio03;

public class Motocicleta extends Vehiculo {

	private String nombre;

	public Motocicleta(double cilindrada, double potenciaEnCaballos, int emisiones, String nombre) {
		super(cilindrada, potenciaEnCaballos, emisiones);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Motocicleta [nombre=" + nombre + "]";
	}

	@Override
	public double calcularPrecio(double fijo, double fijoMercancia, double porcentajeCilindrada, double porcentajePotencia) {
		int cien = 100;
		double total;
		
		total=super.calcularPrecio(fijo, fijoMercancia, porcentajeCilindrada, porcentajePotencia)+(getCilindrada()*(porcentajeCilindrada/cien));
		return total;
		
	}
	
	
	
	
}
