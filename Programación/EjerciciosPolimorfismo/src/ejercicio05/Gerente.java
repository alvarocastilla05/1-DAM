package ejercicio05;

public class Gerente extends Empleado {

	/*Debo de añadir el porcentaje de impuestos como atributo en esta clase, MODIFICAR EN CASA*/
	private double porcentajeImpuestos;
	
	public Gerente(String nombre, String apellidos, double sueldoBase, int numEmpleado, double porcentajeImpuestos) {
		super(nombre, apellidos, sueldoBase, numEmpleado);
		this.porcentajeImpuestos = porcentajeImpuestos;
	}
	
	
	public double getPorcentajeImpuestos() {
		return porcentajeImpuestos;
	}

	public void setPorcentajeImpuestos(double porcentajeImpuestos) {
		this.porcentajeImpuestos = porcentajeImpuestos;
	}
	
	
	@Override
	public String toString() {
		return "Gerente [porcentajeImpuestos=" + porcentajeImpuestos + "]";
	}


	@Override
	public double calcularSueldo() {
		// TODO Auto-generated method stub
		int cien = 100;
		double total;
		total = super.calcularSueldo()-(super.calcularSueldo()*porcentajeImpuestos/cien);
		return total;
	}
	
	

	
}
