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
	
	public boolean comprobarPin(String pin) throws ExcepcionPin{
		String regex = "[0-9]{4}[A-Za-z]";
		
		if(pin.matches(regex)) { //matches sirve para comprobar si el String realiza el patron de regex.
			return true;
		}else {
			throw new ExcepcionPin("Formato de PIN no valido.");
		}
	}
}
