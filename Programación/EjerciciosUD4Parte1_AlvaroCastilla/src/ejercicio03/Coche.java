package ejercicio03;

public class Coche extends Vehiculo{

	private String nombre;

	public Coche(double cilindrada, double potenciaEnCaballos, int emisiones, String nombre) {
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
		return "Coche [nombre=" + nombre + "]";
	}
	
	public double calcularPrecio(double porcentajePotencia) {
		return 0.0;
	}
	
}
