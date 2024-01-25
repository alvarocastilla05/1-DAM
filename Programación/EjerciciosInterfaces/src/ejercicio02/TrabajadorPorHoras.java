package ejercicio02;

public class TrabajadorPorHoras extends Trabajador{

	//No debemos de implementar la Interfaz porque la hereda de la madre.
	
	private double sueldoPorHora;
	private int numeroHora;
	
	public TrabajadorPorHoras(double sueldoPorHora, int numeroHora) {
		this.sueldoPorHora = sueldoPorHora;
		this.numeroHora = numeroHora;
	}
	

	public double getSueldoPorHora() {
		return sueldoPorHora;
	}

	public void setSueldoPorHora(double sueldoPorHora) {
		this.sueldoPorHora = sueldoPorHora;
	}

	public int getNumeroHora() {
		return numeroHora;
	}

	public void setNumeroHora(int numeroHora) {
		this.numeroHora = numeroHora;
	}


	@Override
	public String toString() {
		return "TrabajadorPorHoras [sueldoPorHora=" + sueldoPorHora + ", numeroHora=" + numeroHora + "]";
	}


	@Override
	public double calculoIrpf(double sueldo) {
		double irpf = 85, cien = 100;
		return (sueldoPorHora*numeroHora)*(irpf/cien);
	}
	
	

}
