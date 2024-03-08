package ejercicioTutorial;

public class Moto extends Vehiculo{

	//Atributos
	private int cilindrada;

	//Constructor
	public Moto(String matricula, int cilindrada) {
		super(matricula);
		this.cilindrada = cilindrada;
	}

	//Getters and Setters
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	//To String
	@Override
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + "]";
	}
	
}
