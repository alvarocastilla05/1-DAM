package ejercicio4;

public class Electronica extends Producto {

	//Atributos 
	private double pcntImpuesto;

	
	
	//Constructores
	public Electronica(double precioUnitario, String nombre, String codIdentificacion, double pcntImpuesto) {
		super(precioUnitario, nombre, codIdentificacion);
		this.pcntImpuesto = pcntImpuesto;
	}

	//Getters and Setters

	public double getPcntImpuesto() {
		return pcntImpuesto;
	}
	public void setPcntImpuesto(double pcntImpuesto) {
		this.pcntImpuesto = pcntImpuesto;
	}

	//ToString
	@Override
	public String toString() {
		return "Electronica [pcntImpuesto=" + pcntImpuesto + "]";
	}

	//Methods
	
	@Override
	public double calcularPrecioUnitario() {
		double cien = 100;
		return super.getPrecioUnitario()+(super.getPrecioUnitario()*pcntImpuesto/cien);
	}
	
	
	
	 
	
	
	
	
	
}
