package ejercicio06;

public class Trabajador implements Comparable<Trabajador>{

	private String nombre;
	private String dni;
	private double horasTrabajadas;
	private double sueldoFinal;
	
	public Trabajador(String nombre, String dni, double horasTrabajadas, double sueldoFinal) {
		this.nombre = nombre;
		this.dni = dni;
		this.horasTrabajadas = horasTrabajadas;
		this.sueldoFinal = sueldoFinal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getSueldoFinal() {
		return sueldoFinal;
	}

	public void setSueldoFinal(double sueldoFinal) {
		this.sueldoFinal = sueldoFinal;
	}

	//Orden natural.
	@Override
	/*public int compareTo(Trabajador t) {
		if(this.sueldoFinal < t.getSueldoFinal()) {
			return -1;
		}else if (this.sueldoFinal > t.getSueldoFinal()){
			return 1;
		}
		return 0;
	}
	*/
	
	public int compareTo(Trabajador t) {
		ComparaPorHoras c = new ComparaPorHoras();
		
		if(this.nombre.equalsIgnoreCase(t.getNombre())) {
			return c.compare(this.horasTrabajadas, t.getHorasTrabajadas());
		}else {
			return 
		}
	}
	
	
	
	
	
}
