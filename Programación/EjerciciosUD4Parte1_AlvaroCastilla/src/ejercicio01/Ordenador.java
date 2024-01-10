package ejercicio01;

public class Ordenador {

	private int capacidadDisco;
	private double frecuenciaProcesador;
	private double precioBase;
	private String marca;
	
	public Ordenador(int capacidadDisco, double frecuenciaProcesador, double precioBase, String marca) {
		
		this.capacidadDisco = capacidadDisco;
		this.frecuenciaProcesador = frecuenciaProcesador;
		this.precioBase = precioBase;
		this.marca = marca;
	}

	public int getCapacidadDisco() {
		return capacidadDisco;
	}

	public void setCapacidadDisco(int capacidadDisco) {
		this.capacidadDisco = capacidadDisco;
	}

	public double getFrecuenciaProcesador() {
		return frecuenciaProcesador;
	}

	public void setFrecuenciaProcesador(double frecuenciaProcesador) {
		this.frecuenciaProcesador = frecuenciaProcesador;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Ordenador [capacidadDisco=" + capacidadDisco + ", frecuenciaProcesador=" + frecuenciaProcesador
				+ ", precioBase=" + precioBase + ", marca=" + marca + "]";
	}
	
	public double calcularPrecioVenta(double ganancia) {
		return precioBase*(ganancia/100);
	}
	
	
}
