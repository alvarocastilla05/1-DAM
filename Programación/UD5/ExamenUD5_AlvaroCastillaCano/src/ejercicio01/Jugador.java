package ejercicio01;



public class Jugador implements Comparable<Jugador>{

	//Atributos
	private String nombre;
	private String posicion;
	private int numJugador;
	private int golesMarcados;
	private boolean titular;
	
	//Constructores
	public Jugador(String nombre, String posicion, int numJugador, int golesMarcados, boolean titular) {
		this.nombre = nombre;
		this.posicion = posicion;
		this.numJugador = numJugador;
		this.golesMarcados = golesMarcados;
		this.titular = titular;
	}

	//Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getNumJugador() {
		return numJugador;
	}

	public void setNumJugador(int numJugador) {
		this.numJugador = numJugador;
	}

	public int getGolesMarcados() {
		return golesMarcados;
	}

	public void setGolesMarcados(int golesMarcados) {
		this.golesMarcados = golesMarcados;
	}

	public boolean isTitular() {
		return titular;
	}

	public void setTitular(boolean titular) {
		this.titular = titular;
	}

	//toString
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", posicion=" + posicion + ", numJugador=" + numJugador
				+ ", golesMarcados=" + golesMarcados + ", titular=" + titular + "]";
	}

	@Override
	public int compareTo(Jugador j) {
		
		return this.posicion.toLowerCase().compareTo(j.getPosicion().toLowerCase());
	}

	
	
	
	
	
	
	
}
