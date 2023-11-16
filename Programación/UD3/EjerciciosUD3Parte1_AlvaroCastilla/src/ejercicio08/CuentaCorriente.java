package ejercicio08;

public class CuentaCorriente {
	
	private double saldo;
	private String nombre;
	public CuentaCorriente(double saldo, String nombre) {
		
		this.saldo = saldo;
		this.nombre = nombre;
	}

	public double retirarCant (double retiro) {
		double saldoRetiro;
		
		saldoRetiro=saldo-retiro;
		return saldoRetiro;
		
	}
	public void mostrarRetiro(double saldoRetiro) {
		System.out.printf("Su saldo actual es %.2f €\n", saldoRetiro);
	}
	
	public double ingresarCant (double ingreso) {
		double saldoIngreso;
		
		saldoIngreso=saldo+ingreso;
		return saldoIngreso;
		
	}
	public void mostrarIngreso(double saldoIngreso) {
		System.out.printf("Su saldo actual es %.2f €\n", saldoIngreso);
	}
	
	public double calcularDolares (double dolares) {
		double tasaEurDol=1.15;
		dolares= tasaEurDol*saldo;
		
		return dolares;
	}
	public void mostrarDolares(double dolares) {
		System.out.printf("Tienes un total de %.2f $\n", dolares);
	}
		
	
}
