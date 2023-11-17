package ejercicio08;

public class CuentaCorriente {
	
	private double saldo;
	private String nombre;
	public CuentaCorriente(double saldo, String nombre) {
		
		this.saldo = saldo;
		this.nombre = nombre;
	}

	public double retirarCant (double retiro) {
		
		saldo=saldo-retiro;
		return saldo;
		
	}
	public void mostrarRetiro(double saldo) {
		System.out.printf("Su saldo actual es %.2f €\n", saldo);
	}
	
	public double ingresarCant (double ingreso) {
		
		saldo=saldo+ingreso;
		return saldo;
		
	}
	public void mostrarIngreso(double saldo) {
		System.out.printf("Su saldo actual es %.2f €\n", saldo);
	}
	
	public double calcularDolares (double dolares) {
		double tasaEurDol=1.15;
		dolares= tasaEurDol*saldo;
		
		return dolares;
	}
	public void mostrarDolares(double dolares) {
		System.out.printf("Tienes un total de %.2f $\n", dolares);
	}
	
	public void mostrarSaldo (double saldo) {
		System.out.printf("Tu saldo es %.2f €\n", saldo);
	}
		
	
}
