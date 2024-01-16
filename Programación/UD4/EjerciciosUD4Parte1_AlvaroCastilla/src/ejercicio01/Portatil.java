package ejercicio01;

public class Portatil extends Ordenador {

	private boolean seguro;
	private double precioSeguro;
	
	public Portatil(int capacidadDisco, double frecuenciaProcesador, double precioBase, String marca, boolean seguro,
			double precioSeguro) {
		super(capacidadDisco, frecuenciaProcesador, precioBase, marca);
		this.seguro = seguro;
		this.precioSeguro = precioSeguro;
	}

	public boolean isSeguro() {
		return seguro;
	}

	public void setSeguro(boolean seguro) {
		this.seguro = seguro;
	}

	public double getPrecioSeguro() {
		return precioSeguro;
	}

	public void setPrecioSeguro(double precioSeguro) {
		this.precioSeguro = precioSeguro;
	}

	@Override
	public String toString() {
		return "Portatil [seguro=" + seguro + ", precioSeguro=" + precioSeguro + "]";
	}
	
	public double calcularPrecioVenta(double ganancia) {
		double total;
		if(seguro=true) {
			total=super.calcularPrecioVenta(ganancia)+precioSeguro;
			return total;
		}else {
			return super.calcularPrecioVenta(ganancia);
		}
		
	}
	
	
	
}
