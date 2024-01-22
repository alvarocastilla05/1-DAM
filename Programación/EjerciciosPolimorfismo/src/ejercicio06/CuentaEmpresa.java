package ejercicio06;

public class CuentaEmpresa extends Cuenta{

	public CuentaEmpresa(double saldo) {
		super(saldo);
	}

	@Override
	public void retirarDinero(double cantidadRetirada) {
		// TODO Auto-generated method stub
		super.retirarDinero(cantidadRetirada);
		saldo -=1;
	}
	
	

	
}
