package ejercicio02;

public class Trastero implements Comparable<Trastero>{

	private double metrosCuadrados;
	private String direccion;
	private int numTrastero;
	private double precio;
	private boolean ocupado;
	
	public Trastero(double metrosCuadrados, String direccion, int numTrastero, double precio, boolean ocupado) {
		this.metrosCuadrados = metrosCuadrados;
		this.direccion = direccion;
		this.numTrastero = numTrastero;
		this.precio = precio;
		this.ocupado = ocupado;
	}


	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumTrastero() {
		return numTrastero;
	}

	public void setNumTrastero(int numTrastero) {
		this.numTrastero = numTrastero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	@Override
	public String toString() {
		return "Trastero [metrosCuadrados=" + metrosCuadrados + ", direccion=" + direccion + ", numTrastero="
				+ numTrastero + ", precio=" + precio + ", ocupado=" + ocupado + "]";
	}

	@Override
	public int compareTo(Trastero t) {
		
		if(this.numTrastero < t.getNumTrastero()) {
			return 1;
		}
		if(this.numTrastero > t.getNumTrastero()) {
			return -1;
		}
		
		return 0;
	}
	
	
}
