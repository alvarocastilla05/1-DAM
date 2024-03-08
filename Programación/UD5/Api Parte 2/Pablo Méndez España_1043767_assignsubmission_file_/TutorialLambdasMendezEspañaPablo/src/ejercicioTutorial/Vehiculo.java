package ejercicioTutorial;

public abstract class Vehiculo {

	//Atributos
	private String matricula;
	private double kmRecorridos;

	//Constructor
	public Vehiculo(String matricula) {
		super();
		this.matricula = matricula;
	}

	//Getters and Setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	//To String
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", kmRecorridos=" + kmRecorridos + "]";
	}
	
}
