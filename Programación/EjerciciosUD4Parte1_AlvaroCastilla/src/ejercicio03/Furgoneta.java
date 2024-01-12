package ejercicio03;

public class Furgoneta extends Vehiculo{

	private String nombre;

	public Furgoneta(double cilindrada, double potenciaEnCaballos, int emisiones, String nombre) {
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
		return "Furgoneta [nombre=" + nombre + "]";
	}
	
	public double calcularPrecio(double fijo, double fijoMercancia, double porcentajeCilindrada, double porcentajePotencia) {
		
		double total;
		
		total=super.calcularPrecio(fijo, fijoMercancia, porcentajeCilindrada, porcentajePotencia)+fijoMercancia;
		return total;
	}
	
}
