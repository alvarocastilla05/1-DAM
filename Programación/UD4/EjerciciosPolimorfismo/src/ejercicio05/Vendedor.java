package ejercicio05;

public class Vendedor extends Empleado{

	private double cantidadVentas;
	private double incentivo;
	
	public Vendedor(String nombre, String apellidos, double sueldoBase, int numEmpleado, double cantidadVentas,
			double incentivo) {
		super(nombre, apellidos, sueldoBase, numEmpleado);
		this.cantidadVentas = cantidadVentas;
		this.incentivo = incentivo;
	}

	public double getCantidadVentas() {
		return cantidadVentas;
	}

	public void setCantidadVentas(double cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	@Override
	public String toString() {
		return "Vendedor [cantidadVentas=" + cantidadVentas + ", incentivo=" + incentivo + "]";
	}

	@Override
	public double calcularSueldo() {
		// TODO Auto-generated method stub
		int cien = 100;
		double total;
		total = super.calcularSueldo()+(cantidadVentas*incentivo/cien); 
		return total;
	}
	
	public void avisoObjetivo (double objetivo) {
		if(cantidadVentas>objetivo) {
			System.out.println("Enhorabuena has llegado al objetivo propuesto.");
		}
		
	}
	
	
	
	
	
	
}
