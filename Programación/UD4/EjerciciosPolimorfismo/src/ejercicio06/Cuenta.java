package ejercicio06;

public  class Cuenta {

	protected double saldo;
	private int numeroCuenta;

	public Cuenta(double saldo, int numeroCuenta) {
		this.saldo = saldo;
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", numeroCuenta=" + numeroCuenta + "]";
	}

	public void ingresarDinero (double cantidadIngresada) {
		saldo += cantidadIngresada;
	}
	
	//Corregir este metodo. NUNCA  se pone un syso en un metodo de calculo. 
	public void retirarDinero (double cantidadRetirada) {
		if (saldo>=cantidadRetirada) {
			saldo -=cantidadRetirada;
		}
	}
	
}
	

