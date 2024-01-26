package ejercicio01;

public class PatineteVoladores extends Vehiculos{
	
	private double potenciaCaballos;

	public PatineteVoladores(int id, String matricula, double tamanio, int anioFabricacion, double potenciaCaballos) {
		super(id, matricula, tamanio, anioFabricacion);
		this.potenciaCaballos = potenciaCaballos;
	}

	public double getPotenciaCaballos() {
		return potenciaCaballos;
	}

	public void setPotenciaCaballos(double potenciaCaballos) {
		this.potenciaCaballos = potenciaCaballos;
	}

	@Override
	public double calcularPrecio(double fijoBatmovil) {
		double eurosPorCaballo = 1;
		return super.calcularPrecio(fijoBatmovil)+(potenciaCaballos*eurosPorCaballo);
	}
	
	

}
