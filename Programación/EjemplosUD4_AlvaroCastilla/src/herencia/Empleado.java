package herencia;

//No hay que poner los atributos de la clase trabajador ya que los va a heredar.
//Para que los herede debemos de hacer lo siguiente.

public class Empleado extends Trabajador {

	
	
	private double sueldo;
	private double impuesto;
	
	public Empleado(String nombre, String puesto, String dni, double sueldo, double impuesto) {
		super(nombre, puesto, dni); //Es una llamada al constructor de la clase madre (Trabajador).
		this.sueldo = sueldo;
		this.impuesto = impuesto;
	}
	
	

	public Empleado( String dni, double sueldo, double impuesto) {
		super(dni);
		this.sueldo = sueldo;
		this.impuesto = impuesto;
	}



	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}



	@Override
	public String toString() {
		return super.toString()+"Empleado [sueldo=" + sueldo + ", impuesto=" + impuesto + "]";
	}

	//Cuando reescribimos el método, se debe de llamar igual que el anterior método creado(en la clase trabajador), lo único que cambia es lo que se hace dentro
	public double calcularPaga () {
		int cien = 100;
		
		return sueldo-sueldo+impuesto/cien;
	}
	
	
	
	
}
