package ejercicio06;

public  class Cuenta {

	protected double saldo;

	public Cuenta(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + "]";
	}
	
	public void ingresarDinero (double cantidadIngresada) {
		saldo += cantidadIngresada;
	}
	
	public void retirarDinero (double cantidadRetirada) {
		if (saldo>=cantidadRetirada) {
			saldo -=cantidadRetirada;
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
}
	

