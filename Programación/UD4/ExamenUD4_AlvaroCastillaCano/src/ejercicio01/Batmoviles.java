package ejercicio01;

public class Batmoviles extends Vehiculos{

	private int numeroRuedas;

	public Batmoviles(int id, String matricula, double tamanio, int anioFabricacion, int numeroRuedas) {
		super(id, matricula, tamanio, anioFabricacion);
		this.numeroRuedas = numeroRuedas;
	}

	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	@Override
	public double calcularPrecio(double fijoBatmovil) {
		
		return super.calcularPrecio(fijoBatmovil)+(fijoBatmovil*numeroRuedas);
	}
	
	public void avisarMaximo () {
		System.out.println("Desplegado al maximo");
	}
	
	
}
