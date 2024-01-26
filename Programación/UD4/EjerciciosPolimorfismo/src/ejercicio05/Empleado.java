package ejercicio05;

public class Empleado {

	private String nombre;
	private String apellidos;
	private double sueldoBase;
	private int numEmpleado;
	
	public Empleado(String nombre, String apellidos, double sueldoBase, int numEmpleado) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sueldoBase = sueldoBase;
		this.numEmpleado = numEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", sueldoBase=" + sueldoBase
				+ ", numEmpleado=" + numEmpleado + "]";
	}
	
	public double calcularSueldo () {
		return sueldoBase;
	}
	
	
}
