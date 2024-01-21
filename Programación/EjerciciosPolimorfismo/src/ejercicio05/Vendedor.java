package ejercicio05;

public class Vendedor extends Empleado{

	private int cantidadVentas;
	private double incentivo;
	
	public Vendedor(String nombre, String apellidos, double sueldoBase, int numEmpleado, int cantidadVentas,
			double incentivo) {
		super(nombre, apellidos, sueldoBase, numEmpleado);
		this.cantidadVentas = cantidadVentas;
		this.incentivo = incentivo;
	}

	public int getCantidadVentas() {
		return cantidadVentas;
	}

	public void setCantidadVentas(int cantidadVentas) {
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
	public double calcularSueldo(double porcentajeImpuestos, double incentivo) {
		// TODO Auto-generated method stub
		int cien = 100;
		double total;
		total = super.calcularSueldo(porcentajeImpuestos, incentivo)+(super.calcularSueldo(porcentajeImpuestos, incentivo)*incentivo/cien); 
		return total;
	}
	
	public void avisoObjetivo (int objetivo) {
		
		
	}
	
	
	
	
	
	
}
