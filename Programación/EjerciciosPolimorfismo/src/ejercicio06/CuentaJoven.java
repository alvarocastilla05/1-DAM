package ejercicio06;

public class CuentaJoven extends Cuenta {

	public CuentaJoven(double saldo) {
		super(saldo);
	}

	@Override
	public void ingresarDinero(double cantidadIngresada) {
		super.ingresarDinero(cantidadIngresada);
		saldo +=1;
	}

	
	
}
