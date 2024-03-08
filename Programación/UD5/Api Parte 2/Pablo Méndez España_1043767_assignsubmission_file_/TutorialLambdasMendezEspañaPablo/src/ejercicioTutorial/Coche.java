package ejercicioTutorial;

public class Coche extends Vehiculo{

	//Atributos
	private boolean antinieblaDelantero;

	//Constructor
	public Coche(String matricula, boolean antinieblaDelantero) {
		super(matricula);
		this.antinieblaDelantero = antinieblaDelantero;
	}

	//Getters and Setters
	public boolean isAntinieblaDelantero() {
		return antinieblaDelantero;
	}

	public void setAntinieblaDelantero(boolean antinieblaDelantero) {
		this.antinieblaDelantero = antinieblaDelantero;
	}

	//To String
	@Override
	public String toString() {
		return "Coche [antinieblaDelantero=" + antinieblaDelantero + "]";
	}
	
}
