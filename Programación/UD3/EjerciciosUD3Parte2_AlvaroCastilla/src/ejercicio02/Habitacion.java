package ejercicio02;

public class Habitacion {

	private int id;
	private String tipo;
	private double precio;
	private int extras;
	private String nomClient;
	private int dias;
	private boolean limpieza;
	private boolean ocupada;
	
	public Habitacion(int id, String tipo, double precio, int extras, String nomClient, int dias, boolean limpieza,
			boolean ocupada) {
		this.tipo = tipo;
		this.precio = precio;
		this.extras = extras;
		this.nomClient = nomClient;
		this.dias = dias;
		this.limpieza = limpieza;
		this.ocupada = ocupada;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getExtras() {
		return extras;
	}

	public void setExtras(int extras) {
		this.extras = extras;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public boolean isLimpieza() {
		return limpieza;
	}

	public void setLimpieza(boolean limpieza) {
		this.limpieza = limpieza;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	@Override
	public String toString() {
		return "Habitacion [tipo=" + tipo + ", precio=" + precio + ", extras=" + extras + ", nomClient=" + nomClient
				+ ", dias=" + dias + ", limpieza=" + limpieza + ", ocupada=" + ocupada + "]";
	}
	
	
	
}
