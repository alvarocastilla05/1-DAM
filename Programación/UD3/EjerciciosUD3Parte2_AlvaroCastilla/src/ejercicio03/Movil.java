package ejercicio03;

public class Movil {

	private String marca;
	private String modelo;
	private boolean vendido;
	private boolean estado;
	private double precioU;
	
	public Movil(String marca, String modelo, boolean vendido, boolean estado, double precioU) {
		this.marca = marca;
		this.modelo = modelo;
		this.vendido = vendido;
		this.estado = estado;
		this.precioU = precioU;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isVendido() {
		return vendido;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public double getPrecioU() {
		return precioU;
	}

	public void setPrecioU(double precioU) {
		this.precioU = precioU;
	}

	@Override
	public String toString() {
		return "Movil [marca=" + marca + ", modelo=" + modelo + ", vendido=" + vendido + ", estado=" + estado
				+ ", precioU=" + precioU + "]";
	}
	
	
	
	//
}
