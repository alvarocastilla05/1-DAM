package ejercicio01;

public class Vehiculos implements IAlquiler{

	private int id;
	private String matricula;
	private double tamanio;
	private int anioFabricacion;
	
	public Vehiculos(int id, String matricula, double tamanio, int anioFabricacion) {
		this.id = id;
		this.matricula = matricula;
		this.tamanio = tamanio;
		this.anioFabricacion = anioFabricacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getTamanio() {
		return tamanio;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	@Override
	public String toString() {
		return "Vehiculos [id=" + id + ", matricula=" + matricula + ", tamanio=" + tamanio + ", anioFabricacion="
				+ anioFabricacion + "]";
	}

	@Override
	public double calcularPrecio(double fijoBatmovil) {
		double cien = 100;
		return (tamanio*anioFabricacion)/cien;
	}
	
	
	
	
}
