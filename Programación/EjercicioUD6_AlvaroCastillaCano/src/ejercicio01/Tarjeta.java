package ejercicio01;

public class Tarjeta {

	private double saldo;

	public Tarjeta(double saldo) {
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
		return "Tarjeta [saldo=" + saldo + "]";
	}
	
	
	public double retirarDinero(double dineroRetirado) throws Exception{
		if (dineroRetirado>saldo) {
			throw new ExcepcionDineroInsuficiente("No dispones del dinero solicitado");
		}else {
			return saldo-dineroRetirado;
		}
	}
	
	public double ingresarDinero(double dineroIngresado)throws Exception{
		if(dineroIngresado<0) {
			throw new ExcepcionDineroNegativo("No se puede añadir una cantidad negativa");
		}else {
			return saldo+dineroIngresado;
		}
	}
	
	public void comprobarPin(int pin, String letraPin) throws Exception{
		if(pin < 1000) {
			throw new ExcepcionPin("El PIN debe de tener minimo 4 números");
		}if(letraPin.length()>1) {
			throw new ExcepcionPin("El PIN debe de contener una única letra");
		}
		else {
			System.out.println("PIN correcto");
		}
	}
}
