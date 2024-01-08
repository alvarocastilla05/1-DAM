package herencia;

public class Consultor extends Trabajador{

	private double horas;
	private double tarifa;
	
	public Consultor(String nombre, String puesto, String dni, double horas, double tarifa) {
		super(nombre, puesto, dni);
		this.horas = horas;
		this.tarifa = tarifa;
	}

	
	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}


	@Override
	public String toString() {
		return "Consultor [horas=" + horas + ", tarifa=" + tarifa + "]";
	}
	
	
	public double calcularPaga () {
		return tarifa*horas;
	}
	
}
