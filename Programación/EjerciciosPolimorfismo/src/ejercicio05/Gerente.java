package ejercicio05;

public class Gerente extends Empleado {

	public Gerente(String nombre, String apellidos, double sueldoBase, int numEmpleado) {
		super(nombre, apellidos, sueldoBase, numEmpleado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularSueldo(double porcentajeImpuestos, double incentivo) {
		// TODO Auto-generated method stub
		int cien = 100;
		double total;
		total = super.calcularSueldo(porcentajeImpuestos, incentivo)-(super.calcularSueldo(porcentajeImpuestos, incentivo)*porcentajeImpuestos/cien);
		return total;
	}
	
	

	
}
