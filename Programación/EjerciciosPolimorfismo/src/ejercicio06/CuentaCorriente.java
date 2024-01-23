package ejercicio06;

public class CuentaCorriente extends Cuenta {

	private double pagaMantenimiento;
	private int puntos;
	
	

	public CuentaCorriente(double saldo, int numeroCuenta, double pagaMantenimiento, int puntos) {
		super(saldo, numeroCuenta);
		this.pagaMantenimiento = pagaMantenimiento;
		this.puntos = puntos;
	}

	public double getPagaMantenimiento() {
		return pagaMantenimiento;
	}

	public void setPagaMantenimiento(double pagaMantenimiento) {
		this.pagaMantenimiento = pagaMantenimiento;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	

	@Override
	public String toString() {
		return "CuentaCorriente [pagaMantenimiento=" + pagaMantenimiento + ", puntos=" + puntos + "]";
	}

	@Override
	public void ingresarDinero(double cantidadIngresada) {
		super.ingresarDinero(cantidadIngresada);
		puntos++;
	}

	@Override
	public void retirarDinero(double cantidadRetirada) {
		super.retirarDinero(cantidadRetirada);
		puntos++;
	}
	
	
	
	
	
	
	
}
